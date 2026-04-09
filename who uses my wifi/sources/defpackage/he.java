package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class he extends yt0 {
    public final bc e;
    public final /* synthetic */ AtomicReferenceArray f;

    public he(long j, he heVar, bc bcVar, int i) {
        super(j, heVar, i);
        this.e = bcVar;
        this.f = new AtomicReferenceArray(dc.b * 2);
    }

    @Override // defpackage.yt0
    public final int f() {
        return dc.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        defpackage.i30.j(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.yt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r5, defpackage.hk r6) {
        /*
            r4 = this;
            int r6 = defpackage.dc.b
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
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof defpackage.w71
            bc r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof defpackage.x71
            if (r1 == 0) goto L21
            goto L62
        L21:
            gs3 r1 = defpackage.dc.j
            if (r6 == r1) goto L59
            gs3 r1 = defpackage.dc.k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            gs3 r1 = defpackage.dc.g
            if (r6 == r1) goto L11
            gs3 r1 = defpackage.dc.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            gs3 r5 = defpackage.dc.i
            if (r6 == r5) goto L7c
            gs3 r5 = defpackage.dc.d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            gs3 r5 = defpackage.dc.l
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
            defpackage.i30.j(r2)
            return
        L62:
            if (r0 == 0) goto L67
            gs3 r1 = defpackage.dc.j
            goto L69
        L67:
            gs3 r1 = defpackage.dc.k
        L69:
            boolean r6 = r4.j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            defpackage.i30.j(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he.g(int, hk):void");
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            bc bcVar = this.e;
            i30.j(bcVar);
            bcVar.q((this.c * dc.b) + i);
        }
        h();
    }

    public final void m(int i, jw0 jw0Var) {
        this.f.set(i * 2, jw0Var);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
