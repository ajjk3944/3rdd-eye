package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gn1 implements lf1 {
    public final List a;
    public final kz2 b = new kz2(0, new byte[9400]);
    public final SparseIntArray c;
    public final dm1 d;
    public final us0 e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final xm1 i;
    public zg1 j;
    public nf1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;

    static {
        int i = pu1.u;
    }

    public gn1(us0 us0Var, x13 x13Var, dm1 dm1Var) {
        this.d = dm1Var;
        this.e = us0Var;
        this.a = Collections.singletonList(x13Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.c = new SparseIntArray();
        this.i = new xm1(1);
        this.k = nf1.d;
        this.o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f.put(sparseArray2.keyAt(i), (jn1) sparseArray2.valueAt(i));
        }
        SparseArray sparseArray3 = this.f;
        l92 l92Var = new l92();
        l92Var.g = this;
        l92Var.f = new lg1(4, new byte[4]);
        sparseArray3.put(0, new bn1(l92Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.mf1 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            kz2 r0 = r6.b
            byte[] r0 = r0.a
            df1 r7 = (defpackage.df1) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.B(r0, r2, r1, r2)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.c(r1, r2)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn1.b(mf1):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0282  */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r27, defpackage.pf1 r28) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn1.c(mf1, pf1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.a
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L38
            java.lang.Object r4 = r10.get(r1)
            x13 r4 = (defpackage.x13) r4
            monitor-enter(r4)
            long r5 = r4.b     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.a()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.b(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r10
        L38:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L43
            zg1 r10 = r9.j
            if (r10 == 0) goto L43
            r10.a(r12)
        L43:
            kz2 r10 = r9.b
            r10.y(r0)
            android.util.SparseIntArray r10 = r9.c
            r10.clear()
        L4d:
            android.util.SparseArray r10 = r9.f
            int r11 = r10.size()
            if (r0 >= r11) goto L61
            java.lang.Object r10 = r10.valueAt(r0)
            jn1 r10 = (defpackage.jn1) r10
            r10.d()
            int r0 = r0 + 1
            goto L4d
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn1.e(long, long):void");
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.k = new rl(nf1Var, this.e);
    }
}
