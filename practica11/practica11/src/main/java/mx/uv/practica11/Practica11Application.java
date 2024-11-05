package mx.uv.practica11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Practica11Application {

	Color color = new Color();
	public static void main(String[] args) {
		SpringApplication.run(Practica11Application.class, args);
	}

// API relativo a los colores
// curl -X PUT -d @color.json -H "Content-Type: application/json" http://localhost:8080/color
@RequestMapping(method = RequestMethod.PUT, value = "/color")
String cambiarColor(@RequestBody String objeto){
	System.out.println(objeto);
    return "Color cambiado";
}

@RequestMapping(method = RequestMethod.DELETE, value = "/color/{id}")
Color eliminarColor(@PathVariable String id){
	System.out.println(id);
	color = null;
	return color;
}

@RequestMapping(method = RequestMethod.GET, value = "/color")
Color listarcolor(){
	return color;
}


@RequestMapping(method = RequestMethod.POST, value = "/color")
String crearColor(){
	color.setId("1");
	color.setNombreColor("blanco");
	color.setValorColor("255");
	System.out.println(color.getNombreColor());
	return "Color creado";
}

}