function hide_number(s) {
    // var result = "";
    // // 내풀이
    // for(var i=0;i<s.length;i++){
    //     var t = s.substring(i,i+1);
    //     if(i < s.length - 4)
    //         t = '*';
    //     result = result + t;
    // }
    // // 다른 사람 풀이
    // //var result = "*".repeat(s.length - 4) + s.slice(-4);
    // return result;

    /*
     * @author OhMook
     * ES5
     */
    
    //case 1
    return s.substring(0, s.length-4).replace(/\d/g,'*').concat(s.match(/\d{1,4}$/g));


    //case 2
    var ptn = [];

    return (s.replace(/(\d{1,4})$/, function(cx, $1){
                ptn = $1; return '';
            }).replace(/\d/g, '*').concat(ptn));

    }
console.log("결과 :: " + hide_number('01033334444'))
console.log("결과 :: " + hide_number('0103333444'))
console.log("결과 :: " + hide_number('0133'))
