// source file is savings.pascal - Pascal to JavaScript
var ShowInterest = function ShowInterest() {
var principal,interest,rate ;
function GetPrincipalAndRate(principal,rate) {
putstr('Enter the principle ') ;
readln(principal) = readline() ;
putstr('Enter the rate ') ;
readln(rate) = readline() ;
}
function CalculateYear(interest,principal) {
var perCentFactor=0.1 ;
principal = principal+interest;
}
function ShowForYear() {
putstr('The interest earned for year ') ;
putstr(year:1,' is GBP',interest) ;
putstr('The principal after year ') ;
putstr(year:1,' is GBP',principal) ;
}
GetPrincipalAndRate(principal, rate) ;
CalculateYear(rate, interest, principal) ;
ShowForYear(1, interest, principal) ;
CalculateYear(rate, interest, principal) ;
ShowForYear(2, interest, principal) ;
CalculateYear(rate, interest, principal) ;
ShowForYear(3, interest, principal) ;
}
ShowInterest();
