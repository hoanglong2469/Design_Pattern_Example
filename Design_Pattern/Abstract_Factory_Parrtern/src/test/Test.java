package test;

import chair.Chair;
import factory.FurnitureAbstractFactory;
import factory.FurnitureFactory;
import table.Table;
import table.Table.MaterialType;

public class Test {

	public static void main(String[] args) {

		FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

		Chair chair = factory.createChair();
		chair.create(); // Create plastic chair

		Table table = factory.createTable();
		table.create(); // Create plastic table
	}
}
