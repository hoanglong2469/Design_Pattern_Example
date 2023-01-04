package factory;

import chair.Chair;
import chair.PlasticChair;
import table.PlasticTable;
import table.Table;

public class FlasticFactory extends FurnitureAbstractFactory {
	 
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
 
    @Override
    public Table createTable() {
        return new PlasticTable();
    }
 
}
