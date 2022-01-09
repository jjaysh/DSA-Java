// Time Complexity of this is O(nlogn)

function fun()
{
    let i, j;
    let n=5;
    for (i = 1; i <= n; i++){
        for (j = 1; j <= Math.log(i); j++)
        {
            console.log("GeeksforGeeks");
        }
    }    
}
fun();