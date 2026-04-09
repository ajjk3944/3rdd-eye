package y3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f25818a;

    /* renamed from: b, reason: collision with root package name */
    public int f25819b;

    /* renamed from: c, reason: collision with root package name */
    public float f25820c;

    /* renamed from: d, reason: collision with root package name */
    public float f25821d;

    /* renamed from: e, reason: collision with root package name */
    public long f25822e;

    /* renamed from: f, reason: collision with root package name */
    public long f25823f;

    /* renamed from: g, reason: collision with root package name */
    public long f25824g;

    /* renamed from: h, reason: collision with root package name */
    public float f25825h;

    /* renamed from: i, reason: collision with root package name */
    public int f25826i;

    public final float a(long j) {
        if (j < this.f25822e) {
            return 0.0f;
        }
        long j7 = this.f25824g;
        if (j7 < 0 || j < j7) {
            return d.b((j - r0) / this.f25818a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f25825h;
        return (d.b((j - j7) / this.f25826i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
