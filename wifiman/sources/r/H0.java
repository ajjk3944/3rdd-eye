package r;

/* loaded from: classes.dex */
public final class H0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f59478a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59479b;

    /* renamed from: c, reason: collision with root package name */
    private final E f59480c;

    /* renamed from: d, reason: collision with root package name */
    private final A0 f59481d;

    public H0(int i10, int i11, E e10) {
        this.f59478a = i10;
        this.f59479b = i11;
        this.f59480c = e10;
        this.f59481d = new A0(new L(g(), e(), e10));
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59481d.c(j10, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    @Override // r.y0
    public int e() {
        return this.f59479b;
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59481d.f(j10, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    @Override // r.y0
    public int g() {
        return this.f59478a;
    }
}
