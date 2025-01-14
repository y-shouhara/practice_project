package sample;

import java.util.ArrayList;
import java.util.List;

public class ListSamlpe {

	public static void main(String[] args) {
		//List(可変長配列)の宣言方法
		List<String> strList = new ArrayList<String>();
		strList.add("角谷");
		System.out.println(strList.get(0));
		System.out.println(strList.size());
		List<Integer> integerList = new ArrayList<Integer>();
	}

}
