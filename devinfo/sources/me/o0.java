package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public long f29261a;

    /* renamed from: b, reason: collision with root package name */
    public String f29262b;

    /* renamed from: c, reason: collision with root package name */
    public d2 f29263c;

    /* renamed from: d, reason: collision with root package name */
    public e2 f29264d;

    /* renamed from: e, reason: collision with root package name */
    public f2 f29265e;

    /* renamed from: f, reason: collision with root package name */
    public i2 f29266f;
    public byte g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.g == 1 && (str = this.f29262b) != null && (d2Var = this.f29263c) != null && (e2Var = this.f29264d) != null) {
            return new p0(this.f29261a, str, d2Var, e2Var, this.f29265e, this.f29266f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f29262b == null) {
            sb2.append(" type");
        }
        if (this.f29263c == null) {
            sb2.append(" app");
        }
        if (this.f29264d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
