package basic.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws IOException {

		ArrayList<Person> ps = new ArrayList<Person>();

		input(ps);
		// a
		print(ps);
		// b
		sortluong(ps);
		System.out.println("------------------------");
		System.out.println("Danh sách Person sau khi sắp xếp theo lương tăng dần:");
		print(ps);
		// c
		System.out.println("------------------------");
		maxLuong(ps);

	}

	private static void maxLuong(ArrayList<Person> ps) {
		// TODO Auto-generated method stub
		System.out.println("nguoi co luong cao nhat la " + ps.get(ps.size() - 1).getTen());
	}

	private static void sortluong(ArrayList<Person> ps) {
		// TODO Auto-generated method stub
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getThunhap() > p2.getThunhap()) {
					return 1;
				} else if (p1.getThunhap() < p2.getThunhap()) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(ps, comparator);
	}

	private static void input(ArrayList<Person> ps) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fstream = new FileInputStream("input.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		// Đọc từng dòng từ tập tin input.txt
		while ((strLine = br.readLine()) != null) {
			System.out.println(strLine);
			String[] arr = strLine.split(":");
			String ten = arr[0];
			// chuyển đổi chuôi thành số
			int age = Integer.valueOf(arr[1]);
			int tuoi = age;
			String thanhPho = arr[2];
			// chuyển đổi chuôi thành số
			double thuNhap = Double.valueOf(arr[3]);
			Person person = new Person(ten, tuoi, thanhPho, thuNhap);
			ps.add(person);
		}

	}

	public static void print(ArrayList<Person> ps) {
		for (int i = 0; i < ps.size(); i++) {
			System.out.println(ps.get(i).toString());
		}
	}

}
