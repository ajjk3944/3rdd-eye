package P6;

/* loaded from: classes3.dex */
public class A implements x {

    /* renamed from: a, reason: collision with root package name */
    private final m f18038a;

    /* renamed from: b, reason: collision with root package name */
    private final q f18039b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18040c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18041d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18042e;

    A(m mVar, q qVar, int i10, int i11, boolean z10) {
        this.f18038a = mVar;
        this.f18039b = qVar;
        this.f18041d = i10;
        this.f18042e = i11;
        this.f18040c = z10;
    }

    private boolean c() {
        return !this.f18040c && (this.f18042e >= 29 || this.f18041d >= 23);
    }

    @Override // P6.x
    public boolean a() {
        return !c() || this.f18038a.a();
    }

    @Override // P6.x
    public boolean b() {
        return this.f18039b.a();
    }
}
