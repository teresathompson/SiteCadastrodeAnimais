function temperamento() {
	
	var data = new FormData();
	$('input').each(function(i) {
		var attr = $('input')[i]; 
		data.append(attr.name, attr.value);
	});
	
	$.ajax({
		url: 'http://localhost:8080/aulajavaweb/rest/temperamento',  
		method: 'GET',
		success: success,
		fail: fail
	}
	);
};