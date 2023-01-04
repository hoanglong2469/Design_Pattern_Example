package factory;

import chair.Chair;
import chair.WoodChair;
import table.Table;
import table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
	 
    @Override
    public Chair createChair() {
        return new WoodChair();
    }
 
    @Override
    public Table createTable() {
        return new WoodTable();
    }
}