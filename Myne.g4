grammar Myne;

fragment COMMA_: ',' ;

WORD: [a-zA-Z0-9\-'’]+ ;

PUNCTUATION: [!?.]+ ;

NEWLINE: '\r'? '\n' ;
COMMA: COMMA_ ;

IGNORE:
	( '(' ~')'+ ')'
	| '[' ~']'+ ']'
	| [\t "]+
    ) -> skip
;

song:
	NEWLINE* stanza+
;

stanza:
	verse+ NEWLINE*
;

verse:
	sentence+ NEWLINE?
;

sentence:
	(WORD COMMA?)+ PUNCTUATION?
;