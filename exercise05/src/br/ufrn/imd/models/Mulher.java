package br.ufrn.imd.models;

import java.text.DecimalFormat;

public class Mulher extends Pessoa {

    public Mulher() {
    }

    @Override
    public String calcularImc() {
        var df = new DecimalFormat("#.00");
        String msg = "IMC: ";
        double imc = this.peso / Math.pow(this.altura, 2);
        msg += df.format(imc) + " - ";

        if (imc < 19) {
            msg += "abaixo do peso";
        } else if (imc < 25.8 && imc >= 19) {
            msg += "peso ideal";
        } else {
            msg += "acima do peso";
        }
        return msg;
    }
}