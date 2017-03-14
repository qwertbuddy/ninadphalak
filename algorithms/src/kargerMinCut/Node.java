package kargerMinCut;

import java.util.ArrayList;

public class Node {
	//node id can be a list of integers
	//single node would have only one value in the ArrayList, combined nodes would have list of all combined node ids
	ArrayList<Integer> id = new ArrayList<>();
	
	public Node(int singeNodeId){
		id.add(singeNodeId);
	}
	

	public Node(ArrayList<Integer> nodes){
		id.addAll(nodes);
	}
	@Override
	public String toString(){
		return id.toString();
	}

}