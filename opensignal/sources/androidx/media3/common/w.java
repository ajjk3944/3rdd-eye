package androidx.media3.common;

/* loaded from: classes.dex */
public abstract class w implements i {
    public static final String B;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final ab.c H;

    /* renamed from: y, reason: collision with root package name */
    public static final x f1812y = new x(new v());

    /* renamed from: a, reason: collision with root package name */
    public final long f1813a;

    /* renamed from: d, reason: collision with root package name */
    public final long f1814d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1815g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1816r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1817x;

    static {
        int i10 = a5.d0.f105a;
        B = Integer.toString(0, 36);
        D = Integer.toString(1, 36);
        E = Integer.toString(2, 36);
        F = Integer.toString(3, 36);
        G = Integer.toString(4, 36);
        H = new ab.c(7);
    }

    public w(v vVar) {
        this.f1813a = vVar.f1803a;
        this.f1814d = vVar.f1804b;
        this.f1815g = vVar.f1805c;
        this.f1816r = vVar.f1806d;
        this.f1817x = vVar.f1807e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f1813a == wVar.f1813a && this.f1814d == wVar.f1814d && this.f1815g == wVar.f1815g && this.f1816r == wVar.f1816r && this.f1817x == wVar.f1817x;
    }

    public final int hashCode() {
        long j = this.f1813a;
        int i10 = ((int) (j ^ (j >>> 32))) * 31;
        long j7 = this.f1814d;
        return ((((((i10 + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.f1815g ? 1 : 0)) * 31) + (this.f1816r ? 1 : 0)) * 31) + (this.f1817x ? 1 : 0);
    }
}
