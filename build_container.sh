#!/bin/bash

set -e -x

CONTAINER="myne"
LXC_PATH=`lxc-config lxc.lxcpath`

# create the container
# sudo lxc-create -t ubuntu -n $CONTAINER -- -a amd64
lxc-create -t download -n $CONTAINER

# matt daemon
lxc-start -n $CONTAINER -d

sleep 5

lxc-attach -n $CONTAINER -- apt-get update
lxc-attach -n $CONTAINER -- apt-get -qy install openjdk-7-jre

git clone https://github.com/jasonmoo/myne $LXC_PATH/$CONTAINER/rootfs/usr/local/myne

cat > $LXC_PATH/$CONTAINER/rootfs/etc/init/myne.conf <<EOF
#!upstart

start on runlevel [23]

respawn                # restart when job dies
respawn limit 5 60     # give up restart after 5 respawns in 60 seconds

script
  cd /usr/local/myne
  exec java -jar target/myne-1.0.1-jar-with-dependencies.jar 2>&1
end script
EOF

lxc-attach -n $CONTAINER -- start myne

# exits with error on non-connect
curl -I http://$(lxc-info -n $CONTAINER -i -H):8000
