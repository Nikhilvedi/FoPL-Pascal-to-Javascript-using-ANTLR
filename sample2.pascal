PROGRAM Lesson1_PROGRAM3;
BEGIN
    PROCEDURE DrawLine(X : Integer; Y : Integer);

    VAR
        Num1, Num2, Sum : Integer;

    BEGIN
        Write('Input number 1:');
        Readln(Num1);
        Writeln('Input number 2:');
        Readln(Num2);
        Sum := Num1 + Num2;
        Writeln(Sum);
        Readln;

        IF Sel = '1' THEN
        BEGIN
            Total := N1 + N2;
            Write('Press any key TO continue...');
            Readkey;
            GOTO 1;
        END;

        FOR Counter := 1 TO 7 DO
            writeln('for loop');
        Readln;
    END;
END.
