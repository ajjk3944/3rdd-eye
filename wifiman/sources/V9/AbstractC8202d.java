package v9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.z1;
import Y0.h;
import Yg.J;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6525a;
import l0.AbstractC6526b;
import l0.AbstractC6532h;
import l0.AbstractC6534j;
import l0.AbstractC6536l;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6688Y;
import m0.U0;
import m0.j1;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7044k;
import o0.InterfaceC7039f;
import r.AbstractC7521c;
import r.AbstractC7535j;
import r.G;
import s.AbstractC7848i;
import z1.AbstractC8707a;

/* renamed from: v9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8202d {
    public static final void c(final e eVar, final float f10, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1929048487);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.g(f10) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1929048487, i12, -1, "com.ui.core.ui.component.battery.UiBatteryStatus (UiBatteryStatus.kt:57)");
            }
            final z1 z1VarD = AbstractC7521c.d(AbstractC8707a.a(f10, 0.0f, 1.0f), AbstractC7535j.k(500, 0, G.c()), 0.0f, null, null, interfaceC3540lR, 0, 28);
            final long jA = C8199a.f63525a.a(((Number) z1VarD.getValue()).floatValue(), interfaceC3540lR, 48);
            final U0 u0A = AbstractC6688Y.a();
            e eVarV = r.v(eVar, h.j(24));
            interfaceC3540lR.U(1351521043);
            boolean zJ = interfaceC3540lR.j(jA) | interfaceC3540lR.T(z1VarD) | interfaceC3540lR.l(u0A);
            Object objF = interfaceC3540lR.f();
            if (zJ || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: v9.b
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC8202d.d(jA, z1VarD, u0A, (InterfaceC7039f) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC7848i.a(eVarV, (InterfaceC6835l) objF, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: v9.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8202d.e(eVar, f10, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(long j10, z1 z1Var, U0 u02, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        float fH = C6537m.h(Canvas.c()) / Canvas.d1(h.j(24));
        float fD1 = Canvas.d1(h.j(20)) * fH;
        float fD12 = Canvas.d1(h.j(11)) * fH;
        float fD13 = Canvas.d1(h.j(3)) * fH;
        float fD14 = Canvas.d1(h.j(16)) * fH;
        float fD15 = Canvas.d1(h.j(7)) * fH;
        float f10 = 1;
        float fD16 = Canvas.d1(h.j(f10)) * fH;
        float fD17 = Canvas.d1(h.j(f10)) * fH;
        float fD18 = Canvas.d1(h.j(4)) * fH;
        float fD19 = Canvas.d1(h.j(2)) * fH;
        float f11 = fD1 / 2.0f;
        InterfaceC7039f.d0(Canvas, new j1(j10, null), AbstractC6532h.a((C6531g.m(Canvas.D1()) - f11) - (Canvas.d1(h.j(f10)) * fH), C6531g.n(Canvas.D1()) - (fD12 / 2.0f)), AbstractC6538n.a(fD1, fD12), AbstractC6526b.a(fD13, fD13), 0.0f, new C7044k(Canvas.d1(h.j(f10)) * fH, 0.0f, 0, 0, null, 30, null), null, 0, 208, null);
        InterfaceC7039f.d0(Canvas, new j1(j10, null), AbstractC6532h.a((C6531g.m(Canvas.D1()) - (fD14 / 2.0f)) - (Canvas.d1(h.j(f10)) * fH), C6531g.n(Canvas.D1()) - (fD15 / 2.0f)), AbstractC6538n.a(((Number) z1Var.getValue()).floatValue() * fD14, fD15), AbstractC6526b.a(fD16, fD16), 0.0f, null, null, 0, 240, null);
        u02.a();
        U0.t(u02, AbstractC6536l.b(AbstractC6534j.b(AbstractC6532h.a(C6531g.m(Canvas.D1()) + f11, C6531g.n(Canvas.D1()) - (fD18 / 2.0f)), AbstractC6538n.a(fD17, fD18)), (18 & 2) != 0 ? AbstractC6525a.f52329a.a() : 0L, (18 & 4) != 0 ? AbstractC6525a.f52329a.a() : AbstractC6526b.a(fD19, fD19), (18 & 8) != 0 ? AbstractC6525a.f52329a.a() : AbstractC6526b.a(fD19, fD19), (18 & 16) != 0 ? AbstractC6525a.f52329a.a() : 0L), null, 2, null);
        InterfaceC7039f.C1(Canvas, u02, j10, 0.0f, null, null, 0, 60, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(e eVar, float f10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, f10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
