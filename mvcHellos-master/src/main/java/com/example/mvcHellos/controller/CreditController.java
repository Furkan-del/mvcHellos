package com.example.mvcHellos.controller;

import com.example.mvcHellos.model.Credit;
import com.example.mvcHellos.model.User;
import com.example.mvcHellos.serviceImpl.CreditServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Data
@Controller
public class CreditController {
    private final CreditServiceImpl creditService;

    @GetMapping("calculate/save")
    public String showForm(Model model) {
        Credit credit = new Credit();
        model.addAttribute("credit", credit);
        return "credits";
    }

    @GetMapping("credits")
    public String createForm(Model model) {
        model.addAttribute("credit", creditService.getCredits());
        return "credits";
    }

    @PostMapping("students/calculate")
    public String saveCalculateForm(@ModelAttribute("credit") Credit credit) {
        creditService.save(credit);
        return "redirect:/credşts";
    }

}
