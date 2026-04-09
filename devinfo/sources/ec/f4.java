package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final g4 f22713a;

    /* renamed from: b, reason: collision with root package name */
    public int f22714b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f22715c = a();

    public f4(g4 g4Var) {
        this.f22713a = g4Var;
    }

    public final long a() {
        g4 g4Var = this.f22713a;
        pb.y.h(g4Var);
        long jLongValue = ((Long) d0.f22668v.a(null)).longValue();
        long jLongValue2 = ((Long) d0.f22670w.a(null)).longValue();
        for (int i4 = 1; i4 < this.f22714b; i4++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        g4Var.f().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
