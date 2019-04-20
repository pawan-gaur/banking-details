package com.pgaur.banking.service;

import com.pgaur.banking.model.BankDetail;
import com.pgaur.banking.repository.BankDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BankDetailService {

    @Autowired
    private BankDetailRepository bankDetailRepository;

    public List<BankDetail> getAllBankRecord(){
        List<BankDetail> bankDetails = bankDetailRepository.findAll();
        return bankDetails;
    }

    public BankDetail findByIfsc(String ifsc){
        BankDetail bankDetail = bankDetailRepository.findByIfsc(ifsc);
        return bankDetail;
    }

    public List<BankDetail> getBankByNameandCity(String bankName, String city){
        List<BankDetail> bankDetails = bankDetailRepository.findByBankNameAndCity(bankName, city);
        return bankDetails;
    }

}
