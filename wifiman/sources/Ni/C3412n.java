package Ni;

import Ii.S;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ni.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3412n {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16608a = AtomicReferenceFieldUpdater.newUpdater(C3412n.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16609b = AtomicReferenceFieldUpdater.newUpdater(C3412n.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16610c = AtomicReferenceFieldUpdater.newUpdater(C3412n.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(Ni.C3412n.f16608a, r3, r2, ((Ni.w) r4).f16626a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Ni.C3412n g() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = n()
            java.lang.Object r0 = r0.get(r7)
            Ni.n r0 = (Ni.C3412n) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.p()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof Ni.w
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m()
            Ni.w r4 = (Ni.w) r4
            Ni.n r4 = r4.f16626a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r2 = r4.get(r2)
            Ni.n r2 = (Ni.C3412n) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC6492s.g(r4, r3)
            r3 = r4
            Ni.n r3 = (Ni.C3412n) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Ni.C3412n.g():Ni.n");
    }

    private final C3412n h(C3412n c3412n) {
        while (c3412n.p()) {
            c3412n = (C3412n) f16609b.get(c3412n);
        }
        return c3412n;
    }

    private final void i(C3412n c3412n) {
        C3412n c3412n2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16609b;
        do {
            c3412n2 = (C3412n) atomicReferenceFieldUpdater.get(c3412n);
            if (j() != c3412n) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f16609b, c3412n, c3412n2, this));
        if (p()) {
            c3412n.g();
        }
    }

    private final w s() {
        w wVar = (w) f16610c.get(this);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        f16610c.set(this, wVar2);
        return wVar2;
    }

    public final boolean c(C3412n c3412n, int i10) {
        C3412n c3412nL;
        do {
            c3412nL = l();
            if (c3412nL instanceof C3410l) {
                return (((C3410l) c3412nL).f16607d & i10) == 0 && c3412nL.c(c3412n, i10);
            }
        } while (!c3412nL.d(c3412n, this));
        return true;
    }

    public final boolean d(C3412n c3412n, C3412n c3412n2) {
        f16609b.set(c3412n, this);
        f16608a.set(c3412n, c3412n2);
        if (!androidx.concurrent.futures.b.a(f16608a, this, c3412n2, c3412n)) {
            return false;
        }
        c3412n.i(c3412n2);
        return true;
    }

    public final boolean e(C3412n c3412n) {
        f16609b.set(c3412n, this);
        f16608a.set(c3412n, this);
        while (j() == this) {
            if (androidx.concurrent.futures.b.a(f16608a, this, this, c3412n)) {
                c3412n.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        c(new C3410l(i10), i10);
    }

    public final Object j() {
        return f16608a.get(this);
    }

    public final C3412n k() {
        C3412n c3412n;
        Object objJ = j();
        w wVar = objJ instanceof w ? (w) objJ : null;
        if (wVar != null && (c3412n = wVar.f16626a) != null) {
            return c3412n;
        }
        AbstractC6492s.g(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C3412n) objJ;
    }

    public final C3412n l() {
        C3412n c3412nG = g();
        return c3412nG == null ? h((C3412n) f16609b.get(this)) : c3412nG;
    }

    public boolean p() {
        return j() instanceof w;
    }

    public boolean q() {
        return r() == null;
    }

    public final C3412n r() {
        Object objJ;
        C3412n c3412n;
        do {
            objJ = j();
            if (objJ instanceof w) {
                return ((w) objJ).f16626a;
            }
            if (objJ == this) {
                return (C3412n) objJ;
            }
            AbstractC6492s.g(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c3412n = (C3412n) objJ;
        } while (!androidx.concurrent.futures.b.a(f16608a, this, objJ, c3412n.s()));
        c3412n.g();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.D(this) { // from class: Ni.n.a
            @Override // kotlin.jvm.internal.D, th.m
            public Object get() {
                return S.a(this.receiver);
            }
        } + '@' + S.b(this);
    }
}
