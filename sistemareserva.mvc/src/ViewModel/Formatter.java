/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import java.text.NumberFormat;

/**
 *
 * @author Nigri
 */
public class Formatter {

    public static String currency(double valor) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(valor);
    }
}
