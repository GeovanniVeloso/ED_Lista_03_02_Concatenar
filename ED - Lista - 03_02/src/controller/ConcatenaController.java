package controller;

import br.edu.fatec.zl.Lista;

public class ConcatenaController {

	public ConcatenaController() {
		super();
	}

	public void Uni_Int_Lista(Lista<Integer> A, Lista<Integer> B) {
		Lista<Integer> I = new Lista<Integer>();
		Lista<Integer> U = new Lista<Integer>();

		for (int c = 0; c < 5; c++) {
			for (int i = 0; i < 7; i++) {
				try {
					if (A.get(i) == B.get(c)) {
						if (!I.isEmpty()) {
							I.addLast(A.get(i));
						} else {
							I.addFirst(A.get(i));
						}
					}
				} catch (Exception e) {
					System.err.println(e + "21");
				}
			}
		}

		for (int i = 0; i < 7; i++) {
			if (!U.isEmpty()) {
				try {
					U.addLast(A.get(0));
				} catch (Exception e) {
					System.err.println(e + "41");
				}
				if (!B.isEmpty()) {
					try {
						U.addLast(B.get(0));
					} catch (Exception e) {
						System.err.println(e + "46");
					}
				}
				try {
					A.removeFirst();
				} catch (Exception e) {
					System.err.println(e + "51");
				}
				if (!B.isEmpty()) {
					try {
						B.removeFirst();
					} catch (Exception e) {
						System.err.println(e + "56");
					}
				}
			} else {
				try {
					U.addFirst(A.get(0));
				} catch (Exception e) {
					System.err.println(e + "62");
				}
				if (!B.isEmpty()) {
					try {
						U.addFirst(B.get(0));
					} catch (Exception e) {
						System.err.println(e + "67");
					}
				}
				try {
					A.removeFirst();
				} catch (Exception e) {
					System.err.println(e + "72");
				}
				if (!B.isEmpty()) {
					try {
						B.removeFirst();
					} catch (Exception e) {
						System.err.println(e + "77");
					}
				}
			}
		}

		int c = I.size();
		int i = 0;
		while (i < c) {
			try {
				System.out.println("I #" + I.get(i));
			} catch (Exception e) {
				System.err.println(e);
			}
			i += 1;
		}

		c = U.size();
		while (i < c) {
			try {
				System.out.println("U #" + U.get(i));
			} catch (Exception e) {
				System.err.println(e);
			}
			i += 1;
		}
	}
}
