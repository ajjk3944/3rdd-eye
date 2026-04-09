package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.a0 f32490a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32491b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32492c;

    static {
        float f10 = t0.a.f33885a;
        float f11 = t0.a.f33886b;
        float f12 = 16;
        float f13 = t0.b.f33887a;
        float f14 = 8;
        f32490a = new g0.a0(f10, f14, f11, f14);
        if (!((f11 >= 0.0f) & (f12 >= 0.0f) & (f14 >= 0.0f) & (f14 >= 0.0f))) {
            h0.a.a("Padding must be non-negative");
        }
        float f15 = 12;
        if (!((f15 >= 0.0f) & (f14 >= 0.0f) & (f15 >= 0.0f) & (f14 >= 0.0f))) {
            h0.a.a("Padding must be non-negative");
        }
        if (!((f15 >= 0.0f) & (f14 >= 0.0f) & (f12 >= 0.0f) & (f14 >= 0.0f))) {
            h0.a.a("Padding must be non-negative");
        }
        f32491b = 58;
        f32492c = t0.b.f33887a;
    }
}
