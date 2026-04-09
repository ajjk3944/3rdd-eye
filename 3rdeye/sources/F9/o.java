package F9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes3.dex */
public final class o<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1774e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1775f = AtomicLongFieldUpdater.newUpdater(o.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final y f1776g = new y("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f1777a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1778b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1780d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1781a;

        public a(int i) {
            this.f1781a = i;
        }
    }

    public o(int i, boolean z10) {
        this.f1777a = i;
        this.f1778b = z10;
        int i10 = i - 1;
        this.f1779c = i10;
        this.f1780d = new AtomicReferenceArray(i);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1775f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j4);
            int i10 = (int) ((1152921503533105152L & j4) >> 30);
            int i11 = this.f1779c;
            if (((i10 + 2) & i11) == (i & i11)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1780d;
            if (!this.f1778b && atomicReferenceArray.get(i10 & i11) != null) {
                int i12 = this.f1777a;
                if (i12 < 1024 || ((i10 - i) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((i10 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i10 & i11, runnable);
                o<E> oVarC = this;
                while ((atomicLongFieldUpdater.get(oVarC) & 1152921504606846976L) != 0) {
                    oVarC = oVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = oVarC.f1780d;
                    int i13 = oVarC.f1779c & i10;
                    Object obj = atomicReferenceArray2.get(i13);
                    if ((obj instanceof a) && ((a) obj).f1781a == i10) {
                        atomicReferenceArray2.set(i13, runnable);
                    } else {
                        oVarC = null;
                    }
                    if (oVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f1775f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        o<E> oVar;
        while (true) {
            atomicLongFieldUpdater = f1775f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                oVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j4;
            oVar = this;
            if (atomicLongFieldUpdater.compareAndSet(oVar, j4, j10)) {
                j4 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1774e;
            o<E> oVar2 = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar2 != null) {
                return oVar2;
            }
            o oVar3 = new o(oVar.f1777a * 2, oVar.f1778b);
            int i = (int) (1073741823 & j4);
            int i10 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i11 = oVar.f1779c;
                int i12 = i & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object aVar = oVar.f1780d.get(i12);
                if (aVar == null) {
                    aVar = new a(i);
                }
                oVar3.f1780d.set(oVar3.f1779c & i, aVar);
                i++;
            }
            atomicLongFieldUpdater.set(oVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = F9.o.f1775f
            long r2 = r0.get(r1)
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r6
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L15
            F9.y r0 = F9.o.f1776g
            return r0
        L15:
            r10 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r10
            int r4 = (int) r4
            r12 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r12 = r12 & r2
            r5 = 30
            long r12 = r12 >> r5
            int r5 = (int) r12
            int r12 = r1.f1779c
            r5 = r5 & r12
            r12 = r12 & r4
            r13 = 0
            if (r5 != r12) goto L2d
            goto L40
        L2d:
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r1.f1780d
            java.lang.Object r15 = r14.get(r12)
            boolean r5 = r1.f1778b
            if (r15 != 0) goto L3a
            if (r5 == 0) goto L2
            goto L40
        L3a:
            r16 = r6
            boolean r6 = r15 instanceof F9.o.a
            if (r6 == 0) goto L41
        L40:
            return r13
        L41:
            int r4 = r4 + 1
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r6
            r6 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r6
            r20 = r6
            long r6 = (long) r4
            long r18 = r18 | r6
            r28 = r18
            r18 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L61
            r14.set(r12, r13)
            return r15
        L61:
            r1 = r30
            if (r18 == 0) goto L2
        L65:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = F9.o.f1775f
            long r24 = r0.get(r1)
            long r2 = r24 & r10
            int r2 = (int) r2
            long r3 = r24 & r16
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L7a
            F9.o r0 = r1.c()
            r1 = r0
            goto L93
        L7a:
            long r3 = r24 & r20
            long r26 = r3 | r6
            r22 = r0
            r23 = r1
            boolean r0 = r22.compareAndSet(r23, r24, r26)
            r1 = r23
            if (r0 == 0) goto L65
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f1780d
            int r1 = r1.f1779c
            r1 = r1 & r2
            r0.set(r1, r13)
            r1 = r13
        L93:
            if (r1 != 0) goto L65
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.o.d():java.lang.Object");
    }
}
