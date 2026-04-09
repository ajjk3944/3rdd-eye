package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22532b = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public i0[] f22533a;

    public final void a(i0 i0Var) {
        i0Var.a(this);
        i0[] i0VarArrG = g();
        int iC = c();
        k(iC + 1);
        i0VarArrG[iC] = i0Var;
        i0Var.setIndex(iC);
        m(iC);
    }

    public final i0 b() {
        i0[] i0VarArr = this.f22533a;
        if (i0VarArr != null) {
            return i0VarArr[0];
        }
        return null;
    }

    public final int c() {
        return f22532b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final i0 f() {
        i0 i0VarB;
        synchronized (this) {
            i0VarB = b();
        }
        return i0VarB;
    }

    public final i0[] g() {
        i0[] i0VarArr = this.f22533a;
        if (i0VarArr == null) {
            i0[] i0VarArr2 = new i0[4];
            this.f22533a = i0VarArr2;
            return i0VarArr2;
        }
        if (c() < i0VarArr.length) {
            return i0VarArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(i0VarArr, c() * 2);
        kotlin.jvm.internal.p.d(objArrCopyOf, "copyOf(...)");
        i0[] i0VarArr3 = (i0[]) objArrCopyOf;
        this.f22533a = i0VarArr3;
        return i0VarArr3;
    }

    public final boolean h(i0 i0Var) {
        boolean z10;
        synchronized (this) {
            if (i0Var.c() == null) {
                z10 = false;
            } else {
                i(i0Var.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.i0 i(int r6) {
        /*
            r5 = this;
            kotlinx.coroutines.internal.i0[] r0 = r5.f22533a
            kotlin.jvm.internal.p.b(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.p.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.p.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.p.b(r6)
            r1 = 0
            r6.a(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.h0.i(int):kotlinx.coroutines.internal.i0");
    }

    public final i0 j() {
        i0 i0VarI;
        synchronized (this) {
            i0VarI = c() > 0 ? i(0) : null;
        }
        return i0VarI;
    }

    public final void k(int i10) {
        f22532b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            kotlinx.coroutines.internal.i0[] r2 = r5.f22533a
            kotlin.jvm.internal.p.b(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.p.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.p.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.p.b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.p.b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.h0.l(int):void");
    }

    public final void m(int i10) {
        while (i10 > 0) {
            i0[] i0VarArr = this.f22533a;
            kotlin.jvm.internal.p.b(i0VarArr);
            int i11 = (i10 - 1) / 2;
            i0 i0Var = i0VarArr[i11];
            kotlin.jvm.internal.p.b(i0Var);
            i0 i0Var2 = i0VarArr[i10];
            kotlin.jvm.internal.p.b(i0Var2);
            if (((Comparable) i0Var).compareTo(i0Var2) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int i11) {
        i0[] i0VarArr = this.f22533a;
        kotlin.jvm.internal.p.b(i0VarArr);
        i0 i0Var = i0VarArr[i11];
        kotlin.jvm.internal.p.b(i0Var);
        i0 i0Var2 = i0VarArr[i10];
        kotlin.jvm.internal.p.b(i0Var2);
        i0VarArr[i10] = i0Var;
        i0VarArr[i11] = i0Var2;
        i0Var.setIndex(i10);
        i0Var2.setIndex(i11);
    }
}
