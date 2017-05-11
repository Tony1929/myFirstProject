package myproj.cav.prog.iterator.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import myproj.cav.prog.iterator.model.Fund;

public class IteratorService {
	
	private static final LocalDate START_DATE = LocalDate.of(2015, Month.DECEMBER, 23);
	private static final LocalDate END_DATE = LocalDate.of(2030, Month.DECEMBER, 23);
	
	public List <Fund> processFunds(List <Fund> funds){
		List<Fund> newFunds = new ArrayList<Fund>();
		for(Fund fund: funds){
			Fund processedFund = processFund(fund);
			if(processedFund!= null){
				newFunds.add(processFund(fund));
			}
			
		}
		return newFunds;
	}
	
	private Fund processFund(Fund fund){
		if((START_DATE.equals(fund.getEfectiveDate()) || START_DATE.isBefore(fund.getEfectiveDate()) &&
						(END_DATE.equals(fund.getEfectiveDate()) || END_DATE.isAfter(fund.getEfectiveDate())
						))){
			return fund;
		}
		return null;
	}
	

}
