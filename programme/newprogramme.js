var img=document.getElementById("image");
var imgs=["image_4.jpg","image_3.jpg","image_2.jpg","image_1.jpg","image_1.jpg"];
var counter=0;
//setInterval(()=>next(),1000);

setInterval(()=>next(),1000);
function next(){
    if(counter==imgs.length-1){
        counter=0;
    }
    counter++;
    document.getElementById("image").src=imgs[counter];// or img.src=imgs[counter];
}
function previous(){
    if(counter==0){
        counter=imgs.length;
    }
    counter--;

    document.getElementById("image").src=imgs[counter];
}