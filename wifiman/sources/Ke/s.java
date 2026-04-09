package Ke;

import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.AbstractC3346t0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.t1;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import r.AbstractC7521c;
import s9.d;
import sa.AbstractC7930a;
import z.C8680c;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class s {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10751a;

        a(String str) {
            this.f10751a = str;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(60081744, i10, -1, "com.ui.wifiman.ui.device.card.BasePortItem.<anonymous>.<anonymous>.<anonymous> (DeviceDetailCardPortScan.kt:131)");
            }
            s.l(androidx.compose.ui.e.f28771b0, new d.c("000000"), this.f10751a, interfaceC3540l, 54);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f10752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10753b;

        b(Integer num, String str) {
            this.f10752a = num;
            this.f10753b = str;
        }

        public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.g(f10) ? 4 : 2;
            }
            if ((i10 & 131) == 130 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1295576837, i10, -1, "com.ui.wifiman.ui.device.card.BasePortItem.<anonymous>.<anonymous>.<anonymous> (DeviceDetailCardPortScan.kt:137)");
            }
            s.l(androidx.compose.foundation.layout.r.s(androidx.compose.ui.e.f28771b0, f10), new d.c(String.valueOf(((Number) AbstractC7521c.e(this.f10752a.intValue(), null, "port", null, interfaceC3540l, 384, 10).getValue()).intValue())), this.f10753b, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Y0.h) obj).s(), ((Y0.h) obj2).s(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    private static final void f(final androidx.compose.ui.e eVar, final String str, final Integer num, final s9.d dVar, final Float f10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1361211677);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(num) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(dVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(f10) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1361211677, i12, -1, "com.ui.wifiman.ui.device.card.BasePortItem (DeviceDetailCardPortScan.kt:119)");
            }
            float f11 = 8;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.b(eVar, 0.0f, Y0.h.j(48), 1, null), Y0.h.j(16), Y0.h.j(f11));
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(f11)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            interfaceC3540lR.U(-2056768732);
            if (num != null) {
                qa.d.d(androidx.compose.ui.e.f28771b0, b0.c.e(60081744, true, new a(str), interfaceC3540lR, 54), b0.c.e(-1295576837, true, new b(num, str), interfaceC3540lR, 54), interfaceC3540lR, 438);
            }
            interfaceC3540lR.J();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = z10.a(aVar2, 1.0f, true);
            C3174d c3174dA = AbstractC7930a.a(dVar, interfaceC3540lR, (i12 >> 9) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            a1.c(c3174dA, eVarA, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540lR, 0, 3120, 120824);
            interfaceC3540lR.U(-2056737998);
            if (f10 == null) {
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                interfaceC3540l2 = interfaceC3540lR;
                AbstractC3346t0.a(((Number) AbstractC7521c.d(f10.floatValue(), null, 0.0f, "port scan progress", null, interfaceC3540lR, ((i12 >> 12) & 14) | 3072, 22).getValue()).floatValue(), androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(20)), c6562a.a(interfaceC3540lR, i13).a().b().f(), Y0.h.j(2), 0L, 0, interfaceC3540lR, 3120, 48);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ke.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.g(eVar, str, num, dVar, f10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, String str, Integer num, s9.d dVar, Float f10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, str, num, dVar, f10, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final androidx.compose.ui.e r27, final Ke.m r28, mh.InterfaceC6824a r29, T.InterfaceC3540l r30, int r31) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ke.s.h(androidx.compose.ui.e, Ke.m, mh.a, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(androidx.compose.ui.e eVar, m mVar, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, mVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void j(final androidx.compose.ui.e modifier, final l model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1257646261);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1257646261, i11, -1, "com.ui.wifiman.ui.device.card.DeviceDetailCardPortScanItem (DeviceDetailCardPortScan.kt:195)");
            }
            f(modifier, model.b(), model.c(), model.a(), null, interfaceC3540lR, (i11 & 14) | 24576);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ke.o
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.k(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(androidx.compose.ui.e eVar, l lVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        j(eVar, lVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(final androidx.compose.ui.e r39, final s9.d r40, final java.lang.String r41, T.InterfaceC3540l r42, final int r43) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ke.s.l(androidx.compose.ui.e, s9.d, java.lang.String, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(String str, t1 t1Var) {
        if (str != null) {
            Z7.b.h("User clicked on port. Opening'" + str + "' in default browser...", null, 2, null);
            t1Var.a(str);
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(androidx.compose.ui.e eVar, s9.d dVar, String str, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(eVar, dVar, str, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
