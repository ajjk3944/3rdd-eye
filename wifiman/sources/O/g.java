package O;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import T.C0;
import T.InterfaceC3543m0;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.m0;
import s.M;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final int f16703j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final N f16704a;

    /* renamed from: b, reason: collision with root package name */
    private final z1 f16705b;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3543m0 f16710g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3543m0 f16711h;

    /* renamed from: c, reason: collision with root package name */
    private final z1 f16706c = o1.e(new a());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f16707d = t1.d(Boolean.FALSE, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3543m0 f16708e = C0.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3543m0 f16709f = C0.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    private final M f16712i = new M();

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.h() * 0.5f);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f16714a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f16716c;

        static final class a extends l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f16717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f16718b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f16719c;

            /* renamed from: O.g$b$a$a, reason: collision with other inner class name */
            static final class C0598a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f16720a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0598a(g gVar) {
                    super(2);
                    this.f16720a = gVar;
                }

                public final void a(float f10, float f11) {
                    this.f16720a.w(f10);
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, float f10, InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
                this.f16718b = gVar;
                this.f16719c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new a(this.f16718b, this.f16719c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f16717a;
                if (i10 == 0) {
                    v.b(obj);
                    float fM = this.f16718b.m();
                    float f10 = this.f16719c;
                    C0598a c0598a = new C0598a(this.f16718b);
                    this.f16717a = 1;
                    if (m0.e(fM, f10, 0.0f, null, c0598a, this, 12, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f16716c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return g.this.new b(this.f16716c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f16714a;
            if (i10 == 0) {
                v.b(obj);
                M m10 = g.this.f16712i;
                a aVar = new a(g.this, this.f16716c, null);
                this.f16714a = 1;
                if (M.e(m10, null, aVar, this, 1, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public g(N n10, z1 z1Var, float f10, float f11) {
        this.f16704a = n10;
        this.f16705b = z1Var;
        this.f16710g = C0.a(f11);
        this.f16711h = C0.a(f10);
    }

    private final InterfaceC3091y0 e(float f10) {
        return AbstractC3063k.d(this.f16704a, null, null, new b(f10, null), 3, null);
    }

    private final float f() {
        if (g() <= l()) {
            return g();
        }
        float fAbs = Math.abs(j()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            fAbs = 2.0f;
        }
        return l() + (l() * (fAbs - (((float) Math.pow(fAbs, 2)) / 4)));
    }

    private final float g() {
        return ((Number) this.f16706c.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h() {
        return this.f16709f.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m() {
        return this.f16708e.c();
    }

    private final boolean n() {
        return ((Boolean) this.f16707d.getValue()).booleanValue();
    }

    private final float o() {
        return this.f16711h.c();
    }

    private final float p() {
        return this.f16710g.c();
    }

    private final void s(float f10) {
        this.f16709f.k(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(float f10) {
        this.f16708e.k(f10);
    }

    private final void x(boolean z10) {
        this.f16707d.setValue(Boolean.valueOf(z10));
    }

    private final void y(float f10) {
        this.f16711h.k(f10);
    }

    private final void z(float f10) {
        this.f16710g.k(f10);
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return g() / l();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return p();
    }

    public final float q(float f10) {
        if (n()) {
            return 0.0f;
        }
        float fC = AbstractC7978m.c(h() + f10, 0.0f);
        float fH = fC - h();
        s(fC);
        w(f());
        return fH;
    }

    public final float r(float f10) {
        if (k()) {
            return 0.0f;
        }
        if (g() > l()) {
            ((InterfaceC6824a) this.f16705b.getValue()).invoke();
        }
        e(0.0f);
        if (h() == 0.0f || f10 < 0.0f) {
            f10 = 0.0f;
        }
        s(0.0f);
        return f10;
    }

    public final void t(boolean z10) {
        if (n() != z10) {
            x(z10);
            s(0.0f);
            e(z10 ? o() : 0.0f);
        }
    }

    public final void u(float f10) {
        if (o() == f10) {
            return;
        }
        y(f10);
        if (k()) {
            e(f10);
        }
    }

    public final void v(float f10) {
        z(f10);
    }
}
