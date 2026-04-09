package N;

import C0.AbstractC2522b;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import f0.c;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes.dex */
public abstract class L0 {

    /* renamed from: c, reason: collision with root package name */
    private static final float f13790c;

    /* renamed from: f, reason: collision with root package name */
    private static final float f13793f;

    /* renamed from: a, reason: collision with root package name */
    private static final float f13788a = Y0.h.j(30);

    /* renamed from: b, reason: collision with root package name */
    private static final float f13789b = Y0.h.j(16);

    /* renamed from: d, reason: collision with root package name */
    private static final float f13791d = Y0.h.j(2);

    /* renamed from: e, reason: collision with root package name */
    private static final float f13792e = Y0.h.j(6);

    /* renamed from: g, reason: collision with root package name */
    private static final float f13794g = Y0.h.j(12);

    /* renamed from: h, reason: collision with root package name */
    private static final float f13795h = Y0.h.j(48);

    /* renamed from: i, reason: collision with root package name */
    private static final float f13796i = Y0.h.j(68);

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13799c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, int i10) {
            super(2);
            this.f13797a = interfaceC6839p;
            this.f13798b = interfaceC6839p2;
            this.f13799c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            L0.a(this.f13797a, this.f13798b, interfaceC3540l, T.L0.a(this.f13799c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements C0.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13800a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13801b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f13802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f13803b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f13804c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f13805d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f13806e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.t tVar, int i10, androidx.compose.ui.layout.t tVar2, int i11, int i12) {
                super(1);
                this.f13802a = tVar;
                this.f13803b = i10;
                this.f13804c = tVar2;
                this.f13805d = i11;
                this.f13806e = i12;
            }

            public final void a(t.a aVar) {
                t.a.l(aVar, this.f13802a, 0, this.f13803b, 0.0f, 4, null);
                t.a.l(aVar, this.f13804c, this.f13805d, this.f13806e, 0.0f, 4, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        b(String str, String str2) {
            this.f13800a = str;
            this.f13801b = str2;
        }

        @Override // C0.C
        public final C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            int i10;
            int iC0;
            int iMax;
            String str = this.f13800a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0.B b10 = (C0.B) list.get(i11);
                if (AbstractC6492s.d(androidx.compose.ui.layout.f.a(b10), str)) {
                    androidx.compose.ui.layout.t tVarT = b10.T(j10);
                    int iD = AbstractC7978m.d((Y0.b.l(j10) - tVarT.I0()) - mVar.x1(L0.f13793f), Y0.b.n(j10));
                    String str2 = this.f13801b;
                    int size2 = list.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        C0.B b11 = (C0.B) list.get(i12);
                        if (AbstractC6492s.d(androidx.compose.ui.layout.f.a(b11), str2)) {
                            androidx.compose.ui.layout.t tVarT2 = b11.T(Y0.b.d(j10, 0, iD, 0, 0, 9, null));
                            int iX = tVarT2.X(AbstractC2522b.a());
                            int iX2 = tVarT2.X(AbstractC2522b.b());
                            boolean z10 = true;
                            boolean z11 = (iX == Integer.MIN_VALUE || iX2 == Integer.MIN_VALUE) ? false : true;
                            if (iX != iX2 && z11) {
                                z10 = false;
                            }
                            int iL = Y0.b.l(j10) - tVarT.I0();
                            if (z10) {
                                iMax = Math.max(mVar.x1(L0.f13795h), tVarT.C0());
                                int iC02 = (iMax - tVarT2.C0()) / 2;
                                int iX3 = tVarT.X(AbstractC2522b.a());
                                iC0 = iX3 != Integer.MIN_VALUE ? (iX + iC02) - iX3 : 0;
                                i10 = iC02;
                            } else {
                                int iX1 = mVar.x1(L0.f13788a) - iX;
                                int iMax2 = Math.max(mVar.x1(L0.f13796i), tVarT2.C0() + iX1);
                                i10 = iX1;
                                iC0 = (iMax2 - tVarT.C0()) / 2;
                                iMax = iMax2;
                            }
                            return androidx.compose.ui.layout.m.x0(mVar, Y0.b.l(j10), iMax, null, new a(tVarT2, i10, tVarT, iL, iC0), 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, int i10) {
            super(2);
            this.f13807a = interfaceC6839p;
            this.f13808b = interfaceC6839p2;
            this.f13809c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            L0.b(this.f13807a, this.f13808b, interfaceC3540l, T.L0.a(this.f13809c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13811b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13812c;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13813a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13814b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f13815c;

            /* renamed from: N.L0$d$a$a, reason: collision with other inner class name */
            static final class C0543a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f13816a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f13817b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f13818c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0543a(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, boolean z10) {
                    super(2);
                    this.f13816a = interfaceC6839p;
                    this.f13817b = interfaceC6839p2;
                    this.f13818c = z10;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(225114541, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:103)");
                    }
                    if (this.f13816a == null) {
                        interfaceC3540l.U(1850967489);
                        L0.e(this.f13817b, interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else if (this.f13818c) {
                        interfaceC3540l.U(1850969582);
                        L0.a(this.f13817b, this.f13816a, interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else {
                        interfaceC3540l.U(1850971719);
                        L0.b(this.f13817b, this.f13816a, interfaceC3540l, 0);
                        interfaceC3540l.J();
                    }
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
            a(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, boolean z10) {
                super(2);
                this.f13813a = interfaceC6839p;
                this.f13814b = interfaceC6839p2;
                this.f13815c = z10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1939362236, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:101)");
                }
                a1.a(C3319f0.f14419a.c(interfaceC3540l, 6).b(), b0.c.e(225114541, true, new C0543a(this.f13813a, this.f13814b, this.f13815c), interfaceC3540l, 54), interfaceC3540l, 48);
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
        d(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, boolean z10) {
            super(2);
            this.f13810a = interfaceC6839p;
            this.f13811b = interfaceC6839p2;
            this.f13812c = z10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2084221700, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:100)");
            }
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(r.f14715a.c(interfaceC3540l, 6))), b0.c.e(1939362236, true, new a(this.f13810a, this.f13811b, this.f13812c), interfaceC3540l, 54), interfaceC3540l, T.I0.f20869i | 48);
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
        final /* synthetic */ androidx.compose.ui.e f13819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13821c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1 f13822d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13823e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13824f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f13825g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13826h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13827i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13828j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, boolean z10, i1 i1Var, long j10, long j11, float f10, InterfaceC6839p interfaceC6839p2, int i10, int i11) {
            super(2);
            this.f13819a = eVar;
            this.f13820b = interfaceC6839p;
            this.f13821c = z10;
            this.f13822d = i1Var;
            this.f13823e = j10;
            this.f13824f = j11;
            this.f13825g = f10;
            this.f13826h = interfaceC6839p2;
            this.f13827i = i10;
            this.f13828j = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            L0.c(this.f13819a, this.f13820b, this.f13821c, this.f13822d, this.f13823e, this.f13824f, this.f13825g, this.f13826h, interfaceC3540l, T.L0.a(this.f13827i | 1), this.f13828j);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {
        f(H0 h02) {
            super(2);
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
            } else {
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-261845785, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:178)");
                }
                throw null;
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1 f13831c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13832d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13833e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13834f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f13835g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13836h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13837i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(H0 h02, androidx.compose.ui.e eVar, boolean z10, i1 i1Var, long j10, long j11, long j12, float f10, int i10, int i11) {
            super(2);
            this.f13829a = eVar;
            this.f13830b = z10;
            this.f13831c = i1Var;
            this.f13832d = j10;
            this.f13833e = j11;
            this.f13834f = j12;
            this.f13835g = f10;
            this.f13836h = i10;
            this.f13837i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            L0.d(null, this.f13829a, this.f13830b, this.f13831c, this.f13832d, this.f13833e, this.f13834f, this.f13835g, interfaceC3540l, T.L0.a(this.f13836h | 1), this.f13837i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f13838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13839b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {
            a(H0 h02) {
                super(0);
            }

            public final void a() {
                throw null;
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f13840a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f13840a = str;
            }

            public final void a(z.Y y10, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-929149933, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:170)");
                }
                a1.b(this.f13840a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3540l, 0, 0, 131070);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10, H0 h02, String str) {
            super(2);
            this.f13838a = j10;
            this.f13839b = str;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1843479216, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:167)");
            }
            InterfaceC3314d interfaceC3314dH = C3316e.f14407a.h(0L, this.f13838a, 0L, interfaceC3540l, 3072, 5);
            boolean zL = interfaceC3540l.l(null);
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(null);
                interfaceC3540l.K(objF);
            }
            AbstractC3320g.c((InterfaceC6824a) objF, null, false, null, null, null, null, interfaceC3314dH, null, b0.c.e(-929149933, true, new b(this.f13839b), interfaceC3540l, 54), interfaceC3540l, 805306368, 382);
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

    static final class i implements C0.C {

        /* renamed from: a, reason: collision with root package name */
        public static final i f13841a = new i();

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f13842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f13843b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList arrayList, int i10) {
                super(1);
                this.f13842a = arrayList;
                this.f13843b = i10;
            }

            public final void a(t.a aVar) {
                ArrayList arrayList = this.f13842a;
                int i10 = this.f13843b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) arrayList.get(i11);
                    t.a.l(aVar, tVar, 0, (i10 - tVar.C0()) / 2, 0.0f, 4, null);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        i() {
        }

        @Override // C0.C
        public final C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z10 = false;
            int iX = Integer.MIN_VALUE;
            int iX2 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.t tVarT = ((C0.B) list.get(i10)).T(j10);
                arrayList.add(tVarT);
                if (tVarT.X(AbstractC2522b.a()) != Integer.MIN_VALUE && (iX == Integer.MIN_VALUE || tVarT.X(AbstractC2522b.a()) < iX)) {
                    iX = tVarT.X(AbstractC2522b.a());
                }
                if (tVarT.X(AbstractC2522b.b()) != Integer.MIN_VALUE && (iX2 == Integer.MIN_VALUE || tVarT.X(AbstractC2522b.b()) > iX2)) {
                    iX2 = tVarT.X(AbstractC2522b.b());
                }
                iMax = Math.max(iMax, tVarT.C0());
            }
            if (iX != Integer.MIN_VALUE && iX2 != Integer.MIN_VALUE) {
                z10 = true;
            }
            int iMax2 = Math.max(mVar.x1((iX == iX2 || !z10) ? L0.f13795h : L0.f13796i), iMax);
            return androidx.compose.ui.layout.m.x0(mVar, Y0.b.l(j10), iMax2, null, new a(arrayList, iMax2), 4, null);
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f13844a = interfaceC6839p;
            this.f13845b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            L0.e(this.f13844a, interfaceC3540l, T.L0.a(this.f13845b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static {
        float f10 = 8;
        f13790c = Y0.h.j(f10);
        f13793f = Y0.h.j(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1229075900);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:293)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            float f10 = f13789b;
            float f11 = f13790c;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(eVarH, f10, 0.0f, f11, f13791d, 2, null);
            C8680c.m mVarG = C8680c.f66832a.g();
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarM);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarM2 = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.a.g(aVar, f13788a, f13794g), 0.0f, 0.0f, f11, 0.0f, 11, null);
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarM2);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cH, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf(i11 & 14));
            interfaceC3540lR.R();
            androidx.compose.ui.e eVarC = c8688k.c(aVar, aVar2.j());
            C0.C cH2 = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarC);
            InterfaceC6824a interfaceC6824aA3 = aVar3.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA3);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA3, cH2, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            interfaceC6839p2.invoke(interfaceC3540lR, Integer.valueOf((i11 >> 3) & 14));
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(interfaceC6839p, interfaceC6839p2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-534813202);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:314)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(aVar, f13789b, 0.0f, f13790c, 0.0f, 10, null);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new b("action", "text");
                interfaceC3540lR.K(objF);
            }
            C0.C c10 = (C0.C) objF;
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarM);
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
            E1.c(interfaceC3540lA, c10, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.ui.layout.f.b(aVar, "text"), 0.0f, f13792e, 1, null);
            c.a aVar3 = f0.c.f46573a;
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cH, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf(i11 & 14));
            interfaceC3540lR.R();
            androidx.compose.ui.e eVarB = androidx.compose.ui.layout.f.b(aVar, "action");
            C0.C cH2 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
            InterfaceC6824a interfaceC6824aA3 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA3);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA3, cH2, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            interfaceC6839p2.invoke(interfaceC3540lR, Integer.valueOf((i11 >> 3) & 14));
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(interfaceC6839p, interfaceC6839p2, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r27, mh.InterfaceC6839p r28, boolean r29, m0.i1 r30, long r31, long r33, float r35, mh.InterfaceC6839p r36, T.InterfaceC3540l r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.L0.c(androidx.compose.ui.e, mh.p, boolean, m0.i1, long, long, float, mh.p, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(N.H0 r27, androidx.compose.ui.e r28, boolean r29, m0.i1 r30, long r31, long r33, long r35, float r37, T.InterfaceC3540l r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.L0.d(N.H0, androidx.compose.ui.e, boolean, m0.i1, long, long, long, float, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(917397959);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:238)");
            }
            i iVar = i.f13841a;
            e.a aVar = androidx.compose.ui.e.f28771b0;
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, aVar);
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
            E1.c(interfaceC3540lA, iVar, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(aVar, f13789b, f13792e);
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cH, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf(i11 & 14));
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new j(interfaceC6839p, i10));
        }
    }
}
