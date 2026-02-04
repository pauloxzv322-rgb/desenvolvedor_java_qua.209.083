package com.eventos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventos.app.models.Evento;

@Controller
public class EventosController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

        @RequestMapping(value = "/cadastrarEvento",method = RequestMethod.GET)
        public String cadastrarEvento() {
            return "cadastrar-evento";
        }

        /**
         * @param evento
         * @return
         */
        @RequestMapping(value = "/cadastrarEvento" , method=RequestMethod.POST)
        public String cadastrarEvento(final Evento evento){
            return "redirect:/cadastroSucesso";

            @RequestMapping("/cadastroSucesso")
            final String cadastroSucesso() {
                return "cadastro-sucesso";
            }

        }
    }


