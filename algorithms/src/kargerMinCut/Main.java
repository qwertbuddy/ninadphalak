package kargerMinCut;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class Main {

	public static void main(String[] args) {
		//String path = args[0];
		String inputPath = "/home/ninad/workspace/java_personal/karger1.txt";
		Path path = Paths.get(inputPath);
		//HashMap contains Adjacency list mapping of each vertex to it's adjacent vertices
		//Key Point: Parallel edges between vertices are denoted by duplicate node in the ArrayList
		HashMap<Node,ArrayList<Node>> graphMap = new HashMap<Node,ArrayList<Node>>();
		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String line = null;
			while((line = reader.readLine()) != null){
				String[] nodesInLine = line.split("\\s");
				ArrayList<Node> adjacentNodes = new ArrayList<Node>();
				for(int i = 1 ; i < nodesInLine.length; i++){
					Node n = new Node(Integer.parseInt(nodesInLine[i]));
					adjacentNodes.add(n);
				}
				Node node = new Node(Integer.parseInt(nodesInLine[0]));
				graphMap.put(node, adjacentNodes);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
/*		
  		//Prints entire graph
		System.out.println("Graph input is given as: ");
		for(Entry<Node, ArrayList<Node>> entry : graphMap.entrySet()){
			System.out.println(entry.getKey().toString() + "=>" + entry.getValue().toString());
		}
		*/
		
		

	}
}
