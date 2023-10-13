package com.projeto.server;

import com.projeto.model.Veiculo;

public class No {

    	int chave;
        No prox;
	    Veiculo veiculo;
	
	public No(int k, Veiculo v) {
		this.chave = k;
        this.veiculo = v;
        this.prox = null;
	}

    public No( int k, Veiculo v, No prox){
        this.chave = k;
        this.veiculo = v;
        this.prox = prox;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
}   

