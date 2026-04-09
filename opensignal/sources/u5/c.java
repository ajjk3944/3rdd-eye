package u5;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final d f23269a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23270b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23271c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23272d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23273e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23274f;

    public c(d dVar, long j, long j7, long j10, long j11, long j12) {
        this.f23269a = dVar;
        this.f23270b = j;
        this.f23271c = j7;
        this.f23272d = j10;
        this.f23273e = j11;
        this.f23274f = j12;
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.x
    public final w d(long j) {
        y yVar = new y(j, ca.b.b(this.f23269a.b(j), 0L, this.f23271c, this.f23272d, this.f23273e, this.f23274f));
        return new w(yVar, yVar);
    }

    @Override // u5.x
    public final long e() {
        return this.f23270b;
    }
}
