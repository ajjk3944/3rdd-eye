package androidx.compose.foundation.lazy.layout;

import B.F;
import B.InterfaceC2455t;
import E0.v0;
import E0.w0;
import Ii.AbstractC3063k;
import Ii.N;
import J0.t;
import J0.w;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import w.q;

/* loaded from: classes.dex */
final class g extends e.c implements v0 {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6824a f28324n;

    /* renamed from: o, reason: collision with root package name */
    private F f28325o;

    /* renamed from: p, reason: collision with root package name */
    private q f28326p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28327q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28328r;

    /* renamed from: s, reason: collision with root package name */
    private J0.h f28329s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6835l f28330t = new b();

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC6835l f28331u;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.f28325o.a() - g.this.f28325o.c());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            InterfaceC2455t interfaceC2455t = (InterfaceC2455t) g.this.f28324n.invoke();
            int iA = interfaceC2455t.a();
            int i10 = 0;
            while (true) {
                if (i10 >= iA) {
                    i10 = -1;
                    break;
                }
                if (AbstractC6492s.d(interfaceC2455t.b(i10), obj)) {
                    break;
                }
                i10++;
            }
            return Integer.valueOf(i10);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.f28325o.b());
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.f28325o.d());
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f28337a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f28338b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f28339c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, int i10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28338b = gVar;
                this.f28339c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f28338b, this.f28339c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f28337a;
                if (i10 == 0) {
                    v.b(obj);
                    F f10 = this.f28338b.f28325o;
                    int i11 = this.f28339c;
                    this.f28337a = 1;
                    if (f10.f(i11, this) == objG) {
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
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        e() {
            super(1);
        }

        public final Boolean a(int i10) {
            InterfaceC2455t interfaceC2455t = (InterfaceC2455t) g.this.f28324n.invoke();
            if (i10 >= 0 && i10 < interfaceC2455t.a()) {
                AbstractC3063k.d(g.this.d2(), null, null, new a(g.this, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + interfaceC2455t.a() + ')').toString());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(InterfaceC6824a interfaceC6824a, F f10, q qVar, boolean z10, boolean z11) {
        this.f28324n = interfaceC6824a;
        this.f28325o = f10;
        this.f28326p = qVar;
        this.f28327q = z10;
        this.f28328r = z11;
        I2();
    }

    private final J0.b F2() {
        return this.f28325o.e();
    }

    private final boolean G2() {
        return this.f28326p == q.Vertical;
    }

    private final void I2() {
        this.f28329s = new J0.h(new c(), new d(), this.f28328r);
        this.f28331u = this.f28327q ? new e() : null;
    }

    public final void H2(InterfaceC6824a interfaceC6824a, F f10, q qVar, boolean z10, boolean z11) {
        this.f28324n = interfaceC6824a;
        this.f28325o = f10;
        if (this.f28326p != qVar) {
            this.f28326p = qVar;
            w0.b(this);
        }
        if (this.f28327q == z10 && this.f28328r == z11) {
            return;
        }
        this.f28327q = z10;
        this.f28328r = z11;
        I2();
        w0.b(this);
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return false;
    }

    @Override // E0.v0
    public void q(w wVar) {
        t.w0(wVar, true);
        t.v(wVar, this.f28330t);
        if (G2()) {
            J0.h hVar = this.f28329s;
            if (hVar == null) {
                AbstractC6492s.v("scrollAxisRange");
                hVar = null;
            }
            t.x0(wVar, hVar);
        } else {
            J0.h hVar2 = this.f28329s;
            if (hVar2 == null) {
                AbstractC6492s.v("scrollAxisRange");
                hVar2 = null;
            }
            t.e0(wVar, hVar2);
        }
        InterfaceC6835l interfaceC6835l = this.f28331u;
        if (interfaceC6835l != null) {
            t.X(wVar, null, interfaceC6835l, 1, null);
        }
        t.s(wVar, null, new a(), 1, null);
        t.Y(wVar, F2());
    }
}
