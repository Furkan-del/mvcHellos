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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Data
@Controller
public class CreditController {
    private final CreditServiceImpl creditService;

    @GetMapping("/credits")
    public String getAllCredits(Model model){
        model.addAttribute("credit_model",creditService.getCredits());
        return "credits";
    }
    @GetMapping("credits/save")
    public String createForm(Model model) {
        Credit credit=new Credit();
        model.addAttribute("credit", credit);
        return "student_calculator";
    }

    @PostMapping("/credits")
    public String saveCredit(@ModelAttribute("credit") Credit credit) {
        creditService.makeCalculate(credit);
        creditService.save(credit);
        return "redirect:/credits";
    }





}
