




class Cash_Manager{

	public static void main(String[] args) {

		boolean tag = true;
		String details = "";//Cash in/out log
		int startBalance = 50;

		while (tag){

			System.out.println("--------------------Cash Manager---------------------\n");
			System.out.println("                  1: Income and Expense");
			System.out.println("                  2: Enter income");
			System.out.println("                  3: Enter expense");
			System.out.println("                  4: Log out\n");
			System.out.print("                  PLease select from 1 to 4: ");

			

			char selection = Utility.readMenuSelection();//collect users' input

			switch (selection){

			case '1':
				//"1: Income and Expense"
				System.out.println("--------------------Current Cash Flow----------------");
				System.out.println("In or Out\tTransaction\tBalance\t\tMemo\n");
				System.out.println(details);
				System.out.println("-----------------------------------------------------");
				break;
			case '2':
				//"2: Enter income"
				System.out.print("Enter your income: ");
				int cashIn = Utility.readNumber();
				System.out.print("Income Memo: ");
				String cashInfo = Utility.readString();

				//Embed cashIn
				startBalance += cashIn;

				//Embed details
				details += ("In\t\t" + cashIn + "\t\t" + startBalance + "\t\t" + cashInfo + "\n");


				System.out.println("--------------------Complete!------------------------");
				break;			
			case '3':
				//"3: Enter expense"
				System.out.print("Enter your expense: ");
				int cashOut = Utility.readNumber();
				System.out.print("Expense Memo: ");
				String expenseInfo = Utility.readString();

				//Embed cashOut
				if (startBalance >= cashOut){
					startBalance -= cashOut;
				}else{
					System.out.println("Error: Out of balance!");
				}

				//Embed details
				details += ("Out\t\t" + cashOut + "\t\t" + startBalance + "\t\t" + expenseInfo + "\n");


				System.out.println("--------------------Complete!------------------------");

				break;			
			case '4':
				//"4: Exit"
				System.out.print("Log out?(Y/N): ");
				char exit = Utility.readConfirmSelection();
				if (exit == 'Y'){
					tag = false;
				}
				
			}

		System.out.println("Current balance: " + startBalance);

		}






	}
}
