#!/bin/bash

BUILD_GRAMMARS=${1}

if [[ -n $BUILD_GRAMMARS ]]; then

	echo "Building grammar"             &&
	java -jar antlr-4.2.2-complete.jar  \
		 -o src/main/java/myne          \
		 -package myne                  \
		 Myne.g4

	if [[ $? -ne 0 ]]; then
		echo "Grammar build failed";
		exit 1;
	fi
fi

mvn clean compile assembly:single &&

java -jar target/myne-1.0-jar-with-dependencies.jar
