package E5;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1402e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1403f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final B2.a f1404g = new B2.a("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f1405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1408d;

    public n(int i, boolean z6) {
        this.f1405a = i;
        this.f1406b = z6;
        int i3 = i - 1;
        this.f1407c = i3;
        this.f1408d = new AtomicReferenceArray(i);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1403f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                return (2305843009213693952L & j6) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j6);
            int i3 = (int) ((1152921503533105152L & j6) >> 30);
            int i6 = this.f1407c;
            if (((i3 + 2) & i6) == (i & i6)) {
                return 1;
            }
            boolean z6 = this.f1406b;
            AtomicReferenceArray atomicReferenceArray = this.f1408d;
            if (z6 || atomicReferenceArray.get(i3 & i6) == null) {
                if (f1403f.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i3 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i3 & i6, obj);
                    n nVarC = this;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.f1408d;
                        int i7 = nVarC.f1407c & i3;
                        Object obj2 = atomicReferenceArray2.get(i7);
                        if ((obj2 instanceof m) && ((m) obj2).f1401a == i3) {
                            atomicReferenceArray2.set(i7, obj);
                        } else {
                            nVarC = null;
                        }
                        if (nVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i8 = this.f1405a;
                if (i8 < 1024 || ((i3 - i) & 1073741823) > (i8 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f1403f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f1403f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j7 = 1152921504606846976L | j6;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j6, j7)) {
                j6 = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1402e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f1405a * 2, nVar.f1406b);
            int i = (int) (1073741823 & j6);
            int i3 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i6 = nVar.f1407c;
                int i7 = i & i6;
                if (i7 == (i6 & i3)) {
                    break;
                }
                Object mVar = nVar.f1408d.get(i7);
                if (mVar == null) {
                    mVar = new m(i);
                }
                nVar3.f1408d.set(nVar3.f1407c & i, mVar);
                i++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = E5.n.f1403f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            B2.a r0 = E5.n.f1404g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f1407c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f1408d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f1406b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof E5.m
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = E5.n.f1403f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            E5.n r0 = r1.c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = E5.n.f1403f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f1408d
            int r2 = r2.f1407c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.n.d():java.lang.Object");
    }
}
