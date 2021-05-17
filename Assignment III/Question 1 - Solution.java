// -------------------------------------------------------
// Assignment 3 Question 1
// Written by: Zafir Mohammad Khalid 40152164
// For COMP 248 Section W – Winter 2020
// --------------------------------------------------------

/*
The following program calculates, organizes and displays data about the IMO
It calculates values such as individual rank, team rank and team total
Data is organized in arrays and displayed in a tabular format
Ranking algorithm used for ranking induviduals and teams
 */

public class Question1 {
	public static void main(String args[]) {
		int inputData[][] = {{39,40,17,35,42,6}, {40,41,27,41,42,36} ,{42,40,26,42,42,35}};
		
		//Total number of score values
		int numOfScores=0;
		//Total number of teams
		int numOfTeams=0;
		//Running total used in loop
		int currentTotal=0;
		//Running rank used in loop
		int currentRank=1;
		//Used to index through 1D version of inputData array
		int count=0;
		//Used in printing loop to check which row is being printed
		int row=0;
		
		//Determine total length of 2D array
        for (;numOfTeams < inputData.length; numOfTeams++){
             numOfScores += inputData[numOfTeams].length;
         }
        
        //Number of members per team (Used in printing loop)
        //Works on the basis that numOfScores/numOfTeams is always an integer
        int perTeam = numOfScores/numOfTeams;        
		//Declare new 1D array of all the score values
        int [] allScores = new int[numOfScores];
        //Declare new 1D array to store each team total
        int [] teamTotals = new int[numOfTeams];
        //Declare new 1D array to store the rank of each competitor
        int [] ranksCompetitors = new int[numOfScores];
        //Declare new 1D array to store the rank of each team
        int [] ranksTeam = new int[numOfTeams];
        
        //Nested for loop to convert 2D array to 1D array
        //Also calculates team total after each iteration of the outer loop 
        //(ie: after iterating over each team)
        for(int x=0; x<numOfTeams; x++) {
        	currentTotal=0;
        	for(int n=0; n<inputData[x].length; n++) {
        		allScores[count] = inputData[x][n];
        		currentTotal += inputData[x][n];
        		count++;
        	}
        	teamTotals[x] = currentTotal;
        }
        
        //Ranking loop for players
        //Compares each index position with every remaining index position
        //If a particular index position (x) is less than each remaining position (n)
        //Then its rank is incremented by 1
        for(int x=0; x<allScores.length; x++) {
        	currentRank = 1;
        	for(int n=0; n<allScores.length; n++) {
        		if(allScores[x]<allScores[n]) {
        			currentRank += 1;
        		}
        	}
        	ranksCompetitors[x] = currentRank;
        }
        
        //Ranking loop for teams
        //Works same as ranking loop for competitors
        for(int x=0; x<numOfTeams; x++) {
        	currentRank=1;
        	for(int n=0; n<numOfTeams; n++) {
        		if(teamTotals[x]<teamTotals[n]) {
        			currentRank += 1;
        		}
        	}
        	ranksTeam[x] = currentRank;
        }
        
        
        
        //Printing Statements
        //Printing the column headings (P1,P2..Pn),Total,Rank
        System.out.print("\t");
    	for(int n=1; n<=perTeam; n++) {
    		System.out.print("P"+n+"\t");
    	}
    	System.out.print("Total"+"\t"+"Rank");
    	System.out.println();
    	
    	//Printing main body of the table
    	//Along with the team number
        for(int x=0; x<numOfScores; x++) {
        	if(x==0 || x%perTeam==0) {
        		System.out.print("Team "+(row+1)+"\t");
        	}
        	System.out.print(allScores[x] + "(" +ranksCompetitors[x] + ")\t");
        	if((x+1)%perTeam == 0) {
        		System.out.print(teamTotals[row] +"\t"+ ranksTeam[row]);
        		row++;
        		System.out.println();
        	}
        	
        	}

	}
}
