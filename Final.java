
package ProjetoFinal;

import java.util.Random;
import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		// JOGO JAVA
		int i = 0, j = 0, per, saldo = 100, rodada = 0, jogar, jogarnovamente = 0, ganho = 0, perda = 0, perdaVal = 0,
				ganhoVal = 0;
		String resjogador;
		String[][] perguntas;

		// ENTRADA E INICIO DO JOGO
		Scanner sc = new Scanner(System.in);
		System.out.println(
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println("BEM-VINDO AO JOGO DE PERGUNTAS E RESPOSTAS! | QUIZ \n");
		System.out.println(
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println(
				"Cada rodada tem o valor de 5€, se acertar ganha 5€ senão perde 5€. O seu saldo inicial é 100€. \nAcerte na resposta para GANHAR!. Simplesmente tem de introduzir a letra da resposta correta.");
		System.out.println(
				"---------------------------------------------------------------------------------------------");

		System.out.println("VAMOS COMEÇAR? PRECIONE 1 = SIM, 0 = NÃO");
		jogar = sc.nextInt();

		// MATRIZ DE PERGUNTAS E RESPOSTAS (50)
		if (jogar == 1) {
			do {
				perguntas = new String[][] { {
						"Quem foi o primeiro rei de portugal? \nA: Marcelo Rebelo Sousa B: Afonso Henriques C: Donal Trump",
						"b" },
						{ "O que a palavra legend significa em português? \nA: Legenda B: Conto C: História", "a" },
						{ "Qual o número mínimo de jogadores numa partida de futebol? \nA: 8 B: 10 C: 7 ", "c" },
						{ "Qual a nacionalidade de Che Guevara? \nA: Cubana B: Argentina C: Panamenha ", "b" },
						{ "De quem é a famosa frase “Penso, logo existo”? \nA: Descartes B: Platão C: Galileu Galilei ",
								"a" },
						{ "Qual é o menor e o maior país do mundo? \nA: Nauru e China B: Malta e Estados Unidos C: Vaticano e Rússia ",
								"c" },
						{ "Quantas casas decimais tem o número pi? \nA: Centenas B: Duas C: Infinitas", "c" },
						{ "Em que período da pré-história o fogo foi descoberto? \nA: Paleolítico B: Neolítico C: Idade Média",
								"a" },
						{ "Qual a velocidade da luz? \nA: 30 000 000 metros por segundo (m/s) B: 299 792 458 metros por segundo (m/s) C: 199 792 458 metros por segundo (m/s)",
								"b" },
						{ "Em qual local da Ásia o português é língua oficial?\nA: Macau B: Filipinas C: Moçambique",
								"a" },
						{ "Como é a conjugação do verbo caber na 1.ª pessoa do singular do presente do indicativo? \nA: Que eu caiba B: Eu cabo C: Eu caibo",
								"c" },
						{ "Qual destes países é transcontinental? \nA: Groenlândia B: Rússia C: Marrocos", "b" },
						{ "Júpiter e Plutão são os correlatos romanos de quais deuses gregos? \nA: Cronos e Apolo B: Zeus e Ares C: Zeus e Hades",
								"c" },
						{ "Qual o maior animal terrestre? \nA: Baleia Azul B: Elefante africano C: Girafa", "b" },
						{ "Qual o tema do famoso discurso Eu Tenho um Sonho, de Martin Luther King? \nA: Igualdade das raças B: Intolerância religiosa C: Luta contra o Apartheid",
								"a" },
						{ "Que líder mundial ficou conhecida como “Dama de Ferro”? \nA: Angela Merkel B: Hillary Clinton C: Margaret Thatcher",
								"c" },
						{ "Quais os nomes dos três Reis Magos? \nA: Gaspar, Nicolau e Natanael B: Belchior, Gaspar e Baltazar C: Belchior, Gaspar e Nataniel",
								"b" },
						{ "Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu? \nA: Charles Duke, em 1971 B: Yuri Gagarin, em 1961 C: Neil Armstrong, em 1969",
								"c" },
						{ "As pessoas de qual tipo sanguíneo são consideradas doadores universais? \nA: Tipo O B: Tipo B C: Tipo ABO",
								"a" },
						{ "Quais são os cromossomos que determinam o sexo masculino? \nA: Os W B: Os X C: Os Y", "c" },
						{ "Em que estado australiano fica situada a cidade de Sydney? \nA: Nova Gales do Sul B: Queensland C: Victoria",
								"a" },
						{ "No exterior de que famoso edifício francês foi construída uma enorme pirâmide de vidro em 1989? \nA: Torre Eiffel B: Grand Palais C: Museu do Louvre",
								"c" },
						{ "Como se chamam os vasos que transportam sangue do coração para a periferia do corpo? \nA: veias B: artérias C: ventrículos",
								"b" },
						{ "Com que dois países faz fronteira o Equador? \nA: Colômbia e com o Peru B: Brasil e com a Colômbia C: Peru e com o Equador",
								"a" },
						{ "Que animal gruguleja? \nA: a cacatua B: o papagaio C: o peru", "c" },
						{ "Qual é o maior arquipélago da Terra? \nA: As Maldivas B: A Indonésia C: A Filipinas", "b" },
						{ "Em que oceano fica Madagascar? \nA: Oceano Índico B: Oceano Antártico C: Oceano Pacífico",
								"a" },
						{ "Qual o metal cujo símbolo químico é o Au? \nA: Cobre B: Mercúrio C: Ouro", "c" },
						{ "Quem viveu, segundo a Bíblia, 969 anos? \nA: Jesus Cristo B: Matusalém C: Noé", "b" },
						{ "Quem pintou o teto da capela sistina? \nA: Leonardo da Vinci B: Michelangelo C: Donatello",
								"b" },
						{ "Jim Morrison era vocalista de que grupo? \nA: The Police B: Pink Floyd C: The Doors", "c" },
						{ "Quantos braços tem um polvo? \nA: Sete B: Oito C: Seis", "b" },
						{ "De que são constituídos os diamantes? \nA: Ósmio B: Carbono C: Grafite", "b" },
						{ "Qual dessas aves não voa? \nA: Cegonha B: Galinha C: Pinguim", "c" },
						{ "A quem foi atribuído pela primeira vez o Prêmio Nobel da Paz? \nA: Frédéric Passy e Henry Dunant B: Henri Becquerel e Marie Curie C: Martin Luther King Jr.",
								"a" },
						{ "O que é um Papiloscopista? \nA: Indivíduo que se dedica ao estudo de papiros B: Profissional especializado em papilas digitais C: Especialista em cópias",
								"b" },
						{ "Qual o significado da expressão “calcanhar de Aquiles”? \nA: Fuga dos problemas B: Esporão C: O ponto mais vulnerável de alguém",
								"c" },
						{ "O etanol é produzido através de qual fonte de energia? \nA: Biomassa B: Eólica C: Solar",
								"a" },
						{ "Homem Vitruviano é um desenho de qual artista famoso? \nA: William Shakespeare B: Leonardo da Vinci C: Van Gogh",
								"b" },
						{ "Quantos dias, aproximadamente, a Lua demora para dar uma volta à Terra? \nA: 31 dias B: 365 dias C: 28 dias",
								"c" },
						{ "O português é a língua oficial nesses três países: \nA: Moçambique, Cabo Verde e Angola B: Venezuela, Angola e Portugal C: Guiné-Bissau, África do Sul e Brasil",
								"a" },
						{ "Qual a unidade que mede a intensidade do som? \nA: Hertz B: Decibel C: Compasso", "b" },
						{ "Em que país nasceu o Conde Drácula? \nA: Escócia B: Polônia C: Transilvânia", "c" },
						{ "Que tipo de tempestade é um haboob? \nA: tempestade de areia B: tempestade de relâmpagos C: tempestade de neve",
								"a" },
						{ "Que capital asiática tem uma Cidade Imperial e uma Cidade Proibida? \nA: Tóquio B: Pequim C: Seul",
								"b" },
						{ "Que autor da antiguidade clássica escreveu As Bacantes? \nA: Plutarco B: Sófocles C: Eurípides",
								"c" },
						{ "Que povo foi o primeiro a utilizar a bússola? \nA: mesopotâmicos B: chineses C: gregos",
								"b" },
						{ "Segundo Pitágoras, a que é igual A2 + B2? \nA: C2 B: AB C: C4", "a" },
						{ "Qual era o deus romano do amor? \nA: Júpiter B: Eros C: Cupido", "c" },
						{ "Que personagem da mitologia grega era metade homem metade cavalo? \nA: Gigante B: Centauro C: Sátiro",
								"b" } };

				// ACCESSO DA MATRIZ PERGUNTAS E RESPOSTAS
				for (i = 0; i < 1; i++) {
					for (j = 0; j < 1; j++) {

						per = new Random().nextInt(perguntas.length);
						System.out.println((perguntas[per][0]));
						rodada = rodada + 1;

						// INPUT DA RESPOSTA DO JOGADOR
						System.out.println("Escreva a palavra da resposta correta");
						resjogador = sc.next();

						if (resjogador.equals(perguntas[per][1])) { // VERIFICAR SE RESPOSTA É CERTA
							System.out.println("Resposta correta!");
							System.out.println("Acabou de ganhar 5€ !\n");
							ganho++;
							saldo += 5;
							ganhoVal += 5;
						} else {
							System.out.println("Resposta incorreta!");
							System.out.println("Acabou de perder 5€ \n");
							perda++;
							saldo -= 5;
							perdaVal += 5;
						}
					}
				}

				// INPUT PARA JOGAR NOVAMENTE
				System.out.println("QUER SAIR? PRECIONE 1 = SIM, 0 = NÃO");
				jogarnovamente = sc.nextInt();

			} while (jogarnovamente != 1);

			if (jogarnovamente == 0) { // REPETIR JOGO
				jogar = 1;

			} else { // FIM DO JOGO COM RESUMO DE RODADAS GANHOS E PERDAS.
				jogar = 0;
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Obrigado por jogar connosco!");
				System.out.println("O Seu saldo é: " + saldo + "€");
				System.out.println("Fez: " + rodada + " rodada(s), ganhou " + ganho + " vez(es) total de " + ganhoVal
						+ "€ e perdeu " + perda + " vez(es) total de " + perdaVal + "€");
				System.out.println("--------------------------------------------------------------------------------");
			}
		} else { // FIM DO JOGO COM RESUMO DE RODADAS GANHOS E PERDAS (NAO JOGOU DESDE O INICIO).
			jogar = 0;
			System.out.println("---------------------------------------------");
			System.out.println("O! fica para a próxima!");
			System.out.println("O Seu saldo é: " + saldo + "€");
			System.out.println("Fez: " + rodada + " rodada(s), ganhou " + ganho + " e perdeu " + perda + " vez(es)");
			System.out.println("---------------------------------------------");
		}
		sc.close();
	}
}
