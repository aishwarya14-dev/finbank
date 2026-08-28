Feature: Create Loan Application

Requirements:
- A user can have only one active application per loan type.
- Application starts in PENDING state.
- Duplicate active applications must be rejected.
- Evaluation happens only after successful persistence.

API:
POST /applications

Input:
- userId
- loanType
- loanAmount
- applicant details

Success:
201 CREATED

Failure cases:
- Duplicate active application → 409
- Invalid loan type → 400
- Invalid amount → 400

Concurrency:
Two simultaneous requests for the same user + loan type
must not create two active applications.

Validation:
- Unit tests for business rules
- Integration test for duplicate applications
- Concurrency test for simultaneous requests