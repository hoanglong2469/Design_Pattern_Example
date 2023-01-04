package factory;

import chair.Chair;
import table.Table;

public abstract class FurnitureAbstractFactory {
	 
    public abstract Chair createChair();
 
    public abstract Table createTable();
     
}
