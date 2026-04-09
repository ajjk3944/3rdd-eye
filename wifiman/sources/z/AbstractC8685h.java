package z;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import z.C8680c;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8685h {

    /* renamed from: a, reason: collision with root package name */
    private static final C0.C f66908a = new C8686i(C8680c.f66832a.g(), f0.c.f46573a.k());

    public static final C0.C a(C8680c.m mVar, c.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
        C0.C c10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (AbstractC6492s.d(mVar, C8680c.f66832a.g()) && AbstractC6492s.d(bVar, f0.c.f46573a.k())) {
            interfaceC3540l.U(345962472);
            interfaceC3540l.J();
            c10 = f66908a;
        } else {
            interfaceC3540l.U(346016319);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(mVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(bVar)) || (i10 & 48) == 32);
            Object objF = interfaceC3540l.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C8686i(mVar, bVar);
                interfaceC3540l.K(objF);
            }
            c10 = (C8686i) objF;
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c10;
    }

    public static final long b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? Y0.c.a(i11, i13, i10, i12) : Y0.b.f24516b.a(i11, i13, i10, i12);
    }
}
