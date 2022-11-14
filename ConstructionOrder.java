package com.greatlearning.skrscraper.model;

public class ConstructionOrder {
private int[] constructionOrder;
	
	public void Construction(int[] floorsConstruction) {
		constructionOrder=new int[floorsConstruction.length+1];
		int positionPointer=floorsConstruction.length;
		int arrayNumber=0;
		String value;
		MyConsole.print("The order of construction is as follows:");
		while (positionPointer!=0) {
			value = "";
			if(positionPointer==floorsConstruction[arrayNumber]) {
				value+= positionPointer;
				positionPointer--;
				while (constructionOrder[positionPointer]!=0) {
					value+= " "+positionPointer;
					positionPointer--;
				}
			}
			else {
				constructionOrder[floorsConstruction[arrayNumber]]=floorsConstruction[arrayNumber];
			}
			arrayNumber++;
			MyConsole.print("Day "+ (arrayNumber) +" : "+value);
		}
		
	}
}
