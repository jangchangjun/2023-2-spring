function memberInsert(){
	
	userinfo = {
		"username":"nomember",
		"password":"nono",
		"email":"n@.nnono"
	}
	
	 $.ajax({
        type:"POST",
        url:"/user",
        data:JSON,stringify(userinfo),
        contentType:"application/json; ;sharset = uft-8" 
        
    }).done(function(response){

       $('#tarea').text(response);
    }).fail(function(error){

    });
}

function memberList(){
    $.ajax({
        type:"GET",
        url:"/user/list"
    }).done(function(data){

       $('#tarea').text(data);
        
    }).fail(function(error){

    });
}
