package myproj.cav.prog.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import myproj.cav.prog.models.BankAccount;

public class EqualsMain {

	public static void main(String[] args) {

		BankAccount acount1 = new BankAccount(123456L, "Tony", "Cavaangh", LocalDate.of(1962, 1, 11), new BigDecimal(1000));
		BankAccount acount2 = new BankAccount(123456L, "Tony", "Cavaangh", LocalDate.of(1962, 1, 11), new BigDecimal(1000));
		if(acount1.equals(acount2)){
			System.out.println("Account1  equals Account2");
		}
		
		Map map = new HashMap();
		map.put(acount1, acount1);
		System.out.println(map.get(acount2).toString());

	}

}
