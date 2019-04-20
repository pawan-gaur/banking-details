package com.pgaur.banking.repository;

import com.pgaur.banking.model.BankDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankDetailRepository extends JpaRepository<BankDetail, Integer> {
    public BankDetail findByIfsc(String ifsc);

    public List<BankDetail> findByBankNameAndCity(String bankName, String city);
}
