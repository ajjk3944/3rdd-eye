package N;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import y.InterfaceC8558m;
import z.C8680c;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14146a = Y0.h.j(56);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14147b = Y0.h.j(48);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14148c = Y0.h.j(12);

    /* renamed from: d, reason: collision with root package name */
    private static final float f14149d = Y0.h.j(20);

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2) {
            super(2);
            this.f14150a = interfaceC6839p;
            this.f14151b = interfaceC6839p2;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1418981691, i10, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)");
            }
            float f10 = this.f14150a == null ? X.f14149d : X.f14148c;
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(aVar, f10, 0.0f, X.f14149d, 0.0f, 10, null);
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            InterfaceC6839p interfaceC6839p = this.f14150a;
            InterfaceC6839p interfaceC6839p2 = this.f14151b;
            C0.C cB = z.W.b(C8680c.f66832a.f(), interfaceC1752cI, interfaceC3540l, 48);
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
            z.Z z10 = z.Z.f66823a;
            if (interfaceC6839p != null) {
                interfaceC3540l.U(-565171246);
                interfaceC6839p.invoke(interfaceC3540l, 0);
                z.a0.a(androidx.compose.foundation.layout.r.z(aVar, X.f14148c), interfaceC3540l, 6);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-565074185);
                interfaceC3540l.J();
            }
            interfaceC6839p2.invoke(interfaceC3540l, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14155d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14156e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f14157f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f14158g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f14159h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ V f14160i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14161j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14162k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p2, InterfaceC8558m interfaceC8558m, i1 i1Var, long j10, long j11, V v10, int i10, int i11) {
            super(2);
            this.f14152a = interfaceC6839p;
            this.f14153b = interfaceC6824a;
            this.f14154c = eVar;
            this.f14155d = interfaceC6839p2;
            this.f14156e = interfaceC8558m;
            this.f14157f = i1Var;
            this.f14158g = j10;
            this.f14159h = j11;
            this.f14160i = v10;
            this.f14161j = i10;
            this.f14162k = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            X.a(this.f14152a, this.f14153b, this.f14154c, this.f14155d, this.f14156e, this.f14157f, this.f14158g, this.f14159h, this.f14160i, interfaceC3540l, T.L0.a(this.f14161j | 1), this.f14162k);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14163a = new c();

        c() {
            super(1);
        }

        public final void a(J0.w wVar) {
            J0.t.i0(wVar, J0.g.f9602b.a());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14165b;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14166a;

            /* renamed from: N.X$d$a$a, reason: collision with other inner class name */
            static final class C0549a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f14167a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0549a(InterfaceC6839p interfaceC6839p) {
                    super(2);
                    this.f14167a = interfaceC6839p;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1567914264, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:102)");
                    }
                    androidx.compose.ui.e eVarA = androidx.compose.foundation.layout.r.a(androidx.compose.ui.e.f28771b0, X.f14146a, X.f14146a);
                    f0.c cVarE = f0.c.f46573a.e();
                    InterfaceC6839p interfaceC6839p = this.f14167a;
                    C0.C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
                    int iA = AbstractC3536j.a(interfaceC3540l, 0);
                    InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                    androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
                    InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                    InterfaceC6824a interfaceC6824aA = aVar.a();
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
                    E1.c(interfaceC3540lA, cH, aVar.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                    InterfaceC6839p interfaceC6839pB = aVar.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar.f());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
                    interfaceC6839p.invoke(interfaceC3540l, 0);
                    interfaceC3540l.R();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f14166a = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1867794295, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                }
                a1.a(C3319f0.f14419a.c(interfaceC3540l, 6).c(), b0.c.e(-1567914264, true, new C0549a(this.f14166a), interfaceC3540l, 54), interfaceC3540l, 48);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f14164a = j10;
            this.f14165b = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1972871863, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:100)");
            }
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(C6733v0.n(this.f14164a))), b0.c.e(1867794295, true, new a(this.f14165b), interfaceC3540l, 54), interfaceC3540l, T.I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14169b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f14170c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1 f14171d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14172e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14173f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ V f14174g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14175h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f14176i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14177j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, i1 i1Var, long j10, long j11, V v10, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f14168a = interfaceC6824a;
            this.f14169b = eVar;
            this.f14170c = interfaceC8558m;
            this.f14171d = i1Var;
            this.f14172e = j10;
            this.f14173f = j11;
            this.f14174g = v10;
            this.f14175h = interfaceC6839p;
            this.f14176i = i10;
            this.f14177j = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            X.b(this.f14168a, this.f14169b, this.f14170c, this.f14171d, this.f14172e, this.f14173f, this.f14174g, this.f14175h, interfaceC3540l, T.L0.a(this.f14176i | 1), this.f14177j);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(mh.InterfaceC6839p r29, mh.InterfaceC6824a r30, androidx.compose.ui.e r31, mh.InterfaceC6839p r32, y.InterfaceC8558m r33, m0.i1 r34, long r35, long r37, N.V r39, T.InterfaceC3540l r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.X.a(mh.p, mh.a, androidx.compose.ui.e, mh.p, y.m, m0.i1, long, long, N.V, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(mh.InterfaceC6824a r30, androidx.compose.ui.e r31, y.InterfaceC8558m r32, m0.i1 r33, long r34, long r36, N.V r38, mh.InterfaceC6839p r39, T.InterfaceC3540l r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.X.b(mh.a, androidx.compose.ui.e, y.m, m0.i1, long, long, N.V, mh.p, T.l, int, int):void");
    }
}
