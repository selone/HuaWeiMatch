package com.cacheserverdeploy.deploy.ant;

import java.util.Iterator;

import com.cacheserverdeploy.deploy.graph.DirectedEdge;
import com.cacheserverdeploy.deploy.graph.EdgeWeightedDigraph;
import com.cacheserverdeploy.deploy.graph.Node;
import com.cacheserverdeploy.deploy.util.Bag;

public abstract class Ant {
	private Node belong;//归属消费节点
	private Bag path=new Bag();//路径、同时也是禁忌列表
	private Node current;//现在所在的路径
	private Bag candidate;//候选集合
	
	public Ant(Node belong){
		this.belong=belong;
		current=belong;
	}
	
	//调用一次，前进一步
	public void move(EdgeWeightedDigraph graph){
		Iterable<DirectedEdge> list=graph.adj(current.getId());
		for(DirectedEdge e:list){
			
		}
	}
	
	//找出候选集
	public Bag candidate(EdgeWeightedDigraph graph){
		Iterable<DirectedEdge> list=graph.adj(current.getId());
		for(DirectedEdge e:list){
			
		}
	}
	
	
}
