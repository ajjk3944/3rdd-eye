package Be;

import Be.AbstractC2457a0;
import E0.InterfaceC2629g;
import N.O0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import f0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: Be.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2457a0 {

    /* renamed from: Be.a0$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J9.j f1522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f1523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V f1524d;

        a(androidx.compose.ui.e eVar, J9.j jVar, InterfaceC6835l interfaceC6835l, V v10) {
            this.f1521a = eVar;
            this.f1522b = jVar;
            this.f1523c = interfaceC6835l;
            this.f1524d = v10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC6835l interfaceC6835l, J9.a aVar) {
            interfaceC6835l.invoke(aVar);
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1211867627, i10, -1, "com.ui.wifiman.ui.component.UiNavigationBarLayout.<anonymous> (UiNavigationBar.kt:93)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            androidx.compose.ui.e eVar = this.f1521a;
            J9.j jVar = this.f1522b;
            final InterfaceC6835l interfaceC6835l = this.f1523c;
            V v10 = this.f1524d;
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(eVar, 0.0f, 1, null), Y0.h.j(1));
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            z.a0.a(androidx.compose.foundation.b.d(eVarI, c6562a.a(interfaceC3540l, i11).a().g().f(), null, 2, null), interfaceC3540l, 0);
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            float fC = c6562a.d(interfaceC3540l, i11).a().a().c();
            float f10 = 4;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVarH2, fC, Y0.h.j(f10));
            C0.C cB = z.W.b(c8680c.n(Y0.h.j(f10)), aVar2.l(), interfaceC3540l, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA2);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA2, cB, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            z.Z z10 = z.Z.f66823a;
            interfaceC3540l.U(-2050199843);
            for (final J9.a aVar4 : jVar.a()) {
                androidx.compose.ui.e eVarA = z10.a(androidx.compose.foundation.layout.r.b(androidx.compose.ui.e.f28771b0, 0.0f, Y0.h.j(58), 1, null), 1.0f, true);
                interfaceC3540l.U(949334252);
                boolean zT = interfaceC3540l.T(interfaceC6835l) | interfaceC3540l.T(aVar4);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Be.Z
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC2457a0.a.c(interfaceC6835l, aVar4);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC2457a0.d(eVarA, aVar4, (InterfaceC6824a) objF, v10, interfaceC3540l, 0, 0);
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.e r33, final J9.a r34, final mh.InterfaceC6824a r35, final Be.V r36, T.InterfaceC3540l r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.AbstractC2457a0.d(androidx.compose.ui.e, J9.a, mh.a, Be.V, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(InterfaceC6824a interfaceC6824a) {
        interfaceC6824a.invoke();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(androidx.compose.ui.e eVar, J9.a aVar, InterfaceC6824a interfaceC6824a, V v10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        d(eVar, aVar, interfaceC6824a, v10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void g(androidx.compose.ui.e eVar, final J9.j tabs, final InterfaceC6835l onClick, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        AbstractC6492s.i(tabs, "tabs");
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1569639983);
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
            i12 |= interfaceC3540lR.T(tabs) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(onClick) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1569639983, i12, -1, "com.ui.wifiman.ui.component.UiNavigationBarLayout (UiNavigationBar.kt:83)");
            }
            V vJ = j(interfaceC3540lR, 0);
            androidx.compose.ui.e eVar4 = eVar3;
            O0.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.D(androidx.compose.foundation.layout.r.h(eVar3, 0.0f, 1, null), null, false, 3, null), vJ.a(), null, 2, null), null, vJ.a(), 0L, null, 0.0f, b0.c.e(-1211867627, true, new a(eVar3, tabs, onClick, vJ), interfaceC3540lR, 54), interfaceC3540lR, 1572864, 58);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar2;
            x0Z.a(new InterfaceC6839p() { // from class: Be.W
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2457a0.h(eVar5, tabs, onClick, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, J9.j jVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        g(eVar, jVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final V j(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1572754361);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1572754361, i10, -1, "com.ui.wifiman.ui.component.rememberUiNavigationBarLayoutColors (UiNavigationBar.kt:50)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(-451130761);
        boolean zT = interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            if (AbstractC6492s.d(abstractC6784aA, AbstractC6784a.d.f53661a)) {
                objF = new V(abstractC6784aA.a().g().a(), abstractC6784aA.f().c(), abstractC6784aA.a().b().f(), abstractC6784aA.a().g().g(), null);
            } else {
                if (!AbstractC6492s.d(abstractC6784aA, AbstractC6784a.b.f53648a)) {
                    throw new NoWhenBranchMatchedException();
                }
                objF = new V(abstractC6784aA.a().g().b(), abstractC6784aA.f().c(), abstractC6784aA.a().b().f(), C6733v0.f52951b.a(), null);
            }
            interfaceC3540l.K(objF);
        }
        V v10 = (V) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return v10;
    }
}
