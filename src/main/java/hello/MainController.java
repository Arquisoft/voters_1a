package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/user")
    public UserInfo user() {
    	// Añadir parámetros o conseguir el usuario por algún otro medio (GET, POST y cosas de esas)
    	// Conectarse a la Base de Datos y buscar el usuario
    	// Devolver una instancia de UserInfo con los datos (¿y si no un UserInfo vacío?)
        return null;
    }

    @RequestMapping("/")
    public String landing() {
    	// Vete a saber para qué sirve esto
    	// No lo toco, por si acaso
        return "User Management Service";
    }
}