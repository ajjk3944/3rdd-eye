package androidx.media3.common;

/* loaded from: classes.dex */
public final class z implements i {
    public static final String B;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final ab.c H;

    /* renamed from: y, reason: collision with root package name */
    public static final z f1833y = new z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: a, reason: collision with root package name */
    public final long f1834a;

    /* renamed from: d, reason: collision with root package name */
    public final long f1835d;

    /* renamed from: g, reason: collision with root package name */
    public final long f1836g;

    /* renamed from: r, reason: collision with root package name */
    public final float f1837r;

    /* renamed from: x, reason: collision with root package name */
    public final float f1838x;

    static {
        int i10 = a5.d0.f105a;
        B = Integer.toString(0, 36);
        D = Integer.toString(1, 36);
        E = Integer.toString(2, 36);
        F = Integer.toString(3, 36);
        G = Integer.toString(4, 36);
        H = new ab.c(8);
    }

    public z(long j, long j7, long j10, float f10, float f11) {
        this.f1834a = j;
        this.f1835d = j7;
        this.f1836g = j10;
        this.f1837r = f10;
        this.f1838x = f11;
    }

    public final y a() {
        y yVar = new y();
        yVar.f1822a = this.f1834a;
        yVar.f1823b = this.f1835d;
        yVar.f1824c = this.f1836g;
        yVar.f1825d = this.f1837r;
        yVar.f1826e = this.f1838x;
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f1834a == zVar.f1834a && this.f1835d == zVar.f1835d && this.f1836g == zVar.f1836g && this.f1837r == zVar.f1837r && this.f1838x == zVar.f1838x;
    }

    public final int hashCode() {
        long j = this.f1834a;
        long j7 = this.f1835d;
        int i10 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.f1836g;
        int i11 = (i10 + ((int) ((j10 >>> 32) ^ j10))) * 31;
        float f10 = this.f1837r;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f1838x;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
