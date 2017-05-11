package myproj.cav.prog.setdata.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import myproj.cav.prog.iterator.model.Fund;

public class SetData {
  
	List <Fund> funds = new ArrayList<Fund>();
	
	public void createData(int max){
		LocalDate date = LocalDate.now();
		for(int index = 0; index < max; index++){
			funds.add(new Fund(index, "fund"+index, new BigDecimal(10), date));
			date = date.plusDays(1);
		}
	}

	public List<Fund> getFunds() {
		return funds;
	}

}
