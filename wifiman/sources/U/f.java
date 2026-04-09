package U;

import T.AbstractC3546o;
import T.C3520d;
import T.C3525e1;
import T.InterfaceC3526f;

/* loaded from: classes.dex */
public abstract class f {
    private static final int c(C3525e1 c3525e1) {
        int iA0 = c3525e1.a0();
        int iC0 = c3525e1.c0();
        while (iC0 >= 0 && !c3525e1.r0(iC0)) {
            iC0 = c3525e1.E0(iC0);
        }
        int iK0 = iC0 + 1;
        int iC02 = 0;
        while (iK0 < iA0) {
            if (c3525e1.m0(iA0, iK0)) {
                if (c3525e1.r0(iK0)) {
                    iC02 = 0;
                }
                iK0++;
            } else {
                iC02 += c3525e1.r0(iK0) ? 1 : c3525e1.C0(iK0);
                iK0 += c3525e1.k0(iK0);
            }
        }
        return iC02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C3525e1 c3525e1, C3520d c3520d, InterfaceC3526f interfaceC3526f) {
        int iF = c3525e1.F(c3520d);
        AbstractC3546o.O(c3525e1.a0() < iF);
        e(c3525e1, interfaceC3526f, iF);
        int iC = c(c3525e1);
        while (c3525e1.a0() < iF) {
            if (c3525e1.l0(iF)) {
                if (c3525e1.q0()) {
                    interfaceC3526f.d(c3525e1.A0(c3525e1.a0()));
                    iC = 0;
                }
                c3525e1.g1();
            } else {
                iC += c3525e1.V0();
            }
        }
        AbstractC3546o.O(c3525e1.a0() == iF);
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3525e1 c3525e1, InterfaceC3526f interfaceC3526f, int i10) {
        while (!c3525e1.n0(i10)) {
            c3525e1.W0();
            if (c3525e1.r0(c3525e1.c0())) {
                interfaceC3526f.g();
            }
            c3525e1.T();
        }
    }
}
