package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f29144a;

    /* renamed from: b, reason: collision with root package name */
    public String f29145b;

    /* renamed from: c, reason: collision with root package name */
    public String f29146c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29147d;

    /* renamed from: e, reason: collision with root package name */
    public byte f29148e;

    public final i1 a() {
        String str;
        String str2;
        if (this.f29148e == 3 && (str = this.f29145b) != null && (str2 = this.f29146c) != null) {
            return new i1(str, this.f29144a, str2, this.f29147d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f29148e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f29145b == null) {
            sb2.append(" version");
        }
        if (this.f29146c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f29148e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
