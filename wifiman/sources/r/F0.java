package r;

/* loaded from: classes.dex */
public final class F0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f59470a;

    public F0(int i10) {
        this.f59470a = i10;
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return j10 < ((long) e()) * 1000000 ? abstractC7542q : abstractC7542q2;
    }

    @Override // r.y0
    public int e() {
        return this.f59470a;
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return abstractC7542q3;
    }

    @Override // r.y0
    public int g() {
        return 0;
    }
}
