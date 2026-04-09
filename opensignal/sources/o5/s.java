package o5;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f19041x = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f19042g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f19043r;

    public s(androidx.media3.common.a1 a1Var, Object obj, Object obj2) {
        super(a1Var);
        this.f19042g = obj;
        this.f19043r = obj2;
    }

    @Override // o5.o, androidx.media3.common.a1
    public final int b(Object obj) {
        Object obj2;
        if (f19041x.equals(obj) && (obj2 = this.f19043r) != null) {
            obj = obj2;
        }
        return this.f19002d.b(obj);
    }

    @Override // o5.o, androidx.media3.common.a1
    public final androidx.media3.common.y0 f(int i10, androidx.media3.common.y0 y0Var, boolean z10) {
        this.f19002d.f(i10, y0Var, z10);
        if (a5.d0.a(y0Var.f1828d, this.f19043r) && z10) {
            y0Var.f1828d = f19041x;
        }
        return y0Var;
    }

    @Override // o5.o, androidx.media3.common.a1
    public final Object l(int i10) {
        Object objL = this.f19002d.l(i10);
        return a5.d0.a(objL, this.f19043r) ? f19041x : objL;
    }

    @Override // o5.o, androidx.media3.common.a1
    public final androidx.media3.common.z0 m(int i10, androidx.media3.common.z0 z0Var, long j) {
        this.f19002d.m(i10, z0Var, j);
        if (a5.d0.a(z0Var.f1842a, this.f19042g)) {
            z0Var.f1842a = androidx.media3.common.z0.N;
        }
        return z0Var;
    }
}
