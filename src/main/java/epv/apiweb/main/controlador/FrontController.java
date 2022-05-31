/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epv.apiweb.main.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrador
 */

@Controller
@RequestMapping(value = "/app/home",method = RequestMethod.GET)
public class FrontController {
    
    @GetMapping(value = "/inicio")
    public String index(){
    
      return "index.html";
    }
    
    
    
    @GetMapping("/saludo")
    @ResponseBody
    public ResponseEntity datos(){
        
        return ResponseEntity.ok("Hola mundi");
    }
    
    
}
