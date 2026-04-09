package j4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f27364a;

    /* renamed from: b, reason: collision with root package name */
    public int f27365b;

    /* renamed from: c, reason: collision with root package name */
    public float f27366c;

    /* renamed from: d, reason: collision with root package name */
    public float f27367d;

    /* renamed from: e, reason: collision with root package name */
    public long f27368e;

    /* renamed from: f, reason: collision with root package name */
    public long f27369f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public float f27370h;

    /* renamed from: i, reason: collision with root package name */
    public int f27371i;

    public final float a(long j) {
        if (j < this.f27368e) {
            return 0.0f;
        }
        long j8 = this.g;
        if (j8 < 0 || j < j8) {
            return d.b((j - r0) / this.f27364a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f27370h;
        return (d.b((j - j8) / this.f27371i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
