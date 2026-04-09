package androidx.media3.common;

/* loaded from: classes.dex */
public final class f implements i {
    public static final f B = new f(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1619a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1620d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1621g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1622r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1623x;

    /* renamed from: y, reason: collision with root package name */
    public b9.e f1624y;

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public f(int i10, int i11, int i12, int i13, int i14) {
        this.f1619a = i10;
        this.f1620d = i11;
        this.f1621g = i12;
        this.f1622r = i13;
        this.f1623x = i14;
    }

    public final b9.e a() {
        if (this.f1624y == null) {
            this.f1624y = new b9.e(this);
        }
        return this.f1624y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f1619a == fVar.f1619a && this.f1620d == fVar.f1620d && this.f1621g == fVar.f1621g && this.f1622r == fVar.f1622r && this.f1623x == fVar.f1623x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f1619a) * 31) + this.f1620d) * 31) + this.f1621g) * 31) + this.f1622r) * 31) + this.f1623x;
    }
}
