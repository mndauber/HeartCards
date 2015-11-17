import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Heart {
	private String[] cards;
	// System.out.println("");
	// spades is 1, clubs is 2, diamonds is 3, hearts is 4
	
	private int[] nums = new int [5];
	private int[] suit = new int [5];
	
	private int cn1;
	private int cn2;
	private int cn3;
	private int cn4;
	private int cn5;

	private int cs1;
	private int cs2;
	private int cs3;
	private int cs4;
	private int cs5;

	private String arry;
	private int[] multiplicity = {1,1,1,1,1};
	private int[] multiplicity1 = {1,1,1,1,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heart beta = new Heart();
		beta.setCards("6H 8C 7C 2S 3D");
		beta.multiplicity();
		System.out.println(beta.getHand());
	}

	public void setCards(String t) {
		cards = t.split(" ");
		System.out.println(Arrays.toString(cards));
		// if(cards[0].substring(0, cards[0].length()-1))
		try {
			cn1 = Integer
					.parseInt(cards[0].substring(0, cards[0].length() - 1));
		} catch (NumberFormatException e) {
			if (cards[0].substring(0, cards[0].length() - 1).equals("J")) {
				cn1 = 11;
			} else if (cards[0].substring(0, cards[0].length() - 1).equals("Q")) {
				cn1 = 12;
			} else if (cards[0].substring(0, cards[0].length() - 1).equals("K")) {
				cn1 = 13;
			} else if (cards[0].substring(0, cards[0].length() - 1).equals("A")) {
				cn1 = 14;
			}
		}

		nums[0]=cn1;
		if (cards[0].charAt(cards[0].length() - 1) == 'S') {
			cs1 = 1;
		} else if (cards[0].charAt(cards[0].length() - 1) == 'C') {
			cs1 = 2;
		} else if (cards[0].charAt(cards[0].length() - 1) == 'D') {
			cs1 = 3;
		} else if (cards[0].charAt(cards[0].length() - 1) == 'H') {
			cs1 = 4;
		} else
			failGraceful();
		suit[0]=cs1;
		try {
			cn2 = Integer
					.parseInt(cards[1].substring(0, cards[1].length() - 1));
		} catch (NumberFormatException e) {
			if (cards[1].substring(0, cards[1].length() - 1).equals("J")) {
				cn2 = 11;
			} else if (cards[1].substring(0, cards[1].length() - 1).equals("Q")) {
				cn2 = 12;
			} else if (cards[1].substring(0, cards[1].length() - 1).equals("K")) {
				cn2 = 13;
			} else if (cards[1].substring(0, cards[1].length() - 1).equals("A")) {
				cn2 = 14;
			}
		}
		nums[1]=cn2;
		if (cards[1].charAt(cards[1].length() - 1) == 'S') {
			cs2 = 1;
		} else if (cards[1].charAt(cards[1].length() - 1) == 'C') {
			cs2 = 2;
		} else if (cards[1].charAt(cards[1].length() - 1) == 'D') {
			cs2 = 3;
		} else if (cards[1].charAt(cards[1].length() - 1) == 'H') {
			cs2 = 4;
		} else
			failGraceful();
		suit[1]=cs2;
		try {
			cn3 = Integer
					.parseInt(cards[2].substring(0, cards[2].length() - 1));
		} catch (NumberFormatException e) {
			if (cards[2].substring(0, cards[2].length() - 1).equals("J")) {
				cn3 = 11;
			} else if (cards[2].substring(0, cards[2].length() - 1).equals("Q")) {
				cn3 = 12;
			} else if (cards[2].substring(0, cards[2].length() - 1).equals("K")) {
				cn3 = 13;
			} else if (cards[2].substring(0, cards[2].length() - 1).equals("A")) {
				cn3 = 14;
			}
		}
		nums[2]=cn3;
		if (cards[2].charAt(cards[2].length() - 1) == 'S') {
			cs3 = 1;
		} else if (cards[2].charAt(cards[2].length() - 1) == 'C') {
			cs3 = 2;
		} else if (cards[2].charAt(cards[2].length() - 1) == 'D') {
			cs3 = 3;
		} else if (cards[2].charAt(cards[2].length() - 1) == 'H') {
			cs3 = 4;
		} else
			failGraceful();
		suit[2]=cs3;
		try {
			cn4 = Integer
					.parseInt(cards[3].substring(0, cards[3].length() - 1));
		} catch (NumberFormatException e) {
			if (cards[3].substring(0, cards[3].length() - 1).equals("J")) {
				cn4 = 11;
			} else if (cards[3].substring(0, cards[3].length() - 1).equals("Q")) {
				cn4 = 12;
			} else if (cards[3].substring(0, cards[3].length() - 1).equals("K")) {
				cn4 = 13;
			} else if (cards[3].substring(0, cards[3].length() - 1).equals("A")) {
				cn4 = 14;
			}
		}
		nums[3]=cn4;
		if (cards[3].charAt(cards[3].length() - 1) == 'S') {
			cs4 = 1;
		} else if (cards[3].charAt(cards[3].length() - 1) == 'C') {
			cs4 = 2;
		} else if (cards[3].charAt(cards[3].length() - 1) == 'D') {
			cs4 = 3;
		} else if (cards[3].charAt(cards[3].length() - 1) == 'H') {
			cs4 = 4;
		} else
			failGraceful();
		suit[3]=cs4;
		try {
			cn5 = Integer
					.parseInt(cards[4].substring(0, cards[4].length() - 1));
		} catch (NumberFormatException e) {
			if (cards[4].substring(0, cards[4].length() - 1).equals("J")) {
				cn5 = 11;
			} else if (cards[4].substring(0, cards[4].length() - 1).equals("Q")) {
				cn5 = 12;
			} else if (cards[4].substring(0, cards[4].length() - 1).equals("K")) {
				cn5 = 13;
			} else if (cards[4].substring(0, cards[4].length() - 1).equals("A")) {
				cn5 = 14;
			}
		}
		nums[4]=cn5;
		if (cards[4].charAt(cards[4].length() - 1) == 'S') {
			cs5 = 1;
		} else if (cards[4].charAt(cards[4].length() - 1) == 'C') {
			cs5 = 2;
		} else if (cards[4].charAt(cards[4].length() - 1) == 'D') {
			cs5 = 3;
		} else if (cards[4].charAt(cards[4].length() - 1) == 'H') {
			cs5 = 4;
		} else
			failGraceful();
		suit[4]=cs5;
		
		
		
//		System.out.println(cn1);
//		System.out.println(cn2);
//		System.out.println(cn3);
//		System.out.println(cn4);
//		System.out.println(cn5);
////
//		System.out.println(cs1);
//		System.out.println(cs2);
//		System.out.println(cs3);
//		System.out.println(cs4);
//		System.out.println(cs5);
//		
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(suit));
		
		Arrays.sort(nums);
		Arrays.sort(suit);
		Arrays.sort(cards);
		
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(suit));
	}

	public String getHand() {
		if(isStraightFlush()&&nums[0]>9)
			return "Royal Flush";
		if(isStraightFlush())
			return "Straight Flush";
		if(isFourKind())
			return "Four of a Kind";
		if(isFullHouse())
			return "Full House";
		if(isFlush())
			return "Flush";
		if(isStraight())
			return "Straight";
		if(isThreeKind())
			return "Triple "+nums[2];
		if(isTwoPair())
			return "Two Pairs";
		if(isOnePair())
			return "One Pair";
		return "High Card of "+nums[4];
	}

	public boolean isStraightFlush() {
		if (isFlush() && isStraight()) {
			return true;
		}
		return false;
	}

	public boolean isFourKind() {
		if(nums[1]==nums[4]||nums[0]==nums[3])
			return true;
		return false;
		}

	public boolean isFullHouse() {
		if(((nums[0]==nums[1]&&nums[2]==nums[4])||(nums[0]==nums[2]&&nums[3]==nums[4])))
			return true;
		return false;
	}

	public boolean isFlush() {
		if((cs1+cs2+cs3+cs4+cs5)/5==cs1&&(cs1+cs2+cs3+cs4+cs5)/5==cs5&&(cs1+cs2+cs3+cs4+cs5)/5==cs3)
			return true;
		return false;
	}

	public boolean isStraight() {
		for(int i=0;i<4;i++){
			if(!(nums[i]+1==nums[i+1]))
				return false;			
		}
		return true;
	}

	public boolean isThreeKind() {  //checks the sorted array of numbers in the hand to check if there are three of a kind. the ordering of this method behind the isFullHouse() method in the actual tester method, hand(), ensures that if isFullHouse() returns true, then this code will never be reached.
		if(nums[2]==nums[4]||nums[0]==nums[2])
				return true;
		return false;
	}

	public boolean isTwoPair() {  //uses the multiplicity of the hand to return true if there is 2 pairs of cards in the hand.
		if(multiplicity[0]==2&&multiplicity[2]==2)
			return true;
		return false;
	}
	
	public void multiplicity(){  //gets the multiplicity of each numerical value in the hand. this is useful for one pair and two pairs, and could have also been used for the three of a kind, four of a kind, and for full house, if I had thought to use this beforehand.
		for(int i = 0; i<5; i++){
			for(int z = 0; z<5; z++){
				if(nums[i]==nums[z]&&!(i==z)){
					multiplicity1[i]+=1;
				}
			}
		}
		int t=0;
		for(int f=4; f>0;f--){
		multiplicity[t]=multiplicity1[f];	
		t++;
		}		
		//System.out.println( Arrays.toString(multiplicity));
	}
	
	public boolean isOnePair() {  //returns true if there is a single pair in the hand, using the multiplicity values.
		if((multiplicity[0]==2&&multiplicity[2]!=2)||(multiplicity[2]==2&&multiplicity[0]!=2))
			return true;
		return false;
	}

	public void failGraceful() {  //Allows for the program to end in the case of an  unexpected value.
		try {
			Integer.parseInt("this should fail");
		} catch (NumberFormatException e) {
			System.out.println("Error. System Failure. Please try again.");
			System.exit(0);
		}
	}

}


