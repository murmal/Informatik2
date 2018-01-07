import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Time {

	public static void hintenAnhaengen() {

		Vector<Integer> vector = new Vector<Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		HashSet<Integer> hashset = new HashSet<Integer>();
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		Vector<Integer> vector1 = new Vector<Integer>(100_000);
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>(100_000);

		long[] durationInMsec = new long[6];
		long[] durationInMsec1 = new long[6];
		long[] durationInMsec2 = new long[6];
		long[] durationInMsec3 = new long[6];
		long[] durationInMsec4 = new long[6];
		long[] durationInMsec5 = new long[6];
		long[] durationInMsec6 = new long[6];

		for (int e = 0; e < 6; e++) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				vector.add(i);
			}
			long end = System.currentTimeMillis();
			durationInMsec[e] = end - start;
		}

		for (int e = 0; e < 6; e++) {
			long start1 = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				arraylist.add(i);
			}
			long end1 = System.currentTimeMillis();
			durationInMsec1[e] = end1 - start1;
		}

		for (int e = 0; e < 6; e++) {
			long start2 = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				linkedlist.add(i);
			}
			long end2 = System.currentTimeMillis();
			durationInMsec2[e] = end2 - start2;
		}

		for (int e = 0; e < 6; e++) {
			long start3 = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				hashset.add(i);
			}
			long end3 = System.currentTimeMillis();
			durationInMsec3[e] = end3 - start3;
		}

		for (int e = 0; e < 6; e++) {
			long start4 = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				treeset.add(i);
			}
			long end4 = System.currentTimeMillis();
			durationInMsec4[e] = end4 - start4;
		}

		for (int e = 0; e < 6; e++) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				vector1.add(i);
			}
			long end5 = System.currentTimeMillis();
			durationInMsec5[e] = end5 - start;
		}

		for (int e = 0; e < 6; e++) {
			long start1 = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				arraylist1.add(i);
			}
			long end6 = System.currentTimeMillis();
			durationInMsec6[e] = end6 - start1;
		}

		for (int e = 0; e < 6; e++) {
			long start1 = System.currentTimeMillis();
			for (int i = 0; i < 100_000; i++) {
				arraylist1.add(i);
			}
			long end6 = System.currentTimeMillis();
			durationInMsec6[e] = end6 - start1;
		}

		Iterator<Integer> itV = vector.iterator();
		Iterator<Integer> itA = arraylist.iterator();
		Iterator<Integer> itL = linkedlist.iterator();
		Iterator<Integer> itH = hashset.iterator();
		Iterator<Integer> itT = treeset.iterator();

		long startF = System.currentTimeMillis();
		Collections.binarySearch(vector, 99_999);
		long endF = System.currentTimeMillis();
		long durationInMsecF = endF - startF;

		long startG = System.currentTimeMillis();
		Collections.binarySearch(arraylist, 99_999);
		long endG = System.currentTimeMillis();
		long durationInMsecG = endG - startG;

		long startE = System.currentTimeMillis();
		vector.indexOf(99_999);
		long endE = System.currentTimeMillis();
		long durationInMsecE = endE - startE;

		long startQ = System.currentTimeMillis();
		arraylist.indexOf(99_999);
		long endQ = System.currentTimeMillis();
		long durationInMsecQ = endQ - startQ;

		long startR = System.currentTimeMillis();
		linkedlist.indexOf(99_999);
		long endR = System.currentTimeMillis();
		long durationInMsecR = endR - startR;

		long start1 = System.currentTimeMillis();
		while (itV.hasNext()) {
			itV.next();
		}
		long end1 = System.currentTimeMillis();
		long durationInMsec8 = end1 - start1;

		long start2 = System.currentTimeMillis();
		while (itA.hasNext()) {
			itA.next();
		}
		long end2 = System.currentTimeMillis();
		long durationInMsec9 = end2 - start2;

		long start3 = System.currentTimeMillis();
		while (itL.hasNext()) {
			itL.next();
		}
		long end3 = System.currentTimeMillis();
		long durationInMsecA = end3 - start3;

		long start4 = System.currentTimeMillis();
		while (itH.hasNext()) {
			itH.next();
		}
		long end4 = System.currentTimeMillis();
		long durationInMsecB = end4 - start4;

		long start5 = System.currentTimeMillis();
		while (itT.hasNext()) {
			itT.next();
		}
		long end5 = System.currentTimeMillis();
		long durationInMsecC = end5 - start5;

		System.out.println("Vector Iterator: " + durationInMsec8 + "\n");
		System.out.println(durationInMsec[0] + "\t" + durationInMsec[1] + "\t" + durationInMsec[2] + "\t"
				+ durationInMsec[3] + "\t" + durationInMsec[4] + "\t" + durationInMsec[5]);
		System.out.println("\n");
		System.out.println("Vector with initial capacity of 100_000:\n");
		System.out.println(durationInMsec5[0] + "\t" + durationInMsec5[1] + "\t" + durationInMsec5[2] + "\t"
				+ durationInMsec5[3] + "\t" + durationInMsec5[4] + "\t" + durationInMsec5[5]);
		System.out.println("\n");
		System.out.print("ArrayList Iterator: " + durationInMsec9 + "\n");
		System.out.println(durationInMsec1[0] + "\t" + durationInMsec1[1] + "\t" + durationInMsec1[2] + "\t"
				+ durationInMsec1[3] + "\t" + durationInMsec1[4] + "\t" + durationInMsec1[5]);
		System.out.println("\n");
		System.out.print("ArrayList with initial capacity of 100_000:\n");
		System.out.println(durationInMsec6[0] + "\t" + durationInMsec6[1] + "\t" + durationInMsec6[2] + "\t"
				+ durationInMsec6[3] + "\t" + durationInMsec6[4] + "\t" + durationInMsec6[5]);
		System.out.println("\n");
		System.out.print("LinkedList Iterator:" + durationInMsecA + "\n");
		System.out.println(durationInMsec2[0] + "\t" + durationInMsec2[1] + "\t" + durationInMsec2[2] + "\t"
				+ durationInMsec2[3] + "\t" + durationInMsec2[4] + "\t" + durationInMsec2[5]);
		System.out.println("\n");
		System.out.print("HashSet Iterator:" + durationInMsecB + "\n");
		System.out.println(durationInMsec3[0] + "\t" + durationInMsec3[1] + "\t" + durationInMsec3[2] + "\t"
				+ durationInMsec3[3] + "\t" + durationInMsec3[4] + "\t" + durationInMsec3[5]);
		System.out.println("\n");
		System.out.print("TreeSet Iterator:" + durationInMsecC + "\n");
		System.out.println(durationInMsec4[0] + "\t" + durationInMsec4[1] + "\t" + durationInMsec4[2] + "\t"
				+ durationInMsec4[3] + "\t" + durationInMsec4[4] + "\t" + durationInMsec4[5]);
		System.out.println("\n");
		System.out.println("Binary Search Vector:" + durationInMsecF);
		System.out.println("Binary Search Arraylist:" + durationInMsecG);
		System.out.println("IndexOf Vector:" + durationInMsecE);
		System.out.println("IndexOf Arraylist:" + durationInMsecQ);
		System.out.println("IndexOf LinkedList:" + durationInMsecR);

	}

	public static void vorneAnhaengen() {

		Vector<Integer> vector = new Vector<Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		Vector<Integer> vector1 = new Vector<Integer>(100_000);
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>(100_000);

		long[] durationInMsec = new long[6];
		long[] durationInMsec1 = new long[6];
		long[] durationInMsec2 = new long[6];
		long[] durationInMsec5 = new long[6];
		long[] durationInMsec6 = new long[6];

		for (int e = 0; e < 6; e++) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 10_000; i++) {
				vector.add(0, i);
			}
			long end = System.currentTimeMillis();
			durationInMsec[e] = end - start;
		}

		for (int e = 0; e < 6; e++) {
			long start1 = System.currentTimeMillis();
			for (int i = 0; i < 10_000; i++) {
				arraylist.add(0, i);
			}
			long end1 = System.currentTimeMillis();
			durationInMsec1[e] = end1 - start1;
		}

		for (int e = 0; e < 6; e++) {
			long start2 = System.currentTimeMillis();
			for (int i = 0; i < 10_000; i++) {
				linkedlist.add(0, i);
			}
			long end2 = System.currentTimeMillis();
			durationInMsec2[e] = end2 - start2;
		}

		for (int e = 0; e < 6; e++) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 10_000; i++) {
				vector1.add(0, i);
			}
			long end3 = System.currentTimeMillis();
			durationInMsec5[e] = end3 - start;
		}

		for (int e = 0; e < 6; e++) {
			long start1 = System.currentTimeMillis();
			for (int i = 0; i < 10_000; i++) {
				arraylist1.add(0, i);
			}
			long end4 = System.currentTimeMillis();
			durationInMsec6[e] = end4 - start1;
		}

		System.out.println("Vector:\n");
		System.out.println(durationInMsec[0] + "\t" + durationInMsec[1] + "\t" + durationInMsec[2] + "\t"
				+ durationInMsec[3] + "\t" + durationInMsec[4] + "\t" + durationInMsec[5]);
		System.out.println("\n");
		System.out.println("Vector with initial capacity of 10_000:\n");
		System.out.println(durationInMsec5[0] + "\t" + durationInMsec5[1] + "\t" + durationInMsec5[2] + "\t"
				+ durationInMsec5[3] + "\t" + durationInMsec5[4] + "\t" + durationInMsec5[5]);
		System.out.println("\n");
		System.out.print("ArrayList:\n");
		System.out.println(durationInMsec1[0] + "\t" + durationInMsec1[1] + "\t" + durationInMsec1[2] + "\t"
				+ durationInMsec1[3] + "\t" + durationInMsec1[4] + "\t" + durationInMsec1[5]);
		System.out.println("\n");
		System.out.print("ArrayList with initial capacity of 10_000:\n");
		System.out.println(durationInMsec6[0] + "\t" + durationInMsec6[1] + "\t" + durationInMsec6[2] + "\t"
				+ durationInMsec6[3] + "\t" + durationInMsec6[4] + "\t" + durationInMsec6[5]);
		System.out.println("\n");
		System.out.print("LinkedList:\n");
		System.out.println(durationInMsec2[0] + "\t" + durationInMsec2[1] + "\t" + durationInMsec2[2] + "\t"
				+ durationInMsec2[3] + "\t" + durationInMsec2[4] + "\t" + durationInMsec2[5]);
		System.out.println("\n");

	}

	public static void zufallArray() {

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		
		
		
		long[] durationInMsec = new long[6];
		
		

		for (int e = 0; e < 6; e++) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 1000; i++) {
				arraylist.add((int) (Math.random() * 9999));
			}
			long end = System.currentTimeMillis();
			durationInMsec[e] = end - start;
		}
		
		
			long start1 = System.currentTimeMillis();
			
			
			Stream<Integer> stream = Stream.generate(() -> (int)(Math.random()*9999));
			
			arraylist1 = (ArrayList<Integer>) stream.collect(Collectors.toList());
			
			
			long end1 = System.currentTimeMillis();
			long durationInMsec1 = end1 - start1;
		
		

	}

	public static void main(String[] args) {

		//hintenAnhaengen();
		System.out.println("------------------------------------------");
		//vorneAnhaengen();
		zufallArray();
	}

}
