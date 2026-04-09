package S9;

import Q9.AbstractC1520b;
import R9.AbstractC1564a;
import t4.C5606d;

/* compiled from: StreamingJsonEncoder.kt */
/* loaded from: classes3.dex */
public final class O extends P9.a implements R9.r {

    /* renamed from: a, reason: collision with root package name */
    public final C1584p f12053a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1564a f12054b;

    /* renamed from: c, reason: collision with root package name */
    public final T f12055c;

    /* renamed from: d, reason: collision with root package name */
    public final R9.r[] f12056d;

    /* renamed from: e, reason: collision with root package name */
    public final T9.a f12057e;

    /* renamed from: f, reason: collision with root package name */
    public final R9.g f12058f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12059g;

    /* renamed from: h, reason: collision with root package name */
    public String f12060h;

    /* compiled from: StreamingJsonEncoder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12061a;

        static {
            int[] iArr = new int[T.values().length];
            try {
                iArr[T.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12061a = iArr;
        }
    }

    public O(C1584p composer, AbstractC1564a json, T t10, R9.r[] rVarArr) {
        kotlin.jvm.internal.l.f(composer, "composer");
        kotlin.jvm.internal.l.f(json, "json");
        this.f12053a = composer;
        this.f12054b = json;
        this.f12055c = t10;
        this.f12056d = rVarArr;
        this.f12057e = json.f11782b;
        this.f12058f = json.f11781a;
        int iOrdinal = t10.ordinal();
        if (rVarArr != null) {
            R9.r rVar = rVarArr[iOrdinal];
            if (rVar == null && rVar == this) {
                return;
            }
            rVarArr[iOrdinal] = this;
        }
    }

    @Override // P9.a, P9.e
    public final void C(int i) {
        if (this.f12059g) {
            G(String.valueOf(i));
        } else {
            this.f12053a.d(i);
        }
    }

    @Override // P9.a, P9.e
    public final void D(long j4) {
        if (this.f12059g) {
            G(String.valueOf(j4));
        } else {
            this.f12053a.e(j4);
        }
    }

    @Override // P9.a, P9.c
    public final boolean F(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return this.f12058f.f11799a;
    }

    @Override // P9.a, P9.e
    public final void G(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        this.f12053a.h(value);
    }

    @Override // P9.a
    public final void H(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        int i10 = a.f12061a[this.f12055c.ordinal()];
        boolean z10 = true;
        C1584p c1584p = this.f12053a;
        if (i10 == 1) {
            if (!c1584p.f12102b) {
                c1584p.c(',');
            }
            c1584p.a();
            return;
        }
        if (i10 == 2) {
            if (c1584p.f12102b) {
                this.f12059g = true;
                c1584p.a();
                return;
            }
            if (i % 2 == 0) {
                c1584p.c(',');
                c1584p.a();
            } else {
                c1584p.c(':');
                c1584p.i();
                z10 = false;
            }
            this.f12059g = z10;
            return;
        }
        if (i10 == 3) {
            if (i == 0) {
                this.f12059g = true;
            }
            if (i == 1) {
                c1584p.c(',');
                c1584p.i();
                this.f12059g = false;
                return;
            }
            return;
        }
        if (!c1584p.f12102b) {
            c1584p.c(',');
        }
        c1584p.a();
        AbstractC1564a json = this.f12054b;
        kotlin.jvm.internal.l.f(json, "json");
        y.c(descriptor, json);
        G(descriptor.g(i));
        c1584p.c(':');
        c1584p.i();
    }

    @Override // P9.e
    public final I9.g a() {
        return this.f12057e;
    }

    @Override // P9.a, P9.c
    public final void b(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        T t10 = this.f12055c;
        if (t10.end != 0) {
            C1584p c1584p = this.f12053a;
            c1584p.getClass();
            c1584p.a();
            c1584p.c(t10.end);
        }
    }

    @Override // R9.r
    public final AbstractC1564a c() {
        return this.f12054b;
    }

    @Override // P9.a, P9.e
    public final P9.c d(O9.e descriptor) {
        R9.r rVar;
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        AbstractC1564a abstractC1564a = this.f12054b;
        T tB = U.b(descriptor, abstractC1564a);
        char c10 = tB.begin;
        C1584p c1584p = this.f12053a;
        if (c10 != 0) {
            c1584p.c(c10);
            c1584p.f12102b = true;
        }
        if (this.f12060h != null) {
            c1584p.a();
            String str = this.f12060h;
            kotlin.jvm.internal.l.c(str);
            G(str);
            c1584p.c(':');
            c1584p.getClass();
            G(descriptor.a());
            this.f12060h = null;
        }
        if (this.f12055c == tB) {
            return this;
        }
        R9.r[] rVarArr = this.f12056d;
        return (rVarArr == null || (rVar = rVarArr[tB.ordinal()]) == null) ? new O(c1584p, abstractC1564a, tB, rVarArr) : rVar;
    }

    @Override // P9.a, P9.e
    public final void f() {
        this.f12053a.f("null");
    }

    @Override // P9.a, P9.e
    public final void g(double d10) {
        boolean z10 = this.f12059g;
        C1584p c1584p = this.f12053a;
        if (z10) {
            G(String.valueOf(d10));
        } else {
            c1584p.f12101a.d(String.valueOf(d10));
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw E.u.e(Double.valueOf(d10), c1584p.f12101a.toString());
        }
    }

    @Override // P9.a, P9.e
    public final void h(short s10) {
        if (this.f12059g) {
            G(String.valueOf((int) s10));
        } else {
            this.f12053a.g(s10);
        }
    }

    @Override // P9.a, P9.e
    public final void j(byte b10) {
        if (this.f12059g) {
            G(String.valueOf((int) b10));
        } else {
            this.f12053a.b(b10);
        }
    }

    @Override // P9.a, P9.e
    public final void l(boolean z10) {
        if (this.f12059g) {
            G(String.valueOf(z10));
        } else {
            this.f12053a.f12101a.d(String.valueOf(z10));
        }
    }

    @Override // P9.a, P9.e
    public final void o(float f10) {
        boolean z10 = this.f12059g;
        C1584p c1584p = this.f12053a;
        if (z10) {
            G(String.valueOf(f10));
        } else {
            c1584p.f12101a.d(String.valueOf(f10));
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw E.u.e(Float.valueOf(f10), c1584p.f12101a.toString());
        }
    }

    @Override // P9.a, P9.e
    public final void p(O9.e enumDescriptor, int i) {
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        G(enumDescriptor.g(i));
    }

    @Override // P9.a, P9.e
    public final void q(char c10) {
        G(String.valueOf(c10));
    }

    @Override // R9.r
    public final void t(R9.i element) {
        kotlin.jvm.internal.l.f(element, "element");
        x(R9.p.f11812a, element);
    }

    @Override // P9.a, P9.c
    public final <T> void w(O9.e descriptor, int i, M9.b serializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(serializer, "serializer");
        if (t10 != null || this.f12058f.f11802d) {
            super.w(descriptor, i, serializer, t10);
        }
    }

    @Override // P9.a, P9.e
    public final <T> void x(M9.b serializer, T t10) {
        kotlin.jvm.internal.l.f(serializer, "serializer");
        if (!(serializer instanceof AbstractC1520b)) {
            serializer.serialize(this, t10);
            return;
        }
        AbstractC1564a abstractC1564a = this.f12054b;
        R9.g gVar = abstractC1564a.f11781a;
        AbstractC1520b abstractC1520b = (AbstractC1520b) serializer;
        String strM = C5606d.m(serializer.getDescriptor(), abstractC1564a);
        kotlin.jvm.internal.l.d(t10, "null cannot be cast to non-null type kotlin.Any");
        M9.b bVarT = A9.I.t(abstractC1520b, this, t10);
        C5606d.j(bVarT.getDescriptor().e());
        this.f12060h = strM;
        bVarT.serialize(this, t10);
    }

    @Override // P9.a, P9.e
    public final P9.e z(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        boolean zA = P.a(descriptor);
        T t10 = this.f12055c;
        AbstractC1564a abstractC1564a = this.f12054b;
        C1584p c1585q = this.f12053a;
        if (zA) {
            if (!(c1585q instanceof r)) {
                c1585q = new r(c1585q.f12101a, this.f12059g);
            }
            return new O(c1585q, abstractC1564a, t10, null);
        }
        if (!descriptor.isInline() || !descriptor.equals(R9.j.f11806a)) {
            return this;
        }
        if (!(c1585q instanceof C1585q)) {
            c1585q = new C1585q(c1585q.f12101a, this.f12059g);
        }
        return new O(c1585q, abstractC1564a, t10, null);
    }
}
