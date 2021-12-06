package TT.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import TT.language.services.LanguageService;
import TT.languages.models.Language;

@Controller
public class LanguageController {
    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @RequestMapping("/language")
    public String redirect() {
        return "redirect:/languages";
    }
    @RequestMapping("/languages")
    public String index(Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "index.jsp";
    }
    @RequestMapping("/languages/new")
    public String newLanguage(@ModelAttribute("language") Language language) {
        return "new.jsp";
    }

    @RequestMapping("/languages/{id}")
    public String show(Model model , @PathVariable("id") Long id) {
        Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "show.jsp";
    }

    @RequestMapping(value="/languages", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        }
        else {
            languageService.createLanguage(language);
            return "show.jsp";
        }
    }

    @RequestMapping("/languages/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "edit.jsp";
    }

    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }
        else {
            languageService.updateLanguage(language.getId() , language.getName() , language.getCreator(),language.getCurrentVersion());

            return "redirect:/language";
        }
    }

    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/language";
    }

}