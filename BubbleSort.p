PROGRAM BubbleSort ;

CONST
    lastelement = 5 ;
TYPE
    IntArray = ARRAY[1..lastelement] OF integer ;
VAR
    ints: IntArray ;


PROCEDURE exchangeIntegers(Var int1, int2 : integer);
    VAR 
        temp: integer ;
    BEGIN
        temp := int1 ;
        int1 := int2 ;
        int2 := temp ; 
    END;


PROCEDURE sortIt(VAR ints : IntArray);
    VAR
        sorted,
        index:  1..lastelement ;
    BEGIN
        FOR sorted := 1 TO lastelement-1 DO
            FOR index := lastelement-1 DOWNTO sorted DO
                IF ints[index] > ints[index+1] THEN
                    exchangeIntegers(ints[index], ints[index+1])
    END;


PROCEDURE showIt(ints : IntArray);
    VAR
        i: integer ;
    BEGIN
        FOR i := 1 TO lastelement DO
            writeln(ints[i]) ;
    END;


BEGIN
    ints[1] := 12;
    ints[2] := 7;
    ints[3] := 19;
    ints[4] := 1;
    ints[5] := 3;

    showIt(ints);
    sortIt(ints);
    showIt(ints);

END.
