package app;

import java.util.ArrayList;
import java.util.List;

public class StoryTwoController implements IRiverCrossingController{
private ICrossingStrategy crossingStrategy;
	
	boolean isBoatOnLeftBank;
	int numberOfSails;
	
	ArrayList<ICrosser> boatRiders = new ArrayList<ICrosser>();
	ArrayList<ICrosser> leftBankCrossers = new ArrayList<ICrosser>();
	ArrayList<ICrosser> rightBankCrossers = new ArrayList<ICrosser>();

	public StoryTwoController(ICrossingStrategy crossingStrategy,
			ArrayList<ICrosser> boatRiders, ArrayList<ICrosser> leftBankCrossers,
			ArrayList<ICrosser> rightBankCrossers) {
		isBoatOnLeftBank = true;
		crossingStrategy = new StoryTwoCrossingStrategy();
	}

	@Override
	public void newGame(ICrossingStrategy gameStrategy) {
		crossingStrategy = gameStrategy;
		
	}

	@Override
	public void resetGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getInstructions() {
		StoryTwoInstructions StoryTwoInstructions = new StoryTwoInstructions();
		String[] Instructions = StoryTwoInstructions.getInstructions();
		return Instructions;
	}
	
	@Override
	public List<ICrosser> getCrossersOnRightBank() {
		return rightBankCrossers;
	}

	@Override
	public List<ICrosser> getCrossersOnLeftBank() {
		return leftBankCrossers;
	}

	@Override
	public boolean isBoatOnTheLeftBank() {
		return isBoatOnLeftBank;
	}

	@Override
	public int getNumberOfSails() {
		return numberOfSails;
	}


	@Override
	public boolean canMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
		return crossingStrategy.isValid(rightBankCrossers,leftBankCrossers, boatRiders);
	}

	@Override
	public void doMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
		if (fromLeftToRightBank)
		{
			rightBankCrossers.addAll(boatRiders);
		}
		
		else {
			
			leftBankCrossers.addAll(boatRiders);
		}
		
		boatRiders.removeAll(boatRiders);
		numberOfSails++;
		if(isBoatOnLeftBank)
			isBoatOnLeftBank=false;
		else
			isBoatOnLeftBank=true;
	}

	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canRedo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<List<ICrosser>> solveGame() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ICrossingStrategy getCrossingStrategy() {
		return crossingStrategy;
	}

	public void setCrossingStrategy(ICrossingStrategy crossingStrategy) {
		this.crossingStrategy = crossingStrategy;
	}

}
