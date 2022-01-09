function twosum(numbers, target) {
    let start = 0;
    let end = numbers.length - 1;
    while (start < end); {
        const total = numbers[start] + numbers[end];
      if (total > target) {
        end--;
      } else if (total < target) {
        start++;
      } else {
        return [start + 1, end + 1];
      }
    }
  };
let ans = twosum([2,7,11,15],9);

console.log(ans);