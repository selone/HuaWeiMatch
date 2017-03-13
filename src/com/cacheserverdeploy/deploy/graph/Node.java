package com.cacheserverdeploy.deploy.graph;

import com.cacheserverdeploy.deploy.util.Bag;

public class Node {
	private int id;//点的编号
	private double bandRequirement;//与消费点相连的带宽需求不为0
	
	public Node(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public double getBandRequirement() {
		return bandRequirement;
	}
	public void setBandRequirement(double bandRequirement) {
		this.bandRequirement = bandRequirement;
	}
	
}
