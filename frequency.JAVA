function freq(arr,target)
    {
        let count = 0;
        let n= arr.length;
        for (let i=0; i<n; i++)
        {
            if (target == arr[i])
                count++;
        }
        return count;
    }

let ans= freq([1,1,2,2,4,5,5,6,6,6,6,9,10,11],6);
console.log(ans);