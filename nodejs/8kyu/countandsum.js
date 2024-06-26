//solution 1
function countPositivesSumNegatives(input) {
    if(!input || !input.length){
        return [];
    }
    const result = [0, 0];
    input.forEach((x)=>{
        x > 0 ? result[0]++ : (result[1]+=x);
    })
    return result;
}
console.log(countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]));
console.log(countPositivesSumNegatives([]));

//solution 2
function countPositivesSumNegatives2(input) {
    return input && input.length
        ? [
            input.filter((p)=>p > 0).length,
            input.filter((p)=>p < 0).reduce((a, b)=>a+b,0)
        ]
        : [];
}
console.log(countPositivesSumNegatives2([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]));
console.log(countPositivesSumNegatives2([]));