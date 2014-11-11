package charfinder;

public class CharFinder {

	public static void main(String[] args) {
		CharFinder ch = new CharFinder();
		String s = "Praktikum";
		Character t = s.charAt(0);
		System.out.println("the first character of " + s + " is "
				+ ch.getFirstChar(s));
		System.out.println("the last character of " + s + " is "
				+ ch.getLastChar(s));
		System.out.println(s + " length is " + s.length());
		Character l = s.charAt(s.length() - 1);
		// System.out.println(l);
		ch.printAllPositions(s);
		ch.containsK(s, 'm');
		ch.countCharOccALaForLoop(s, 'k');
	}

	Character getFirstChar(String s) {
		Character ch = s.charAt(0);
		return ch;
	}

	Character getLastChar(String s) {
		Character ch = s.charAt(s.length() - 1);
		return ch;
	}

	void printAllPositions(String s) {
		Integer currentPorition = 0;
		Integer lastPosition = s.length() - 1;
		while (currentPorition <= lastPosition) {
			System.out.println(s.charAt(currentPorition) + " is at position: "
					+ currentPorition);
			currentPorition++;
		}
	}

	void getCharPos(String s, Character toFind) {
		Integer currentPorition = 0;
		Integer lastPosition = s.length() - 1;
		Boolean found = false;
		while (currentPorition <= lastPosition) {
			if (s.charAt(currentPorition) == toFind) {
				System.out.println(toFind + " is at Position "
						+ currentPorition + " of " + s);
			}
		}
	}

	public void containsK(String s, Character toFind) {
		s = s.toLowerCase();
		Integer lastPosition = s.length() - 1;
		Boolean found = false;
		for (Integer currentPosition = 0; currentPosition <= lastPosition; currentPosition++) {
			if (s.charAt(currentPosition) == toFind) {
				System.out.println(toFind + " is at Position "
						+ currentPosition);
				found = true;
			}
		}
		if (found == false) {
			System.out.println(toFind + " was not found!");
		}
	}
	
	void countCharOccALaForLoop(String s, Character toFind)
	{
		s = s.toLowerCase();
		Integer stringLength = s.length();
		Integer charOcc = 0;
		for(Integer i = 0; i < stringLength; i++)
		{
			if(s.charAt(i) != toFind)
			{
				continue;
			}
			else
			{
				charOcc++;
			}
		}
		if(charOcc == 0)
		{
			System.out.println("'" + toFind + "' was not Found in " + s );
		}
		else
		{
			if (charOcc == 1)
			{
				System.out.println("There is " + charOcc + " occurence of '" + toFind + "' in " + s);
			}
			else 
			{
				System.out.println("There are " + charOcc + " occurences of '" + toFind + "' in " + s );
			}
		}
	}
	
}
