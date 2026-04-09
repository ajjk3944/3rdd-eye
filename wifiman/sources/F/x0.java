package F;

/* loaded from: classes.dex */
final class x0 implements R0.H {

    /* renamed from: b, reason: collision with root package name */
    private final R0.H f5630b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5631c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5632d;

    public x0(R0.H h10, int i10, int i11) {
        this.f5630b = h10;
        this.f5631c = i10;
        this.f5632d = i11;
    }

    @Override // R0.H
    public int a(int i10) {
        int iA = this.f5630b.a(i10);
        if (i10 >= 0 && i10 <= this.f5632d) {
            y0.h(iA, this.f5631c, i10);
        }
        return iA;
    }

    @Override // R0.H
    public int b(int i10) {
        int iB = this.f5630b.b(i10);
        if (i10 >= 0 && i10 <= this.f5631c) {
            y0.g(iB, this.f5632d, i10);
        }
        return iB;
    }
}
