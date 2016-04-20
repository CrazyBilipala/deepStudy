/**
 * Created by Administrator on 2016/4/18.
 */
window.onload = function () {
    imageLocation("container","box");
}
function imageLocation(parent,content) {
    var cParent = document.getElementById(parent);
    var cContent = getChildElement(cParent,content);
    var imgWidth = cContent[0].offsetWidth;
    var cols = Math.floor(document.documentElement.offsetWidth / imgWidth);
    cParent.style.cssText = "width:"+imgWidth*cols+"px;margin:0px auto";
    
    var boxHeightArr = [];
    for(var i =0;i<cContent.length;i++){
        if()
    }
}
function getChildElement(parent,content) {
    var contentArr = [];
    var allContent = parent.getElementsByTagName("*");
    for(var i=0;i<allContent.length;i++){
        if (allContent[i].className==content){
            contentArr.push(allContent[i]);
        }
    }
    return contentArr;
}