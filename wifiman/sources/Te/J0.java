package Te;

import Be.AbstractC2487w;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import f0.c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes4.dex */
public abstract class J0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F0 f21668a;

        a(F0 f02) {
            this.f21668a = f02;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1283057928, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabStatsItemWifi.<anonymous>.<anonymous> (SignalTabStatsItemWifi.kt:86)");
            }
            if (this.f21668a.d() != null) {
                J0.d(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), this.f21668a.d(), interfaceC3540l, 6, 0);
            }
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F0 f21669a;

        b(F0 f02) {
            this.f21669a = f02;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(267591103, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabStatsItemWifi.<anonymous>.<anonymous> (SignalTabStatsItemWifi.kt:97)");
            }
            if (this.f21669a.e() != null) {
                J0.d(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), this.f21669a.e(), interfaceC3540l, 6, 0);
            }
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

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F0 f21670a;

        c(F0 f02) {
            this.f21670a = f02;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1555596160, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabStatsItemWifi.<anonymous>.<anonymous> (SignalTabStatsItemWifi.kt:108)");
            }
            if (this.f21670a.f() != null) {
                J0.d(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Y0.h.j(8), 7, null), this.f21670a.f(), interfaceC3540l, 6, 0);
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.ui.e eVar, final E0 e02, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        int i13;
        C6562a c6562a;
        pa.b bVarB;
        long jC;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1945740779);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
            i12 |= interfaceC3540lR.T(e02) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1945740779, i12, -1, "com.ui.wifiman.ui.signal.components.Link (SignalTabStatsItemWifi.kt:172)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
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
            z.Z z10 = z.Z.f66823a;
            C6562a c6562a2 = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            Be.E.b(null, e02.c().m2getColorvNxB06k(c6562a2.a(interfaceC3540lR, i15)), interfaceC3540lR, 0, 1);
            androidx.compose.ui.e eVar4 = eVar3;
            a1.b(AbstractC7930a.b(Ne.h.c(e02.b()), interfaceC3540lR, 0), null, c6562a2.a(interfaceC3540lR, i15).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, c6562a2.c(interfaceC3540lR, i15).b().f(), interfaceC3540lR, 0, 3120, 55290);
            De.g gVarA = e02.a();
            interfaceC3540lR.U(-1671167720);
            if (gVarA != null) {
                gVarA.c(interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            z.a0.a(z.Y.b(z10, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null), interfaceC3540lR, 0);
            C3174d c3174dA = AbstractC7930a.a(Ne.f.h(e02.d(), true, null, 2, null), interfaceC3540lR, 0);
            if (e02.d() != null) {
                interfaceC3540lR.U(-1671161129);
                i13 = i15;
                c6562a = c6562a2;
                bVarB = c6562a.c(interfaceC3540lR, i13).a();
            } else {
                i13 = i15;
                c6562a = c6562a2;
                interfaceC3540lR.U(-1671159817);
                bVarB = c6562a.c(interfaceC3540lR, i13).b();
            }
            L0.U uC = bVarB.c();
            interfaceC3540lR.J();
            if (e02.d() != null) {
                interfaceC3540lR.U(-1671157391);
                jC = c6562a.a(interfaceC3540lR, i13).f().a();
            } else {
                interfaceC3540lR.U(-1671156495);
                jC = c6562a.a(interfaceC3540lR, i13).f().c();
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, null, jC, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uC, interfaceC3540l2, 0, 0, 131066);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.G0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J0.e(eVar2, e02, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, E0 e02, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        d(eVar, e02, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final void f(androidx.compose.ui.e eVar, final InterfaceC7929a interfaceC7929a, final s9.d dVar, final boolean z10, Ci.c cVar, final s9.d dVar2, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        z.Z z11;
        C8680c c8680c;
        androidx.compose.ui.e eVar3;
        int i13;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540l3;
        long jC;
        final Ci.c cVar2;
        final androidx.compose.ui.e eVar4;
        Ci.c cVarA = cVar;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1856905928);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
            i12 |= interfaceC3540lR.T(interfaceC7929a) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(dVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? 2048 : 1024;
        }
        int i15 = i11 & 16;
        if (i15 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= (32768 & i10) == 0 ? interfaceC3540lR.T(cVarA) : interfaceC3540lR.l(cVarA) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
        } else if ((i10 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= interfaceC3540lR.T(dVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i16 = i12;
        if ((74899 & i16) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            cVar2 = cVarA;
            eVar4 = eVar2;
            interfaceC3540l3 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar5 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (i15 != 0) {
                cVarA = Ci.a.a();
            }
            Ci.c cVar3 = cVarA;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1856905928, i16, -1, "com.ui.wifiman.ui.signal.components.OverallApInfo (SignalTabStatsItemWifi.kt:128)");
            }
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.r.k(eVar5, Y0.h.j(60), 0.0f, 2, null);
            C8680c c8680c2 = C8680c.f66832a;
            C8680c.f fVarN = c8680c2.n(Y0.h.j(8));
            c.a aVar = f0.c.f46573a;
            C0.C cB = z.W.b(fVarN, aVar.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            z.Z z12 = z.Z.f66823a;
            interfaceC3540lR.U(-1474026663);
            if (interfaceC7929a == null) {
                z11 = z12;
                c8680c = c8680c2;
                eVar3 = eVar5;
                i13 = i16;
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                z11 = z12;
                c8680c = c8680c2;
                eVar3 = eVar5;
                i13 = i16;
                interfaceC3540l2 = interfaceC3540lR;
                AbstractC2487w.b(interfaceC7929a, androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(32)), null, null, null, 0.0f, 0L, interfaceC3540lR, ((i16 >> 3) & 14) | 48, 62);
                Yg.J j10 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarB = z.Y.b(z11, aVar3, 1.0f, false, 2, null);
            interfaceC3540l3 = interfaceC3540l2;
            C0.C cB2 = z.W.b(c8680c.n(Y0.h.j(4)), aVar.i(), interfaceC3540l3, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540l3, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l3.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l3, eVarB);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540l3.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l3.u();
            if (interfaceC3540l3.o()) {
                interfaceC3540l3.D(interfaceC6824aA2);
            } else {
                interfaceC3540l3.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l3);
            E1.c(interfaceC3540lA2, cB2, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            androidx.compose.ui.e eVarA = z11.a(aVar3, 1.0f, false);
            C3174d c3174dA = AbstractC7930a.a(dVar, interfaceC3540l3, (i13 >> 6) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i17 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540l3, i17).b().b();
            if (z10) {
                interfaceC3540l3.U(461222900);
                jC = c6562a.a(interfaceC3540l3, i17).f().a();
            } else {
                interfaceC3540l3.U(461223796);
                jC = c6562a.a(interfaceC3540l3, i17).f().c();
            }
            interfaceC3540l3.J();
            a1.c(c3174dA, eVarA, jC, 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 2, 0, null, null, uB, interfaceC3540l3, 0, 3120, 120824);
            interfaceC3540l3.U(461227530);
            Iterator<E> it = cVar3.iterator();
            while (it.hasNext()) {
                ((De.g) it.next()).c(interfaceC3540l3, 0);
            }
            interfaceC3540l3.J();
            interfaceC3540l3.R();
            interfaceC3540l3.U(-1474002972);
            if (dVar2 != null) {
                C3174d c3174dA2 = AbstractC7930a.a(dVar2, interfaceC3540l3, (i13 >> 15) & 14);
                C6562a c6562a2 = C6562a.f52458a;
                int i18 = C6562a.f52459b;
                a1.c(c3174dA2, null, c6562a2.a(interfaceC3540l3, i18).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a2.c(interfaceC3540l3, i18).b().f(), interfaceC3540l3, 0, 3120, 120826);
                Yg.J j11 = Yg.J.f24997a;
            }
            interfaceC3540l3.J();
            interfaceC3540l3.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            cVar2 = cVar3;
            eVar4 = eVar3;
        }
        X0 x0Z = interfaceC3540l3.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.H0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J0.g(eVar4, interfaceC7929a, dVar, z10, cVar2, dVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, InterfaceC7929a interfaceC7929a, s9.d dVar, boolean z10, Ci.c cVar, s9.d dVar2, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        f(eVar, interfaceC7929a, dVar, z10, cVar, dVar2, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void h(final androidx.compose.ui.e modifier, final F0 model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1237114950);
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
                AbstractC3546o.Q(-1237114950, i11, -1, "com.ui.wifiman.ui.signal.components.SignalTabStatsItemWifi (SignalTabStatsItemWifi.kt:70)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            f(androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), model.c(), model.g(), model.h(), model.a(), model.b(), interfaceC3540lR, 6, 0);
            z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(4)), interfaceC3540lR, 6);
            AbstractC7385d.d(c8688k, model.d() != null, null, null, null, null, b0.c.e(1283057928, true, new a(model), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            AbstractC7385d.d(c8688k, model.e() != null, null, null, null, null, b0.c.e(267591103, true, new b(model), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            AbstractC7385d.d(c8688k, model.f() != null, null, null, null, null, b0.c.e(-1555596160, true, new c(model), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.I0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J0.i(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, F0 f02, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, f02, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
