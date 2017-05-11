package myproj.cav.prog.main;

import java.util.List;

import myproj.cav.prog.iterator.model.Fund;
import myproj.cav.prog.iterator.service.IteratorService;
import myproj.cav.prog.lambda.service.StreamService;
import myproj.cav.prog.setdata.service.SetData;

public class main {

	public static void main(String[] args) {
		
		SetData data = new SetData();
		data.createData(1000000);
		List<Fund> funds = data.getFunds();
		System.out.println(funds.size());
		
		StreamService service = new StreamService();
		 Long startTime = System.nanoTime(); 
		 List<Fund> streamedFunds = service.processFunds(funds);
		 Long endTime = System.nanoTime() - startTime;
		 System.out.println("Iter "+streamedFunds.size()+ " Took "+endTime);
	}

}
