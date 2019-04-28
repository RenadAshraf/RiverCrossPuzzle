package app;

import java.util.List;

public class StoryTwoCrossingStrategy implements ICrossingStrategy {

	@Override
	public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers,
			List<ICrosser> boatRiders) {
		
		int flag = 0;
		for(ICrosser x : boatRiders) {
			if(x instanceof Farmer) flag = 1;
		}
		if(flag == 0)
			return false;
		
		
		
		
	}
	
	

	@Override
	public List<ICrosser> getInitialCrossers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getInstructions() {
		// TODO Auto-generated method stub
		return null;
	}

}
