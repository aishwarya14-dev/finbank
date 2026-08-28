package com.aishwarya.Finbank.event_publishing;

import java.time.LocalDateTime;

public record LoanEvaluatedEvent(
        Long applicationId,
        String loanType,
        String decision,
        Double finalScore,
        LocalDateTime evaluatedAt
) {
}
