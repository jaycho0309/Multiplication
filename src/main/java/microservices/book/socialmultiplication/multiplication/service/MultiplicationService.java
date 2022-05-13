package microservices.book.socialmultiplication.multiplication.service;


import microservices.book.socialmultiplication.multiplication.domain.Multiplication;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();
}
