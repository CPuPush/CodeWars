const uniqueInOrder = (iterable) => {
  const str = [];
  for (let i = 0; i < iterable.length; i++) {
    let curr = iterable[i];
    let next = iterable[i + 1];    
    if(curr != next){
      str.push(iterable[i]);
    }
  }
  return str;
};

console.log(uniqueInOrder('AAAABBBCCDAABBB'));
console.log(uniqueInOrder('ABBCcAD'));


// using filter

const uniqueInOrder2 = (iterable) => {
  return [...iterable].filter((a,i) => a !== iterable[i-1])
}

console.log(uniqueInOrder2('AAAABBBCCDAABBB'));
console.log(uniqueInOrder2('ABBCcAD'));