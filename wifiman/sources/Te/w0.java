package Te;

import E0.InterfaceC2629g;
import L0.C3174d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import Te.C3592l0;
import Zg.AbstractC3689v;
import android.content.Context;
import androidx.compose.ui.e;
import hf.C6031c;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import z.C8680c;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public abstract class w0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.c f21940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S8.d f21941b;

        a(S8.c cVar, S8.d dVar) {
            this.f21940a = cVar;
            this.f21941b = dVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-653679837);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-653679837, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:84)");
            }
            String str = String.format(H0.f.a(AbstractC6780c.f53562q2, interfaceC3540l, 0), Arrays.copyOf(new Object[]{AbstractC7930a.b(Ne.h.c(this.f21940a), interfaceC3540l, 0), Integer.valueOf(this.f21941b.getWidth())}, 2));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ci.c f21942a;

        b(Ci.c cVar) {
            this.f21942a = cVar;
        }

        public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.g(f10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 131) == 130 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-71108942, i11, -1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:129)");
            }
            w0.k(androidx.compose.foundation.layout.r.r(androidx.compose.ui.e.f28771b0, f10, 0.0f, 0.0f, 0.0f, 14, null), new d.b(AbstractC6780c.f53555p2), null, 0L, this.f21942a, null, 0L, interfaceC3540l, 0, 108);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Y0.h) obj).s(), ((Y0.h) obj2).s(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W7.b f21943a;

        c(W7.b bVar) {
            this.f21943a = bVar;
        }

        public final CharSequence a(Context unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(unused$var$, "$unused$var$");
            interfaceC3540l.U(-431380843);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-431380843, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:112)");
            }
            C3174d c3174dE = C6031c.f48649a.e(this.f21943a.b(), false, this.f21943a.c(), false, interfaceC3540l, 27696, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dE;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21944a = new d();

        d() {
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1105516766);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1105516766, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:99)");
            }
            C3174d.a aVar = new C3174d.a(0, 1, null);
            interfaceC3540l.U(-1773751060);
            int iN = aVar.n(new L0.D(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().d(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                aVar.i(H0.f.a(AbstractC6780c.f53349L2, interfaceC3540l, 0));
                Yg.J j10 = Yg.J.f24997a;
                aVar.l(iN);
                interfaceC3540l.J();
                C3174d c3174dP = aVar.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            } catch (Throwable th2) {
                aVar.l(iN);
                throw th2;
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d A(C3592l0 c3592l0, InterfaceC6835l interfaceC6835l, s9.d dVar, InterfaceC6835l interfaceC6835l2, S8.c it) {
        Object objInvoke;
        s9.d dVar2;
        AbstractC6492s.i(it, "it");
        C3592l0.a aVar = (C3592l0.a) c3592l0.a().get(it);
        return (aVar == null || (objInvoke = interfaceC6835l2.invoke(aVar)) == null || (dVar2 = (s9.d) interfaceC6835l.invoke(objInvoke)) == null) ? dVar : dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0275 A[LOOP:0: B:134:0x026f->B:136:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(androidx.compose.ui.e r39, final s9.d r40, L0.U r41, long r42, final Ci.c r44, L0.U r45, long r46, T.InterfaceC3540l r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Te.w0.k(androidx.compose.ui.e, s9.d, L0.U, long, Ci.c, L0.U, long, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(final L0.C3174d r34, L0.U r35, long r36, T.InterfaceC3540l r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Te.w0.l(L0.d, L0.U, long, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(C3174d c3174d, L0.U u10, long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        l(c3174d, u10, j10, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(androidx.compose.ui.e eVar, s9.d dVar, L0.U u10, long j10, Ci.c cVar, L0.U u11, long j11, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(eVar, dVar, u10, j10, cVar, u11, j11, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void o(final androidx.compose.ui.e modifier, final C3592l0 model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1608604900);
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
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1608604900, i11, -1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar (SignalTabConnectionStatsBar.kt:69)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(12)), f0.c.f46573a.l(), interfaceC3540lR, 6);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            z.Z z10 = z.Z.f66823a;
            interfaceC3540lR.U(796150143);
            if (model.a().isEmpty()) {
                interfaceC3540lR.J();
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                d.b bVar = new d.b(AbstractC6780c.f53323H4);
                long jB = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).f().b();
                interfaceC3540lR.U(1549708285);
                Object objF = interfaceC3540lR.f();
                InterfaceC3540l.a aVar2 = InterfaceC3540l.f21100a;
                if (objF == aVar2.a()) {
                    objF = new InterfaceC6835l() { // from class: Te.p0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return w0.p((C3592l0.a) obj);
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF;
                interfaceC3540lR.J();
                interfaceC3540lR.U(1549709965);
                Object objF2 = interfaceC3540lR.f();
                if (objF2 == aVar2.a()) {
                    objF2 = new InterfaceC6835l() { // from class: Te.q0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return w0.r((Yg.s) obj);
                        }
                    };
                    interfaceC3540lR.K(objF2);
                }
                interfaceC3540lR.J();
                k(null, bVar, null, 0L, z(model, interfaceC6835l, null, (InterfaceC6835l) objF2, 2, null), null, jB, interfaceC3540lR, 0, 45);
                interfaceC3540lR.U(1549728818);
                Object objF3 = interfaceC3540lR.f();
                if (objF3 == aVar2.a()) {
                    objF3 = new InterfaceC6835l() { // from class: Te.r0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return w0.s((C3592l0.a) obj);
                        }
                    };
                    interfaceC3540lR.K(objF3);
                }
                InterfaceC6835l interfaceC6835l2 = (InterfaceC6835l) objF3;
                interfaceC3540lR.J();
                d.a aVar3 = new d.a("noSignal", d.f21944a);
                interfaceC3540lR.U(1549740163);
                Object objF4 = interfaceC3540lR.f();
                if (objF4 == aVar2.a()) {
                    objF4 = new InterfaceC6835l() { // from class: Te.s0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return w0.t((S8.l) obj);
                        }
                    };
                    interfaceC3540lR.K(objF4);
                }
                interfaceC3540lR.J();
                Ci.c cVarY = y(model, interfaceC6835l2, aVar3, (InterfaceC6835l) objF4);
                interfaceC3540lR.U(1549743572);
                Object objF5 = interfaceC3540lR.f();
                if (objF5 == aVar2.a()) {
                    objF5 = new InterfaceC6835l() { // from class: Te.t0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return w0.u((C3592l0.a) obj);
                        }
                    };
                    interfaceC3540lR.K(objF5);
                }
                InterfaceC6835l interfaceC6835l3 = (InterfaceC6835l) objF5;
                interfaceC3540lR.J();
                interfaceC3540lR.U(1549744628);
                Object objF6 = interfaceC3540lR.f();
                if (objF6 == aVar2.a()) {
                    objF6 = new InterfaceC6835l() { // from class: Te.u0
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return w0.q((W7.b) obj);
                        }
                    };
                    interfaceC3540lR.K(objF6);
                }
                interfaceC3540lR.J();
                Ci.c cVarZ = z(model, interfaceC6835l3, null, (InterfaceC6835l) objF6, 2, null);
                e.a aVar4 = androidx.compose.ui.e.f28771b0;
                z.a0.a(z.Y.b(z10, aVar4, 1.0f, false, 2, null), interfaceC3540lR, 0);
                qa.d.d(aVar4, C3587j.f21858a.a(), b0.c.e(-71108942, true, new b(cVarY), interfaceC3540lR, 54), interfaceC3540lR, 438);
                z.a0.a(z.Y.b(z10, aVar4, 1.0f, false, 2, null), interfaceC3540lR, 0);
                interfaceC3540l2 = interfaceC3540lR;
                k(null, new d.b(AbstractC6780c.f53548o2), null, 0L, cVarZ, null, 0L, interfaceC3540l2, 0, 109);
                z.a0.a(z.Y.b(z10, aVar4, 1.0f, false, 2, null), interfaceC3540l2, 0);
                interfaceC3540l2.J();
            }
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.v0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return w0.v(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s p(C3592l0.a getColumnValues) {
        AbstractC6492s.i(getColumnValues, "$this$getColumnValues");
        return Yg.z.a(getColumnValues.a(), getColumnValues.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d q(W7.b it) {
        AbstractC6492s.i(it, "it");
        return new d.a(String.valueOf(it), new c(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d r(Yg.s sVar) {
        AbstractC6492s.i(sVar, "<destruct>");
        S8.c cVar = (S8.c) sVar.a();
        S8.d dVar = (S8.d) sVar.c();
        if (dVar == null) {
            return Ne.h.c(cVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar);
        sb2.append(dVar);
        return new d.a(sb2.toString(), new a(cVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S8.l s(C3592l0.a getColumnValues) {
        AbstractC6492s.i(getColumnValues, "$this$getColumnValues");
        return getColumnValues.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d t(S8.l it) {
        AbstractC6492s.i(it, "it");
        return Ne.f.h(it, true, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.b u(C3592l0.a getColumnValues) {
        AbstractC6492s.i(getColumnValues, "$this$getColumnValues");
        return getColumnValues.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J v(androidx.compose.ui.e eVar, C3592l0 c3592l0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        o(eVar, c3592l0, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final Ci.c y(final C3592l0 c3592l0, final InterfaceC6835l interfaceC6835l, final s9.d dVar, final InterfaceC6835l interfaceC6835l2) {
        return Ci.a.i(AbstractC8783m.N(AbstractC3689v.d0(c3592l0.a().keySet()), new InterfaceC6835l() { // from class: Te.m0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w0.A(c3592l0, interfaceC6835l2, dVar, interfaceC6835l, (S8.c) obj);
            }
        }));
    }

    static /* synthetic */ Ci.c z(C3592l0 c3592l0, InterfaceC6835l interfaceC6835l, s9.d dVar, InterfaceC6835l interfaceC6835l2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = new d.b(AbstractC6780c.f53274A4);
        }
        return y(c3592l0, interfaceC6835l, dVar, interfaceC6835l2);
    }
}
