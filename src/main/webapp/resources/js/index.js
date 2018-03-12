$(document).ready(function() {
	getAPIMethods();
});

function getAPIMethods(){
	debugger;
	$.ajax({
		url : "api/getmethodlist",
		type : "GET",
		complete : function() {
		},
		success : function(methodList) {
			debugger;
			var options = '';
			for (var i = 0; i < methodList.length; i++) {
				console.log(methodList[i]);
				options += "<option value='" + methodList[i].id+"'" ;
				if(methodList[i].selected==true){
					
					options +=" selected='selected' ";
				}
				
				options += ">"+ methodList[i].text + "</option>";
			}
			console.log(options);
			$('#api').html(options);

		},
		error : function(jqXHR, textStatus, errorThrown) {
			debugger;
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
			$('#ajax_div').hide();
		}
	});
}

function changeApi(){
	reset();
	var api= $('#api').val();
	$.ajax({
		url : "api/updateapi",
		type : "POST",
		data : "api="+api,
		complete : function() {
		},
		success : function(response) {
			debugger;
			$('#url').val(response.url);
			if(response.hotel != null){
				$('#response').val(reformatJSON(response.hotel));
			}else if(response.list != null){
				$('#response').val(reformatJSON(response.list));
			}
		
		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
			$('#ajax_div').hide();
		}
	});
}


function reformatJSON(uglyText){
  	   //var obj = JSON.parse(uglyText);
        var prettyText = JSON.stringify(uglyText, undefined, 5);
        return prettyText;
}

function reset(){
	$('#url').val("");
	$('#response').val("");
}