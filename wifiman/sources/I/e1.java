package I;

import E0.AbstractC2631i;
import E0.AbstractC2635m;
import E0.InterfaceC2630h;
import E0.InterfaceC2641t;
import F.EnumC2726p;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import L0.C3174d;
import R0.C3465s;
import R0.C3471y;
import R0.r;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.C3917f0;
import androidx.compose.ui.platform.C3920g0;
import androidx.compose.ui.platform.E1;
import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import i0.C6052b;
import i0.InterfaceC6054d;
import java.util.List;
import java.util.Set;
import k0.InterfaceC6354b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import t.AbstractC8017d;
import u.AbstractC8121a;
import u.AbstractC8122b;
import w0.InterfaceC8251e;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8558m;
import y0.AbstractC8576P;
import y0.C8593n;
import y0.EnumC8595p;
import y0.InterfaceC8567G;
import y0.InterfaceC8578S;

/* loaded from: classes.dex */
public final class e1 extends AbstractC2635m implements androidx.compose.ui.platform.M0, E0.v0, k0.k, InterfaceC6354b, InterfaceC2641t, E0.s0, InterfaceC8251e, InterfaceC2630h, D0.h, E0.h0, E0.A {

    /* renamed from: A, reason: collision with root package name */
    private final G.a f8230A;

    /* renamed from: B, reason: collision with root package name */
    private C8552g f8231B;

    /* renamed from: D, reason: collision with root package name */
    private F.D f8233D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f8234E;

    /* renamed from: F, reason: collision with root package name */
    private E1 f8235F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC3091y0 f8236G;

    /* renamed from: H, reason: collision with root package name */
    private final g1 f8237H;

    /* renamed from: I, reason: collision with root package name */
    private final r f8238I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC3091y0 f8239J;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC6824a f8240N;

    /* renamed from: p, reason: collision with root package name */
    private o1 f8241p;

    /* renamed from: q, reason: collision with root package name */
    private l1 f8242q;

    /* renamed from: r, reason: collision with root package name */
    private J.j f8243r;

    /* renamed from: s, reason: collision with root package name */
    private H.b f8244s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8245t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8246u;

    /* renamed from: v, reason: collision with root package name */
    private H.d f8247v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8248w;

    /* renamed from: x, reason: collision with root package name */
    private InterfaceC8558m f8249x;

    /* renamed from: y, reason: collision with root package name */
    private Li.y f8250y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC8578S f8251z = (InterfaceC8578S) D2(AbstractC8576P.a(new w(null)));

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC6054d f8232C = (InterfaceC6054d) D2(f1.a(new k(), new l(), new m(), (72 & 8) != 0 ? null : null, (72 & 16) != 0 ? null : new n(), (72 & 32) != 0 ? null : new o(), (72 & 64) != 0 ? null : null, (72 & 128) != 0 ? null : new p(), (72 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : new q()));

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            e1.this.e3().o0();
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            L0.M mF = e1.this.g3().f();
            return Boolean.valueOf(mF != null ? list.add(mF) : false);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3174d c3174d) {
            if (!e1.this.X2()) {
                return Boolean.FALSE;
            }
            e1.this.f3().s(c3174d);
            return Boolean.TRUE;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {
        d() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3174d c3174d) {
            if (!e1.this.X2()) {
                return Boolean.FALSE;
            }
            o1.u(e1.this.f3(), c3174d, true, null, 4, null);
            return Boolean.TRUE;
        }
    }

    static final class e extends AbstractC6494u implements mh.q {
        e() {
            super(3);
        }

        public final Boolean a(int i10, int i11, boolean z10) {
            H.h hVarK = z10 ? e1.this.f3().k() : e1.this.f3().l();
            long jF = hVarK.f();
            if (!e1.this.Y2() || Math.min(i10, i11) < 0 || Math.max(i10, i11) > hVarK.length()) {
                return Boolean.FALSE;
            }
            if (i10 == L0.S.n(jF) && i11 == L0.S.i(jF)) {
                return Boolean.TRUE;
            }
            long jB = L0.T.b(i10, i11);
            if (z10 || i10 == i11) {
                e1.this.e3().I0(J.n.None);
            } else {
                e1.this.e3().I0(J.n.Selection);
            }
            if (z10) {
                e1.this.f3().z(jB);
            } else {
                e1.this.f3().y(jB);
            }
            return Boolean.TRUE;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8258b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super(0);
            this.f8258b = i10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            e1.this.j3(this.f8258b);
            return Boolean.TRUE;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {
        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (!e1.this.h3()) {
                androidx.compose.ui.focus.q.a(e1.this);
            } else if (!e1.this.b3()) {
                e1.this.k3().b();
            }
            return Boolean.TRUE;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (!e1.this.h3()) {
                androidx.compose.ui.focus.q.a(e1.this);
            }
            e1.this.e3().I0(J.n.Selection);
            return Boolean.TRUE;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {
        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            J.j.F(e1.this.e3(), false, 1, null);
            return Boolean.TRUE;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            e1.this.e3().H();
            return Boolean.TRUE;
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6824a {
        k() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            AbstractC8122b.a(e1.this);
            return d1.f8227a;
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6839p {
        l() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3917f0 c3917f0, C3920g0 c3920g0) {
            e1.this.W2();
            e1.this.e3().D();
            String strA = AbstractC8017d.a(c3917f0);
            AbstractC8122b.a(e1.this);
            if (strA != null) {
                o1.u(e1.this.f3(), strA, false, null, 6, null);
            }
            return Boolean.TRUE;
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6835l {
        m() {
            super(1);
        }

        public final void a(C6052b c6052b) {
            AbstractC8122b.a(e1.this);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6052b) obj);
            return Yg.J.f24997a;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6835l {
        n() {
            super(1);
        }

        public final void a(C6052b c6052b) {
            e1 e1Var = e1.this;
            C8552g c8552g = new C8552g();
            e1.this.Z2().c(c8552g);
            e1Var.f8231B = c8552g;
            AbstractC8122b.a(e1.this);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6052b) obj);
            return Yg.J.f24997a;
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {
        o() {
            super(1);
        }

        public final void a(long j10) {
            long jD = m1.d(e1.this.g3(), j10);
            e1.this.f3().y(L0.T.a(l1.i(e1.this.g3(), jD, false, 2, null)));
            e1.this.e3().F0(EnumC2726p.Cursor, jD);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return Yg.J.f24997a;
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6835l {
        p() {
            super(1);
        }

        public final void a(C6052b c6052b) {
            e1.this.W2();
            e1.this.e3().D();
            AbstractC8122b.a(e1.this);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6052b) obj);
            return Yg.J.f24997a;
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6835l {
        q() {
            super(1);
        }

        public final void a(C6052b c6052b) {
            e1.this.W2();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6052b) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class r implements F.B {
        r() {
        }

        private final k0.e b() {
            return (k0.e) AbstractC2631i.a(e1.this, AbstractC3932k0.h());
        }

        public void a(int i10) {
            r.a aVar = R0.r.f19498b;
            if (R0.r.m(i10, aVar.d())) {
                b().k(androidx.compose.ui.focus.d.f28823b.e());
            } else if (R0.r.m(i10, aVar.f())) {
                b().k(androidx.compose.ui.focus.d.f28823b.f());
            } else if (R0.r.m(i10, aVar.b())) {
                e1.this.k3().c();
            }
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8271a;

        s(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return e1.this.new s(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8271a;
            if (i10 == 0) {
                Yg.v.b(obj);
                J.j jVarE3 = e1.this.e3();
                this.f8271a = 1;
                if (jVarE3.l0(this) == objG) {
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
            return ((s) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class t extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i10) {
            super(0);
            this.f8274b = i10;
        }

        public final void a() {
            e1.this.f8238I.a(this.f8274b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class u extends AbstractC6494u implements InterfaceC6824a {
        u() {
            super(0);
        }

        public final void a() {
            e1 e1Var = e1.this;
            e1Var.j3(e1Var.a3().g());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6824a {
        v() {
            super(0);
        }

        public final void a() {
            e1 e1Var = e1.this;
            e1Var.f8235F = (E1) AbstractC2631i.a(e1Var, AbstractC3932k0.u());
            e1.this.i3();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8277a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f8278b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8280a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f8281b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e1 f8282c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f8283d;

            /* renamed from: I.e1$w$a$a, reason: collision with other inner class name */
            static final class C0340a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f8284a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J.j f8285b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC8567G f8286c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0340a(J.j jVar, InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f8285b = jVar;
                    this.f8286c = interfaceC8567G;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0340a(this.f8285b, this.f8286c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f8284a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        J.j jVar = this.f8285b;
                        InterfaceC8567G interfaceC8567G = this.f8286c;
                        this.f8284a = 1;
                        if (jVar.O(interfaceC8567G, this) == objG) {
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
                    return ((C0340a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f8287a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ e1 f8288b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ J.j f8289c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC8567G f8290d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f8291e;

                /* renamed from: I.e1$w$a$b$a, reason: collision with other inner class name */
                static final class C0341a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ e1 f8292a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0341a(e1 e1Var) {
                        super(0);
                        this.f8292a = e1Var;
                    }

                    public final void a() {
                        if (this.f8292a.f8239J != null) {
                            this.f8292a.k3().b();
                        } else {
                            this.f8292a.l3(true);
                        }
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return Yg.J.f24997a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(e1 e1Var, J.j jVar, InterfaceC8567G interfaceC8567G, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f8288b = e1Var;
                    this.f8289c = jVar;
                    this.f8290d = interfaceC8567G;
                    this.f8291e = interfaceC6824a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f8288b, this.f8289c, this.f8290d, this.f8291e, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f8287a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC8558m interfaceC8558mZ2 = this.f8288b.Z2();
                        J.j jVar = this.f8289c;
                        InterfaceC8567G interfaceC8567G = this.f8290d;
                        InterfaceC6824a interfaceC6824a = this.f8291e;
                        C0341a c0341a = new C0341a(this.f8288b);
                        this.f8287a = 1;
                        if (jVar.N(interfaceC8567G, interfaceC8558mZ2, interfaceC6824a, c0341a, this) == objG) {
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
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f8293a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J.j f8294b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC8567G f8295c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f8296d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(J.j jVar, InterfaceC8567G interfaceC8567G, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f8294b = jVar;
                    this.f8295c = interfaceC8567G;
                    this.f8296d = interfaceC6824a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new c(this.f8294b, this.f8295c, this.f8296d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f8293a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        J.j jVar = this.f8294b;
                        InterfaceC8567G interfaceC8567G = this.f8295c;
                        InterfaceC6824a interfaceC6824a = this.f8296d;
                        this.f8293a = 1;
                        if (jVar.D0(interfaceC8567G, interfaceC6824a, this) == objG) {
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
                    return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            static final class d extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ J.j f8297a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ e1 f8298b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(J.j jVar, e1 e1Var) {
                    super(0);
                    this.f8297a = jVar;
                    this.f8298b = e1Var;
                }

                public final void a() {
                    if (this.f8297a.i0()) {
                        return;
                    }
                    androidx.compose.ui.focus.q.a(this.f8298b);
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e1 e1Var, InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8282c = e1Var;
                this.f8283d = interfaceC8567G;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f8282c, this.f8283d, interfaceC5380e);
                aVar.f8281b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f8280a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f8281b;
                J.j jVarE3 = this.f8282c.e3();
                e1 e1Var = this.f8282c;
                InterfaceC8567G interfaceC8567G = this.f8283d;
                d dVar = new d(jVarE3, e1Var);
                Ii.P p10 = Ii.P.UNDISPATCHED;
                AbstractC3063k.d(n10, null, p10, new C0340a(jVarE3, interfaceC8567G, null), 1, null);
                AbstractC3063k.d(n10, null, p10, new b(e1Var, jVarE3, interfaceC8567G, dVar, null), 1, null);
                AbstractC3063k.d(n10, null, p10, new c(jVarE3, interfaceC8567G, dVar, null), 1, null);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        w(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            w wVar = e1.this.new w(interfaceC5380e);
            wVar.f8278b = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8277a;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = new a(e1.this, (InterfaceC8567G) this.f8278b, null);
                this.f8277a = 1;
                if (Ii.O.g(aVar, this) == objG) {
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
            return ((w) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class x extends AbstractC6494u implements InterfaceC6824a {
        x() {
            super(0);
        }

        public final AbstractC8121a a() {
            AbstractC8122b.a(e1.this);
            return null;
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8300a;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8302a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f8303b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e1 f8304c;

            /* renamed from: I.e1$y$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0342a extends C6490p implements InterfaceC6835l {
                C0342a(Object obj) {
                    super(1, obj, e1.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                public final void a(int i10) {
                    ((e1) this.receiver).j3(i10);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((R0.r) obj).p());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e1 e1Var, AbstractC8121a abstractC8121a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8304c = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f8304c, null, interfaceC5380e);
                aVar.f8303b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f8302a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    androidx.compose.ui.platform.P0 p02 = (androidx.compose.ui.platform.P0) this.f8303b;
                    o1 o1VarF3 = this.f8304c.f3();
                    l1 l1VarG3 = this.f8304c.g3();
                    C3465s c3465sL = this.f8304c.a3().l(this.f8304c.c3());
                    C0342a c0342a = new C0342a(this.f8304c);
                    Li.y yVarD3 = this.f8304c.d3();
                    w1 w1Var = (w1) AbstractC2631i.a(this.f8304c, AbstractC3932k0.t());
                    this.f8302a = 1;
                    if (AbstractC2924c.d(p02, o1VarF3, l1VarG3, c3465sL, null, c0342a, yVarD3, w1Var, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.platform.P0 p02, InterfaceC5380e interfaceC5380e) {
                return ((a) create(p02, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        y(AbstractC8121a abstractC8121a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return e1.this.new y(null, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8300a;
            if (i10 == 0) {
                Yg.v.b(obj);
                e1 e1Var = e1.this;
                a aVar = new a(e1Var, null, null);
                this.f8300a = 1;
                if (androidx.compose.ui.platform.N0.b(e1Var, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((y) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class z extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F.D f8306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(F.D d10) {
            super(0);
            this.f8306b = d10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Li.y yVarD3;
            if (!e1.this.h3()) {
                androidx.compose.ui.focus.q.a(e1.this);
            }
            int iH = this.f8306b.h();
            C3471y.a aVar = C3471y.f19528b;
            if (!C3471y.n(iH, aVar.f()) && !C3471y.n(this.f8306b.h(), aVar.e()) && (yVarD3 = e1.this.d3()) != null) {
                yVarD3.j(Yg.J.f24997a);
            }
            return Boolean.TRUE;
        }
    }

    public e1(o1 o1Var, l1 l1Var, J.j jVar, H.b bVar, boolean z10, boolean z11, F.D d10, H.d dVar, boolean z12, InterfaceC8558m interfaceC8558m) {
        this.f8241p = o1Var;
        this.f8242q = l1Var;
        this.f8243r = jVar;
        this.f8244s = bVar;
        this.f8245t = z10;
        this.f8246u = z11;
        this.f8247v = dVar;
        this.f8248w = z12;
        this.f8249x = interfaceC8558m;
        this.f8230A = (G.a) D2(new G.a(new z(d10)));
        H.b bVar2 = this.f8244s;
        this.f8233D = d10.c(bVar2 != null ? bVar2.b() : null);
        this.f8237H = h1.b();
        this.f8238I = new r();
        this.f8240N = new x();
    }

    private final void V2() {
        InterfaceC3091y0 interfaceC3091y0 = this.f8239J;
        if (interfaceC3091y0 != null) {
            InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
        }
        this.f8239J = null;
        Li.y yVarD3 = d3();
        if (yVarD3 != null) {
            yVarD3.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        C8552g c8552g = this.f8231B;
        if (c8552g != null) {
            this.f8249x.c(new C8553h(c8552g));
            this.f8231B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X2() {
        return this.f8245t && !this.f8246u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Li.y d3() {
        Li.y yVar = this.f8250y;
        if (yVar != null) {
            return yVar;
        }
        if (!G.c.a()) {
            return null;
        }
        Li.y yVarB = Li.F.b(1, 0, Ki.a.DROP_LATEST, 2, null);
        this.f8250y = yVarB;
        return yVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h3() {
        E1 e12 = this.f8235F;
        return this.f8234E && (e12 != null && e12.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3() {
        this.f8243r.v0(h3());
        if (h3() && this.f8236G == null) {
            this.f8236G = AbstractC3063k.d(d2(), null, null, new s(null), 3, null);
        } else {
            if (h3()) {
                return;
            }
            InterfaceC3091y0 interfaceC3091y0 = this.f8236G;
            if (interfaceC3091y0 != null) {
                InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
            }
            this.f8236G = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(int i10) {
        H.d dVar;
        r.a aVar = R0.r.f19498b;
        if (R0.r.m(i10, aVar.e()) || R0.r.m(i10, aVar.a()) || (dVar = this.f8247v) == null) {
            this.f8238I.a(i10);
        } else if (dVar != null) {
            dVar.a(new t(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.n1 k3() {
        androidx.compose.ui.platform.n1 n1Var = (androidx.compose.ui.platform.n1) AbstractC2631i.a(this, AbstractC3932k0.q());
        if (n1Var != null) {
            return n1Var;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3(boolean z10) {
        if (z10 || this.f8233D.j()) {
            AbstractC8122b.a(this);
            this.f8239J = AbstractC3063k.d(d2(), null, null, new y(null, null), 3, null);
        }
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        this.f8242q.n(rVar);
    }

    @Override // E0.s0
    public void C0() {
        this.f8230A.C0();
        this.f8251z.C0();
    }

    @Override // k0.InterfaceC6354b
    public void J1(k0.l lVar) {
        if (this.f8234E == lVar.isFocused()) {
            return;
        }
        this.f8234E = lVar.isFocused();
        i3();
        if (!lVar.isFocused()) {
            V2();
            o1 o1Var = this.f8241p;
            H.l lVar2 = o1Var.f8379a;
            H.b bVar = o1Var.f8380b;
            K.c cVar = K.c.MergeIfPossible;
            lVar2.g().f().e();
            H.e(lVar2.g());
            lVar2.e(bVar, true, cVar);
            this.f8241p.f();
        } else if (X2()) {
            l3(false);
        }
        this.f8230A.J1(lVar);
    }

    @Override // w0.InterfaceC8251e
    public boolean Q(KeyEvent keyEvent) {
        return this.f8237H.c(keyEvent, this.f8241p, this.f8243r, (k0.e) AbstractC2631i.a(this, AbstractC3932k0.h()), k3());
    }

    @Override // E0.v0
    public boolean S1() {
        return true;
    }

    public final boolean Y2() {
        return this.f8245t;
    }

    public final InterfaceC8558m Z2() {
        return this.f8249x;
    }

    public final F.D a3() {
        return this.f8233D;
    }

    public final boolean b3() {
        return this.f8246u;
    }

    public final boolean c3() {
        return this.f8248w;
    }

    public final J.j e3() {
        return this.f8243r;
    }

    public final o1 f3() {
        return this.f8241p;
    }

    public final l1 g3() {
        return this.f8242q;
    }

    public final void m3(o1 o1Var, l1 l1Var, J.j jVar, H.b bVar, boolean z10, boolean z11, F.D d10, H.d dVar, boolean z12, InterfaceC8558m interfaceC8558m) {
        boolean z13 = this.f8245t;
        boolean z14 = z13 && !this.f8246u;
        boolean z15 = z10 && !z11;
        o1 o1Var2 = this.f8241p;
        F.D d11 = this.f8233D;
        J.j jVar2 = this.f8243r;
        InterfaceC8558m interfaceC8558m2 = this.f8249x;
        this.f8241p = o1Var;
        this.f8242q = l1Var;
        this.f8243r = jVar;
        this.f8244s = bVar;
        this.f8245t = z10;
        this.f8246u = z11;
        this.f8233D = d10.c(bVar != null ? bVar.b() : null);
        this.f8247v = dVar;
        this.f8248w = z12;
        this.f8249x = interfaceC8558m;
        if (z15 != z14 || !AbstractC6492s.d(o1Var, o1Var2) || !AbstractC6492s.d(this.f8233D, d11)) {
            if (z15 && h3()) {
                l3(false);
            } else if (!z15) {
                V2();
            }
        }
        if (z13 != z10) {
            E0.w0.b(this);
        }
        if (!AbstractC6492s.d(jVar, jVar2)) {
            this.f8251z.Z1();
            this.f8230A.Z1();
            if (k2()) {
                jVar.y0(this.f8240N);
            }
        }
        if (AbstractC6492s.d(interfaceC8558m, interfaceC8558m2)) {
            return;
        }
        this.f8251z.Z1();
        this.f8230A.Z1();
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        q1();
        this.f8243r.y0(this.f8240N);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        V2();
        this.f8243r.y0(null);
    }

    @Override // E0.v0
    public void q(J0.w wVar) {
        H.h hVarI = this.f8241p.i();
        long jF = hVarI.f();
        J0.t.c0(wVar, new C3174d(hVarI.toString(), null, null, 6, null));
        J0.t.r0(wVar, jF);
        if (!this.f8245t) {
            J0.t.l(wVar);
        }
        J0.t.b0(wVar, X2());
        J0.t.u(wVar, null, new b(), 1, null);
        if (X2()) {
            J0.t.q0(wVar, null, new c(), 1, null);
            J0.t.x(wVar, null, new d(), 1, null);
        }
        J0.t.l0(wVar, null, new e(), 1, null);
        int iG = this.f8233D.g();
        J0.t.C(wVar, iG, null, new f(iG), 2, null);
        J0.t.A(wVar, null, new g(), 1, null);
        J0.t.E(wVar, null, new h(), 1, null);
        if (!L0.S.h(jF)) {
            J0.t.h(wVar, null, new i(), 1, null);
            if (this.f8245t && !this.f8246u) {
                J0.t.j(wVar, null, new j(), 1, null);
            }
        }
        if (X2()) {
            J0.t.P(wVar, null, new a(), 1, null);
        }
        H.b bVar = this.f8244s;
        if (bVar != null) {
            bVar.q(wVar);
        }
    }

    @Override // E0.h0
    public void q1() {
        E0.i0.a(this, new v());
    }

    @Override // w0.InterfaceC8251e
    public boolean r0(KeyEvent keyEvent) {
        return this.f8237H.b(keyEvent, this.f8241p, this.f8242q, this.f8243r, this.f8245t && !this.f8246u, this.f8248w, new u());
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        this.f8230A.s0(c8593n, enumC8595p, j10);
        this.f8251z.s0(c8593n, enumC8595p, j10);
    }
}
