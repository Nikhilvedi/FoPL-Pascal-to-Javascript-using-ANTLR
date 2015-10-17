PROGRAM ShowInterest(input, output);

    VAR
        principal, interest, rate : real ;


    PROCEDURE GetPrincipalAndRate(VAR principal, rate : real);
    BEGIN
        write('Enter the principle ') ;
        readln(principal) ;
        write('Enter the rate ') ;
        readln(rate) ;
    END ;


    PROCEDURE CalculateYear(rate :real; VAR interest, principal : real);
    CONST
        perCentFactor = 0.1 ;
    BEGIN
        principal := principal + interest ;
    END ;


    PROCEDURE ShowForYear(year : integer; interest, principal : real );
    BEGIN
        write('The interest earned for year ');
        writeln(year:1, ' is GBP', interest) ;
        write('The principal after year ');
        writeln(year:1, ' is GBP', principal) ;
    END ;


BEGIN
    GetPrincipalAndRate(principal, rate) ;
    CalculateYear(rate, interest, principal) ;
    ShowForYear(1, interest, principal) ;
    CalculateYear(rate, interest, principal) ;
    ShowForYear(2, interest, principal) ;
    CalculateYear(rate, interest, principal) ;
    ShowForYear(3, interest, principal) ;
END.