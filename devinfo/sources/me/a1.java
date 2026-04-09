package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public Double f29048a;

    /* renamed from: b, reason: collision with root package name */
    public int f29049b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29050c;

    /* renamed from: d, reason: collision with root package name */
    public int f29051d;

    /* renamed from: e, reason: collision with root package name */
    public long f29052e;

    /* renamed from: f, reason: collision with root package name */
    public long f29053f;
    public byte g;

    public final b1 a() {
        if (this.g == 31) {
            return new b1(this.f29048a, this.f29049b, this.f29050c, this.f29051d, this.f29052e, this.f29053f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
