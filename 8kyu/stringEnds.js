function solution(str, ending){
    // TODO: complete   
    // let test = str.substr(-(ending.length));
    // if(ending==''){
    //     return true;
    // }
    // // console.log(-(ending.length));
    // return test === ending ? true : false;
    return str.endsWith(ending);
}
console.log(solution('abc', 'bc'));
console.log(solution('abc', 'd'));
console.log(solution('abc', ''));

/*
//* substr(-integer)
start in string from end of string
*/
/*
for best practice we can use //?endsWith(string)

*/