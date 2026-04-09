package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.l0;

/* loaded from: classes4.dex */
public class LockFreeLinkedListNode {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22507a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22508b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22509c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public static abstract class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public final LockFreeLinkedListNode f22510b;

        /* renamed from: c, reason: collision with root package name */
        public LockFreeLinkedListNode f22511c;

        public a(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f22510b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z10 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z10 ? this.f22510b : this.f22511c;
            if (lockFreeLinkedListNode2 != null && t.a.a(LockFreeLinkedListNode.q(), lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z10) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f22510b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f22511c;
                kotlin.jvm.internal.p.b(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.k(lockFreeLinkedListNode4);
            }
        }
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater q() {
        return f22507a;
    }

    public final boolean h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f22508b.set(lockFreeLinkedListNode, this);
        f22507a.set(lockFreeLinkedListNode, this);
        while (n() == this) {
            if (t.a.a(f22507a, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.k(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (t.a.a(kotlinx.coroutines.internal.LockFreeLinkedListNode.f22507a, r3, r2, ((kotlinx.coroutines.internal.w) r4).f22566a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode i(kotlinx.coroutines.internal.v r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r()
            java.lang.Object r0 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = q()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L25
            if (r0 != r2) goto L1a
            goto L2e
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = r()
            boolean r0 = t.a.a(r1, r7, r0, r2)
            if (r0 != 0) goto L2e
            goto L0
        L25:
            boolean r5 = r7.t()
            if (r5 == 0) goto L2c
            return r1
        L2c:
            if (r4 != r8) goto L2f
        L2e:
            return r2
        L2f:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.v
            if (r5 == 0) goto L39
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.v) r4
            r4.a(r2)
            goto L0
        L39:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.w
            if (r5 == 0) goto L5b
            if (r3 == 0) goto L50
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = q()
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.w) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f22566a
            boolean r2 = t.a.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4e
            goto L0
        L4e:
            r2 = r3
            goto Lc
        L50:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = r()
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Ld
        L5b:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.p.c(r4, r3)
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.i(kotlinx.coroutines.internal.v):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    public final LockFreeLinkedListNode j(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.t()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f22508b.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    public final void k(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22508b;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (n() != lockFreeLinkedListNode) {
                return;
            }
        } while (!t.a.a(f22508b, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (t()) {
            lockFreeLinkedListNode.i(null);
        }
    }

    public final Object n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22507a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).a(this);
        }
    }

    public final LockFreeLinkedListNode o() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objN = n();
        w wVar = objN instanceof w ? (w) objN : null;
        if (wVar != null && (lockFreeLinkedListNode = wVar.f22566a) != null) {
            return lockFreeLinkedListNode;
        }
        kotlin.jvm.internal.p.c(objN, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) objN;
    }

    public final LockFreeLinkedListNode p() {
        LockFreeLinkedListNode lockFreeLinkedListNodeI = i(null);
        return lockFreeLinkedListNodeI == null ? j((LockFreeLinkedListNode) f22508b.get(this)) : lockFreeLinkedListNodeI;
    }

    public boolean t() {
        return n() instanceof w;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, r9.m
            public Object get() {
                return l0.a(this.receiver);
            }
        } + '@' + l0.b(this);
    }

    public boolean u() {
        return v() == null;
    }

    public final LockFreeLinkedListNode v() {
        Object objN;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objN = n();
            if (objN instanceof w) {
                return ((w) objN).f22566a;
            }
            if (objN == this) {
                return (LockFreeLinkedListNode) objN;
            }
            kotlin.jvm.internal.p.c(objN, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objN;
        } while (!t.a.a(f22507a, this, objN, lockFreeLinkedListNode.w()));
        lockFreeLinkedListNode.i(null);
        return null;
    }

    public final w w() {
        w wVar = (w) f22509c.get(this);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        f22509c.set(this, wVar2);
        return wVar2;
    }

    public final int x(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, a aVar) {
        f22508b.set(lockFreeLinkedListNode, this);
        f22507a.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        aVar.f22511c = lockFreeLinkedListNode2;
        if (t.a.a(f22507a, this, lockFreeLinkedListNode2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
