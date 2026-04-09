package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f29227a;

    /* renamed from: b, reason: collision with root package name */
    public String f29228b;

    /* renamed from: c, reason: collision with root package name */
    public int f29229c;

    /* renamed from: d, reason: collision with root package name */
    public long f29230d;

    /* renamed from: e, reason: collision with root package name */
    public long f29231e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29232f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public String f29233h;

    /* renamed from: i, reason: collision with root package name */
    public String f29234i;
    public byte j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f29228b) != null && (str2 = this.f29233h) != null && (str3 = this.f29234i) != null) {
            return new n0(this.f29227a, str, this.f29229c, this.f29230d, this.f29231e, this.f29232f, this.g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f29228b == null) {
            sb2.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f29233h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f29234i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
