package E9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Y0.t;
import Yg.J;
import Zg.AbstractC3689v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6537m;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.k1;
import ma.AbstractC6784a;
import o0.InterfaceC7039f;
import r.C7548x;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final float f4388a = Y0.h.j(8);

    /* renamed from: b, reason: collision with root package name */
    private static final float f4389b = Y0.h.j(240);

    /* renamed from: c, reason: collision with root package name */
    private static final float f4390c = Y0.h.j(40);

    /* renamed from: d, reason: collision with root package name */
    private static final C7548x f4391d = new C7548x(0.2f, 0.0f, 0.8f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r26, final float r27, E9.e r28, float r29, float r30, int r31, boolean r32, T.InterfaceC3540l r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E9.d.c(androidx.compose.ui.e, float, E9.e, float, float, int, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(e eVar, float f10, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        g(Canvas, eVar.a(), C6537m.g(Canvas.c()));
        f(Canvas, 0.0f, f10, eVar.b(), C6537m.g(Canvas.c()));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, float f10, e eVar2, float f11, float f12, int i10, boolean z10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        c(eVar, f10, eVar2, f11, f12, i10, z10, interfaceC3540l, L0.a(i11 | 1), i12);
        return J.f24997a;
    }

    private static final void f(InterfaceC7039f interfaceC7039f, float f10, float f11, AbstractC6713l0 abstractC6713l0, float f12) {
        float fI = C6537m.i(interfaceC7039f.c());
        float fG = C6537m.g(interfaceC7039f.c()) / 2;
        boolean z10 = interfaceC7039f.getLayoutDirection() == t.Ltr;
        InterfaceC7039f.i0(interfaceC7039f, abstractC6713l0, AbstractC6532h.a((z10 ? f10 : 1.0f - f11) * fI, fG), AbstractC6532h.a((z10 ? f11 : 1.0f - f10) * fI, fG), f12, k1.f52924a.b(), null, 0.0f, null, 0, 480, null);
    }

    private static final void g(InterfaceC7039f interfaceC7039f, long j10, float f10) {
        f(interfaceC7039f, 0.0f, 1.0f, AbstractC6713l0.a.b(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(j10), C6733v0.g(j10)), 0.0f, 0.0f, 0, 14, null), f10);
    }

    private static final e h(InterfaceC3540l interfaceC3540l, int i10) {
        Object eVar;
        interfaceC3540l.U(-468437296);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-468437296, i10, -1, "com.ui.core.ui.component.progress.rememberUiProgressIndicatorColors (UiLinearProgressIndicator.kt:56)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(-396614762);
        boolean zT = interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            if (AbstractC6492s.d(abstractC6784aA, AbstractC6784a.d.f53661a)) {
                eVar = new e(AbstractC6713l0.a.b(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(abstractC6784aA.a().b().e()), C6733v0.g(abstractC6784aA.a().a().d())), 0.0f, 0.0f, 0, 14, null), abstractC6784aA.a().g().f(), null);
            } else {
                if (!AbstractC6492s.d(abstractC6784aA, AbstractC6784a.b.f53648a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new e(AbstractC6713l0.a.b(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(abstractC6784aA.a().b().e()), C6733v0.g(abstractC6784aA.a().a().d())), 0.0f, 0.0f, 0, 14, null), abstractC6784aA.a().g().f(), null);
            }
            objF = eVar;
            interfaceC3540l.K(objF);
        }
        e eVar2 = (e) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return eVar2;
    }
}
