package com.projeto.client;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import com.projeto.exceptions.InputNotAnIntegerException;
import com.projeto.huffmandocapiroto.huffman;
import com.projeto.model.Veiculo;
import com.projeto.protocol.Protocol;
import com.projeto.server.ServerExtendido;
public class Client {
	
Protocol protocol = null;

    public Client(ServerExtendido server) {
        protocol = new Protocol(server);
    }

    public void client() {
        protocol.inserir(207375205, new Veiculo("Lotus Elan S-2 1.6 16V", 207375205,"MYW-7312",1995,"Diogo Pedro Henrique Joaquim Rocha", "521.584.994-35"));
        protocol.inserir(543120725, new Veiculo("Pontiac Trans-Sport SE 3.1 ", 543120725,"MYY-6935",1991,"Helena Andreia Moraes", "212.187.624-38"));
        protocol.inserir(166039541, new Veiculo("Mercedes-Benz E-320 3.2 Elegance", 166039541,"MXY-9623",1993,"Marcos Vinicius Baptista", "238.745.704-87"));
        protocol.inserir(497189059, new Veiculo("Bugre Buggy IV e V", 497189059,"MXY-9663",1985,"Vinicius Jorge Davi da Cruz", "588.987.534-54"));
        protocol.inserir(373529902, new Veiculo("Plymouth Gran Voyager LE 2.5", 373529902,"JJY-2942",1992,"Elisa Isadora Bernardes", "115.027.844-75"));
        protocol.inserir(157987345, new Veiculo("Nissan Sentra UNIQUE 2.0 Flex Fuel 16V Aut.", 157987345,"MWT-0888",2012,"Erick Renato Ruan Nunes", "485.568.134-29"));
        protocol.inserir(458113698, new Veiculo("SSANGYONG ACTYON SPORTS 2.0 16V 141cv Diesel", 458113698,"JNO-9228",2007,"Nathan Davi Marcos Vinicius da Rocha", "631.692.924-20"));
        protocol.inserir(115138309, new Veiculo("Mahindra SCORPIO 2.6 CD TB Diesel CRDe 4x4", 115138309,"HPX-0841",1965,"Fábio Yago Pires", "039.569.144-30"));
        protocol.inserir(421093503, new Veiculo("CHANGAN MINI STAR CE 1.0", 421093503,"LLU-7184",2011,"Laura Elaine da Mota", "823.627.144-70"));
        protocol.inserir(897514562, new Veiculo("Asia Motors Towner Super Luxo", 897514562,"GIM-9419",1997,"Levi Sebastião Ferreira", "749.034.624-04"));
        protocol.inserir(833933097, new Veiculo("Kia Motors Besta Furg ", 833933097,"KBL-2443",1991,"Oliver Filipe Fernando da Rocha", "878.188.534-21"));
        protocol.inserir(414338500, new Veiculo("Envemo Master 4.0 Diesel", 414338500,"LCR-2025",2011,"Arthur Bento Ramos", "413.801.164-14"));
        protocol.inserir(134580959, new Veiculo("Agrale", 134580959,"HTN-8267",2013,"Lucca Pietro Theo Alves", "356.858.914-15"));
        protocol.inserir(630609180, new Veiculo("MARRU", 630609180,"HTN-8267",2016,"Daniel Bento Marcos das Neves", "202.744.824-10"));
        protocol.inserir(100175992, new Veiculo("HAFEI", 100175992,"MUE-5690",2019,"Luiza Allana Assunção", "733.364.614-99"));
        protocol.inserir(785246535, new Veiculo("Towner Jr. Pick-up 1.0 8V 48cv  CD 4p", 785246535,"LGW-1312",2021,"Matheus Anthony Lopes", "544.232.384-54"));
        protocol.inserir(908156123, new Veiculo("Fibravan", 908156123,"ICM-5553",2001,"Manuela Isabelly Rebeca Lima", "594.348.134-68"));
        protocol.inserir(338554088, new Veiculo("Buggy Vip 1.8 8V", 338554088,"MRV-3816",2021,"Beatriz Daiane Caroline Oliveira", "071.048.754-17"));
        protocol.inserir(374774851, new Veiculo("SOUL 1.6/ 1.6 16V FLEX Aut.", 374774851,"MYO-0895",1999,"Marcela Tânia Duarte", "975.652.554-16"));
        protocol.inserir(397972596, new Veiculo("BMW 325i", 397972596,"MZG-5070",2003,"Antonio Caleb dos Santos", "351.687.724-39"));
        protocol.inserir(461115621, new Veiculo("Mercedes-Benz C-280 Touring", 461115621,"MXP-4316",2005,"Eloá Antônia Ferreira", "351.687.724-39"));
        protocol.inserir(592575837, new Veiculo("HAFEI Towner Pick_up Ba", 592575837,"MZD-1421",2006,"Gustavo Martin Luís Novaes", "635.803.144-91"));
        protocol.inserir(941349264, new Veiculo("Pontiac Trans-Sport SE 3.1", 941349264,"MUR-5012",2002,"Rosa Lavínia Nogueira", "935.079.544-27"));
        protocol.inserir(850696167, new Veiculo("Pointer GLi 2.0", 850696167,"HWY-2140",1987,"Leonardo Nelson Barros","952.771.694-23"));
        protocol.inserir(697619074, new Veiculo("Fox SELE", 697619074,"MVL-5804",2003,"Ian Davi Mendes", "120.001.334-44"));
        protocol.inserir(340056372, new Veiculo("Parati 1.8 Mi CROSSOVER Total Flex 8V 4p", 340056372,"HVC-9511",2004,"Emanuel Lucca Daniel Figueiredo", "750.121.404-27"));
        protocol.inserir(450385416, new Veiculo("Saveiro 1.6 Mi/ 1.6 Mi Total Flex 8V", 450385416,"LXX-4497",2023,"Davi Anthony Gabriel da Mota", "138.383.684-10"));
        protocol.inserir(625897912, new Veiculo("up! Run 1.0 Total Flex 12V 5p", 625897912,"NAK-0810",2020,"Roberto Vinicius Rafael Souza", "569.405.214-53"));
        protocol.inserir(989041863, new Veiculo("Parati 1.0 Mi FUN/ SunSet 16V 4p", 989041863,"JYA-6055",1999,"Gael Marcos Vinicius da Cruz", "669.048.264-28"));
        protocol.inserir(636005812, new Veiculo("Santana GLi / GL/ Sport 1.8/ 2.0", 636005812,"BTR-3401",2004,"Aurora Stefany Flávia Aragão", "015.207.304-38"));
        protocol.inserir(891291364, new Veiculo("Gol (novo) 1.0 Mi Total Flex 8V 2p", 891291364,"HVE-6904",2015,"Filipe André Caldeira", "522.347.074-55"));
        protocol.inserir(591291364, new Veiculo("Gol L 1.3/ L/ LS/ C/ S/ BX/ Plus 1.6", 591291364,"KAC-2565",1997,"César Ruan da Mata", "669.048.264-28"));
        protocol.inserir(543178725, new Veiculo("AMAROK Trendline CD 2.0 16V TDI 4x4 Dies", 543178725,"MZV-6244",2003,"Leandro Kevin Renato Santos", "600.168.844-34"));
        protocol.inserir(299858373, new Veiculo("SpaceCross I MOTION 1.6 Mi T. Flex 16V", 299858373,"IDB-4143",2022,"Cristiane Milena Francisca Moraes", "680.363.454-04"));
        protocol.inserir(523490399, new Veiculo("Polo Sedan 1.6 Mi Total Flex 8V 4p", 523490399,"NEI-8824",2001,"Analu Jaqueline Gonçalves", "481.168.924-01"));
        protocol.inserir(234903990, new Veiculo("Kombi LAST EDITION 56 1.4 Mi Total Flex", 234903990,"HPC-9532",2004,"Vitor Thiago da Rosa", "349.155.864-64"));
        protocol.inserir(331548689, new Veiculo("Gol TECH 1.0 Mi Total Flex 8V 2p", 331548689,"LWC-1750",2006,"Antonio Danilo Raimundo Teixeira", "046.938.914-10"));
        protocol.inserir(406995148, new Veiculo("SPACEFOX COMFORTLINE 1.6 Mi T.Flex 8V 5p", 406995148,"GYD-3752",2016,"Murilo Guilherme Mateus das Neves", "147.993.744-43"));
        protocol.inserir(881280122, new Veiculo("Eurovan 2.4 Diesel", 881280122,"NAZ-5345",1995,"Pietra Maya Teresinha Ribeiro", "681.281.724-41"));
        protocol.inserir(487613636, new Veiculo("Polo 2.0 Mi 116cv 8V 5p", 487613636,"NEY-8966",2015,"Jaqueline Luzia Luna Brito", "415.954.344-88"));
        protocol.inserir(100030725, new Veiculo("VOYAGE I MOTION  Trendline 1.6 T.Flex 8V", 100030725,"LVU-9466",2021,"316.020.294-15", "316.020.294-15"));
        protocol.inserir(499577206, new Veiculo("Envemo Master 4.0 Diesel",499577206 ,"JJG-8782",1995,"Bento Mário Assis", "373.883.138-00"));
        protocol.inserir(626970318, new Veiculo("JeepGrand Cherokee Limited 3.6 4x4 V6 Aut.",626970313 ,"HPT-6391",2011,"Isabel Lara Peixoto", "156.465.742-69"));
        protocol.inserir(776887150, new Veiculo("LIFAN X60 1.8 16V 128cv 5p Mec.X60",776887156 ,"JUA-4399",2013,"Fábio Diogo Fogaça", "001.572.069-12"));
        protocol.inserir(979786902, new Veiculo("911 Carrera S Cabriolet 3.8 24V",979786902 ,"JJO-8347",2012,"Evelyn Marcela Manuela Silveira", "478.531.451-60"));
        protocol.inserir(176713396, new Veiculo("TAC Stark 2.3 4WD 127cv TDI Diesel 3p",176713396 ,"KDT-2995",2010,"Leandro Erick Thiago Almeida", "224.226.094-49"));
        protocol.inserir(596013772, new Veiculo("Troller RF Esport T-4 4x4 2.0 Cap. R",596013772 ,"IAC-6433",1999,"Thomas Breno da Mota", "138.257.899-77"));
        protocol.inserir(781101269, new Veiculo("ASTON MARTIN Vantage S 6.0 V12 565cv",309760216 ,"JTC-3752",2015,"Laura Elaine Adriana da Silva", "219.199.757-05"));
        protocol.inserir(831091845, new Veiculo("Troller T-4 4x4 3.0 TB Int. Cap. Lona Diesel ",831091845 ,"HUW-4283",2006,"Isadora Ana Vanessa Sales", "834.545.236-13"));
        protocol.inserir(506552979, new Veiculo("MG 550 1.8 16V Turbo 170cv Aut.",506552979 ,"HSB-2837",2010,"Mateus Caleb Yago da Paz", "581.687.187-04"));
		Scanner lerx;
		int x = 1;
		do {
            try{
                lerx = new Scanner(System.in);
            System.out.println("+----------------------------------------------------+");
            System.out.println("|             Escolha uma opção abaixo              |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| 1 - Adicionar Veículos                            |");
            System.out.println("| 2 - Alterar Veículos                              |");
            System.out.println("| 3 - Remover Veículos                              |");
            System.out.println("| 4 - Acessar a Quantidade                          |");
            System.out.println("| 5 - Listar Veículos                               |");
            System.out.println("| 6 - Buscar Veículo                                |");
            System.out.println("| 0 - Fechar o sistema cliente                      |");
            System.out.println("+----------------------------------------------------+");
            x = lerx.nextInt();
            lerx.nextLine();  // Limpar a nova linha após a leitura do número

            switch (x) {
                case 1:
                    System.out.println("+-- Adicionar Veículos ----------------------------+");
                    protocol.openAccess();
					System.out.println(protocol.cadVeiculos()); 
					protocol.closeAcess();
                    break;
                case 2:
                    System.out.println("+-- Alterar Veículos ------------------------------+");
                    protocol.openAccess();
					System.out.println(protocol.alterarVeiculos());
					protocol.closeAcess();
                    break;
                case 3:
                    System.out.println("+-- Remover Veículos ------------------------------+");
                    protocol.openAccess();
					System.out.println(protocol.removeVeiculos());
					protocol.closeAcess();
                    break;
                case 4:
                    System.out.println("+-- Acessar a Quantidade --------------------------+");
                	protocol.openAccess();
					protocol.quantidade();
					protocol.closeAcess();
                    break;
                case 5:
                    System.out.println("+-- Listar Veículos -------------------------------+");
                    protocol.openAccess();
					System.out.println(protocol.listar());
					protocol.closeAcess();
                    break;
                case 6:
                    System.out.println("+-- Buscar Veículo --------------------------------+");
                    protocol.openAccess();
					huffman h = new huffman();
                    String a = protocol.buscar();
                    System.out.println((Objects.equals(a, "veiculo não encontrado."))? ("veiculo não encontrado!! \n"):(new Veiculo(h.decodificar(a)).toString()));
					protocol.closeAcess();
                    break;
                case 0:
                    System.out.println("Fechando Sistema Cliente");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Entrada inválida. Digite um número inteiro.");
        }catch (InputNotAnIntegerException e) {
            System.out.println(e.getMessage());}

        } while (x != 0);
		
	}
}
