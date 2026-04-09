package P;

import E0.InterfaceC2632j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import m0.C6733v0;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import r.G;
import r.InterfaceC7533i;
import r.r0;
import s.InterfaceC7834G;
import y.C8547b;
import y.C8549d;
import y.C8552g;
import y.InterfaceC8555j;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final r0 f17951a = new r0(15, 0, G.d(), 2, null);

    public static final InterfaceC2632j c(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a) {
        return t.d(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7533i d(InterfaceC8555j interfaceC8555j) {
        if (interfaceC8555j instanceof C8552g) {
            return f17951a;
        }
        if (!(interfaceC8555j instanceof C8549d) && !(interfaceC8555j instanceof C8547b)) {
            return f17951a;
        }
        return new r0(45, 0, G.d(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7533i e(InterfaceC8555j interfaceC8555j) {
        if (!(interfaceC8555j instanceof C8552g) && !(interfaceC8555j instanceof C8549d) && (interfaceC8555j instanceof C8547b)) {
            return new r0(150, 0, G.d(), 2, null);
        }
        return f17951a;
    }

    public static final InterfaceC7834G f(boolean z10, float f10, long j10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Y0.h.f24523b.c();
        }
        if ((i11 & 4) != 0) {
            j10 = C6733v0.f52951b.e();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        z1 z1VarN = o1.n(C6733v0.g(j10), interfaceC3540l, (i10 >> 6) & 14);
        boolean z12 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.c(z10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !interfaceC3540l.g(f10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objF = interfaceC3540l.f();
        if (z13 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new e(z10, f10, z1VarN, null);
            interfaceC3540l.K(objF);
        }
        e eVar = (e) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return eVar;
    }
}
