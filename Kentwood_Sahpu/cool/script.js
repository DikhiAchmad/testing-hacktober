$(document).ready(function(){
    $('li').on('click',function(){
        $(this).siblings().removeClass('active');
        $(this).addClass('active');
        console.log("Ada");
    })
})