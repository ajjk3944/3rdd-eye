package K9;

import C0.C;
import E0.InterfaceC2629g;
import F9.u0;
import K9.g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.c;
import t9.AbstractC8045a;
import t9.AbstractC8046b;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Y;
import z.Z;

/* loaded from: classes3.dex */
public abstract class g {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10534a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f10535b;

        a(boolean z10, InterfaceC6835l interfaceC6835l) {
            this.f10534a = z10;
            this.f10535b = interfaceC6835l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e(InterfaceC6835l interfaceC6835l) {
            interfaceC6835l.invoke(Boolean.FALSE);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(InterfaceC6835l interfaceC6835l) {
            interfaceC6835l.invoke(Boolean.TRUE);
            return J.f24997a;
        }

        public final void c(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1315917313, i10, -1, "com.ui.core.ui.component.theme.UiThemeSwitcher.<anonymous>.<anonymous> (UiThemeSwitcher.kt:63)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            float f10 = 4;
            androidx.compose.ui.e eVarM = o.m(r.h(aVar, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, h.j(f10), 7, null);
            C8680c.f fVarD = C8680c.f66832a.d();
            boolean z10 = this.f10534a;
            final InterfaceC6835l interfaceC6835l = this.f10535b;
            C cB = W.b(fVarD, f0.c.f46573a.l(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z11 = Z.f66823a;
            float f11 = 8;
            androidx.compose.ui.e eVarB = Y.b(z11, r.h(o.j(aVar, h.j(f11), h.j(f10)), 0.0f, 1, null), 1.0f, false, 2, null);
            String strA = H0.f.a(AbstractC8046b.f61872g, interfaceC3540l, 0);
            c.a aVar3 = new c.a(AbstractC8045a.f61864d, null, 2, null);
            boolean z12 = !z10;
            interfaceC3540l.U(1608345801);
            boolean zT = interfaceC3540l.T(interfaceC6835l);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: K9.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return g.a.e(interfaceC6835l);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            g.e(eVarB, strA, aVar3, z12, (InterfaceC6824a) objF, interfaceC3540l, 0, 0);
            androidx.compose.ui.e eVarB2 = Y.b(z11, r.h(o.j(aVar, h.j(f11), h.j(f10)), 0.0f, 1, null), 1.0f, false, 2, null);
            String strA2 = H0.f.a(AbstractC8046b.f61870e, interfaceC3540l, 0);
            c.a aVar4 = new c.a(AbstractC8045a.f61865e, null, 2, null);
            interfaceC3540l.U(1608363080);
            boolean zT2 = interfaceC3540l.T(interfaceC6835l);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: K9.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return g.a.f(interfaceC6835l);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            g.e(eVarB2, strA2, aVar4, z10, (InterfaceC6824a) objF2, interfaceC3540l, 0, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            c((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r35, final java.lang.String r36, final s9.c r37, final boolean r38, mh.InterfaceC6824a r39, T.InterfaceC3540l r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.g.e(androidx.compose.ui.e, java.lang.String, s9.c, boolean, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, String str, s9.c cVar, boolean z10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, str, cVar, z10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void h(androidx.compose.ui.e eVar, final boolean z10, final boolean z11, final InterfaceC6835l onFollowSystemThemeChange, final InterfaceC6835l onDarkThemeSelectedChange, InterfaceC3540l interfaceC3540l, final int i10, final int i11) throws Resources.NotFoundException {
        androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(onFollowSystemThemeChange, "onFollowSystemThemeChange");
        AbstractC6492s.i(onDarkThemeSelectedChange, "onDarkThemeSelectedChange");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-278047729);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.c(z11) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(onFollowSystemThemeChange) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(onDarkThemeSelectedChange) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i12 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-278047729, i12, -1, "com.ui.core.ui.component.theme.UiThemeSwitcher (UiThemeSwitcher.kt:45)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(AbstractC6234e.a(eVar4, E.h.d(h.j(12))), C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().b(), null, 2, null);
            c.a aVar = f0.c.f46573a;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), aVar.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            String strA = H0.f.a(AbstractC8046b.f61871f, interfaceC3540lR, 0);
            interfaceC3540lR.U(-692112216);
            boolean z12 = (i12 & 7168) == 2048;
            Object objF = interfaceC3540lR.f();
            if (z12 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: K9.a
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return g.i(onFollowSystemThemeChange, ((Boolean) obj).booleanValue());
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVar5 = eVar4;
            u0.c(null, null, strA, null, z10, (InterfaceC6835l) objF, null, null, false, null, interfaceC3540lR, (i12 << 9) & 57344, 971);
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC7385d.d(c8688k, !z10, null, androidx.compose.animation.g.o(null, 0.0f, 3, null).c(androidx.compose.animation.g.m(null, aVar.l(), false, null, 13, null)), androidx.compose.animation.g.q(null, 0.0f, 3, null).c(androidx.compose.animation.g.y(null, aVar.l(), false, null, 13, null)), null, b0.c.e(1315917313, true, new a(z11, onDarkThemeSelectedChange), interfaceC3540l2, 54), interfaceC3540l2, 1600518, 18);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar3 = eVar5;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: K9.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return g.j(eVar3, z10, z11, onFollowSystemThemeChange, onDarkThemeSelectedChange, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(InterfaceC6835l interfaceC6835l, boolean z10) {
        interfaceC6835l.invoke(Boolean.valueOf(z10));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(androidx.compose.ui.e eVar, boolean z10, boolean z11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) throws Resources.NotFoundException {
        h(eVar, z10, z11, interfaceC6835l, interfaceC6835l2, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
