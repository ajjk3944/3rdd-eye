package z;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import z.C8680c;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    private static final C0.C f66815a = new X(C8680c.f66832a.f(), f0.c.f46573a.l());

    public static final long a(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? Y0.c.a(i10, i12, i11, i13) : Y0.b.f24516b.b(i10, i12, i11, i13);
    }

    public static final C0.C b(C8680c.e eVar, c.InterfaceC1752c interfaceC1752c, InterfaceC3540l interfaceC3540l, int i10) {
        C0.C c10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:122)");
        }
        if (AbstractC6492s.d(eVar, C8680c.f66832a.f()) && AbstractC6492s.d(interfaceC1752c, f0.c.f46573a.l())) {
            interfaceC3540l.U(-849081669);
            interfaceC3540l.J();
            c10 = f66815a;
        } else {
            interfaceC3540l.U(-849030798);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(eVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(interfaceC1752c)) || (i10 & 48) == 32);
            Object objF = interfaceC3540l.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new X(eVar, interfaceC1752c);
                interfaceC3540l.K(objF);
            }
            c10 = (X) objF;
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c10;
    }
}
