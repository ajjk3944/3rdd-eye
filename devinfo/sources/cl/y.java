package cl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import xk.n0;
import xk.o0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2948b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public n0[] f2949a;

    public final void a(n0 n0Var) {
        n0Var.e((o0) this);
        n0[] n0VarArr = this.f2949a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2948b;
        if (n0VarArr == null) {
            n0VarArr = new n0[4];
            this.f2949a = n0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= n0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(n0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            n0VarArr = (n0[]) objArrCopyOf;
            this.f2949a = n0VarArr;
        }
        int i4 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i4 + 1);
        n0VarArr[i4] = n0Var;
        n0Var.f37209b = i4;
        d(i4);
    }

    public final void b(n0 n0Var) {
        synchronized (this) {
            if (n0Var.c() != null) {
                c(n0Var.f37209b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final xk.n0 c(int r9) {
        /*
            r8 = this;
            xk.n0[] r0 = r8.f2949a
            nk.k.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = cl.y.f2948b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            nk.k.b(r4)
            r5 = r0[r2]
            nk.k.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            xk.n0[] r5 = r8.f2949a
            nk.k.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            nk.k.b(r6)
            r7 = r5[r4]
            nk.k.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            nk.k.b(r4)
            r5 = r5[r2]
            nk.k.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            nk.k.b(r9)
            r2 = 0
            r9.e(r2)
            r9.f37209b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.y.c(int):xk.n0");
    }

    public final void d(int i4) {
        while (i4 > 0) {
            n0[] n0VarArr = this.f2949a;
            nk.k.b(n0VarArr);
            int i10 = (i4 - 1) / 2;
            n0 n0Var = n0VarArr[i10];
            nk.k.b(n0Var);
            n0 n0Var2 = n0VarArr[i4];
            nk.k.b(n0Var2);
            if (n0Var.compareTo(n0Var2) <= 0) {
                return;
            }
            e(i4, i10);
            i4 = i10;
        }
    }

    public final void e(int i4, int i10) {
        n0[] n0VarArr = this.f2949a;
        nk.k.b(n0VarArr);
        n0 n0Var = n0VarArr[i10];
        nk.k.b(n0Var);
        n0 n0Var2 = n0VarArr[i4];
        nk.k.b(n0Var2);
        n0VarArr[i4] = n0Var;
        n0VarArr[i10] = n0Var2;
        n0Var.f37209b = i4;
        n0Var2.f37209b = i10;
    }
}
