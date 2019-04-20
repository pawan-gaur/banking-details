package com.pgaur.banking.controller;

import com.pgaur.banking.model.BankDetail;
import com.pgaur.banking.service.BankDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankController {

    @Autowired
    private BankDetailService bankDetailService;

    @GetMapping("/bank")
    public ResponseEntity<List<BankDetail>> bankRecord() {
        List<BankDetail> bankDetailList = bankDetailService.getAllBankRecord();
        return ResponseEntity.status(HttpStatus.OK).body(bankDetailList);
    }

    @GetMapping("/ifsc/{ifsc}")
    public ResponseEntity<BankDetail> getByIfsc(@PathVariable("ifsc") String ifsc) {
        BankDetail bankRecord = bankDetailService.findByIfsc(ifsc);
        return ResponseEntity.status(HttpStatus.OK).body(bankRecord);
    }

    @GetMapping("/find/{city}/{bankName}")
    public ResponseEntity<List<BankDetail>> bankRecordByNameAndCity(@PathVariable("bankName") String bankName, @PathVariable("city") String city) {
        List<BankDetail> bankDetailList = bankDetailService.getBankByNameandCity(bankName, city);
        return ResponseEntity.status(HttpStatus.OK).body(bankDetailList);
    }

}
