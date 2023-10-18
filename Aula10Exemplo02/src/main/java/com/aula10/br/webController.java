package com.aula10.br;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class webController {
@RequestMapping("/mensagem")
public String mensagem() {
	return "mensagem";
}
@RequestMapping ("/NewFile")
public String NewFile() {
 return "NewFile";

}
}