package A;

import B.AbstractC2450n;
import B.M;
import C0.D;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import androidx.compose.runtime.snapshots.g;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import m0.InterfaceC6671H0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.AbstractC7849j;
import z.C8680c;
import z.N;

/* loaded from: classes.dex */
public abstract class p {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f109c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f110d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f111e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w.n f112f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f113g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f114h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c.b f115i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C8680c.m f116j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1752c f117k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C8680c.e f118l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f119m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f120n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f121o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f122p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, B b10, N n10, boolean z10, boolean z11, w.n nVar, boolean z12, int i10, c.b bVar, C8680c.m mVar, c.InterfaceC1752c interfaceC1752c, C8680c.e eVar2, InterfaceC6835l interfaceC6835l, int i11, int i12, int i13) {
            super(2);
            this.f107a = eVar;
            this.f108b = b10;
            this.f109c = n10;
            this.f110d = z10;
            this.f111e = z11;
            this.f112f = nVar;
            this.f113g = z12;
            this.f114h = i10;
            this.f115i = bVar;
            this.f116j = mVar;
            this.f117k = interfaceC1752c;
            this.f118l = eVar2;
            this.f119m = interfaceC6835l;
            this.f120n = i11;
            this.f121o = i12;
            this.f122p = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            p.a(this.f107a, this.f108b, this.f109c, this.f110d, this.f111e, this.f112f, this.f113g, this.f114h, this.f115i, this.f116j, this.f117k, this.f118l, this.f119m, interfaceC3540l, L0.a(this.f120n | 1), L0.a(this.f121o), this.f122p);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B f123a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f124b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f125c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f126d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f127e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C8680c.m f128f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C8680c.e f129g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f130h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f131i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ii.N f132j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6671H0 f133k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ c.b f134l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1752c f135m;

        static final class a extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B.x f136a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f137b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f138c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f139d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B.x xVar, long j10, int i10, int i11) {
                super(3);
                this.f136a = xVar;
                this.f137b = j10;
                this.f138c = i10;
                this.f139d = i11;
            }

            public final D a(int i10, int i11, InterfaceC6835l interfaceC6835l) {
                return this.f136a.v1(Y0.c.i(this.f137b, i10 + this.f138c), Y0.c.h(this.f137b, i11 + this.f139d), U.h(), interfaceC6835l);
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (InterfaceC6835l) obj3);
            }
        }

        /* renamed from: A.p$b$b, reason: collision with other inner class name */
        public static final class C0001b extends u {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f140d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ B.x f141e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f142f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f143g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c.b f144h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ c.InterfaceC1752c f145i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f146j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f147k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f148l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f149m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ B f150n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0001b(long j10, boolean z10, m mVar, B.x xVar, int i10, int i11, c.b bVar, c.InterfaceC1752c interfaceC1752c, boolean z11, int i12, int i13, long j11, B b10) {
                super(j10, z10, mVar, xVar, null);
                this.f140d = z10;
                this.f141e = xVar;
                this.f142f = i10;
                this.f143g = i11;
                this.f144h = bVar;
                this.f145i = interfaceC1752c;
                this.f146j = z11;
                this.f147k = i12;
                this.f148l = i13;
                this.f149m = j11;
                this.f150n = b10;
            }

            @Override // A.u
            public t b(int i10, Object obj, Object obj2, List list, long j10) {
                return new t(i10, list, this.f140d, this.f144h, this.f145i, this.f141e.getLayoutDirection(), this.f146j, this.f147k, this.f148l, i10 == this.f142f + (-1) ? 0 : this.f143g, this.f149m, obj, obj2, this.f150n.v(), j10, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b10, boolean z10, N n10, boolean z11, InterfaceC6824a interfaceC6824a, C8680c.m mVar, C8680c.e eVar, boolean z12, int i10, Ii.N n11, InterfaceC6671H0 interfaceC6671H0, c.b bVar, c.InterfaceC1752c interfaceC1752c) {
            super(2);
            this.f123a = b10;
            this.f124b = z10;
            this.f125c = n10;
            this.f126d = z11;
            this.f127e = interfaceC6824a;
            this.f128f = mVar;
            this.f129g = eVar;
            this.f130h = z12;
            this.f131i = i10;
            this.f132j = n11;
            this.f133k = interfaceC6671H0;
            this.f134l = bVar;
            this.f135m = interfaceC1752c;
        }

        public final s a(B.x xVar, long j10) {
            float fA;
            long jA;
            M.a(this.f123a.x());
            boolean z10 = this.f123a.t() || xVar.a1();
            AbstractC7849j.a(j10, this.f124b ? w.q.Vertical : w.q.Horizontal);
            int iX1 = this.f124b ? xVar.x1(this.f125c.a(xVar.getLayoutDirection())) : xVar.x1(androidx.compose.foundation.layout.o.g(this.f125c, xVar.getLayoutDirection()));
            int iX12 = this.f124b ? xVar.x1(this.f125c.b(xVar.getLayoutDirection())) : xVar.x1(androidx.compose.foundation.layout.o.f(this.f125c, xVar.getLayoutDirection()));
            int iX13 = xVar.x1(this.f125c.d());
            int iX14 = xVar.x1(this.f125c.c());
            int i10 = iX13 + iX14;
            int i11 = iX1 + iX12;
            boolean z11 = this.f124b;
            int i12 = z11 ? i10 : i11;
            int i13 = (!z11 || this.f126d) ? (z11 && this.f126d) ? iX14 : (z11 || this.f126d) ? iX12 : iX1 : iX13;
            int i14 = i12 - i13;
            long jN = Y0.c.n(j10, -i11, -i10);
            m mVar = (m) this.f127e.invoke();
            mVar.e().d(Y0.b.l(jN), Y0.b.k(jN));
            if (this.f124b) {
                C8680c.m mVar2 = this.f128f;
                if (mVar2 == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                fA = mVar2.a();
            } else {
                C8680c.e eVar = this.f129g;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
                }
                fA = eVar.a();
            }
            int iX15 = xVar.x1(fA);
            int iA = mVar.a();
            int iK = this.f124b ? Y0.b.k(j10) - i10 : Y0.b.l(j10) - i11;
            if (!this.f126d || iK > 0) {
                jA = Y0.o.a(iX1, iX13);
            } else {
                boolean z12 = this.f124b;
                if (!z12) {
                    iX1 += iK;
                }
                if (z12) {
                    iX13 += iK;
                }
                jA = Y0.o.a(iX1, iX13);
            }
            C0001b c0001b = new C0001b(jN, this.f124b, mVar, xVar, iA, iX15, this.f134l, this.f135m, this.f126d, i13, i14, jA, this.f123a);
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            B b10 = this.f123a;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
            try {
                int iP = b10.P(mVar, b10.r());
                int iS = b10.s();
                J j11 = J.f24997a;
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                s sVarE = r.e(iA, c0001b, iK, i13, i14, iX15, iP, iS, (xVar.a1() || !z10) ? this.f123a.G() : this.f123a.F(), jN, this.f124b, this.f130h ? mVar.g() : AbstractC3689v.l(), this.f128f, this.f129g, this.f126d, xVar, this.f123a.v(), this.f131i, AbstractC2450n.a(mVar, this.f123a.z(), this.f123a.p()), z10, xVar.a1(), this.f123a.B(), this.f132j, this.f123a.A(), this.f133k, new a(xVar, j10, i11, i10));
                B.n(this.f123a, sVarE, xVar.a1(), false, 4, null);
                return sVarE;
            } catch (Throwable th2) {
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((B.x) obj, ((Y0.b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r37, A.B r38, z.N r39, boolean r40, boolean r41, w.n r42, boolean r43, int r44, f0.c.b r45, z.C8680c.m r46, f0.c.InterfaceC1752c r47, z.C8680c.e r48, mh.InterfaceC6835l r49, T.InterfaceC3540l r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.p.a(androidx.compose.ui.e, A.B, z.N, boolean, boolean, w.n, boolean, int, f0.c$b, z.c$m, f0.c$c, z.c$e, mh.l, T.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final mh.InterfaceC6839p b(mh.InterfaceC6824a r21, A.B r22, z.N r23, boolean r24, boolean r25, int r26, f0.c.b r27, f0.c.InterfaceC1752c r28, z.C8680c.e r29, z.C8680c.m r30, Ii.N r31, m0.InterfaceC6671H0 r32, boolean r33, T.InterfaceC3540l r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.p.b(mh.a, A.B, z.N, boolean, boolean, int, f0.c$b, f0.c$c, z.c$e, z.c$m, Ii.N, m0.H0, boolean, T.l, int, int):mh.p");
    }
}
