package B5;

import E5.t;
import a0.AbstractC0258l;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class h extends t {

    /* renamed from: e, reason: collision with root package name */
    public final b f796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f797f;

    public h(long j6, h hVar, b bVar, int i) {
        super(j6, hVar, i);
        this.f796e = bVar;
        this.f797f = new AtomicReferenceArray(d.f778b * 2);
    }

    @Override // E5.t
    public final int f() {
        return d.f778b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        q5.i.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // E5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r5, h5.InterfaceC2375i r6) {
        /*
            r4 = this;
            int r6 = B5.d.f778b
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
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f797f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof z5.n0
            B5.b r2 = r4.f796e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof B5.k
            if (r1 == 0) goto L21
            goto L62
        L21:
            B2.a r1 = B5.d.f785j
            if (r6 == r1) goto L59
            B2.a r1 = B5.d.f786k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            B2.a r1 = B5.d.f783g
            if (r6 == r1) goto L11
            B2.a r1 = B5.d.f782f
            if (r6 != r1) goto L33
            goto L11
        L33:
            B2.a r5 = B5.d.i
            if (r6 == r5) goto L7c
            B2.a r5 = B5.d.f780d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            B2.a r5 = B5.d.f787l
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
            q5.i.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            B2.a r1 = B5.d.f785j
            goto L69
        L67:
            B2.a r1 = B5.d.f786k
        L69:
            boolean r6 = r4.j(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            q5.i.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.h.g(int, h5.i):void");
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i3 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f797f;
            if (atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i3) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f797f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z6) {
        if (z6) {
            b bVar = this.f796e;
            q5.i.b(bVar);
            bVar.q((this.f1413c * d.f778b) + i);
        }
        h();
    }

    public final void m(int i, AbstractC0258l abstractC0258l) {
        this.f797f.set(i * 2, abstractC0258l);
    }

    public final void n(int i, Object obj) {
        this.f797f.set((i * 2) + 1, obj);
    }
}
