package kotlinx.serialization.json.internal;

import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes4.dex */
public final class h0 extends y9.b implements z9.i {

    /* renamed from: a, reason: collision with root package name */
    public final j f23017a;

    /* renamed from: b, reason: collision with root package name */
    public final z9.a f23018b;

    /* renamed from: c, reason: collision with root package name */
    public final WriteMode f23019c;

    /* renamed from: d, reason: collision with root package name */
    public final z9.i[] f23020d;

    /* renamed from: e, reason: collision with root package name */
    public final aa.c f23021e;

    /* renamed from: f, reason: collision with root package name */
    public final z9.d f23022f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23023g;

    /* renamed from: h, reason: collision with root package name */
    public String f23024h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23025a;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23025a = iArr;
        }
    }

    public h0(j composer, z9.a json, WriteMode mode, z9.i[] iVarArr) {
        kotlin.jvm.internal.p.e(composer, "composer");
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(mode, "mode");
        this.f23017a = composer;
        this.f23018b = json;
        this.f23019c = mode;
        this.f23020d = iVarArr;
        this.f23021e = d().a();
        this.f23022f = d().e();
        int iOrdinal = mode.ordinal();
        if (iVarArr != null) {
            z9.i iVar = iVarArr[iOrdinal];
            if (iVar == null && iVar == this) {
                return;
            }
            iVarArr[iOrdinal] = this;
        }
    }

    @Override // z9.i
    public void A(kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(element, "element");
        e(JsonElementSerializer.f22944a, element);
    }

    @Override // y9.b, y9.f
    public void B(int i10) {
        if (this.f23023g) {
            G(String.valueOf(i10));
        } else {
            this.f23017a.h(i10);
        }
    }

    @Override // y9.b, y9.f
    public void G(String value) {
        kotlin.jvm.internal.p.e(value, "value");
        this.f23017a.m(value);
    }

    @Override // y9.b
    public boolean H(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        int i11 = a.f23025a[this.f23019c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f23017a.a()) {
                        this.f23017a.e(',');
                    }
                    this.f23017a.c();
                    G(descriptor.e(i10));
                    this.f23017a.e(':');
                    this.f23017a.o();
                } else {
                    if (i10 == 0) {
                        this.f23023g = true;
                    }
                    if (i10 == 1) {
                        this.f23017a.e(',');
                        this.f23017a.o();
                        this.f23023g = false;
                    }
                }
            } else if (this.f23017a.a()) {
                this.f23023g = true;
                this.f23017a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f23017a.e(',');
                    this.f23017a.c();
                    z10 = true;
                } else {
                    this.f23017a.e(':');
                    this.f23017a.o();
                }
                this.f23023g = z10;
            }
        } else {
            if (!this.f23017a.a()) {
                this.f23017a.e(',');
            }
            this.f23017a.c();
        }
        return true;
    }

    public final j K() {
        j jVar = this.f23017a;
        return jVar instanceof m ? jVar : new m(jVar.f23030a, this.f23023g);
    }

    public final void L(kotlinx.serialization.descriptors.f fVar) {
        this.f23017a.c();
        String str = this.f23024h;
        kotlin.jvm.internal.p.b(str);
        G(str);
        this.f23017a.e(':');
        this.f23017a.o();
        G(fVar.h());
    }

    @Override // y9.f
    public aa.c a() {
        return this.f23021e;
    }

    @Override // y9.b, y9.f
    public y9.d b(kotlinx.serialization.descriptors.f descriptor) {
        z9.i iVar;
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        WriteMode writeModeB = m0.b(d(), descriptor);
        char c10 = writeModeB.begin;
        if (c10 != 0) {
            this.f23017a.e(c10);
            this.f23017a.b();
        }
        if (this.f23024h != null) {
            L(descriptor);
            this.f23024h = null;
        }
        if (this.f23019c == writeModeB) {
            return this;
        }
        z9.i[] iVarArr = this.f23020d;
        return (iVarArr == null || (iVar = iVarArr[writeModeB.ordinal()]) == null) ? new h0(this.f23017a, d(), writeModeB, this.f23020d) : iVar;
    }

    @Override // y9.b, y9.d
    public void c(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        if (this.f23019c.end != 0) {
            this.f23017a.p();
            this.f23017a.c();
            this.f23017a.e(this.f23019c.end);
        }
    }

    @Override // z9.i
    public z9.a d() {
        return this.f23018b;
    }

    @Override // y9.b, y9.f
    public void e(kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(serializer, "serializer");
        if (!(serializer instanceof kotlinx.serialization.internal.b) || d().e().k()) {
            serializer.serialize(this, obj);
            return;
        }
        kotlinx.serialization.internal.b bVar = (kotlinx.serialization.internal.b) serializer;
        String strC = e0.c(serializer.getDescriptor(), d());
        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlin.Any");
        kotlinx.serialization.e eVarB = kotlinx.serialization.c.b(bVar, this, obj);
        e0.f(bVar, eVarB, strC);
        e0.b(eVarB.getDescriptor().getKind());
        this.f23024h = strC;
        eVarB.serialize(this, obj);
    }

    @Override // y9.b, y9.f
    public void g(double d10) {
        if (this.f23023g) {
            G(String.valueOf(d10));
        } else {
            this.f23017a.f(d10);
        }
        if (this.f23022f.a()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw s.b(Double.valueOf(d10), this.f23017a.f23030a.toString());
        }
    }

    @Override // y9.b, y9.f
    public void h(byte b10) {
        if (this.f23023g) {
            G(String.valueOf((int) b10));
        } else {
            this.f23017a.d(b10);
        }
    }

    @Override // y9.b, y9.d
    public void i(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(serializer, "serializer");
        if (obj != null || this.f23022f.f()) {
            super.i(descriptor, i10, serializer, obj);
        }
    }

    @Override // y9.b, y9.f
    public void k(kotlinx.serialization.descriptors.f enumDescriptor, int i10) {
        kotlin.jvm.internal.p.e(enumDescriptor, "enumDescriptor");
        G(enumDescriptor.e(i10));
    }

    @Override // y9.b, y9.f
    public y9.f l(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return i0.a(descriptor) ? new h0(K(), d(), this.f23019c, (z9.i[]) null) : super.l(descriptor);
    }

    @Override // y9.b, y9.f
    public void m(long j10) {
        if (this.f23023g) {
            G(String.valueOf(j10));
        } else {
            this.f23017a.i(j10);
        }
    }

    @Override // y9.b, y9.f
    public void o() {
        this.f23017a.j("null");
    }

    @Override // y9.b, y9.f
    public void q(short s10) {
        if (this.f23023g) {
            G(String.valueOf((int) s10));
        } else {
            this.f23017a.k(s10);
        }
    }

    @Override // y9.b, y9.f
    public void r(boolean z10) {
        if (this.f23023g) {
            G(String.valueOf(z10));
        } else {
            this.f23017a.l(z10);
        }
    }

    @Override // y9.b, y9.f
    public void t(float f10) {
        if (this.f23023g) {
            G(String.valueOf(f10));
        } else {
            this.f23017a.g(f10);
        }
        if (this.f23022f.a()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw s.b(Float.valueOf(f10), this.f23017a.f23030a.toString());
        }
    }

    @Override // y9.b, y9.f
    public void u(char c10) {
        G(String.valueOf(c10));
    }

    @Override // y9.b, y9.d
    public boolean z(kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return this.f23022f.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(d0 output, z9.a json, WriteMode mode, z9.i[] modeReuseCache) {
        this(o.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.p.e(output, "output");
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(mode, "mode");
        kotlin.jvm.internal.p.e(modeReuseCache, "modeReuseCache");
    }
}
