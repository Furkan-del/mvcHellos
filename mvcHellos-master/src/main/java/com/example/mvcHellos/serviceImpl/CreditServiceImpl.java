package com.example.mvcHellos.serviceImpl;

import com.example.mvcHellos.model.Credit;
import com.example.mvcHellos.repository.CreditRepository;
import com.example.mvcHellos.service.CreditService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@Service
public class CreditServiceImpl implements CreditService {

    private final CreditRepository creditRepository;


    @Override
    public Credit makeCalculate(Credit credit) {
        int total=credit.getMonth()*credit.getRatio();
        credit.setTotal(total);
        return creditRepository.save(credit);

    }

    @Override
    public Credit save(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public List<Credit> getCredits() {
        return  creditRepository.findAll();
    }
}
