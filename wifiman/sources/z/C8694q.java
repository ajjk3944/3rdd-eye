package z;

/* renamed from: z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8694q implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f66941b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66942c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66943d;

    /* renamed from: e, reason: collision with root package name */
    private final int f66944e;

    public C8694q(int i10, int i11, int i12, int i13) {
        this.f66941b = i10;
        this.f66942c = i11;
        this.f66943d = i12;
        this.f66944e = i13;
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return this.f66943d;
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return this.f66944e;
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return this.f66942c;
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return this.f66941b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8694q)) {
            return false;
        }
        C8694q c8694q = (C8694q) obj;
        return this.f66941b == c8694q.f66941b && this.f66942c == c8694q.f66942c && this.f66943d == c8694q.f66943d && this.f66944e == c8694q.f66944e;
    }

    public int hashCode() {
        return (((((this.f66941b * 31) + this.f66942c) * 31) + this.f66943d) * 31) + this.f66944e;
    }

    public String toString() {
        return "Insets(left=" + this.f66941b + ", top=" + this.f66942c + ", right=" + this.f66943d + ", bottom=" + this.f66944e + ')';
    }
}
