
function fn(nums1, nums2){
    let intersection = []
    const setNums1 = new Set(nums1)
    const setNums2 = new Set(nums2)
  
    if (setNums1.length < setNums2.length) {
      [setNums1, setNums2] = [setNums2, setNums1]
    }
  
    setNums1.forEach(num => {
      if (setNums2.has(num)) {
        intersection.push(num)
      }
    })
  
    return intersection
  }

let ans = fn([1,2,2,1],[2,2]);

console.log(ans);