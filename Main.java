//creation of a graph and calculation of its connected components
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.*;

public class Main {
	
	private static final int MAX = 100;

	public static void main(String[] args) throws FileNotFoundException {
		int numVertici=0;
		int numArchi=0;
		int nComponenti=0;
		LinkedList<Integer>[] lista = null;
		componentiConnesse c = new componentiConnesse();
		
		try(Scanner scanner = new Scanner(new FileReader("grafo.txt"))) {
			numVertici=scanner.nextInt();
			numArchi=scanner.nextInt();
			lista=new LinkedList[MAX];
			for(int i=0;i<numVertici;i++) {
				lista[i]= new LinkedList<Integer>();
			}
			
			for(int i=0; i< numArchi; i++) {
				int u = scanner.nextInt();
				int v= scanner.nextInt();
				lista[u].add(v);
				lista[v].add(u);
			}
			
			scanner.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		nComponenti=c.calcolaComponentiConnesse(numVertici,numArchi,lista);
		System.out.println("Numero componenti connesse: "+nComponenti);

	}

}

class componentiConnesse{

	public int calcolaComponentiConnesse(int numVertici, int numArchi, LinkedList<Integer>[] lista) {
			boolean[] visitati = new boolean[numVertici];
			int ris=0;
			for(int i=0;i<numVertici;i++) {
				if(!visitati[i]) {
					ricercaInProf(i,lista,visitati);
					ris++; //QUESTA PARTE
				}
			}
		return ris;
	}

	private void ricercaInProf(int vertice, LinkedList<Integer>[] lista, boolean[] visitati) {
		visitati[vertice]=true;
		for(int i : lista[vertice]) {
			if(!visitati[i]) {
				ricercaInProf(i,lista,visitati);
			}
		}
		
	}
	
}
