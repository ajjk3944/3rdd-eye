package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public String f29157a;

    /* renamed from: b, reason: collision with root package name */
    public String f29158b;

    /* renamed from: c, reason: collision with root package name */
    public String f29159c;

    /* renamed from: d, reason: collision with root package name */
    public long f29160d;

    /* renamed from: e, reason: collision with root package name */
    public Long f29161e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29162f;
    public u1 g;

    /* renamed from: h, reason: collision with root package name */
    public l2 f29163h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f29164i;
    public v1 j;

    /* renamed from: k, reason: collision with root package name */
    public List f29165k;

    /* renamed from: l, reason: collision with root package name */
    public int f29166l;

    /* renamed from: m, reason: collision with root package name */
    public byte f29167m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.f29167m == 7 && (str = this.f29157a) != null && (str2 = this.f29158b) != null && (u1Var = this.g) != null) {
            return new j0(str, str2, this.f29159c, this.f29160d, this.f29161e, this.f29162f, u1Var, this.f29163h, this.f29164i, this.j, this.f29165k, this.f29166l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29157a == null) {
            sb2.append(" generator");
        }
        if (this.f29158b == null) {
            sb2.append(" identifier");
        }
        if ((this.f29167m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f29167m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.g == null) {
            sb2.append(" app");
        }
        if ((this.f29167m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
