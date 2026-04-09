package B3;

/* loaded from: classes.dex */
public final class B extends e {

    /* renamed from: o, reason: collision with root package name */
    public int f532o;

    /* renamed from: p, reason: collision with root package name */
    public int f533p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f534q;

    /* renamed from: r, reason: collision with root package name */
    public int f535r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f536s;

    /* renamed from: t, reason: collision with root package name */
    public int f537t;

    /* renamed from: u, reason: collision with root package name */
    public float f538u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f539v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f540w;

    @Override // B3.e
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // B3.e
    public final void d() {
        super.d();
        if (this.f535r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f532o == 0) {
            if ((a() > 0 || (this.f540w && e() > 0)) && this.i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f563e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        return !this.f540w ? a() : this.f539v ? (int) (this.f559a * this.f538u) : this.f537t;
    }
}
