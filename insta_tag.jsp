<!doctype html>
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>Instagram</title>
  
  <script type='text/javascript' src='http://code.jquery.com/jquery-1.8.3.js'></script>
  
  
  <style type='text/css'>
    instagram {
    margin: 0 auto;
    margin-left: 13px;
    
    max-height: 700px !important;
    width: 4875px !important;
    
    /*width: 1300px;*/
}
 .instagram-image {
    cursor: pointer;
}

.instagram-feed {
    width: 325px;
    height: 325px;
    
    border: 1px dashed #FF0000;
    
    padding: 0;
    margin: 0;
    margin-bottom: 13px;
    margin-right: 13px;
            
    float: left;
            
    border: 0px solid #000;
}

.igHover {
    border: 0px solid #D00000;
    background-color: #ffffff;
    background: rgb(255, 255, 255); /* The Fallback */
    background: rgba(255, 255, 255, 0); 
    
    width: 325px;
    height: 325px;
    overflow: hidden;
    
    position: relative;
    top: -325px;
    visibility: hidden;
    z-index: -999;
    
    opacity: 0;
    transition: opacity .25s linear;
    -moz-transition: opacity .25s linear;
    -webkit-transition: opacity .25s linear;
    -o-transition: opacity .25s linear;
}

.igHover2 {
    width: 325px;
    height: 50px;
    
    position: relative;
    top: 275px;
    
    background: rgb(0,0,0); /*The Fallback*/
    background: rgba(0,0,0,0.5);
    
    color:#FFF !important;
}

.igHover:hover {
    opacity: 1;
}
  </style>
  
<script type="text/javascript">

    function toggle_visibility(id) {
       var e = document.getElementById(id);
       if(e.style.display == 'block')
          e.style.display = 'none';
       else
          e.style.display = 'block';
    }

</script>

<script type='text/javascript'>//<![CDATA[ 
$(window).load(function(){
var elseCount = 1;
$(function() {
    $.ajax({
        type: "GET",
        dataType: "jsonp",
        cache: false,
        url:"https://api.instagram.com/v1/tags/car/media/recent?access_token=*********",
        
        success: function(data) {
        
        	//console.log('>>>>>' +JSON.stringify(data));
        
            for (var i = 0; i < 19; i++) {
                var igUID = data.data[i];
                
                console.log(i + '>> ' + JSON.stringify(data.data[i]));
                
                    $(".instagram").append("\
                        <div class='instagram-feed'>\
                            <img class='instagram-image' src='" + data.data[i].images.standard_resolution.url +"' width='325px' alt='" + data.data[i] + " " + igUID + "' onMouseOver=\"toggle_visibility('igImageHover" + i + "');\"/>\
                                <div class='igHover' id='igImageHover" + i + "' onMouseOut=\"toggle_visibility('igImageHover" + i + "');\">\
                                <div class='igHover2'>\
                                    SMALL TEST!\
                                </div />\
                                </div>\
                        </div>\
                    ");
                
              }                
        }
    });
});
});//]]>  

</script>


</head>
<body>
  <div class="instagram"></div>
  
</body>


</html>