package F9;

import A9.AbstractC0568b0;
import F9.E;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes3.dex */
public class D<T extends E & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1738b = AtomicIntegerFieldUpdater.newUpdater(D.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public T[] f1739a;

    public final void a(AbstractC0568b0.c cVar) {
        cVar.a((AbstractC0568b0.d) this);
        T[] tArr = this.f1739a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1738b;
        if (tArr == null) {
            tArr = (T[]) new E[4];
            this.f1739a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(...)");
            tArr = (T[]) ((E[]) objArrCopyOf);
            this.f1739a = tArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tArr[i] = cVar;
        cVar.f231c = i;
        e(i);
    }

    public final T b() {
        T t10;
        synchronized (this) {
            T[] tArr = this.f1739a;
            t10 = tArr != null ? tArr[0] : null;
        }
        return t10;
    }

    public final void c(AbstractC0568b0.c cVar) {
        synchronized (this) {
            if (cVar.d() != null) {
                d(cVar.f231c);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T d(int r9) {
        /*
            r8 = this;
            T extends F9.E & java.lang.Comparable<? super T>[] r0 = r8.f1739a
            kotlin.jvm.internal.l.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = F9.D.f1738b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L80
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3c
            r4 = r0[r9]
            kotlin.jvm.internal.l.c(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r0[r2]
            kotlin.jvm.internal.l.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3c
            r8.f(r9, r2)
            r8.e(r2)
            goto L80
        L3c:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L47
            goto L80
        L47:
            T extends F9.E & java.lang.Comparable<? super T>[] r5 = r8.f1739a
            kotlin.jvm.internal.l.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L67
            r6 = r5[r2]
            kotlin.jvm.internal.l.c(r6)
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            r7 = r5[r4]
            kotlin.jvm.internal.l.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L67
            goto L68
        L67:
            r2 = r4
        L68:
            r4 = r5[r9]
            kotlin.jvm.internal.l.c(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r5[r2]
            kotlin.jvm.internal.l.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L7b
            goto L80
        L7b:
            r8.f(r9, r2)
            r9 = r2
            goto L3c
        L80:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.l.c(r9)
            r2 = 0
            r9.a(r2)
            r9.c(r3)
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.D.d(int):F9.E");
    }

    public final void e(int i) {
        while (i > 0) {
            T[] tArr = this.f1739a;
            kotlin.jvm.internal.l.c(tArr);
            int i10 = (i - 1) / 2;
            T t10 = tArr[i10];
            kotlin.jvm.internal.l.c(t10);
            T t11 = tArr[i];
            kotlin.jvm.internal.l.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            f(i, i10);
            i = i10;
        }
    }

    public final void f(int i, int i10) {
        T[] tArr = this.f1739a;
        kotlin.jvm.internal.l.c(tArr);
        T t10 = tArr[i10];
        kotlin.jvm.internal.l.c(t10);
        T t11 = tArr[i];
        kotlin.jvm.internal.l.c(t11);
        tArr[i] = t10;
        tArr[i10] = t11;
        t10.c(i);
        t11.c(i10);
    }
}
