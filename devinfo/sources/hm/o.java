package hm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements w {

    /* renamed from: a, reason: collision with root package name */
    public final g f25194a;

    /* renamed from: b, reason: collision with root package name */
    public final e f25195b;

    /* renamed from: c, reason: collision with root package name */
    public r f25196c;

    /* renamed from: d, reason: collision with root package name */
    public int f25197d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25198e;

    /* renamed from: f, reason: collision with root package name */
    public long f25199f;

    public o(g gVar) {
        this.f25194a = gVar;
        e buffer = gVar.getBuffer();
        this.f25195b = buffer;
        r rVar = buffer.f25173a;
        this.f25196c = rVar;
        this.f25197d = rVar != null ? rVar.f25207b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25198e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r10 == r0.f25207b) goto L13;
     */
    @Override // hm.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n(hm.e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r10 = "sink"
            nk.k.e(r9, r10)
            boolean r10 = r8.f25198e
            if (r10 != 0) goto L5c
            hm.r r10 = r8.f25196c
            hm.e r11 = r8.f25195b
            if (r10 == 0) goto L25
            hm.r r0 = r11.f25173a
            if (r10 != r0) goto L1d
            int r10 = r8.f25197d
            nk.k.b(r0)
            int r0 = r0.f25207b
            if (r10 != r0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L25:
            long r0 = r8.f25199f
            r2 = 1
            long r0 = r0 + r2
            hm.g r10 = r8.f25194a
            boolean r10 = r10.request(r0)
            if (r10 != 0) goto L35
            r9 = -1
            return r9
        L35:
            hm.r r10 = r8.f25196c
            if (r10 != 0) goto L43
            hm.r r10 = r11.f25173a
            if (r10 == 0) goto L43
            r8.f25196c = r10
            int r10 = r10.f25207b
            r8.f25197d = r10
        L43:
            long r10 = r11.f25174b
            long r0 = r8.f25199f
            long r10 = r10 - r0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r6 = java.lang.Math.min(r0, r10)
            hm.e r2 = r8.f25195b
            long r4 = r8.f25199f
            r3 = r9
            r2.m(r3, r4, r6)
            long r9 = r8.f25199f
            long r9 = r9 + r6
            r8.f25199f = r9
            return r6
        L5c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.o.n(hm.e, long):long");
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f25194a.timeout();
    }
}
