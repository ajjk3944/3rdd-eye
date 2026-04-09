package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public String f29354a;

    /* renamed from: b, reason: collision with root package name */
    public int f29355b;

    /* renamed from: c, reason: collision with root package name */
    public int f29356c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29357d;

    /* renamed from: e, reason: collision with root package name */
    public byte f29358e;

    public final z0 a() {
        String str;
        if (this.f29358e == 7 && (str = this.f29354a) != null) {
            return new z0(str, this.f29355b, this.f29356c, this.f29357d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29354a == null) {
            sb2.append(" processName");
        }
        if ((this.f29358e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f29358e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f29358e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
