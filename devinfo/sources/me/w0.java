package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f29336a;

    /* renamed from: b, reason: collision with root package name */
    public String f29337b;

    /* renamed from: c, reason: collision with root package name */
    public String f29338c;

    /* renamed from: d, reason: collision with root package name */
    public long f29339d;

    /* renamed from: e, reason: collision with root package name */
    public int f29340e;

    /* renamed from: f, reason: collision with root package name */
    public byte f29341f;

    public final x0 a() {
        String str;
        if (this.f29341f == 7 && (str = this.f29337b) != null) {
            return new x0(this.f29336a, str, this.f29338c, this.f29339d, this.f29340e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f29341f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f29337b == null) {
            sb2.append(" symbol");
        }
        if ((this.f29341f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f29341f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
