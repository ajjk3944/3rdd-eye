package I9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.z1;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6526b;
import l0.AbstractC6532h;
import l0.C6537m;
import la.C6562a;
import ma.AbstractC6784a;
import mh.InterfaceC6835l;
import o0.InterfaceC7039f;

/* loaded from: classes3.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.e r29, final boolean r30, final mh.InterfaceC6835l r31, boolean r32, T.InterfaceC3540l r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.d.d(androidx.compose.ui.e, boolean, mh.l, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, boolean z10, InterfaceC6835l interfaceC6835l, boolean z11, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        d(eVar, z10, interfaceC6835l, z11, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l, boolean z10) {
        interfaceC3551q0.setValue(Boolean.valueOf(!((Boolean) interfaceC3551q0.getValue()).booleanValue()));
        if (interfaceC6835l != null) {
            interfaceC6835l.invoke(interfaceC3551q0.getValue());
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(boolean z10, InterfaceC3551q0 interfaceC3551q0, e eVar, float f10, float f11, z1 z1Var, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        InterfaceC7039f.b1(Canvas, z10 ? ((Boolean) interfaceC3551q0.getValue()).booleanValue() ? eVar.b() : eVar.h() : ((Boolean) interfaceC3551q0.getValue()).booleanValue() ? eVar.d() : eVar.f(), 0L, 0L, AbstractC6526b.a(Canvas.d1(f10), Canvas.d1(f10)), null, 0.0f, null, 0, 246, null);
        InterfaceC7039f.P1(Canvas, z10 ? ((Boolean) interfaceC3551q0.getValue()).booleanValue() ? eVar.a() : eVar.g() : ((Boolean) interfaceC3551q0.getValue()).booleanValue() ? eVar.c() : eVar.e(), Canvas.d1(f11), AbstractC6532h.a(((Number) z1Var.getValue()).floatValue(), C6537m.g(Canvas.c()) / 2), 0.0f, null, null, 0, 120, null);
        return J.f24997a;
    }

    private static final e h(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(247187740);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(247187740, i10, -1, "com.ui.core.ui.component.switch.rememberUiSwitchColors (UiSwitch.kt:38)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(-1110956121);
        boolean zT = interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            AbstractC6784a.d dVar = AbstractC6784a.d.f53661a;
            objF = new e(dVar.a().g().a(), dVar.a().g().a(), dVar.a().g().a(), dVar.a().g().a(), abstractC6784aA.a().b().f(), abstractC6784aA.a().b().c(), abstractC6784aA.a().g().h(), abstractC6784aA.a().g().e(), null);
            interfaceC3540l.K(objF);
        }
        e eVar = (e) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return eVar;
    }
}
