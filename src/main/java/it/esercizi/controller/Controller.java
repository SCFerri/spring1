package it.esercizi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.esercizi.core.ControlloFrase;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "/controllo")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		ControlloFrase oggetto = new ControlloFrase();
		ModelAndView mav = new ModelAndView("risultato");
		mav.addObject("testo", testo);
		mav.addObject("listaParolePal", oggetto.checkPalindromia(testo));
		mav.addObject("numeroParole", oggetto.countWord(testo));
		mav.addObject("numeroPararolePal", oggetto.countWordPalindrome(testo));
		return mav;
	}
}
