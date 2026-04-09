package zk;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends cl.s {

    /* renamed from: e, reason: collision with root package name */
    public final h f38369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f38370f;

    public p(long j, p pVar, h hVar, int i4) {
        super(j, pVar, i4);
        this.f38369e = hVar;
        this.f38370f = new AtomicReferenceArray(j.f38347b * 2);
    }

    @Override // cl.s
    public final int g() {
        return j.f38347b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        nk.k.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // cl.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, ck.h r6) {
        /*
            r4 = this;
            int r6 = zk.j.f38347b
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
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f38370f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof xk.u1
            zk.h r2 = r4.f38369e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof zk.y
            if (r1 == 0) goto L21
            goto L62
        L21:
            cl.u r1 = zk.j.j
            if (r6 == r1) goto L59
            cl.u r1 = zk.j.f38354k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            cl.u r1 = zk.j.g
            if (r6 == r1) goto L11
            cl.u r1 = zk.j.f38351f
            if (r6 != r1) goto L33
            goto L11
        L33:
            cl.u r5 = zk.j.f38353i
            if (r6 == r5) goto L7c
            cl.u r5 = zk.j.f38349d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            cl.u r5 = zk.j.f38355l
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
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            nk.k.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            cl.u r1 = zk.j.j
            goto L69
        L67:
            cl.u r1 = zk.j.f38354k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            nk.k.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.p.h(int, ck.h):void");
    }

    public final boolean k(int i4, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i4 * 2) + 1;
        do {
            atomicReferenceArray = this.f38370f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i4) {
        return this.f38370f.get((i4 * 2) + 1);
    }

    public final void m(int i4, boolean z3) {
        if (z3) {
            h hVar = this.f38369e;
            nk.k.b(hVar);
            hVar.K((this.f2939c * j.f38347b) + i4);
        }
        i();
    }

    public final void n(int i4, Object obj) {
        this.f38370f.set(i4 * 2, obj);
    }

    public final void o(int i4, Object obj) {
        this.f38370f.set((i4 * 2) + 1, obj);
    }
}
