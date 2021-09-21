import java.util.Scanner;

public class Reino {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		System.out.print("FILO DOS CORDADOS");
		System.out.println("------------------");
		System.out.println("Digite o nome do animal: ");
		String name = ler.next();
		System.out.print("1-Mamiferos\n2-Aves\n3-Anfibios");
		int escolha = ler.nextInt();
		if(escolha==1)
		{
			System.out.print("\n1-Terrestre\n2-Aereo\n3-Marinho");
			int escolha1 = ler.nextInt();
			if(escolha1==1)
			{
				Terrestre t = new Terrestre();
				t.carac_terrestre();
			}
			if(escolha1==2)
			{
				Aereos a = new Aereos();
				a.carac_aereos();
			}
			if(escolha1==3)
			{
				Marinhos m = new Marinhos();
				m.carac_marinhos();
			}
		}
		if(escolha==2)
		{
			System.out.print("\n1-Carinata\n2-Ratitas");
			int escolha1 = ler.nextInt();
			if(escolha1==1)
			{
				Carinatas ca = new Carinatas();
				ca.carac_carinatas();
			}
			if(escolha1==2)
			{
				Ratitas ra = new Ratitas();
				ra.carac_ratitas();
			}

		}
		if(escolha==3)
		{
			System.out.print("\n1-Anuros\n2-Urodelos\n3-Apodes");
			int escolha1 = ler.nextInt();
			if(escolha1==1)
			{
				Anuros an = new Anuros();
				an.carac_anuros();
			}
			if(escolha1==2)
			{
				Urodelos ur = new Urodelos();
				ur.carac_urodelos();
			}
			if(escolha1==3)
			{
				Apodes ap = new Apodes();
				ap.carac_apodes();
			}
		}
	}

}
