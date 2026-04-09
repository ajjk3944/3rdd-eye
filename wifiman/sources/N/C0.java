package N;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.InterfaceC3540l;
import androidx.compose.ui.layout.t;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f13561a = AbstractC3561w.f(a.f13563a);

    /* renamed from: b, reason: collision with root package name */
    private static final float f13562b = Y0.h.j(16);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13563a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            return null;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f13564a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(mh.q qVar) {
            super(2);
            this.f13564a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1409196448, i10, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:242)");
            }
            this.f13564a.s(androidx.compose.ui.e.f28771b0, interfaceC3540l, 54);
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

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z.f0 f13565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13566b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E0 f13567c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13568d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13569e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.q f13570f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13571g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13572h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f13573i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ mh.q f13574j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f13575k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ i1 f13576l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f13577m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f13578n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f13579o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f13580p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f13581q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f13582r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ mh.q f13583s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f13584t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f13585u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f13586v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z.f0 f0Var, androidx.compose.ui.e eVar, E0 e02, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, mh.q qVar, InterfaceC6839p interfaceC6839p3, int i10, boolean z10, mh.q qVar2, boolean z11, i1 i1Var, float f10, long j10, long j11, long j12, long j13, long j14, mh.q qVar3, int i11, int i12, int i13) {
            super(2);
            this.f13565a = f0Var;
            this.f13566b = eVar;
            this.f13567c = e02;
            this.f13568d = interfaceC6839p;
            this.f13569e = interfaceC6839p2;
            this.f13570f = qVar;
            this.f13571g = interfaceC6839p3;
            this.f13572h = i10;
            this.f13573i = z10;
            this.f13574j = qVar2;
            this.f13575k = z11;
            this.f13576l = i1Var;
            this.f13577m = f10;
            this.f13578n = j10;
            this.f13579o = j11;
            this.f13580p = j12;
            this.f13581q = j13;
            this.f13582r = j14;
            this.f13583s = qVar3;
            this.f13584t = i11;
            this.f13585u = i12;
            this.f13586v = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            C0.b(this.f13565a, this.f13566b, this.f13567c, this.f13568d, this.f13569e, this.f13570f, this.f13571g, this.f13572h, this.f13573i, this.f13574j, this.f13575k, this.f13576l, this.f13577m, this.f13578n, this.f13579o, this.f13580p, this.f13581q, this.f13582r, this.f13583s, interfaceC3540l, T.L0.a(this.f13584t | 1), T.L0.a(this.f13585u), this.f13586v);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E0 f13588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f13591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13592f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13593g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f13594h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ mh.q f13595i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f13596j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ i1 f13597k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f13598l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f13599m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f13600n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f13601o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f13602p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f13603q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ mh.q f13604r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f13605s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f13606t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f13607u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, E0 e02, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, mh.q qVar, InterfaceC6839p interfaceC6839p3, int i10, boolean z10, mh.q qVar2, boolean z11, i1 i1Var, float f10, long j10, long j11, long j12, long j13, long j14, mh.q qVar3, int i11, int i12, int i13) {
            super(2);
            this.f13587a = eVar;
            this.f13588b = e02;
            this.f13589c = interfaceC6839p;
            this.f13590d = interfaceC6839p2;
            this.f13591e = qVar;
            this.f13592f = interfaceC6839p3;
            this.f13593g = i10;
            this.f13594h = z10;
            this.f13595i = qVar2;
            this.f13596j = z11;
            this.f13597k = i1Var;
            this.f13598l = f10;
            this.f13599m = j10;
            this.f13600n = j11;
            this.f13601o = j12;
            this.f13602p = j13;
            this.f13603q = j14;
            this.f13604r = qVar3;
            this.f13605s = i11;
            this.f13606t = i12;
            this.f13607u = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            C0.a(this.f13587a, this.f13588b, this.f13589c, this.f13590d, this.f13591e, this.f13592f, this.f13593g, this.f13594h, this.f13595i, this.f13596j, this.f13597k, this.f13598l, this.f13599m, this.f13600n, this.f13601o, this.f13602p, this.f13603q, this.f13604r, interfaceC3540l, T.L0.a(this.f13605s | 1), T.L0.a(this.f13606t), this.f13607u);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3339p0 f13608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.f0 f13609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13612e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13613f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13614g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ mh.q f13615h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13616i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13617j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ mh.q f13618k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ E0 f13619l;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3339p0 f13620a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z.f0 f13621b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3339p0 c3339p0, z.f0 f0Var) {
                super(1);
                this.f13620a = c3339p0;
                this.f13621b = f0Var;
            }

            public final void a(z.f0 f0Var) {
                this.f13620a.f(z.h0.g(this.f13621b, f0Var));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((z.f0) obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f13622a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f13623b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13624c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ mh.q f13625d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13626e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C3339p0 f13627f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13628g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ mh.q f13629h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ E0 f13630i;

            static final class a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ mh.q f13631a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ E0 f13632b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(mh.q qVar, E0 e02) {
                    super(2);
                    this.f13631a = qVar;
                    this.f13632b = e02;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(433906483, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:223)");
                    }
                    this.f13631a.s(this.f13632b.b(), interfaceC3540l, 0);
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
            b(boolean z10, int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, C3339p0 c3339p0, InterfaceC6839p interfaceC6839p3, mh.q qVar2, E0 e02) {
                super(2);
                this.f13622a = z10;
                this.f13623b = i10;
                this.f13624c = interfaceC6839p;
                this.f13625d = qVar;
                this.f13626e = interfaceC6839p2;
                this.f13627f = c3339p0;
                this.f13628g = interfaceC6839p3;
                this.f13629h = qVar2;
                this.f13630i = e02;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1772955108, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:216)");
                }
                C0.c(this.f13622a, this.f13623b, this.f13624c, this.f13625d, b0.c.e(433906483, true, new a(this.f13629h, this.f13630i), interfaceC3540l, 54), this.f13626e, this.f13627f, this.f13628g, interfaceC3540l, 24576);
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
        e(C3339p0 c3339p0, z.f0 f0Var, long j10, long j11, boolean z10, int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, mh.q qVar2, E0 e02) {
            super(3);
            this.f13608a = c3339p0;
            this.f13609b = f0Var;
            this.f13610c = j10;
            this.f13611d = j11;
            this.f13612e = z10;
            this.f13613f = i10;
            this.f13614g = interfaceC6839p;
            this.f13615h = qVar;
            this.f13616i = interfaceC6839p2;
            this.f13617j = interfaceC6839p3;
            this.f13618k = qVar2;
            this.f13619l = e02;
        }

        public final void a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(eVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-219833176, i11, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:207)");
            }
            boolean zT = interfaceC3540l.T(this.f13608a) | interfaceC3540l.T(this.f13609b);
            C3339p0 c3339p0 = this.f13608a;
            z.f0 f0Var = this.f13609b;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(c3339p0, f0Var);
                interfaceC3540l.K(objF);
            }
            O0.a(z.i0.c(eVar, (InterfaceC6835l) objF), null, this.f13610c, this.f13611d, null, 0.0f, b0.c.e(1772955108, true, new b(this.f13612e, this.f13613f, this.f13614g, this.f13615h, this.f13616i, this.f13608a, this.f13617j, this.f13618k, this.f13619l), interfaceC3540l, 54), interfaceC3540l, 1572864, 50);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13634b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13635c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13636d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13637e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z.f0 f13638f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13639g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ mh.q f13640h;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f13641a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f13642b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f13643c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List f13644d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f13645e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f13646f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f13647g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f13648h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Integer f13649i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ O f13650j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Integer f13651k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, List list2, List list3, List list4, List list5, int i10, int i11, int i12, Integer num, O o10, Integer num2) {
                super(1);
                this.f13641a = list;
                this.f13642b = list2;
                this.f13643c = list3;
                this.f13644d = list4;
                this.f13645e = list5;
                this.f13646f = i10;
                this.f13647g = i11;
                this.f13648h = i12;
                this.f13649i = num;
                this.f13650j = o10;
                this.f13651k = num2;
            }

            public final void a(t.a aVar) {
                List list = this.f13641a;
                int i10 = this.f13646f;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list.get(i11), 0, i10, 0.0f, 4, null);
                }
                List list2 = this.f13642b;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list2.get(i12), 0, 0, 0.0f, 4, null);
                }
                List list3 = this.f13643c;
                int i13 = this.f13647g;
                int i14 = this.f13648h;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list3.get(i15), 0, i13 - i14, 0.0f, 4, null);
                }
                List list4 = this.f13644d;
                int i16 = this.f13647g;
                Integer num = this.f13649i;
                int size4 = list4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list4.get(i17), 0, i16 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                List list5 = this.f13645e;
                O o10 = this.f13650j;
                int i18 = this.f13647g;
                Integer num2 = this.f13651k;
                int size5 = list5.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list5.get(i19), o10 != null ? o10.b() : 0, i18 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z.f0 f13652a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0.U f13653b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f13654c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List f13655d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Integer f13656e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ mh.q f13657f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z.f0 f0Var, C0.U u10, List list, List list2, Integer num, mh.q qVar) {
                super(2);
                this.f13652a = f0Var;
                this.f13653b = u10;
                this.f13654c = list;
                this.f13655d = list2;
                this.f13656e = num;
                this.f13657f = qVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                Integer num;
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-570781649, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:510)");
                }
                z.N nF = z.h0.f(this.f13652a, this.f13653b);
                this.f13657f.s(androidx.compose.foundation.layout.o.d(androidx.compose.foundation.layout.o.g(nF, this.f13653b.getLayoutDirection()), this.f13654c.isEmpty() ? nF.d() : Y0.h.j(0), androidx.compose.foundation.layout.o.f(nF, this.f13653b.getLayoutDirection()), (this.f13655d.isEmpty() || (num = this.f13656e) == null) ? nF.c() : this.f13653b.x(num.intValue())), interfaceC3540l, 0);
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

        static final class c extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f13658a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13659b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O o10, InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f13658a = o10;
                this.f13659b = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(424088350, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:476)");
                }
                AbstractC3561w.a(C0.f().d(this.f13658a), this.f13659b, interfaceC3540l, T.I0.f20869i);
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
        f(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, int i10, boolean z10, z.f0 f0Var, InterfaceC6839p interfaceC6839p4, mh.q qVar) {
            super(2);
            this.f13633a = interfaceC6839p;
            this.f13634b = interfaceC6839p2;
            this.f13635c = interfaceC6839p3;
            this.f13636d = i10;
            this.f13637e = z10;
            this.f13638f = f0Var;
            this.f13639g = interfaceC6839p4;
            this.f13640h = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final C0.D a(C0.U r33, long r34) {
            /*
                Method dump skipped, instructions count: 903
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N.C0.f.a(C0.U, long):C0.D");
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C0.U) obj, ((Y0.b) obj2).r());
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13662c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f13663d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13664e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13665f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z.f0 f13666g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13667h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f13668i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, z.f0 f0Var, InterfaceC6839p interfaceC6839p4, int i11) {
            super(2);
            this.f13660a = z10;
            this.f13661b = i10;
            this.f13662c = interfaceC6839p;
            this.f13663d = qVar;
            this.f13664e = interfaceC6839p2;
            this.f13665f = interfaceC6839p3;
            this.f13666g = f0Var;
            this.f13667h = interfaceC6839p4;
            this.f13668i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            C0.c(this.f13660a, this.f13661b, this.f13662c, this.f13663d, this.f13664e, this.f13665f, this.f13666g, this.f13667h, interfaceC3540l, T.L0.a(this.f13668i | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r58, N.E0 r59, mh.InterfaceC6839p r60, mh.InterfaceC6839p r61, mh.q r62, mh.InterfaceC6839p r63, int r64, boolean r65, mh.q r66, boolean r67, m0.i1 r68, float r69, long r70, long r72, long r74, long r76, long r78, mh.q r80, T.InterfaceC3540l r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0.a(androidx.compose.ui.e, N.E0, mh.p, mh.p, mh.q, mh.p, int, boolean, mh.q, boolean, m0.i1, float, long, long, long, long, long, mh.q, T.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(z.f0 r36, androidx.compose.ui.e r37, N.E0 r38, mh.InterfaceC6839p r39, mh.InterfaceC6839p r40, mh.q r41, mh.InterfaceC6839p r42, int r43, boolean r44, mh.q r45, boolean r46, m0.i1 r47, float r48, long r49, long r51, long r53, long r55, long r57, mh.q r59, T.InterfaceC3540l r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0.b(z.f0, androidx.compose.ui.e, N.E0, mh.p, mh.p, mh.q, mh.p, int, boolean, mh.q, boolean, m0.i1, float, long, long, long, long, long, mh.q, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, z.f0 f0Var, InterfaceC6839p interfaceC6839p4, InterfaceC3540l interfaceC3540l, int i11) {
        int i12;
        int i13;
        int i14;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-468424875);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3540lR.c(z10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3540lR.i(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p3) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= interfaceC3540lR.T(f0Var) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p4) ? 8388608 : 4194304;
        }
        if ((i12 & 4793491) == 4793490 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-468424875, i12, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:390)");
            }
            boolean z11 = ((i12 & 896) == 256) | ((57344 & i12) == 16384) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((i12 & 112) == 32) | ((i12 & 14) == 4) | ((29360128 & i12) == 8388608) | ((i12 & 7168) == 2048);
            Object objF = interfaceC3540lR.f();
            if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                i13 = 1;
                i14 = 0;
                objF = new f(interfaceC6839p, interfaceC6839p2, interfaceC6839p3, i10, z10, f0Var, interfaceC6839p4, qVar);
                interfaceC3540lR.K(objF);
            } else {
                i13 = 1;
                i14 = 0;
            }
            androidx.compose.ui.layout.w.a(null, (InterfaceC6839p) objF, interfaceC3540lR, i14, i13);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new g(z10, i10, interfaceC6839p, qVar, interfaceC6839p2, interfaceC6839p3, f0Var, interfaceC6839p4, i11));
        }
    }

    public static final T.H0 f() {
        return f13561a;
    }

    public static final E0 g(H h10, K0 k02, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            h10 = G.j(I.Closed, null, interfaceC3540l, 6, 2);
        }
        if ((i11 & 2) != 0) {
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new K0();
                interfaceC3540l.K(objF);
            }
            k02 = (K0) objF;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:74)");
        }
        Object objF2 = interfaceC3540l.f();
        if (objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new E0(h10, k02);
            interfaceC3540l.K(objF2);
        }
        E0 e02 = (E0) objF2;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return e02;
    }
}
