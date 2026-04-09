package T;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import o.C7009H;

/* renamed from: T.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3546o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f21177a = new C3556t0("provider");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f21178b = new C3556t0("provider");

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21179c = new C3556t0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    private static final Object f21180d = new C3556t0("providerValues");

    /* renamed from: e, reason: collision with root package name */
    private static final Object f21181e = new C3556t0("providers");

    /* renamed from: f, reason: collision with root package name */
    private static final Object f21182f = new C3556t0("reference");

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f21183g = new Comparator() { // from class: T.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3546o.b((X) obj, (X) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object A(C3512a0 c3512a0) {
        return c3512a0.d() != null ? new Z(Integer.valueOf(c3512a0.a()), c3512a0.d()) : Integer.valueOf(c3512a0.a());
    }

    public static final Object B() {
        return f21178b;
    }

    public static final Object C() {
        return f21181e;
    }

    public static final Object D() {
        return f21182f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(List list, int i10, K0 k02, Object obj) {
        int iW = w(list, i10);
        if (iW < 0) {
            int i11 = -(iW + 1);
            if (!(obj instanceof H)) {
                obj = null;
            }
            list.add(i11, new X(k02, i10, obj));
            return;
        }
        X x10 = (X) list.get(iW);
        if (!(obj instanceof H)) {
            x10.e(null);
            return;
        }
        Object objA = x10.a();
        if (objA == null) {
            x10.e(obj);
        } else if (objA instanceof o.I) {
            ((o.I) objA).h(obj);
        } else {
            x10.e(o.U.b(objA, obj));
        }
    }

    public static final boolean F(C3513a1 c3513a1) {
        return c3513a1.k() > c3513a1.u() + 1;
    }

    public static final boolean G(C3525e1 c3525e1) {
        return c3525e1.a0() > c3525e1.c0() + 1;
    }

    public static final boolean H() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7009H I(int i10) {
        return C3549p0.b(new C7009H(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(C3513a1 c3513a1, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (c3513a1.P(i10) == i11) {
            return i11;
        }
        if (c3513a1.P(i11) == i10) {
            return i10;
        }
        if (c3513a1.P(i10) == c3513a1.P(i11)) {
            return c3513a1.P(i10);
        }
        int iU = u(c3513a1, i10, i12);
        int iU2 = u(c3513a1, i11, i12);
        int i13 = iU - iU2;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = c3513a1.P(i10);
        }
        int i15 = iU2 - iU;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = c3513a1.P(i11);
        }
        while (i10 != i11) {
            i10 = c3513a1.P(i10);
            i11 = c3513a1.P(i11);
        }
        return i10;
    }

    public static final void K(C3525e1 c3525e1, R0 r02) {
        int iE0;
        int iQ = c3525e1.Q(c3525e1.f21053b, c3525e1.h0(c3525e1.a0() + c3525e1.k0(c3525e1.a0())));
        for (int iQ2 = c3525e1.Q(c3525e1.f21053b, c3525e1.h0(c3525e1.a0())); iQ2 < iQ; iQ2++) {
            Object obj = c3525e1.f21054c[c3525e1.R(iQ2)];
            int iF = -1;
            if (obj instanceof InterfaceC3538k) {
                r02.b((InterfaceC3538k) obj, c3525e1.e0() - iQ2, -1, -1);
            }
            if (obj instanceof T0) {
                int iE02 = c3525e1.e0() - iQ2;
                T0 t02 = (T0) obj;
                C3520d c3520dA = t02.a();
                if (c3520dA == null || !c3520dA.b()) {
                    iE0 = -1;
                } else {
                    iF = c3525e1.F(c3520dA);
                    iE0 = c3525e1.e0() - c3525e1.b1(iF);
                }
                r02.c(t02.b(), iE02, iF, iE0);
            }
            if (obj instanceof K0) {
                ((K0) obj).x();
            }
        }
        c3525e1.L0();
    }

    private static final void L(C3525e1 c3525e1, int i10, int i11, Object obj) {
        if (obj == c3525e1.R0(i10, i11, InterfaceC3540l.f21100a.a())) {
            return;
        }
        r("Slot table is out of sync");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X M(List list, int i10) {
        int iW = w(list, i10);
        if (iW >= 0) {
            return (X) list.remove(iW);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(List list, int i10, int i11) {
        int iV = v(list, i10);
        while (iV < list.size() && ((X) list.get(iV)).b() < i11) {
            list.remove(iV);
        }
    }

    public static final void O(boolean z10) {
        if (z10) {
            return;
        }
        r("Check failed");
    }

    public static final void P() {
    }

    public static final void Q(int i10, int i11, int i12, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(X x10, X x11) {
        return AbstractC6492s.k(x10.b(), x11.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(C3516b1 c3516b1, C3520d c3520d) {
        ArrayList arrayList = new ArrayList();
        C3513a1 c3513a1D = c3516b1.D();
        try {
            q(c3513a1D, arrayList, c3516b1.e(c3520d));
            Yg.J j10 = Yg.J.f24997a;
            return arrayList;
        } finally {
            c3513a1D.d();
        }
    }

    private static final void q(C3513a1 c3513a1, List list, int i10) {
        if (c3513a1.J(i10)) {
            list.add(c3513a1.L(i10));
            return;
        }
        int iE = i10 + 1;
        int iE2 = i10 + c3513a1.E(i10);
        while (iE < iE2) {
            q(c3513a1, list, iE);
            iE += c3513a1.E(iE);
        }
    }

    public static final void r(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void s(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void t(C3525e1 c3525e1, R0 r02) {
        int iF;
        int iE0;
        int iA0 = c3525e1.a0();
        int iB0 = c3525e1.b0();
        while (iA0 < iB0) {
            Object objA0 = c3525e1.A0(iA0);
            if (objA0 instanceof InterfaceC3538k) {
                r02.a((InterfaceC3538k) objA0, c3525e1.e0() - c3525e1.d1(iA0), -1, -1);
            }
            int iZ0 = c3525e1.Z0(c3525e1.f21053b, c3525e1.h0(iA0));
            int i10 = iA0 + 1;
            int iQ = c3525e1.Q(c3525e1.f21053b, c3525e1.h0(i10));
            for (int i11 = iZ0; i11 < iQ; i11++) {
                int i12 = i11 - iZ0;
                Object obj = c3525e1.f21054c[c3525e1.R(i11)];
                if (obj instanceof T0) {
                    T0 t02 = (T0) obj;
                    S0 s0B = t02.b();
                    if (!(s0B instanceof V0)) {
                        L(c3525e1, iA0, i12, obj);
                        int iE02 = c3525e1.e0() - i12;
                        C3520d c3520dA = t02.a();
                        if (c3520dA == null || !c3520dA.b()) {
                            iF = -1;
                            iE0 = -1;
                        } else {
                            iF = c3525e1.F(c3520dA);
                            iE0 = c3525e1.e0() - c3525e1.b1(iF);
                        }
                        r02.c(s0B, iE02, iF, iE0);
                    }
                } else if (obj instanceof K0) {
                    L(c3525e1, iA0, i12, obj);
                    ((K0) obj).x();
                }
            }
            iA0 = i10;
        }
    }

    private static final int u(C3513a1 c3513a1, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = c3513a1.P(i10);
            i12++;
        }
        return i12;
    }

    private static final int v(List list, int i10) {
        int iW = w(list, i10);
        return iW < 0 ? -(iW + 1) : iW;
    }

    private static final int w(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iK = AbstractC6492s.k(((X) list.get(i12)).b(), i10);
            if (iK < 0) {
                i11 = i12 + 1;
            } else {
                if (iK <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X x(List list, int i10, int i11) {
        int iV = v(list, i10);
        if (iV >= list.size()) {
            return null;
        }
        X x10 = (X) list.get(iV);
        if (x10.b() < i11) {
            return x10;
        }
        return null;
    }

    public static final Object y() {
        return f21179c;
    }

    public static final Object z() {
        return f21177a;
    }
}
