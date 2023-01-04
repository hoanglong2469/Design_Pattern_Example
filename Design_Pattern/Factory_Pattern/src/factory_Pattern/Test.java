package factory_Pattern;

import factory_Pattern.BankFactory.BankType;

public class Test {
	public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
    }
}
