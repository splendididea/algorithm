function hide_number(s) {
    var result = "";
    // 내풀이 
    for(var i=0;i<s.length;i++){
        var t = s.substring(i,i+1);
        if(i < s.length - 4) 
            t = '*';
        result = result + t;
    }
    // 다른 사람 풀이 
    //var result = "*".repeat(s.length - 4) + s.slice(-4);
    return result;
}
console.log("결과 :: " + hide_number('01033334444'))
