package C9;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes3.dex */
public final class l<E> extends F9.w<l<E>> {

    /* renamed from: f, reason: collision with root package name */
    public final b<E> f1007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1008g;

    public l(long j4, l<E> lVar, b<E> bVar, int i) {
        super(j4, lVar, i);
        this.f1007f = bVar;
        this.f1008g = new AtomicReferenceArray(f.f983b * 2);
    }

    @Override // F9.w
    public final int g() {
        return f.f983b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.l.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // F9.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, f9.InterfaceC4350h r6) {
        /*
            r4 = this;
            int r6 = C9.f.f983b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f1008g
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof A9.U0
            C9.b<E> r2 = r4.f1007f
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof C9.y
            if (r1 == 0) goto L21
            goto L62
        L21:
            F9.y r1 = C9.f.f990j
            if (r6 == r1) goto L59
            F9.y r1 = C9.f.f991k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            F9.y r1 = C9.f.f988g
            if (r6 == r1) goto L11
            F9.y r1 = C9.f.f987f
            if (r6 != r1) goto L33
            goto L11
        L33:
            F9.y r5 = C9.f.i
            if (r6 == r5) goto L7c
            F9.y r5 = C9.f.f985d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            F9.y r5 = C9.f.f992l
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
            kotlin.jvm.internal.l.c(r2)
            return
        L62:
            if (r0 == 0) goto L67
            F9.y r1 = C9.f.f990j
            goto L69
        L67:
            F9.y r1 = C9.f.f991k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.l.c(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.l.h(int, f9.h):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f1008g;
        int i10 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i) {
        return this.f1008g.get((i * 2) + 1);
    }

    public final void m(int i, boolean z10) {
        if (z10) {
            b<E> bVar = this.f1007f;
            kotlin.jvm.internal.l.c(bVar);
            bVar.K((this.f1786d * f.f983b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f1008g.set(i * 2, obj);
    }

    public final void o(int i, F9.y yVar) {
        this.f1008g.set((i * 2) + 1, yVar);
    }
}
