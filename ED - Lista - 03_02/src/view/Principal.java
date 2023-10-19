package view;

import br.edu.fatec.zl.Lista;
import controller.ConcatenaController;

public class Principal {

	public static void main(String[] args) {
		int[] Av = { 3, 5, 8, 12, 9, 7, 16 };
		int[] Bv = { 9, 6, 2, 3, 7 };

		Lista<Integer> A = new Lista<Integer>();
		Lista<Integer> B = new Lista<Integer>();

		ConcatenaController cc = new ConcatenaController();

		int c = Av.length;
		int i = 0;
		while (i < c) {
			if (!A.isEmpty()) {
				try {
					A.addLast(Av[i]);
				} catch (Exception e) {
					System.err.println(e);
				}
			}else {
				A.addFirst(Av[i]);
			}
			i += 1;
		}

		c = Bv.length;
		i = 0;
		while (i < c) {
			if(!B.isEmpty()) {
			try {
				B.addLast(Bv[i]);
			} catch (Exception e) {
				System.err.println(e);
			}
			}else {
				B.addFirst(Bv[i]);
			}
			i += 1;
		}

		cc.Uni_Int_Lista(A, B);
	}

}
