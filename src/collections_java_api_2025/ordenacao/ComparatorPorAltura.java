package collections_java_api_2025.ordenacao;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		if (p1.getAltura() < p2.getAltura()) {
			return -1;
		} else if (p1.getAltura() > p2.getAltura()) {
			return 1;
		} else {
			return 0;
		}
	}

}
