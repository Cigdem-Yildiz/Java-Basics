package dna_Control;

public class DNAControl {
	private String dna1, dna2;

	private int length;

	public DNAControl(String dna1, String dna2) {
		this.dna1 = dna1;
		this.dna2 = dna2;

		if (dna1.length() > dna2.length()) {
			length = dna2.length();
		} else {
			length = dna1.length();
		}
	}

	public String controlFromStart() {
		int value = 0;
		for (int i = 1; i <= length; i++) {
			String subDna1 = dna1.substring(0, i);
			String subDna2 = dna2.substring(0, i);
			if (subDna1.equals(subDna2)) {
				value = i;
			} else {
				break;
			}
		}
		if (value == 0)
			return null;
		return dna1.substring(0, value);
	}

	public String controlAllSubs() {
		int start = 0, finish = 0;
		String dnaPart = "";

		for (int i = 0; i < dna1.length(); i++) {
			for (int j = i + 1; j <= dna1.length(); j++) {
				String subDna = dna1.substring(i, j);
				if (dna2.contains(subDna)) {
					if (subDna.length() > dnaPart.length()) {
						start = i;
						finish = j;
						dnaPart = subDna;
					}
				} else {
					break;
				}
			}
		}
		if ((finish - start) == 1)
			return null;
		return dnaPart + " (" + (finish - start) + ")";
	}

}
