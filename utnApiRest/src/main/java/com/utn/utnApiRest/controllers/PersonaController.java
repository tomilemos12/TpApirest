package com.utn.utnApiRest.controllers;

import com.utn.utnApiRest.entities.Persona;
import com.utn.utnApiRest.services.PersonaService;
import com.utn.utnApiRest.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
//mediante esta url vamos a poder acceder a los metodos de persona
@RequestMapping(path = "api/v1/personas")

public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}
