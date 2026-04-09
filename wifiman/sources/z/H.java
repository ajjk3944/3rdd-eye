package z;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final int f66799a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66800b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66801c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66802d;

    public H(int i10, int i11, int i12, int i13) {
        this.f66799a = i10;
        this.f66800b = i11;
        this.f66801c = i12;
        this.f66802d = i13;
    }

    public final int a() {
        return this.f66802d;
    }

    public final int b() {
        return this.f66799a;
    }

    public final int c() {
        return this.f66801c;
    }

    public final int d() {
        return this.f66800b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return this.f66799a == h10.f66799a && this.f66800b == h10.f66800b && this.f66801c == h10.f66801c && this.f66802d == h10.f66802d;
    }

    public int hashCode() {
        return (((((this.f66799a * 31) + this.f66800b) * 31) + this.f66801c) * 31) + this.f66802d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f66799a + ", top=" + this.f66800b + ", right=" + this.f66801c + ", bottom=" + this.f66802d + ')';
    }
}
