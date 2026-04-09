package gg;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f9561a;

    /* renamed from: b, reason: collision with root package name */
    public d f9562b;

    /* renamed from: c, reason: collision with root package name */
    public String f9563c;

    /* renamed from: d, reason: collision with root package name */
    public String f9564d;

    /* renamed from: e, reason: collision with root package name */
    public long f9565e;

    /* renamed from: f, reason: collision with root package name */
    public long f9566f;

    /* renamed from: g, reason: collision with root package name */
    public String f9567g;

    /* renamed from: h, reason: collision with root package name */
    public byte f9568h;

    public final b a() {
        if (this.f9568h == 3 && this.f9562b != null) {
            return new b(this.f9561a, this.f9562b, this.f9563c, this.f9564d, this.f9565e, this.f9566f, this.f9567g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f9562b == null) {
            sb2.append(" registrationStatus");
        }
        if ((this.f9568h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f9568h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }

    public final void b(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f9562b = dVar;
    }
}
