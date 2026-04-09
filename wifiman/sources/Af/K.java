package Af;

import Af.H;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import q.InterfaceC7386e;

/* loaded from: classes4.dex */
public abstract class K {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H f666a;

        a(H h10) {
            this.f666a = h10;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            Float fA;
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1984932976, i10, -1, "com.ui.wifiman.ui.wifi.component.WmwStatusButton.<anonymous>.<anonymous> (WmwStatusButton.kt:80)");
            }
            H h10 = this.f666a;
            H.a aVar = h10 instanceof H.a ? (H.a) h10 : null;
            float fFloatValue = (aVar == null || (fA = aVar.a()) == null) ? 0.0f : fA.floatValue();
            H h11 = this.f666a;
            H.a aVar2 = h11 instanceof H.a ? (H.a) h11 : null;
            Jf.d.c(null, fFloatValue, aVar2 != null ? aVar2.b() : false, interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r39, final Af.H r40, mh.InterfaceC6824a r41, T.InterfaceC3540l r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Af.K.c(androidx.compose.ui.e, Af.H, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, H h10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, h10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final long f(H h10, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        interfaceC3540l.U(300849284);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(300849284, i10, -1, "com.ui.wifiman.ui.wifi.component.statusColor (WmwStatusButton.kt:46)");
        }
        if (h10 instanceof H.c) {
            interfaceC3540l.U(693489805);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i();
            interfaceC3540l.J();
        } else if (h10 instanceof H.b) {
            interfaceC3540l.U(693492077);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
            interfaceC3540l.J();
        } else {
            if (!(h10 instanceof H.a)) {
                interfaceC3540l.U(693487316);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(693494285);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }
}
