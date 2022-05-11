function countPositivesSumNegatives(input) {
    let possitive = 0;
    let negative = 0;
    if(!input.length||!input){
        return [];
    }
    for(let i=0;i<input.length;i++){
        if(input[i] > 0){
            possitive+=1;
        }else if(input[i]<0){
            negative+=input[i];
        }
    }
    // if(possitive==0&&negative==0){
    //     return [];
    // }
    return [possitive, negative];
}
console.log(countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]));
console.log(countPositivesSumNegatives([]));