package com.projeto.server;

import com.projeto.huffmandocapiroto.huffman;
import com.projeto.model.Veiculo;

public class ServerExtendido {

    	public static HashExtendido hash;

	public ServerExtendido() {
		hash = new HashExtendido(59);

	}
    public String inserir(String msg) {
		String response = "";
		String v = dc(msg);
		Veiculo veiculo = new Veiculo(v);

		if(msg == null) {
			response = "Erro ao decodificar";
		}else if(veiculo != null) {
			hash.inserir(veiculo.getRenavan(), veiculo);
			response = "Veículo inserido com sucesso";
		}
		
		return response;

    }
	public Veiculo remover(int renavan) {
		Veiculo tmp;
		tmp = hash.Remover(renavan);
		return tmp;
	}
	public String alterar(String compressed) {
		String response = "";
		String v = dc(compressed);
		Veiculo veiculo = new Veiculo(v);
		if(veiculo != null) {
			response =hash.Alterar(veiculo.getRenavan(), veiculo);
		}
		return response;
	}
	
	public No buscar(int renavan) {
		No tmp;
		tmp = hash.buscar(renavan);
		return tmp;
	}
	public int quantidade() {
		return hash.Quantidade();
	}

    public String imprimir() {
        return hash.imprimir();
    }

public String dc(String m){
	try {
		huffman h = new huffman();
		String decodificada = h.decodificar(m);
		if(decodificada != null && !decodificada.isBlank()) {
			return decodificada;
		}
	} catch (Exception e) {
		System.out.println("Erro ao decodificar");
		return null;
	}
	return null;
}

public String cm(Veiculo v){
	try {
		huffman h = new huffman();
		return h.codificar(v.toStringCode());
	} catch (Exception e) {
		System.err.println("Erro ao comprimir veículo");
		return null;
	}
}
}