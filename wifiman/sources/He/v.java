package He;

import E0.InterfaceC2629g;
import He.v;
import L9.AbstractC3198d;
import L9.E;
import L9.Q;
import N.O0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.t1;
import T.z1;
import Yg.J;
import androidx.compose.ui.e;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import f0.c;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.InterfaceC7386e;
import y.AbstractC8557l;
import y.InterfaceC8558m;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.N;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class v {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3198d f7891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f7892b;

        a(AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a) {
            this.f7891a = abstractC3198d;
            this.f7892b = interfaceC6824a;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(992614602, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdown.<anonymous>.<anonymous> (WifimanToolbarDropdown.kt:137)");
            }
            E.g(this.f7891a, this.f7892b, interfaceC3540l, AbstractC3198d.f11401a);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s9.b f7894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f7895c;

        b(String str, s9.b bVar, p pVar) {
            this.f7893a = str;
            this.f7894b = bVar;
            this.f7895c = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(p pVar) {
            if (pVar.c()) {
                pVar.b();
            } else {
                pVar.d();
            }
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(685254117, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdown.<anonymous> (WifimanToolbarDropdown.kt:118)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C8680c.f fVarB = C8680c.f66832a.b();
            String str = this.f7893a;
            s9.b bVar = this.f7894b;
            final p pVar = this.f7895c;
            C0.C cB = W.b(fVarB, f0.c.f46573a.l(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            Z z10 = Z.f66823a;
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.H(aVar, null, false, 3, null);
            boolean zC = pVar.c();
            interfaceC3540l.U(273071642);
            boolean zT = interfaceC3540l.T(pVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: He.w
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return v.b.c(pVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Q.b(eVarH2, str, bVar, zC, null, (InterfaceC6824a) objF, interfaceC3540l, 6, 16);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f7896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f7897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f7898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f7899d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f7900e;

        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f7901a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f7902b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ mh.q f7903c;

            a(z1 z1Var, long j10, mh.q qVar) {
                this.f7901a = z1Var;
                this.f7902b = j10;
                this.f7903c = qVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Y0.n c(z1 z1Var, Y0.d offset) {
                AbstractC6492s.i(offset, "$this$offset");
                return Y0.n.b(Y0.o.a(0, offset.x1(Y0.h.j(Y0.h.j(-100) * (1 - v.g(z1Var))))));
            }

            public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1992083602, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdownContent.<anonymous>.<anonymous> (WifimanToolbarDropdown.kt:171)");
                }
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                c.a aVar = f0.c.f46573a;
                androidx.compose.ui.e eVarD = androidx.compose.foundation.layout.r.D(eVarH, aVar.l(), false, 2, null);
                interfaceC3540l.U(1584827882);
                boolean zT = interfaceC3540l.T(this.f7901a);
                final z1 z1Var = this.f7901a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: He.y
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return v.c.a.c(z1Var, (Y0.d) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                float f10 = 12;
                androidx.compose.ui.e eVarD2 = androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.l.a(eVarD, (InterfaceC6835l) objF), E.h.f(0.0f, 0.0f, Y0.h.j(f10), Y0.h.j(f10), 3, null)), this.f7902b, null, 2, null);
                mh.q qVar = this.f7903c;
                C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), aVar.k(), interfaceC3540l, 0);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarD2);
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
                E1.c(interfaceC3540lA, cA, aVar2.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                InterfaceC6839p interfaceC6839pB = aVar2.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar2.f());
                qVar.s(C8688k.f66923a, interfaceC3540l, 6);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        c(androidx.compose.ui.e eVar, p pVar, z1 z1Var, long j10, mh.q qVar) {
            this.f7896a = eVar;
            this.f7897b = pVar;
            this.f7898c = z1Var;
            this.f7899d = j10;
            this.f7900e = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(p pVar) {
            pVar.b();
            return J.f24997a;
        }

        public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2010858538, i10, -1, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdownContent.<anonymous> (WifimanToolbarDropdown.kt:162)");
            }
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(this.f7896a, 0.0f, 1, null);
            interfaceC3540l.U(1570557648);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = AbstractC8557l.a();
                interfaceC3540l.K(objF);
            }
            InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(1570560729);
            boolean zT = interfaceC3540l.T(this.f7897b);
            final p pVar = this.f7897b;
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: He.x
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return v.c.c(pVar);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            O0.a(androidx.compose.foundation.d.b(eVarF, interfaceC8558m, null, false, null, null, (InterfaceC6824a) objF2, 28, null), null, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).d(), 0L, null, 0.0f, b0.c.e(-1992083602, true, new a(this.f7898c, this.f7899d, this.f7900e), interfaceC3540l, 54), interfaceC3540l, 1572864, 58);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r29, final L9.AbstractC3198d r30, mh.InterfaceC6824a r31, final java.lang.String r32, s9.b r33, final He.p r34, mh.q r35, long r36, float r38, z.N r39, T.InterfaceC3540l r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: He.v.e(androidx.compose.ui.e, L9.d, mh.a, java.lang.String, s9.b, He.p, mh.q, long, float, z.N, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final androidx.compose.ui.e r22, final He.p r23, long r24, final mh.q r26, T.InterfaceC3540l r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: He.v.f(androidx.compose.ui.e, He.p, long, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(androidx.compose.ui.e eVar, p pVar, long j10, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        f(eVar, pVar, j10, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i() {
        return J.f24997a;
    }

    private static final long j(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(androidx.compose.ui.e eVar, AbstractC3198d abstractC3198d, InterfaceC6824a interfaceC6824a, String str, s9.b bVar, p pVar, mh.q qVar, long j10, float f10, N n10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, abstractC3198d, interfaceC6824a, str, bVar, pVar, qVar, j10, f10, n10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final p m(final q qVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-412342811);
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            qVar = q.HIDDEN;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-412342811, i10, -1, "com.ui.wifiman.ui.component.toolbar.rememberWifimanToolbarDropdownState (WifimanToolbarDropdown.kt:78)");
        }
        Object[] objArr = {qVar};
        InterfaceC4182k interfaceC4182kC = p.f7870b.c();
        interfaceC3540l.U(-1077269532);
        if ((((i10 & 14) ^ 6) <= 4 || !interfaceC3540l.T(qVar)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new InterfaceC6824a() { // from class: He.r
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return v.n(qVar);
                }
            };
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        p pVar = (p) AbstractC4174c.e(objArr, interfaceC4182kC, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p n(q qVar) {
        return new p(t1.d(qVar, null, 2, null));
    }
}
