package com.cacheserverdeploy.deploy.graph;

public class DirectedEdge {
	private final Node v;//边的起点
	private final Node w;//边的终点
	private final double weight;//边的花费
	private final double bandWidth;//边的带宽
	
	private double phromone;//本条路径的信息素量
	private int antNumber=0;//存在蚂蚁的数量
	
	public DirectedEdge(Node v,Node w,double bandWidth,double weight){
		this.v=v;
		this.w=w;
		this.weight=weight;
		this.bandWidth=bandWidth;
	}
	
	public double weight(){
		return weight;
	}
	
	public double bandWidth(){
		return bandWidth;
	}
	
	public Node from(){
		return v;
	}
	
	public Node to(){
		return w;
	}
	
	//*****************以下都是蚂蚁调用的API
	
	
	public double getPhromone() {
		return phromone;
	}

	public void setPhromone(double phromone) {
		this.phromone = phromone;
	}

	public int getAntNumber() {
		return antNumber;
	}

	public void setAntNumber(int antNumber) {
		this.antNumber = antNumber;
	}

	public String toString(){
		return String.format("%d->%d %.2f", v,w,weight);
	}
}
