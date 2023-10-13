package com.projeto.model;

public class Veiculo {
	private String modelo;
	private Condutor condutor;
	private int renavan;	
	private String placa;
	private int data;
	
	public Veiculo( String modelo,int renavan, String placa, int data,String nomecondutor, String cpf) {
			this.condutor = new Condutor(nomecondutor, cpf);
			this.modelo  = modelo;
			this.data= data;
			this.placa = placa;
			this.renavan = renavan;
	}

	public Veiculo(String dcm){
		String[] tmp = dcm.split("\\*");
		this.modelo = tmp[0];
		this.condutor = new Condutor(tmp[1], tmp[2]);
		this.renavan = Integer.parseInt(tmp[3]);
		this.placa = tmp[4];
		this.data = Integer.parseInt(tmp[5]);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Condutor getCondutor() {
		return condutor;
	}
	public void setCondutor(Condutor condutor) {
		
		this.condutor = condutor;
	}
	public void setCondutor(String name, String cpf) {
		
		this.condutor =  new Condutor(name, cpf);
		
	}
	public int getRenavan() {
		return renavan;
	}
	public void setRenavan(int renavan) {
		this.renavan = renavan;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		String output = "";
		output += "Carro:" + this.getModelo() + " 	Condutor: "+  condutor.getName() +" CPF: "+ condutor.getCPF() + "  Renavan:  "+renavan+ "   Placa:   "+ placa+" Data:  "+ data;
		return output;
	}
	public String toStringCode() {
		return modelo + "*"+ condutor.getName() + "*"+ condutor.getCPF() + "*"+ renavan + "*"+ placa + "*"+ data;
	}


}
