package ia;

/* compiled from: PeekSource.kt */
/* loaded from: classes3.dex */
public final class u implements C {

    /* renamed from: b, reason: collision with root package name */
    public final g f38675b;

    /* renamed from: c, reason: collision with root package name */
    public final C4468d f38676c;

    /* renamed from: d, reason: collision with root package name */
    public x f38677d;

    /* renamed from: e, reason: collision with root package name */
    public int f38678e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38679f;

    /* renamed from: g, reason: collision with root package name */
    public long f38680g;

    public u(g gVar) {
        this.f38675b = gVar;
        C4468d c4468dQ = gVar.q();
        this.f38676c = c4468dQ;
        x xVar = c4468dQ.f38642b;
        this.f38677d = xVar;
        this.f38678e = xVar != null ? xVar.f38689b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38679f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f38689b) goto L15;
     */
    @Override // ia.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(ia.C4468d r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.l.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f38679f
            if (r3 != 0) goto L63
            ia.x r3 = r8.f38677d
            ia.d r4 = r8.f38676c
            if (r3 == 0) goto L2b
            ia.x r5 = r4.f38642b
            if (r3 != r5) goto L23
            int r3 = r8.f38678e
            kotlin.jvm.internal.l.c(r5)
            int r5 = r5.f38689b
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
            long r0 = r8.f38680g
            r2 = 1
            long r0 = r0 + r2
            ia.g r2 = r8.f38675b
            boolean r0 = r2.l0(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            ia.x r0 = r8.f38677d
            if (r0 != 0) goto L4c
            ia.x r0 = r4.f38642b
            if (r0 == 0) goto L4c
            r8.f38677d = r0
            int r0 = r0.f38689b
            r8.f38678e = r0
        L4c:
            long r0 = r4.f38643c
            long r2 = r8.f38680g
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            ia.d r2 = r8.f38676c
            long r4 = r8.f38680g
            r3 = r9
            r2.k(r3, r4, r6)
            long r9 = r8.f38680g
            long r9 = r9 + r6
            r8.f38680g = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = io.appmetrica.analytics.impl.Oo.d(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.u.read(ia.d, long):long");
    }

    @Override // ia.C
    public final D timeout() {
        return this.f38675b.timeout();
    }
}
