package ze;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements we.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f38259a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38260b = false;

    /* renamed from: c, reason: collision with root package name */
    public we.c f38261c;

    /* renamed from: d, reason: collision with root package name */
    public final e f38262d;

    public g(e eVar) {
        this.f38262d = eVar;
    }

    @Override // we.g
    public final we.g f(String str) {
        if (this.f38259a) {
            throw new we.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f38259a = true;
        this.f38262d.h(this.f38261c, str, this.f38260b);
        return this;
    }

    @Override // we.g
    public final we.g g(boolean z3) {
        if (this.f38259a) {
            throw new we.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f38259a = true;
        this.f38262d.g(this.f38261c, z3 ? 1 : 0, this.f38260b);
        return this;
    }
}
