package U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3633a;

    /* renamed from: b, reason: collision with root package name */
    public int f3634b;

    /* renamed from: c, reason: collision with root package name */
    public float f3635c;

    /* renamed from: d, reason: collision with root package name */
    public float f3636d;

    /* renamed from: e, reason: collision with root package name */
    public long f3637e;

    /* renamed from: f, reason: collision with root package name */
    public long f3638f;

    /* renamed from: g, reason: collision with root package name */
    public long f3639g;

    /* renamed from: h, reason: collision with root package name */
    public float f3640h;
    public int i;

    public final float a(long j6) {
        if (j6 < this.f3637e) {
            return 0.0f;
        }
        long j7 = this.f3639g;
        if (j7 < 0 || j6 < j7) {
            return d.b((j6 - r0) / this.f3633a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f3640h;
        return (d.b((j6 - j7) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
