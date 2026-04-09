package yt;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends bu.r {

    /* renamed from: e, reason: collision with root package name */
    public final c f26450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f26451f;

    public k(long j, k kVar, c cVar, int i10) {
        super(j, kVar, i10);
        this.f26450e = cVar;
        this.f26451f = new AtomicReferenceArray(e.f26429b * 2);
    }

    @Override // bu.r
    public final int f() {
        return e.f26429b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        br.l.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // bu.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r5, pq.h r6) {
        /*
            r4 = this;
            int r6 = yt.e.f26429b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f26451f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof wt.q1
            yt.c r2 = r4.f26450e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof yt.s
            if (r1 == 0) goto L21
            goto L62
        L21:
            bu.t r1 = yt.e.j
            if (r6 == r1) goto L59
            bu.t r1 = yt.e.k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            bu.t r1 = yt.e.f26434g
            if (r6 == r1) goto L11
            bu.t r1 = yt.e.f26433f
            if (r6 != r1) goto L33
            goto L11
        L33:
            bu.t r5 = yt.e.f26436i
            if (r6 == r5) goto L7c
            bu.t r5 = yt.e.f26431d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            bu.t r5 = yt.e.f26437l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.m(r5, r3)
            if (r0 == 0) goto L7c
            br.l.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            bu.t r1 = yt.e.j
            goto L69
        L67:
            bu.t r1 = yt.e.k
        L69:
            boolean r6 = r4.j(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            br.l.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.k.g(int, pq.h):void");
    }

    public final boolean j(Object obj, int i10, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f26451f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object k(int i10) {
        return this.f26451f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            c cVar = this.f26450e;
            br.l.b(cVar);
            cVar.C((this.f2987c * e.f26429b) + i10);
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f26451f.set(i10 * 2, obj);
    }

    public final void n(int i10, Object obj) {
        this.f26451f.set((i10 * 2) + 1, obj);
    }
}
