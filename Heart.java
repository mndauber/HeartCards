import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Heart {
	private String[] cards;
	// System.out.println("");
	// spades is 1, clubs is 2, diamonds is 3, hearts is 4

	private int[] nums = new int[5];
	private int[] suit = new int[5];

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
	private int[] multiplicity = { 1, 1, 1, 1, 1 };
	private int[] multiplicity1 = { 1, 1, 1, 1, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heart beta = new Heart();
		beta.setCards("6H 8C 7C 2S 3D");
		beta.multiplicity(); // runs the method to make sure the multiplicity
								// array is set correctly.
		System.out.println(beta.getHand());
	}

	public void setCards(String t) {
		cards = t.split(" ");
		System.out.println(Arrays.toString(cards));
		// if(cards[0].substring(0, cards[0].length()-1))

		// I chose to use 5 try catch loops in order to set the card number
		// variables, and the nums array. this was centered around the
		// Integer.parseInt method so that it tries to parse the substring of
		// the card from the beginning of the specific card to the end of the
		// cards length-1. if this fails, meaning that the "number" of the card
		// is not an actual numeric value, the try catch then checks if the
		// letter/number is equal to specific letters, and then sets the
		// variable to the value manually. this process is then repeated 5x, one
		// time for each card. the code is organized in such a fashion that it
		// deals with each card at once, rather than doing all of the numbers,
		// and then all of the suits.
		try {
			cn1 = Integer.parseInt(cards[0].substring(0, cards[0].length() - 1));
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

		nums[0] = cn1;
		// this code to set the suit of the card is more simple. this just
		// compares the suit part of the card to specific other strings in order
		// to manually set the suit values for a specific value representing
		// each suit. spades is 1, clubs is 2, diamonds is 3, hearts is 4. this
		// is also repeated 5 times, once for each suit
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
		suit[0] = cs1;
		try {
			cn2 = Integer.parseInt(cards[1].substring(0, cards[1].length() - 1));
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
		nums[1] = cn2;
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
		suit[1] = cs2;
		try {
			cn3 = Integer.parseInt(cards[2].substring(0, cards[2].length() - 1));
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
		nums[2] = cn3;
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
		suit[2] = cs3;
		try {
			cn4 = Integer.parseInt(cards[3].substring(0, cards[3].length() - 1));
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
		nums[3] = cn4;
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
		suit[3] = cs4;
		try {
			cn5 = Integer.parseInt(cards[4].substring(0, cards[4].length() - 1));
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
		nums[4] = cn5;
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
		suit[4] = cs5;

		// System.out.println(cn1);
		// System.out.println(cn2);
		// System.out.println(cn3);
		// System.out.println(cn4);
		// System.out.println(cn5);
		////
		// System.out.println(cs1);
		// System.out.println(cs2);
		// System.out.println(cs3);
		// System.out.println(cs4);
		// System.out.println(cs5);
		//
		// System.out.println(Arrays.toString(nums));
		// System.out.println(Arrays.toString(suit));

		Arrays.sort(nums); // makes sure all of the arrays are sorted from least
		Arrays.sort(suit); // to greatest. this is very important for methods
		Arrays.sort(cards); // such as the Straight or even multiplicity.
		
		

		// System.out.println(Arrays.toString(nums));
		// System.out.println(Arrays.toString(suit));
	}

	public String getHand() {
		if (isStraightFlush() && nums[0] > 9) // these methods are sorted in
												// order of value, as shown in
												// the instructional pdf.
			return "Royal Flush"; // this method has the addition of the check
									// to make sure that the smallest sorted
									// number in the array is greater than 9,
									// which means that this hand is a royal
									// flush, given that straight flush is also
									// true
		if (isStraightFlush())
			return "Straight Flush";
		if (isFourKind())
			return "Four of a Kind";
		if (isFullHouse())
			return "Full House";
		if (isFlush())
			return "Flush";
		if (isStraight())
			return "Straight";
		if (isThreeKind())
			return "Triple " + nums[2];
		if (isTwoPair())
			return "Two Pairs";
		if (isOnePair())
			return "One Pair";
		return "High Card of " + nums[4];
	}

	public boolean isStraightFlush() { // this method just runs the flush and
										// straight methods to check if this
										// method is a straight flush.
		if (isFlush() && isStraight()) {
			return true;
		}
		return false;
	}

	public boolean isFourKind() { // this method basically just checks to see if
									// the numbers of the sorted array are
									// either equal in the first and fourth
									// positions, or equal in the second and
									// fifth positions. In hindsight, after
									// setting up the multiplicity method, it
									// would have been far easier to just check
									// the number at the middle of the
									// multiplicity array, and if this number
									// equaled four, then this hand had a four
									// of a kind.
		if (nums[1] == nums[4] || nums[0] == nums[3])
			return true;
		return false;
	}

	public boolean isFullHouse() { // this method checks to see if there is a
									// pair, and then if there is a separate
									// triplet. if this fails, it then checks to
									// see if there is first a triplet, and then
									// if there is a pair. this method comes
									// before the one pair, two pair, and three
									// of a kind methods in the hand method so
									// there should never be any conflicts with
									// the program selecting a lower tier hand
									// than it should be.
		if (((nums[0] == nums[1] && nums[2] == nums[4]) || (nums[0] == nums[2] && nums[3] == nums[4])))
			return true;
		return false;
	}

	public boolean isFlush() { // I also generated an array of the suits of the
								// cards by assigning them numbers based on
								// which suit they are. I then checked to make
								// sure the average of these numbers is equal to
								// the first, last, and middle number. if all of
								// these suit numbers are the same, then of
								// course the average will be the same as the
								// other numbers in the array.
		if ((cs1 + cs2 + cs3 + cs4 + cs5) / 5 == cs1 && (cs1 + cs2 + cs3 + cs4 + cs5) / 5 == cs5
				&& (cs1 + cs2 + cs3 + cs4 + cs5) / 5 == cs3)
			return true;
		return false;
	}

	public boolean isStraight() { // makes use of the array of numbers generated
									// from the hand given in the runner section
									// of the code to check if the number at the
									// next spot in the sorted array is 1
									// greater than the number in the current
									// position in the numerical array.
		for (int i = 0; i < 4; i++) {
			if (!(nums[i] + 1 == nums[i + 1]))
				return false;
		}
		return true;
	}

	public boolean isThreeKind() { // checks the sorted array of numbers in the
									// hand to check if there are three of a
									// kind. the ordering of this method behind
									// the isFullHouse() method in the actual
									// tester method, hand(), ensures that if
									// isFullHouse() returns true, then this
									// code will never be reached.
		if (nums[2] == nums[4] || nums[0] == nums[2])
			return true;
		return false;
	}

	public boolean isTwoPair() { // uses the multiplicity of the hand to return
									// true if there is 2 pairs of cards in the
									// hand.
		if (multiplicity[0] == 2 && multiplicity[2] == 2)
			return true;
		return false;
	}

	public void multiplicity() { // gets the multiplicity of each numerical
									// value in the hand. this is useful for one
									// pair and two pairs, and could have also
									// been used for the three of a kind, four
									// of a kind, and for full house, if I had
									// thought to use this beforehand.
		for (int i = 0; i < 5; i++) {
			for (int z = 0; z < 5; z++) {
				if (nums[i] == nums[z] && !(i == z)) {
					multiplicity1[i] += 1;
				}
			}
		}
		int t = 0;
		for (int f = 4; f > 0; f--) {
			multiplicity[t] = multiplicity1[f];
			t++;
		}
		// System.out.println( Arrays.toString(multiplicity));
	}

	public boolean isOnePair() { // returns true if there is a single pair in
									// the hand, using the multiplicity values.
		if ((multiplicity[0] == 2 && multiplicity[2] != 2) || (multiplicity[2] == 2 && multiplicity[0] != 2))
			return true;
		return false;
	}

	public void failGraceful() { // Allows for the program to end in the case of
									// an unexpected value.
		try {
			Integer.parseInt("this should fail");
		} catch (NumberFormatException e) {
			System.out.println("Error. System Failure. Please try again.");
			System.exit(0);
		}
	}

}
