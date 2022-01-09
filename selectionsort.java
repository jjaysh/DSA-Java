function selectionSort(arr) { 
    let n = arr.length;
        
    for(let i = 0; i < n; i++) {
        // Finding the smallest number in the subarray
        let minIndex = i;
        for(let j = i+1; j < n; j++){
            if(arr[j] < arr[minIndex]) {
                minIndex=j; 
            }
         }
         if (minIndex != i) {
             // Swapping the elements
             let temp = arr[i]; 
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;      
        }
    }
    return arr;
}

let ans= selectionSort([3,5,6,7,87,6,5,4,3]);
console.log(ans);
