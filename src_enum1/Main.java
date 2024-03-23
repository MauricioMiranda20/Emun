package src_enum1;

import java.util.Date;

import entities.Ordem;
import entities.enums.OrdenStatus;

public class Main {

	public static void main(String[] args) {
		Date data = new Date();
		
		Ordem ordem = new Ordem(100,data,OrdenStatus.DELIVERES);
		System.out.println(ordem);
		
		OrdenStatus s1 = OrdenStatus.DELIVERES;
		OrdenStatus s2 = OrdenStatus.valueOf("DELIVERES");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		

	}

}
