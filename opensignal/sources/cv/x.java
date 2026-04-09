package cv;

/* loaded from: classes.dex */
public final class x implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f6744a;

    /* renamed from: d, reason: collision with root package name */
    public final g f6745d;

    /* renamed from: g, reason: collision with root package name */
    public a0 f6746g;

    /* renamed from: r, reason: collision with root package name */
    public int f6747r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6748x;

    /* renamed from: y, reason: collision with root package name */
    public long f6749y;

    public x(i iVar) {
        this.f6744a = iVar;
        g gVarS = iVar.s();
        this.f6745d = gVarS;
        a0 a0Var = gVarS.f6705a;
        this.f6746g = a0Var;
        this.f6747r = a0Var != null ? a0Var.f6679b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6748x = true;
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f6744a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f6679b) goto L15;
     */
    @Override // cv.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u(cv.g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            br.l.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f6748x
            if (r3 != 0) goto L63
            cv.a0 r3 = r8.f6746g
            cv.g r4 = r8.f6745d
            if (r3 == 0) goto L2b
            cv.a0 r5 = r4.f6705a
            if (r3 != r5) goto L23
            int r3 = r8.f6747r
            br.l.b(r5)
            int r5 = r5.f6679b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f6749y
            r2 = 1
            long r0 = r0 + r2
            cv.i r2 = r8.f6744a
            boolean r0 = r2.S(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            cv.a0 r0 = r8.f6746g
            if (r0 != 0) goto L4c
            cv.a0 r0 = r4.f6705a
            if (r0 == 0) goto L4c
            r8.f6746g = r0
            int r0 = r0.f6679b
            r8.f6747r = r0
        L4c:
            long r0 = r4.f6706d
            long r2 = r8.f6749y
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            cv.g r2 = r8.f6745d
            long r4 = r8.f6749y
            r3 = r9
            r2.h(r3, r4, r6)
            long r9 = r8.f6749y
            long r9 = r9 + r6
            r8.f6749y = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = c7.a.m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.x.u(cv.g, long):long");
    }
}
