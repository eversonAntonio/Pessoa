/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

/**
 *
 * @author PC
 */
public class Pessoa {

    protected String nome;
    protected Pessoa mae;
    protected Pessoa pai;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.mae = null;
        this.pai = null;
    }

    
    public boolean Equals(Pessoa p) {
        if (nome.equals(p.nome) && mae == p.mae) {
            return true;
        } else {
            return false;
        }
    }

    public boolean EhIrmao(Pessoa p) {
        if (mae == p.mae || pai == p.pai) {
            return true;
        } else {
            return false;
        }
    }

    public boolean VerificaAntecessor(Pessoa p) {
        if (pai != null && mae != null) {
            if (pai == p || mae == p) {
                return true;
            } else {
                if (pai.VerificaAntecessor(p)==true){
                    return true;
                } else {
                    return mae.VerificaAntecessor(this);
                }
            }
        } else {
            return false;
        }
    }

}
