package vf;

import Ii.N;
import L0.C3174d;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.t1;
import dh.C5385j;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;

/* renamed from: vf.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8226f {
    public static final C8225e a(C3174d str, long j10, t1 t1Var, N n10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(str, "str");
        interfaceC3540l.U(484653129);
        if ((i11 & 2) != 0) {
            j10 = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().j();
        }
        long j11 = j10;
        if ((i11 & 4) != 0) {
            t1Var = (t1) interfaceC3540l.t(AbstractC3932k0.s());
        }
        t1 t1Var2 = t1Var;
        if ((i11 & 8) != 0) {
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540l));
                interfaceC3540l.K(a10);
                objF = a10;
            }
            n10 = ((A) objF).a();
        }
        N n11 = n10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(484653129, i10, -1, "com.ui.wifiman.ui.util.rememberHyperlinkTextHighlighter (HyperlinkTextHighlighter.kt:227)");
        }
        interfaceC3540l.U(1938427405);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(str)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.j(j11)) || (i10 & 48) == 32);
        Object objF2 = interfaceC3540l.f();
        if (z10 || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new C8225e(str, j11, t1Var2, n11, null);
            interfaceC3540l.K(objF2);
        }
        C8225e c8225e = (C8225e) objF2;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c8225e;
    }
}
