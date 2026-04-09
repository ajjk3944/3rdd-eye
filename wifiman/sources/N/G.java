package N;

import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import oh.AbstractC7137b;
import org.conscrypt.PSKKeyManager;
import s.AbstractC7848i;
import w.AbstractC8235B;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8683f;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13678a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13679b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13680c = Y0.h.j(400);

    /* renamed from: d, reason: collision with root package name */
    private static final r.r0 f13681d = new r.r0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0, null, 6, null);

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H f13682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ii.N f13684c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13685d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1 f13686e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13687f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13688g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f13689h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13690i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ mh.q f13691j;

        /* renamed from: N.G$a$a, reason: collision with other inner class name */
        static final class C0534a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ H f13692a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y0.d f13693b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f13694c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f13695d;

            /* renamed from: N.G$a$a$a, reason: collision with other inner class name */
            static final class C0535a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ float f13696a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ float f13697b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0535a(float f10, float f11) {
                    super(1);
                    this.f13696a = f10;
                    this.f13697b = f11;
                }

                public final void a(E e10) {
                    e10.a(I.Closed, this.f13696a);
                    e10.a(I.Open, this.f13697b);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((E) obj);
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0534a(H h10, Y0.d dVar, float f10, float f11) {
                super(0);
                this.f13692a = h10;
                this.f13693b = dVar;
                this.f13694c = f10;
                this.f13695d = f11;
            }

            public final void a() {
                this.f13692a.h(this.f13693b);
                C3310b.J(this.f13692a.c(), androidx.compose.material.a.a(new C0535a(this.f13694c, this.f13695d)), null, 2, null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f13698a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ H f13699b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ii.N f13700c;

            /* renamed from: N.G$a$b$a, reason: collision with other inner class name */
            static final class C0536a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f13701a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ H f13702b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0536a(H h10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f13702b = h10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0536a(this.f13702b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f13701a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        H h10 = this.f13702b;
                        this.f13701a = 1;
                        if (h10.b(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0536a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z10, H h10, Ii.N n10) {
                super(0);
                this.f13698a = z10;
                this.f13699b = h10;
                this.f13700c = n10;
            }

            public final void a() {
                if (this.f13698a && ((Boolean) this.f13699b.c().r().invoke(I.Closed)).booleanValue()) {
                    AbstractC3063k.d(this.f13700c, null, null, new C0536a(this.f13699b, null), 3, null);
                }
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f13703a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f13704b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f13705c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f10, float f11, H h10) {
                super(0);
                this.f13703a = f10;
                this.f13704b = f11;
                this.f13705c = h10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(G.i(this.f13703a, this.f13704b, this.f13705c.g()));
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ H f13706a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(H h10) {
                super(1);
                this.f13706a = h10;
            }

            public final long a(Y0.d dVar) {
                return Y0.o.a(AbstractC7137b.e(this.f13706a.g()), 0);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Y0.n.b(a((Y0.d) obj));
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f13707a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ H f13708b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ii.N f13709c;

            /* renamed from: N.G$a$e$a, reason: collision with other inner class name */
            static final class C0537a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ H f13710a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ii.N f13711b;

                /* renamed from: N.G$a$e$a$a, reason: collision with other inner class name */
                static final class C0538a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f13712a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ H f13713b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0538a(H h10, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f13713b = h10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0538a(this.f13713b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f13712a;
                        if (i10 == 0) {
                            Yg.v.b(obj);
                            H h10 = this.f13713b;
                            this.f13712a = 1;
                            if (h10.b(this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Yg.v.b(obj);
                        }
                        return Yg.J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0538a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0537a(H h10, Ii.N n10) {
                    super(0);
                    this.f13710a = h10;
                    this.f13711b = n10;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    if (((Boolean) this.f13710a.c().r().invoke(I.Closed)).booleanValue()) {
                        AbstractC3063k.d(this.f13711b, null, null, new C0538a(this.f13710a, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, H h10, Ii.N n10) {
                super(1);
                this.f13707a = str;
                this.f13708b = h10;
                this.f13709c = n10;
            }

            public final void a(J0.w wVar) {
                J0.t.g0(wVar, this.f13707a);
                if (this.f13708b.e()) {
                    J0.t.n(wVar, null, new C0537a(this.f13708b, this.f13709c), 1, null);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((J0.w) obj);
                return Yg.J.f24997a;
            }
        }

        static final class f extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.q f13714a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(mh.q qVar) {
                super(2);
                this.f13714a = qVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1941234439, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:586)");
                }
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                mh.q qVar = this.f13714a;
                C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
                E1.c(interfaceC3540lA, cA, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                qVar.s(C8688k.f66923a, interfaceC3540l, 6);
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
        a(H h10, boolean z10, Ii.N n10, long j10, i1 i1Var, long j11, long j12, float f10, InterfaceC6839p interfaceC6839p, mh.q qVar) {
            super(3);
            this.f13682a = h10;
            this.f13683b = z10;
            this.f13684c = n10;
            this.f13685d = j10;
            this.f13686e = i1Var;
            this.f13687f = j11;
            this.f13688g = j12;
            this.f13689h = f10;
            this.f13690i = interfaceC6839p;
            this.f13691j = qVar;
        }

        public final void a(InterfaceC8683f interfaceC8683f, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(interfaceC8683f) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(816674999, i11, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:503)");
            }
            long jD = interfaceC8683f.d();
            if (!Y0.b.h(jD)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            float f10 = -Y0.b.l(jD);
            Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
            boolean zT = interfaceC3540l.T(this.f13682a) | interfaceC3540l.T(dVar) | interfaceC3540l.g(f10);
            H h10 = this.f13682a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0534a(h10, dVar, f10, 0.0f);
                interfaceC3540l.K(objF);
            }
            T.O.g((InterfaceC6824a) objF, interfaceC3540l, 0);
            boolean z10 = interfaceC3540l.t(AbstractC3932k0.m()) == Y0.t.Rtl;
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarE = androidx.compose.material.a.e(aVar, this.f13682a.c(), w.q.Horizontal, this.f13683b, z10, null, false, 48, null);
            H h11 = this.f13682a;
            boolean z11 = this.f13683b;
            Ii.N n10 = this.f13684c;
            long j10 = this.f13685d;
            i1 i1Var = this.f13686e;
            long j11 = this.f13687f;
            long j12 = this.f13688g;
            float f11 = this.f13689h;
            InterfaceC6839p interfaceC6839p = this.f13690i;
            mh.q qVar = this.f13691j;
            c.a aVar2 = f0.c.f46573a;
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarE);
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
            E1.c(interfaceC3540lA, cH, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE2, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            C0.C cH2 = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            E1.c(interfaceC3540lA2, cH2, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE3, aVar3.f());
            interfaceC6839p.invoke(interfaceC3540l, 0);
            interfaceC3540l.R();
            boolean zE = h11.e();
            boolean zC = interfaceC3540l.c(z11) | interfaceC3540l.T(h11) | interfaceC3540l.l(n10);
            Object objF2 = interfaceC3540l.f();
            if (zC || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new b(z11, h11, n10);
                interfaceC3540l.K(objF2);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF2;
            boolean zG = interfaceC3540l.g(f10) | interfaceC3540l.T(h11);
            Object objF3 = interfaceC3540l.f();
            if (zG || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new c(f10, 0.0f, h11);
                interfaceC3540l.K(objF3);
            }
            G.b(zE, interfaceC6824a, (InterfaceC6824a) objF3, j10, interfaceC3540l, 0);
            String strA = N0.a(M0.f13846a.e(), interfaceC3540l, 6);
            Y0.d dVar2 = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
            androidx.compose.ui.e eVarX = androidx.compose.foundation.layout.r.x(aVar, dVar2.x(Y0.b.n(jD)), dVar2.x(Y0.b.m(jD)), dVar2.x(Y0.b.l(jD)), dVar2.x(Y0.b.k(jD)));
            boolean zT2 = interfaceC3540l.T(h11);
            Object objF4 = interfaceC3540l.f();
            if (zT2 || objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = new d(h11);
                interfaceC3540l.K(objF4);
            }
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.l.a(eVarX, (InterfaceC6835l) objF4), 0.0f, 0.0f, G.f13678a, 0.0f, 11, null);
            boolean zT3 = interfaceC3540l.T(strA) | interfaceC3540l.T(h11) | interfaceC3540l.l(n10);
            Object objF5 = interfaceC3540l.f();
            if (zT3 || objF5 == InterfaceC3540l.f21100a.a()) {
                objF5 = new e(strA, h11, n10);
                interfaceC3540l.K(objF5);
            }
            O0.a(J0.m.c(eVarM, false, (InterfaceC6835l) objF5, 1, null), i1Var, j11, j12, null, f11, b0.c.e(-1941234439, true, new f(qVar), interfaceC3540l, 54), interfaceC3540l, 1572864, 16);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f13715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13716b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f13717c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13718d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1 f13719e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f13720f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13721g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f13722h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f13723i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13724j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13725k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13726l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(mh.q qVar, androidx.compose.ui.e eVar, H h10, boolean z10, i1 i1Var, float f10, long j10, long j11, long j12, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f13715a = qVar;
            this.f13716b = eVar;
            this.f13717c = h10;
            this.f13718d = z10;
            this.f13719e = i1Var;
            this.f13720f = f10;
            this.f13721g = j10;
            this.f13722h = j11;
            this.f13723i = j12;
            this.f13724j = interfaceC6839p;
            this.f13725k = i10;
            this.f13726l = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            G.a(this.f13715a, this.f13716b, this.f13717c, this.f13718d, this.f13719e, this.f13720f, this.f13721g, this.f13722h, this.f13723i, this.f13724j, interfaceC3540l, T.L0.a(this.f13725k | 1), this.f13726l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f13727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f13727a = j10;
            this.f13728b = interfaceC6824a;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            InterfaceC7039f.u0(interfaceC7039f, this.f13727a, 0L, 0L, ((Number) this.f13728b.invoke()).floatValue(), null, null, 0, 118, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13732d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13733e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, long j10, int i10) {
            super(2);
            this.f13729a = z10;
            this.f13730b = interfaceC6824a;
            this.f13731c = interfaceC6824a2;
            this.f13732d = j10;
            this.f13733e = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            G.b(this.f13729a, this.f13730b, this.f13731c, this.f13732d, interfaceC3540l, T.L0.a(this.f13733e | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13734a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13736c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f13737a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6824a interfaceC6824a) {
                super(1);
                this.f13737a = interfaceC6824a;
            }

            public final void a(long j10) {
                this.f13737a.invoke();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6531g) obj).v());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13736c = interfaceC6824a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            e eVar = new e(this.f13736c, interfaceC5380e);
            eVar.f13735b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13734a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f13735b;
                a aVar = new a(this.f13736c);
                this.f13734a = 1;
                if (AbstractC8235B.k(interfaceC8567G, null, null, null, aVar, this, 7, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((e) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13739b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f13740a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6824a interfaceC6824a) {
                super(0);
                this.f13740a = interfaceC6824a;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f13740a.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f13738a = str;
            this.f13739b = interfaceC6824a;
        }

        public final void a(J0.w wVar) {
            J0.t.a0(wVar, this.f13738a);
            J0.t.A(wVar, null, new a(this.f13739b), 1, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f13741a = new g();

        g() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I i10) {
            return Boolean.TRUE;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f13742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f13743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(I i10, InterfaceC6835l interfaceC6835l) {
            super(0);
            this.f13742a = i10;
            this.f13743b = interfaceC6835l;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke() {
            return new H(this.f13742a, this.f13743b);
        }
    }

    static {
        float f10 = 56;
        f13678a = Y0.h.j(f10);
        f13679b = Y0.h.j(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(mh.q r34, androidx.compose.ui.e r35, N.H r36, boolean r37, m0.i1 r38, float r39, long r40, long r42, long r44, mh.InterfaceC6839p r46, T.InterfaceC3540l r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.G.a(mh.q, androidx.compose.ui.e, N.H, boolean, m0.i1, float, long, long, long, mh.p, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, long j10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        androidx.compose.ui.e eVarB;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1983403750);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:829)");
            }
            String strA = N0.a(M0.f13846a.a(), interfaceC3540lR, 6);
            if (z10) {
                interfaceC3540lR.U(487729414);
                e.a aVar = androidx.compose.ui.e.f28771b0;
                int i12 = i11 & 112;
                boolean z11 = i12 == 32;
                Object objF = interfaceC3540lR.f();
                if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new e(interfaceC6824a, null);
                    interfaceC3540lR.K(objF);
                }
                androidx.compose.ui.e eVarD = AbstractC8576P.d(aVar, interfaceC6824a, (InterfaceC6839p) objF);
                boolean zT = (i12 == 32) | interfaceC3540lR.T(strA);
                Object objF2 = interfaceC3540lR.f();
                if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new f(strA, interfaceC6824a);
                    interfaceC3540lR.K(objF2);
                }
                eVarB = J0.m.b(eVarD, true, (InterfaceC6835l) objF2);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(487978282);
                interfaceC3540lR.J();
                eVarB = androidx.compose.ui.e.f28771b0;
            }
            androidx.compose.ui.e eVarB0 = androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null).b0(eVarB);
            boolean z12 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objF3 = interfaceC3540lR.f();
            if (z12 || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new c(j10, interfaceC6824a2);
                interfaceC3540lR.K(objF3);
            }
            AbstractC7848i.a(eVarB0, (InterfaceC6835l) objF3, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(z10, interfaceC6824a, interfaceC6824a2, j10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f10, float f11, float f12) {
        float f13 = (f12 - f10) / (f11 - f10);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    public static final H j(I i10, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        if ((i12 & 2) != 0) {
            interfaceC6835l = g.f13741a;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1435874229, i11, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:429)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kA = H.f13746c.a(interfaceC6835l);
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC3540l.T(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3540l.T(interfaceC6835l)) || (i11 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new h(i10, interfaceC6835l);
            interfaceC3540l.K(objF);
        }
        H h10 = (H) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return h10;
    }
}
