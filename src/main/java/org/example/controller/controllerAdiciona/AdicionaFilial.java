/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.controller.controllerAdiciona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.example.view.TelaAdministrador;

/**
 *
 * @author Lana S. Silva
 */
public class AdicionaFilial implements ActionListener{

    private final TelaAdministrador tela;

    public AdicionaFilial(TelaAdministrador tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        tela.cadastraFilial();
    }
    
}
