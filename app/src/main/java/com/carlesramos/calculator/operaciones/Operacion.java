package com.carlesramos.calculator.operaciones;

public abstract class Operacion {
    private float num1;
    private float num2;
    private float resultado;
    private char operacion;

    public Operacion(float num1, float num2, char operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public abstract float calcularResultado(float num1, float num2);
}
