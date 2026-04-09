package ml;

import c0.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f29404e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final kl.d f29405a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f29406b;

    /* renamed from: c, reason: collision with root package name */
    public long f29407c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f29408d;

    public d(kl.d dVar, i0 i0Var) {
        nk.k.e(dVar, "descriptor");
        this.f29405a = dVar;
        this.f29406b = i0Var;
        int iF = dVar.f();
        if (iF <= 64) {
            this.f29407c = iF != 64 ? (-1) << iF : 0L;
            this.f29408d = f29404e;
            return;
        }
        this.f29407c = 0L;
        int i4 = (iF - 1) >>> 6;
        long[] jArr = new long[i4];
        if ((iF & 63) != 0) {
            jArr[i4 - 1] = (-1) << iF;
        }
        this.f29408d = jArr;
    }
}
