package com.cacheserverdeploy.deploy.graph;

import com.cacheserverdeploy.deploy.util.Bag;

public class EdgeWeightedDigraph {
	private int V;//顶点总数
	private int E;//边的总数
	private Bag<DirectedEdge>[] adj;//邻接表
	private double serverPrice;//服务器价格
	
	//利用定站点数建立一个邻接表 
	public EdgeWeightedDigraph(int V){
		this.V=V;
		E=0;
		adj = (Bag<DirectedEdge>[])new Bag[V];
		for(int v = 0; v < V ; v++)
			adj[v] = new Bag<DirectedEdge>();
	}
	
	//用输入字符串建立一个表
	public EdgeWeightedDigraph(String[] in){
		int mark=0;
		for(String temp:in){
			if(temp.equals("")){
				mark++;
				continue;
			}
			String[] line=temp.split(" ");
			
			switch (mark){
			case 0:
				this.V=Integer.parseInt(line[0]);
				adj = (Bag<DirectedEdge>[])new Bag[V];
				for(int v = 0; v < V ; v++)
					adj[v] = new Bag<DirectedEdge>();
				break;
			case 1:
				this.serverPrice=Integer.parseInt(line[0]);
				break;
			case 2:
				DirectedEdge edge=new DirectedEdge(
						new Node(Integer.parseInt(line[0])),
						new Node(Integer.parseInt(line[1])),
						Integer.parseInt(line[2]),
						Integer.parseInt(line[3]));
				addEdge(edge);
				edge=new DirectedEdge(
						new Node(Integer.parseInt(line[1])),
						new Node(Integer.parseInt(line[0])),
						Integer.parseInt(line[2]),
						Integer.parseInt(line[3]));
				addEdge(edge);
				break;
			case 3:
				Node n=getNode(Integer.parseInt(line[1]));
				n.setBandRequirement(Integer.parseInt(line[2]));
				break;
			default:
				
			}
			
				
		}
	}
	
	public int V(){
		return V;
	}
	
	public int E(){
		return E;
	}
	
	public void addEdge(DirectedEdge e){
		adj[e.from().getId()].add(e);
		E++;
	}
	
	public Iterable<DirectedEdge> adj(int v){
		return adj[v];
	}
	
	//得到编号的点
	public Node getNode(int id){
		DirectedEdge e=adj[id].iterator().next();
		return e.from();
	}
	
	public Iterable<DirectedEdge> edges(){
		Bag<DirectedEdge> bag=new Bag<DirectedEdge>();
		for(int v=0;v<V;v++)
			for(DirectedEdge e:adj[v])
				bag.add(e);
		return bag;
	}
}
