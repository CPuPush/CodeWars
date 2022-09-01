const persistence = (num) => {
  let count = 0;
  // num to arrayt ['3','9'];
  let newNum = num.toString().split('');
  while(newNum.length > 1){
    let result = 1;
    for(let i = 0; i < newNum.length; i++){
      result *= newNum[i];
    }
    // increment persistence count
    count += 1;

    // reset newNum
    newNum = result.toString().split('');
  }
  return count;
};

console.log(persistence(39));
console.log(persistence(16));
console.log(persistence(99));
console.log(persistence(999));