package of;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f30533a;

    /* renamed from: b, reason: collision with root package name */
    public String f30534b;

    /* renamed from: c, reason: collision with root package name */
    public String f30535c;

    /* renamed from: d, reason: collision with root package name */
    public String f30536d;

    /* renamed from: e, reason: collision with root package name */
    public long f30537e;

    /* renamed from: f, reason: collision with root package name */
    public byte f30538f;

    public final c a() {
        if (this.f30538f == 1 && this.f30533a != null && this.f30534b != null && this.f30535c != null && this.f30536d != null) {
            return new c(this.f30533a, this.f30534b, this.f30535c, this.f30536d, this.f30537e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f30533a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f30534b == null) {
            sb2.append(" variantId");
        }
        if (this.f30535c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f30536d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f30538f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(h.v(sb2, "Missing required properties:"));
    }
}
