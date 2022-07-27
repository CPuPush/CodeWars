function getMiddle(s)
{
    // let middle = Math.floor(s.length / 2);
    // console.log(middle);
    // //Code goes here!
    // if(s.length % 2 === 0){
    //     return s[middle-1]+s[middle]
    // }else{
    //     return s.charAt(middle);
    // }   

    return s.substr(Math.ceil(s.length / 2 - 1), s.length % 2 === 0 ? 2 : 1)
}
console.log(getMiddle("test"));
console.log(getMiddle("testing"));
console.log(getMiddle("middle"));
console.log(getMiddle("middlest"));

// we can use //?charAt() for get chat in the index


/*
//!ceil()
rounds a number Up the nearest integer
let a = Math.ceil(0.60); =>1
let b = Math.ceil(0.40);=>1
let c = Math.ceil(5);=>5
let d = Math.ceil(5.1);=>5
let e = Math.ceil(-5.1);=>-5
let f = Math.ceil(-5.9);=>-5
*/

/*
//! substr()
method extracts a part of a sting
let text = "Hello world!";
let result = text.substr(1, 4);
=> 'ello'
*/