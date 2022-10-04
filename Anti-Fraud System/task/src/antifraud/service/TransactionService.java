package antifraud.service;

import antifraud.model.Result;
import antifraud.model.dto.ResultResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionService {

    public ResultResponse processAmount(Long amount) {
        if (amount <= 200) {
            return new ResultResponse(Result.ALLOWED);
        } else if (amount <= 1500) {
            return new ResultResponse(Result.MANUAL_PROCESSING);
        } else {
            return new ResultResponse(Result.PROHIBITED);
        }
    }
}
