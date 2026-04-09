package zc;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final p3 f27058a;

    /* renamed from: b, reason: collision with root package name */
    public int f27059b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f27060c = a();

    public o3(p3 p3Var) {
        this.f27058a = p3Var;
    }

    public final long a() {
        p3 p3Var = this.f27058a;
        cc.s.h(p3Var);
        long jLongValue = ((Long) u.f27212v.a(null)).longValue();
        long jLongValue2 = ((Long) u.f27214w.a(null)).longValue();
        for (int i10 = 1; i10 < this.f27059b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        p3Var.C0().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
