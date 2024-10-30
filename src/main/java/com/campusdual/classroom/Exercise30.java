package com.campusdual.classroom;

// Excepción personalizada para la división por cero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise30 {

    // Método que realiza la división y lanza una excepción personalizada si el divisor es cero
    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            // Ejemplo de uso que intenta dividir y atrapa la excepción personalizada si ocurre
            int result = divisionWithCustomException(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}