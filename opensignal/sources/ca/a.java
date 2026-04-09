package ca;

/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final c f3446a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3447b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3448c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3449d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3450e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3451f;

    public a(c cVar, long j, long j7, long j10, long j11, long j12) {
        this.f3446a = cVar;
        this.f3447b = j;
        this.f3448c = j7;
        this.f3449d = j10;
        this.f3450e = j11;
        this.f3451f = j12;
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.u
    public final t d(long j) {
        v vVar = new v(j, b.a(this.f3446a.b(j), 0L, this.f3448c, this.f3449d, this.f3450e, this.f3451f));
        return new t(vVar, vVar);
    }

    @Override // ca.u
    public final long e() {
        return this.f3447b;
    }
}
