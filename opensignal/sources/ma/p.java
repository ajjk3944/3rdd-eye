package ma;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16537b;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16540e;

    /* renamed from: f, reason: collision with root package name */
    public int f16541f;

    /* renamed from: g, reason: collision with root package name */
    public int f16542g;

    /* renamed from: h, reason: collision with root package name */
    public long f16543h;
    public long j;

    /* renamed from: l, reason: collision with root package name */
    public long f16545l;

    /* renamed from: m, reason: collision with root package name */
    public long f16546m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16547n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f16548o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f16549p;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f16538c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f16539d = new SparseArray();

    /* renamed from: q, reason: collision with root package name */
    public Object f16550q = new o();

    /* renamed from: r, reason: collision with root package name */
    public Object f16551r = new o();

    /* renamed from: i, reason: collision with root package name */
    public boolean f16544i = false;
    public boolean k = false;

    public p(u5.a0 a0Var, boolean z10, boolean z11) {
        this.f16548o = a0Var;
        this.f16536a = z10;
        this.f16537b = z11;
        byte[] bArr = new byte[128];
        this.f16540e = bArr;
        this.f16549p = new a5.u(0, 0, 5, bArr);
        o oVar = (o) this.f16551r;
        oVar.f16523b = false;
        oVar.f16522a = false;
    }

    public p(ca.x xVar, boolean z10, boolean z11) {
        this.f16548o = xVar;
        this.f16536a = z10;
        this.f16537b = z11;
        byte[] bArr = new byte[128];
        this.f16540e = bArr;
        this.f16549p = new a5.u(0, 0, 4, bArr);
        o oVar = (o) this.f16551r;
        oVar.f16523b = false;
        oVar.f16522a = false;
    }
}
