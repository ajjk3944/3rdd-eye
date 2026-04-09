package rl;

import b5.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public va.o f33191a;

    /* renamed from: b, reason: collision with root package name */
    public u f33192b;

    /* renamed from: d, reason: collision with root package name */
    public String f33194d;

    /* renamed from: e, reason: collision with root package name */
    public l f33195e;

    /* renamed from: h, reason: collision with root package name */
    public hm.v f33197h;

    /* renamed from: i, reason: collision with root package name */
    public z f33198i;
    public z j;

    /* renamed from: k, reason: collision with root package name */
    public z f33199k;

    /* renamed from: l, reason: collision with root package name */
    public long f33200l;

    /* renamed from: m, reason: collision with root package name */
    public long f33201m;

    /* renamed from: n, reason: collision with root package name */
    public i0 f33202n;

    /* renamed from: c, reason: collision with root package name */
    public int f33193c = -1;
    public c0 g = c0.f33050b;

    /* renamed from: o, reason: collision with root package name */
    public f0 f33203o = f0.f33065a;

    /* renamed from: f, reason: collision with root package name */
    public km.y f33196f = new km.y(17);

    public static void b(String str, z zVar) {
        if (zVar != null) {
            if (zVar.f33211i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (zVar.j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (zVar.f33212k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final z a() {
        int i4 = this.f33193c;
        if (i4 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f33193c).toString());
        }
        va.o oVar = this.f33191a;
        if (oVar == null) {
            throw new IllegalStateException("request == null");
        }
        u uVar = this.f33192b;
        if (uVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f33194d;
        if (str != null) {
            return new z(oVar, uVar, str, i4, this.f33195e, this.f33196f.x(), this.g, this.f33197h, this.f33198i, this.j, this.f33199k, this.f33200l, this.f33201m, this.f33202n, this.f33203o);
        }
        throw new IllegalStateException("message == null");
    }
}
