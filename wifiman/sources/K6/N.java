package K6;

/* loaded from: classes3.dex */
class N implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private final G6.N f10310a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10311b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10312c;

    N(G6.N n10, int i10, int i11) {
        this.f10310a = n10;
        this.f10311b = i10;
        this.f10312c = i11;
    }

    @Override // K6.i0
    public int a() {
        return Math.min(this.f10310a.a() - this.f10311b, this.f10312c);
    }
}
