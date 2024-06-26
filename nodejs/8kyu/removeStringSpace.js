function noSpace(x){
    let regex = /\s+/g;
    return x.replace(regex, "");
}
console.log(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
console.log(noSpace("8aaaaa dddd r     "));

function noSpace2(xx){
    return xx.split(" ").join("");
}
console.log(noSpace2("king non nnnn      df"));