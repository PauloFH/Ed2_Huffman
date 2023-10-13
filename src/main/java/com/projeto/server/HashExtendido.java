package com.projeto.server;

import com.projeto.model.Veiculo;

public class HashExtendido {
    int m;
    No tabela[];

    public HashExtendido(int tam) {

        this.m = tam;
        this.tabela = new No[this.m];
    }

    public int hash(int k) {
        return k % this.m;
    }

	
    public String inserir(int k, Veiculo v) {
        
		Integer c = this.hash(k);
		No no = this.tabela[c];
		
		while(no != null) {
			if(no.chave == k) {
				no.veiculo =v;
				break;
			}
			no = no.prox;
		}
		if(no == null) {
			no = new No(k,v, tabela[c]);
			tabela[c] = no;
			return "Veiculo inserido com sucesso";
		}
		return "Veiculo alterado com sucesso";
    }
    public No buscar(int k) {
        Integer c = this.hash(k);
        No no = this.tabela[c];
		No ant = null;
        while (no != null) {
            if (no.chave == k){
				if(ant != null){
					ant.prox = no.prox;
                	no.prox = tabela[c];
					tabela[c] = no;
				}
					return no;
			}
				ant = no;
				no = no.prox;
			}	
        	return null;
        }
        
    public String imprimir() {
        No no;
		StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.m; i++) {
            no = this.tabela[i];
            output.append(i).append(": ");
            while (no != null) {

                output.append(no.veiculo.toString()).append(" --> ");
                no = no.prox;
            }
			output.append("\n");
			
        }
		return output.toString();
	}

	public String Alterar(int renavan, Veiculo v) {
		Integer c = this.hash(renavan);
		No no = this.tabela[c];
	
		while (no != null) {
			if (no.chave == renavan) {
				no.veiculo = v;
				return "Veiculo alterado com sucesso";
			}
			no = no.prox;
		} 
	
		return "Veiculo não encontrado";
	}	
	public Veiculo Remover(int renavan) {
		Integer c = this.hash(renavan);
		No no = this.tabela[c];
		No anterior = null;
		Veiculo v = null;
		while (no != null) {
			if (no.chave == renavan) {
				if (anterior == null) {
					v = this.tabela[c].veiculo;
					this.tabela[c] = no.prox;
				} else {
					v= anterior.prox.veiculo;
					anterior.prox = no.prox;
				}
				return v;
			}
			anterior = no;
			no = no.prox;
		}
	
		return null;
	}

	public int Quantidade() {
		int total = 0;
	
		for (int i = 0; i < this.m; i++) {
			No no = this.tabela[i];
	
			while (no != null) {
				total++;
				no = no.prox;
			}
		}
	
		return total;
	}
	
	
}
