package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class b80 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(b80.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(b80.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b80.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((defpackage.ip0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.b80 f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.b80.g
            java.lang.Object r1 = r0.get(r9)
            b80 r1 = (defpackage.b80) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.b80.f
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof defpackage.nj0
            if (r7 == 0) goto L38
            nj0 r6 = (defpackage.nj0) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof defpackage.ip0
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            ip0 r6 = (defpackage.ip0) r6
            b80 r6 = r6.a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            b80 r3 = (defpackage.b80) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            defpackage.i30.k(r6, r4)
            r4 = r6
            b80 r4 = (defpackage.b80) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.f():b80");
    }

    public final void g(b80 b80Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            b80 b80Var2 = (b80) atomicReferenceFieldUpdater.get(b80Var);
            if (h() != b80Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(b80Var, b80Var2, this)) {
                if (atomicReferenceFieldUpdater.get(b80Var) != b80Var2) {
                    break;
                }
            }
            if (j()) {
                b80Var.f();
                return;
            }
            return;
        }
    }

    public final Object h() {
        while (true) {
            Object obj = f.get(this);
            if (!(obj instanceof nj0)) {
                return obj;
            }
            ((nj0) obj).a(this);
        }
    }

    public final b80 i() {
        b80 b80Var;
        Object objH = h();
        ip0 ip0Var = objH instanceof ip0 ? (ip0) objH : null;
        if (ip0Var != null && (b80Var = ip0Var.a) != null) {
            return b80Var;
        }
        i30.k(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (b80) objH;
    }

    public boolean j() {
        return h() instanceof ip0;
    }

    public String toString() {
        return new a80(this) + '@' + um.k(this);
    }
}
