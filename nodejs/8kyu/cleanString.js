function stringClean(s){
    // Function will return the cleaned string
    let regex = /\d/g
    return s.replace(regex, "");
}
console.log(stringClean("(E3at m2e2!!)"));
console.log(stringClean("Adgre2321 A1sad! A2A3A4 fv3fdv3J544K5L@"));