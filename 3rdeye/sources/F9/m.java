package F9;

import A9.AbstractC0603t0;
import A9.D0;
import A9.I;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1768b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1769c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1770d = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends AbstractC0659b<m> {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0603t0 f1771b;

        /* renamed from: c, reason: collision with root package name */
        public D0 f1772c;

        public a(AbstractC0603t0 abstractC0603t0) {
            this.f1771b = abstractC0603t0;
        }

        @Override // F9.AbstractC0659b
        public final void b(m mVar, Object obj) {
            m mVar2 = mVar;
            boolean z10 = obj == null;
            m mVar3 = this.f1771b;
            m mVar4 = z10 ? mVar3 : this.f1772c;
            if (mVar4 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1768b;
                while (!atomicReferenceFieldUpdater.compareAndSet(mVar2, this, mVar4)) {
                    if (atomicReferenceFieldUpdater.get(mVar2) != this) {
                        return;
                    }
                }
                if (z10) {
                    m mVar5 = this.f1772c;
                    kotlin.jvm.internal.l.c(mVar5);
                    mVar3.e(mVar5);
                }
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public /* synthetic */ class b extends kotlin.jvm.internal.p {
        public final String j() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((F9.t) r6).f1783a;
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
    public final F9.m d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = F9.m.f1769c
            java.lang.Object r1 = r0.get(r9)
            F9.m r1 = (F9.m) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = F9.m.f1768b
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
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof F9.s
            if (r7 == 0) goto L38
            F9.s r6 = (F9.s) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof F9.t
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            F9.t r6 = (F9.t) r6
            F9.m r6 = r6.f1783a
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
            F9.m r3 = (F9.m) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.l.d(r6, r4)
            r4 = r6
            F9.m r4 = (F9.m) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.m.d():F9.m");
    }

    public final void e(m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1769c;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(mVar);
            if (f() != mVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, mVar2, this)) {
                if (atomicReferenceFieldUpdater.get(mVar) != mVar2) {
                    break;
                }
            }
            if (h()) {
                mVar.d();
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f1768b.get(this);
            if (!(obj instanceof s)) {
                return obj;
            }
            ((s) obj).a(this);
        }
    }

    public final m g() {
        m mVar;
        Object objF = f();
        t tVar = objF instanceof t ? (t) objF : null;
        if (tVar != null && (mVar = tVar.f1783a) != null) {
            return mVar;
        }
        kotlin.jvm.internal.l.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (m) objF;
    }

    public boolean h() {
        return f() instanceof t;
    }

    public String toString() {
        return new b(this, I.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + I.x(this);
    }
}
