package org.java.backend.crm.controllers;

import org.java.backend.crm.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long clienteId){
        return ResponseEntity.ok(new Cliente());
    }

    @GetMapping
    public ResponseEntity <List<Cliente>> getClientes(){
        return ResponseEntity.ok(List.of(new Cliente()));
    }

    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){

    }

    @PutMapping("/{clienteId}")
    public ResponseEntity<Void> actualizaCliente(@PathVariable Long clienteId, @RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> eliminaCliente(@PathVariable Long clienteId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}


