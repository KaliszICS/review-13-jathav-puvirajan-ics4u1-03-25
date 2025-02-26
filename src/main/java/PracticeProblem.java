import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> list, int num1, int num2){
		String storage = list.get(num1);
		list.set(num1, list.get(num2));
		list.set(num2, storage);
	}
	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> arrl = new ArrayList<Double>();
		for(int i = 0; i < arr.length; i++){
			arrl.add(arr[i]);
		}
		return arrl;
	}
	public static HashMap<String,Integer> combineParallelArrays(String[] strarr, int[] intarr){
		HashMap<String, Integer> hmp = new HashMap<String, Integer>();
		for(int i = 0; i < strarr.length; i++){
			hmp.put(strarr[i],intarr[i]);
		}
		return hmp;
	}
	public static void increaseAge(HashMap<String, Integer> map, String name){
		map.put(name, map.get(name) +1);
	}

}
