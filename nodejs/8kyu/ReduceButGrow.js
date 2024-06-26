const grow = (x) => {
  const arr = [...x];
  let result=1;
  for(let i = 0; i< arr.length;i++){
    result*=arr[i]
  }
  return result;

};

console.log(grow([1,2,3,4]));

// simple way using reduce

const grow2 = x => x.reduce((a,b) => a*b);
console.log(grow2([1,2,3,4,5]));