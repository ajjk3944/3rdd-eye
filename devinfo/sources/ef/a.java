package ef;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f23433a;

    /* renamed from: b, reason: collision with root package name */
    public int f23434b;

    /* renamed from: c, reason: collision with root package name */
    public String f23435c;

    /* renamed from: d, reason: collision with root package name */
    public String f23436d;

    /* renamed from: e, reason: collision with root package name */
    public long f23437e;

    /* renamed from: f, reason: collision with root package name */
    public long f23438f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public byte f23439h;

    public final b a() {
        if (this.f23439h == 3 && this.f23434b != 0) {
            return new b(this.f23433a, this.f23434b, this.f23435c, this.f23436d, this.f23437e, this.f23438f, this.g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f23434b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.f23439h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f23439h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(h.v(sb2, "Missing required properties:"));
    }
}
