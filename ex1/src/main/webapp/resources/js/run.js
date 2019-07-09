$(document).ready(function(){
	var header = 211;
	var footer = 88;
	
	var wHeight = window.innerHeight;
	
	$(".login").css("height",wHeight-header-footer);
	
	$(window).resize(function(){
		var wHeight = window.innerHeight;
		
		$(".login").css("height",wHeight-header-footer);
	});
});

