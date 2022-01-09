[3:49 PM, 12/30/2021] Jaysh2: function fn(x) {
    let sqr = 1 + (x-1)/2;
    let temp = x;
        if(x!==0 && x!==1)
        {
            while( Math.abs(sqr - temp) > 0.1 )
            {
            temp = sqr;
            sqr = (sqr*sqr + x) /(2*sqr);
            }
        }
        else
        {
        sqr =x;
        }
        return Math.floor(sqr);
        };
    
    let new1= fn(9);
    console.log(new1);