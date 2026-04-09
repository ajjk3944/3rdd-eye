package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f29081a;

    /* renamed from: b, reason: collision with root package name */
    public String f29082b;

    /* renamed from: c, reason: collision with root package name */
    public int f29083c;

    /* renamed from: d, reason: collision with root package name */
    public int f29084d;

    /* renamed from: e, reason: collision with root package name */
    public long f29085e;

    /* renamed from: f, reason: collision with root package name */
    public long f29086f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public String f29087h;

    /* renamed from: i, reason: collision with root package name */
    public List f29088i;
    public byte j;

    public final d0 a() {
        String str;
        if (this.j == 63 && (str = this.f29082b) != null) {
            return new d0(this.f29081a, str, this.f29083c, this.f29084d, this.f29085e, this.f29086f, this.g, this.f29087h, this.f29088i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f29082b == null) {
            sb2.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
