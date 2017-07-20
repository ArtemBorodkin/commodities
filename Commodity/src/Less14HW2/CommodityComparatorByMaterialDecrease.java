package Less14HW2;

import java.util.Comparator;

import Less14HW2.Commodity;

public class CommodityComparatorByMaterialDecrease implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o2.material.compareTo(o1.material);
	}


}


















