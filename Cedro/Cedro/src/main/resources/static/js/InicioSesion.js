function recuperar(){

	swal({
		  text: "Se ha enviado exitosamente!",
		  icon: "success",
	
		  
		})
		.then((OK) => {
		  if (OK) {
			  location.href="/Iniciar";
				}		
			  });
		   
		
}
