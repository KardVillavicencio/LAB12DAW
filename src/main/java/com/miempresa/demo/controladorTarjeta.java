package com.miempresa.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.miempresa.DTO.SolicitudDTO;

import jakarta.validation.Valid;
@Controller
public class controladorTarjeta {
    @GetMapping("/solicitudRegistro")
    public String envioSolicitud(Model model) {
        model.addAttribute("solicitud", new SolicitudDTO());
        return "solicitud";
    }

    @PostMapping("/solicitudRegistro")
    public String recepcionSolicitud(@ModelAttribute("solicitud") @Valid SolicitudDTO form, 
            BindingResult errores, Model model) {
        if(errores.hasErrors()) {
            return "solicitud";
        }
        model.addAttribute("solicitud", form);
        return "recepcion";
    }
}