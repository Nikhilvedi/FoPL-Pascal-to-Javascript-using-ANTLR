// source file is bubbleSort.p - Pascal to JavaScript
var BubbleSort = function BubbleSort() {
var lastelement=5, ; ;
var ints ;
function exchangeIntegers() {
var temp ;
temp = int1;
int1 = int2;
int2 = temp;
}
function sortIt(ints) {
var sorted,index ;
for (sorted=1; 1 <= lastelement-1; sorted++) 
{
for (index=lastelement-1; lastelement-1 DOWNTO sorted; index++) 
{
if( ints[index] > ints[index+1] ) 
{
exchangeIntegers(ints[index], ints[index+1]) ;
}
}
}
}
function showIt() {
var i ;
for (i=1; 1 <= lastelement; i++) 
{
putstr(ints[i]) ;
}
}
ints[1] = 12;
ints[2] = 7;
ints[3] = 19;
ints[4] = 1;
ints[5] = 3;
showIt(ints) ;
sortIt(ints) ;
showIt(ints) ;
}
BubbleSort();
