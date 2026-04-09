package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0.a0 f32505a = new u0.a0(new b6.a(28));

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f32506b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f32507c;

    static {
        long j = p1.s.f31018h;
        f32506b = new e0(true, Float.NaN, j);
        f32507c = new e0(false, Float.NaN, j);
    }

    public static e0 a(int i4, float f10) {
        boolean z3 = (i4 & 1) != 0;
        if ((i4 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j = p1.s.f31018h;
        return (d3.f.b(f10, Float.NaN) && p1.s.c(j, j)) ? z3 ? f32506b : f32507c : new e0(z3, f10, j);
    }
}
