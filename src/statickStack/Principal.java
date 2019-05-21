package statickStack;

import java.util.Random;

import listas.StaticStack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StaticStack pilha1 = new StaticStack(50);
			StaticStack pilha2= new StaticStack(50);
			Random r = new Random();
			int p1Size = r.nextInt(25);
			for (int i = 0; i < p1Size; i++) {
				pilha1.empilhar(r.nextInt(1000));
			}
			int p2Size = r.nextInt(25);
			for (int i = 0; i <p2Size ; i++) {
				pilha2.empilhar(r.nextInt(1000));
			}
			Object vt[]= new Object[p2Size+p2Size];
			System.out.println("p1 = "+p1Size+" p2 ="+p2Size +" total ="+vt.length);
			geraVetor(pilha1,pilha2,vt);
			for (int i = 0; i < vt.length; i++) {
				System.out.println(vt[i]);
			}
		}

		private static void geraVetor(StaticStack pilha1, StaticStack pilha2,Object[] vt) {
		
			int i=0;
			System.out.println("\n pilha 1 :");
			while (!pilha1.isEmpty()) {
				System.out.println(pilha1.showTop());
				vt[i]  = pilha1.showTop();
				pilha1.desempilhar();
				i++;
			}
			System.out.println("\n pilha 2 :");
			while (!pilha2.isEmpty()) {
				System.out.println(pilha2.showTop());
				vt[i]=pilha2.showTop();
				pilha2.desempilhar();
				i++;
			}
			System.out.println("veze :"+i);
			
		}
	}

