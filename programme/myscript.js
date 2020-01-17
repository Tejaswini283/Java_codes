function add(){
    var a=parseInt(document.getElementById("t1").value);
    var b=parseInt(document.getElementById("t2").value);
    var sum=a+b;
    var res=document.getElementById("sumpos");
     res.innerHTML+=sum;
     res.style.backgroundColor="green";

    document.getElementById("sumpos").innerHTML='Sum='+sum;
// }
// function add( X, Y){
//     return X+Y;
}