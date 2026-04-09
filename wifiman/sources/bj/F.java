package bj;

import aj.AbstractC3868b;
import aj.C3873g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class F extends Yi.b implements aj.t {

    /* renamed from: a, reason: collision with root package name */
    private final C4125h f33417a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3868b f33418b;

    /* renamed from: c, reason: collision with root package name */
    private final M f33419c;

    /* renamed from: d, reason: collision with root package name */
    private final aj.t[] f33420d;

    /* renamed from: e, reason: collision with root package name */
    private final cj.e f33421e;

    /* renamed from: f, reason: collision with root package name */
    private final C3873g f33422f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33423g;

    /* renamed from: h, reason: collision with root package name */
    private String f33424h;

    /* renamed from: i, reason: collision with root package name */
    private String f33425i;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33426a;

        static {
            int[] iArr = new int[M.values().length];
            try {
                iArr[M.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[M.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[M.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33426a = iArr;
        }
    }

    public F(C4125h composer, AbstractC3868b json, M mode, aj.t[] tVarArr) {
        AbstractC6492s.i(composer, "composer");
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(mode, "mode");
        this.f33417a = composer;
        this.f33418b = json;
        this.f33419c = mode;
        this.f33420d = tVarArr;
        this.f33421e = d().a();
        this.f33422f = d().e();
        int iOrdinal = mode.ordinal();
        if (tVarArr != null) {
            aj.t tVar = tVarArr[iOrdinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[iOrdinal] = this;
        }
    }

    private final void J(String str, String str2) {
        this.f33417a.c();
        G(str);
        this.f33417a.f(':');
        this.f33417a.p();
        G(str2);
    }

    @Override // Yi.b, Yi.f
    public void A(int i10) {
        if (this.f33423g) {
            G(String.valueOf(i10));
        } else {
            this.f33417a.i(i10);
        }
    }

    @Override // Yi.b, Yi.f
    public Yi.f B(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (G.b(descriptor)) {
            C4125h c4127j = this.f33417a;
            if (!(c4127j instanceof C4127j)) {
                c4127j = new C4127j(c4127j.f33446a, this.f33423g);
            }
            return new F(c4127j, d(), this.f33419c, (aj.t[]) null);
        }
        if (G.a(descriptor)) {
            C4125h c4126i = this.f33417a;
            if (!(c4126i instanceof C4126i)) {
                c4126i = new C4126i(c4126i.f33446a, this.f33423g);
            }
            return new F(c4126i, d(), this.f33419c, (aj.t[]) null);
        }
        if (this.f33424h == null) {
            return super.B(descriptor);
        }
        this.f33425i = descriptor.a();
        return this;
    }

    @Override // Yi.b, Yi.f
    public void D(Xi.f enumDescriptor, int i10) {
        AbstractC6492s.i(enumDescriptor, "enumDescriptor");
        G(enumDescriptor.f(i10));
    }

    @Override // Yi.b, Yi.f
    public void E(long j10) {
        if (this.f33423g) {
            G(String.valueOf(j10));
        } else {
            this.f33417a.j(j10);
        }
    }

    @Override // Yi.b, Yi.f
    public void G(String value) {
        AbstractC6492s.i(value, "value");
        this.f33417a.n(value);
    }

    @Override // Yi.b
    public boolean H(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        int i11 = a.f33426a[this.f33419c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f33417a.a()) {
                        this.f33417a.f(',');
                    }
                    this.f33417a.c();
                    G(t.h(descriptor, d(), i10));
                    this.f33417a.f(':');
                    this.f33417a.p();
                } else {
                    if (i10 == 0) {
                        this.f33423g = true;
                    }
                    if (i10 == 1) {
                        this.f33417a.f(',');
                        this.f33417a.p();
                        this.f33423g = false;
                    }
                }
            } else if (this.f33417a.a()) {
                this.f33423g = true;
                this.f33417a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f33417a.f(',');
                    this.f33417a.c();
                    z10 = true;
                } else {
                    this.f33417a.f(':');
                    this.f33417a.p();
                }
                this.f33423g = z10;
            }
        } else {
            if (!this.f33417a.a()) {
                this.f33417a.f(',');
            }
            this.f33417a.c();
        }
        return true;
    }

    @Override // Yi.f
    public cj.e a() {
        return this.f33421e;
    }

    @Override // Yi.b, Yi.d
    public void b(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (this.f33419c.end != 0) {
            this.f33417a.q();
            this.f33417a.d();
            this.f33417a.f(this.f33419c.end);
        }
    }

    @Override // Yi.b, Yi.f
    public Yi.d c(Xi.f descriptor) {
        aj.t tVar;
        AbstractC6492s.i(descriptor, "descriptor");
        M mB = N.b(d(), descriptor);
        char c10 = mB.begin;
        if (c10 != 0) {
            this.f33417a.f(c10);
            this.f33417a.b();
        }
        String str = this.f33424h;
        if (str != null) {
            String strA = this.f33425i;
            if (strA == null) {
                strA = descriptor.a();
            }
            J(str, strA);
            this.f33424h = null;
            this.f33425i = null;
        }
        if (this.f33419c == mB) {
            return this;
        }
        aj.t[] tVarArr = this.f33420d;
        return (tVarArr == null || (tVar = tVarArr[mB.ordinal()]) == null) ? new F(this.f33417a, d(), mB, this.f33420d) : tVar;
    }

    @Override // aj.t
    public AbstractC3868b d() {
        return this.f33418b;
    }

    @Override // Yi.f
    public void f() {
        this.f33417a.k("null");
    }

    @Override // Yi.b, Yi.f
    public void j(double d10) {
        if (this.f33423g) {
            G(String.valueOf(d10));
        } else {
            this.f33417a.g(d10);
        }
        if (this.f33422f.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw r.b(Double.valueOf(d10), this.f33417a.f33446a.toString());
        }
    }

    @Override // Yi.b, Yi.f
    public void k(short s10) {
        if (this.f33423g) {
            G(String.valueOf((int) s10));
        } else {
            this.f33417a.l(s10);
        }
    }

    @Override // Yi.b, Yi.f
    public void l(byte b10) {
        if (this.f33423g) {
            G(String.valueOf((int) b10));
        } else {
            this.f33417a.e(b10);
        }
    }

    @Override // Yi.b, Yi.f
    public void m(boolean z10) {
        if (this.f33423g) {
            G(String.valueOf(z10));
        } else {
            this.f33417a.m(z10);
        }
    }

    @Override // Yi.d
    public boolean o(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return this.f33422f.i();
    }

    @Override // Yi.b, Yi.f
    public void r(float f10) {
        if (this.f33423g) {
            G(String.valueOf(f10));
        } else {
            this.f33417a.h(f10);
        }
        if (this.f33422f.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw r.b(Float.valueOf(f10), this.f33417a.f33446a.toString());
        }
    }

    @Override // Yi.b, Yi.d
    public void t(Xi.f descriptor, int i10, Vi.o serializer, Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(serializer, "serializer");
        if (obj != null || this.f33422f.j()) {
            super.t(descriptor, i10, serializer, obj);
        }
    }

    @Override // Yi.b, Yi.f
    public void u(char c10) {
        G(String.valueOf(c10));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // Yi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(Vi.o r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.AbstractC6492s.i(r4, r0)
            aj.b r0 = r3.d()
            aj.g r0 = r0.e()
            boolean r0 = r0.p()
            if (r0 == 0) goto L18
            r4.e(r3, r5)
            goto Lcd
        L18:
            boolean r0 = r4 instanceof Zi.AbstractC3696b
            if (r0 == 0) goto L2d
            aj.b r1 = r3.d()
            aj.g r1 = r1.e()
            aj.a r1 = r1.f()
            aj.a r2 = aj.EnumC3867a.NONE
            if (r1 == r2) goto L75
            goto L62
        L2d:
            aj.b r1 = r3.d()
            aj.g r1 = r1.e()
            aj.a r1 = r1.f()
            int[] r2 = bj.D.a.f33406a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L75
            r2 = 2
            if (r1 == r2) goto L75
            r2 = 3
            if (r1 != r2) goto L6f
            Xi.f r1 = r4.a()
            Xi.m r1 = r1.h()
            Xi.n$a r2 = Xi.n.a.f24470a
            boolean r2 = kotlin.jvm.internal.AbstractC6492s.d(r1, r2)
            if (r2 != 0) goto L62
            Xi.n$d r2 = Xi.n.d.f24473a
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r1, r2)
            if (r1 == 0) goto L75
        L62:
            Xi.f r1 = r4.a()
            aj.b r2 = r3.d()
            java.lang.String r1 = bj.D.c(r1, r2)
            goto L76
        L6f:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L75:
            r1 = 0
        L76:
            if (r0 == 0) goto Lbc
            r0 = r4
            Zi.b r0 = (Zi.AbstractC3696b) r0
            if (r5 == 0) goto L98
            Vi.o r0 = Vi.g.b(r0, r3, r5)
            if (r1 == 0) goto L91
            bj.D.a(r4, r0, r1)
            Xi.f r4 = r0.a()
            Xi.m r4 = r4.h()
            bj.D.b(r4)
        L91:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.AbstractC6492s.g(r0, r4)
            r4 = r0
            goto Lbc
        L98:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            Xi.f r5 = r0.a()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Lbc:
            if (r1 == 0) goto Lca
            Xi.f r0 = r4.a()
            java.lang.String r0 = r0.a()
            r3.f33424h = r1
            r3.f33425i = r0
        Lca:
            r4.e(r3, r5)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.F.z(Vi.o, java.lang.Object):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(o output, AbstractC3868b json, M mode, aj.t[] modeReuseCache) {
        this(AbstractC4129l.a(output, json), json, mode, modeReuseCache);
        AbstractC6492s.i(output, "output");
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(mode, "mode");
        AbstractC6492s.i(modeReuseCache, "modeReuseCache");
    }
}
