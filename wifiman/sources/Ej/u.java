package ej;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class u implements InterfaceC5476D {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5483g f46498a;

    /* renamed from: b, reason: collision with root package name */
    private final C5481e f46499b;

    /* renamed from: c, reason: collision with root package name */
    private y f46500c;

    /* renamed from: d, reason: collision with root package name */
    private int f46501d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46502e;

    /* renamed from: f, reason: collision with root package name */
    private long f46503f;

    public u(InterfaceC5483g upstream) {
        AbstractC6492s.i(upstream, "upstream");
        this.f46498a = upstream;
        C5481e c5481eB = upstream.b();
        this.f46499b = c5481eB;
        y yVar = c5481eB.f46459a;
        this.f46500c = yVar;
        this.f46501d = yVar != null ? yVar.f46527b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f46527b) goto L15;
     */
    @Override // ej.InterfaceC5476D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long U(ej.C5481e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.AbstractC6492s.i(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L75
            boolean r3 = r8.f46502e
            if (r3 != 0) goto L6d
            ej.y r3 = r8.f46500c
            if (r3 == 0) goto L2b
            ej.e r4 = r8.f46499b
            ej.y r4 = r4.f46459a
            if (r3 != r4) goto L23
            int r3 = r8.f46501d
            kotlin.jvm.internal.AbstractC6492s.f(r4)
            int r4 = r4.f46527b
            if (r3 != r4) goto L23
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
            ej.g r0 = r8.f46498a
            long r1 = r8.f46503f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            ej.y r0 = r8.f46500c
            if (r0 != 0) goto L51
            ej.e r0 = r8.f46499b
            ej.y r0 = r0.f46459a
            if (r0 == 0) goto L51
            r8.f46500c = r0
            kotlin.jvm.internal.AbstractC6492s.f(r0)
            int r0 = r0.f46527b
            r8.f46501d = r0
        L51:
            ej.e r0 = r8.f46499b
            long r0 = r0.D0()
            long r2 = r8.f46503f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            ej.e r2 = r8.f46499b
            long r4 = r8.f46503f
            r3 = r9
            r6 = r10
            r2.S(r3, r4, r6)
            long r0 = r8.f46503f
            long r0 = r0 + r10
            r8.f46503f = r0
            return r10
        L6d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L75:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.u.U(ej.e, long):long");
    }

    @Override // ej.InterfaceC5476D
    public E c() {
        return this.f46498a.c();
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46502e = true;
    }
}
