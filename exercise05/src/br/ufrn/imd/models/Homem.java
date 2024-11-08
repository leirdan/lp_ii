package br.ufrn.imd.models;

import java.text.DecimalFormat;

public class Homem extends Pessoa {

    public Homem() {
    }

    @Override
    public String calcularImc() {
        var df = new DecimalFormat("#.00");
        String msg = "IMC: ";
        double imc = this.peso / Math.pow(this.altura, 2);
        msg += df.format(imc) + " - ";

        if (imc < 20.7) {
            msg += "abaixo do peso";
        } else if (imc < 26.4 && imc >= 20.7) {
            msg += "peso ideal";
        } else {
            msg += "acima do peso";
        }
        return msg;
    }
}
