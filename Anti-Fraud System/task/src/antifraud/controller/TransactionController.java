package antifraud.controller;

import antifraud.model.dto.AmountRequest;
import antifraud.model.dto.ResultResponse;
import antifraud.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/api/antifraud/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @PreAuthorize("hasRole('MERCHANT')")
    @PostMapping
    ResultResponse post(@Valid @RequestBody AmountRequest amountRequest) {
        return transactionService.processAmount(amountRequest.getAmount());
    }
}
