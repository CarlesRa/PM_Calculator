package com.carlesramos.calculator.operaciones;

public class Suma extends Operacion {
    private final char OPERACION = '+';
    private float suma;

    public Suma(float num1, float num2, char operacion, float suma) {
        super(num1, num2, operacion);
        this.suma = calcularResultado(num1,num2);
    }

    @Override
    public float calcularResultado(float num1, float num2) {
        return num1 + num2;
    }


}
