package bu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wt.h0;
import wt.i0;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2992b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public h0[] f2993a;

    public final void a(h0 h0Var) {
        h0Var.d((i0) this);
        h0[] h0VarArr = this.f2993a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2992b;
        if (h0VarArr == null) {
            h0VarArr = new h0[4];
            this.f2993a = h0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= h0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(h0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            br.l.d(objArrCopyOf, "copyOf(...)");
            h0VarArr = (h0[]) objArrCopyOf;
            this.f2993a = h0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        h0VarArr[i10] = h0Var;
        h0Var.f24623d = i10;
        c(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wt.h0 b(int r9) {
        /*
            r8 = this;
            wt.h0[] r0 = r8.f2993a
            br.l.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = bu.v.f2992b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            br.l.b(r4)
            r5 = r0[r2]
            br.l.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            wt.h0[] r5 = r8.f2993a
            br.l.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            br.l.b(r6)
            r7 = r5[r4]
            br.l.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            br.l.b(r4)
            r5 = r5[r2]
            br.l.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            br.l.b(r9)
            r2 = 0
            r9.d(r2)
            r9.f24623d = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.v.b(int):wt.h0");
    }

    public final void c(int i10) {
        while (i10 > 0) {
            h0[] h0VarArr = this.f2993a;
            br.l.b(h0VarArr);
            int i11 = (i10 - 1) / 2;
            h0 h0Var = h0VarArr[i11];
            br.l.b(h0Var);
            h0 h0Var2 = h0VarArr[i10];
            br.l.b(h0Var2);
            if (h0Var.compareTo(h0Var2) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        h0[] h0VarArr = this.f2993a;
        br.l.b(h0VarArr);
        h0 h0Var = h0VarArr[i11];
        br.l.b(h0Var);
        h0 h0Var2 = h0VarArr[i10];
        br.l.b(h0Var2);
        h0VarArr[i10] = h0Var;
        h0VarArr[i11] = h0Var2;
        h0Var.f24623d = i10;
        h0Var2.f24623d = i11;
    }
}
