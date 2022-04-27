import java.util.Scanner;
/**
Utility Tool Class��
Apply different functions to different classes, which can be used directly without considering their details.
*/
public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    /**
	User interface: Scan user input. If enter any of ��1��-��4����return to input.
	*/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("Invalid input, please re-enter��");
            } else break;
        }
        return c;
    }
	/**
	Scan income and expense: scan an integer(<= 4 digits) as return value.
	*/
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid number, please re-enter��");
            }
        }
        return n;
    }
	/**
	Scan explanation of income and expense: (<= 8) digits' String as return value.
	*/
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }
	
	/**
	Confirm input: scan ��Y�� or ��N��, return either one as return value.
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("Invalid selection��please re-enter��");
            }
        }
        return c;
    }
	
	
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input digits��<=" + limit + "��error��please re-enter��");
                continue;
            }
            break;
        }

        return line;
    }
}
