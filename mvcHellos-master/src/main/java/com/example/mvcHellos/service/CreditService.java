package com.example.mvcHellos.service;

import com.example.mvcHellos.model.Credit;

import java.util.List;

public interface CreditService {
    public Credit makeCalculate(Credit credit);
    public Credit save(Credit credit);

    public List<Credit> getCredits();


}
