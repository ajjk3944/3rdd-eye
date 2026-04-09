package Jf;

import T.InterfaceC3540l;
import T.L0;
import T.z1;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6525a;
import l0.AbstractC6526b;
import l0.AbstractC6532h;
import l0.AbstractC6534j;
import l0.AbstractC6536l;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6735w0;
import m0.U0;
import m0.j1;
import o0.C7044k;
import o0.InterfaceC7039f;
import r0.AbstractC7554d;
import s0.p;

/* loaded from: classes4.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r26, final float r27, boolean r28, T.InterfaceC3540l r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.d.c(androidx.compose.ui.e, float, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(long j10, z1 z1Var, U0 u02, boolean z10, p pVar, long j11, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        float fH = C6537m.h(Canvas.c()) / Canvas.d1(Y0.h.j(28));
        float fD1 = Canvas.d1(Y0.h.j(20)) * fH;
        float fD12 = Canvas.d1(Y0.h.j(11)) * fH;
        float fD13 = Canvas.d1(Y0.h.j(3)) * fH;
        float fD14 = Canvas.d1(Y0.h.j(16)) * fH;
        float fD15 = Canvas.d1(Y0.h.j(7)) * fH;
        float f10 = 1;
        float fD16 = Canvas.d1(Y0.h.j(f10)) * fH;
        float fD17 = Canvas.d1(Y0.h.j(f10)) * fH;
        float fD18 = Canvas.d1(Y0.h.j(4)) * fH;
        float f11 = 2;
        float fD19 = Canvas.d1(Y0.h.j(f11)) * fH;
        float f12 = fD1 / 2.0f;
        InterfaceC7039f.d0(Canvas, new j1(j10, null), AbstractC6532h.a((C6531g.m(Canvas.D1()) - f12) - (Canvas.d1(Y0.h.j(f10)) * fH), C6531g.n(Canvas.D1()) - (fD12 / 2.0f)), AbstractC6538n.a(fD1, fD12), AbstractC6526b.a(fD13, fD13), 0.0f, new C7044k(Canvas.d1(Y0.h.j(f10)) * fH, 0.0f, 0, 0, null, 30, null), null, 0, 208, null);
        InterfaceC7039f.d0(Canvas, new j1(j10, null), AbstractC6532h.a((C6531g.m(Canvas.D1()) - (fD14 / 2.0f)) - (Canvas.d1(Y0.h.j(f10)) * fH), C6531g.n(Canvas.D1()) - (fD15 / 2.0f)), AbstractC6538n.a(((Number) z1Var.getValue()).floatValue() * fD14, fD15), AbstractC6526b.a(fD16, fD16), 0.0f, null, null, 0, 240, null);
        u02.a();
        U0.t(u02, AbstractC6536l.b(AbstractC6534j.b(AbstractC6532h.a(C6531g.m(Canvas.D1()) + f12, C6531g.n(Canvas.D1()) - (fD18 / 2.0f)), AbstractC6538n.a(fD17, fD18)), (18 & 2) != 0 ? AbstractC6525a.f52329a.a() : 0L, (18 & 4) != 0 ? AbstractC6525a.f52329a.a() : AbstractC6526b.a(fD19, fD19), (18 & 8) != 0 ? AbstractC6525a.f52329a.a() : AbstractC6526b.a(fD19, fD19), (18 & 16) != 0 ? AbstractC6525a.f52329a.a() : 0L), null, 2, null);
        InterfaceC7039f.C1(Canvas, u02, j10, 0.0f, null, null, 0, 60, null);
        if (z10) {
            float f13 = fD12 / f11;
            float fM = (C6531g.m(Canvas.D1()) - f13) - fD17;
            float fN = C6531g.n(Canvas.D1()) - f13;
            Canvas.k1().e().c(fM, fN);
            try {
                AbstractC7554d.k(pVar, Canvas, AbstractC6538n.a(fD12, fD12), 0.0f, AbstractC6735w0.a.b(AbstractC6735w0.f52966b, j11, 0, 2, null), 2, null);
            } finally {
                Canvas.k1().e().c(-fM, -fN);
            }
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, float f10, boolean z10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, f10, z10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
