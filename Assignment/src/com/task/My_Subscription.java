package com.task;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class My_Subscription{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the budget value:");
		int n = sc.nextInt();
		My_Subscription ms = new My_Subscription();
		ms.budget(n);
	}

	public void budget(int amount) {
		double toi[] = { 3, 3, 3, 3, 3, 5, 6 };
		double hindu[] = { 2.5, 2.5, 2.5, 2.5, 2.5, 4, 4 };
		double et[] = { 4, 4, 4, 4, 4, 4, 10 };
		double bm[] = { 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5 };
		double ht[] = { 2, 2, 2, 2, 2, 4, 4 };

		double sumTOI = DoubleStream.of(toi).sum();
		double sumHindu = DoubleStream.of(hindu).sum();
		double sumET = DoubleStream.of(et).sum();
		double sumBM = DoubleStream.of(bm).sum();
		double sumHT = DoubleStream.of(ht).sum();

		HashMap<String, Double> map = new HashMap<>();
		map.put("TOI", sumTOI);
		map.put("Hindu", sumHindu);
		map.put("ET", sumET);
		map.put("BM", sumBM);
		map.put("HT", sumHT);

		HashMap<Integer, String> newspaper = new HashMap<>();
		newspaper.put(0, "TOI");
		newspaper.put(1, "Hindu");
		newspaper.put(2, "ET");
		newspaper.put(3, "BM");
		newspaper.put(4, "HT");

		System.out.println("combinations of possible newspaper subscriptions are:");
		char doublecodes = '"';
		for (int i = 0; i < map.size(); i++) {
			for (int j = i + 1; j < map.size(); j++) {
				if ((map.get(newspaper.get(i)) + map.get(newspaper.get(j))) <= amount) {
					System.out.print("{" + doublecodes + newspaper.get(i) + doublecodes + "," + doublecodes
							+ newspaper.get(j) + doublecodes + "}" + ",");
				}
			}
		}
	}

}
