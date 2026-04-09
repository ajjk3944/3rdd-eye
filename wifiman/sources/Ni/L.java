package Ni;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public class L {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f16580b = AtomicIntegerFieldUpdater.newUpdater(L.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    private M[] f16581a;

    private final M[] g() {
        M[] mArr = this.f16581a;
        if (mArr == null) {
            M[] mArr2 = new M[4];
            this.f16581a = mArr2;
            return mArr2;
        }
        if (c() < mArr.length) {
            return mArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(mArr, c() * 2);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        M[] mArr3 = (M[]) objArrCopyOf;
        this.f16581a = mArr3;
        return mArr3;
    }

    private final void k(int i10) {
        f16580b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            Ni.M[] r2 = r5.f16581a
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC6492s.f(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC6492s.f(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC6492s.f(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ni.L.l(int):void");
    }

    private final void m(int i10) {
        while (i10 > 0) {
            M[] mArr = this.f16581a;
            AbstractC6492s.f(mArr);
            int i11 = (i10 - 1) / 2;
            M m10 = mArr[i11];
            AbstractC6492s.f(m10);
            M m11 = mArr[i10];
            AbstractC6492s.f(m11);
            if (((Comparable) m10).compareTo(m11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        M[] mArr = this.f16581a;
        AbstractC6492s.f(mArr);
        M m10 = mArr[i11];
        AbstractC6492s.f(m10);
        M m11 = mArr[i10];
        AbstractC6492s.f(m11);
        mArr[i10] = m10;
        mArr[i11] = m11;
        m10.setIndex(i10);
        m11.setIndex(i11);
    }

    public final void a(M m10) {
        m10.c(this);
        M[] mArrG = g();
        int iC = c();
        k(iC + 1);
        mArrG[iC] = m10;
        m10.setIndex(iC);
        m(iC);
    }

    public final M b() {
        M[] mArr = this.f16581a;
        if (mArr != null) {
            return mArr[0];
        }
        return null;
    }

    public final int c() {
        return f16580b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final M f() {
        M mB;
        synchronized (this) {
            mB = b();
        }
        return mB;
    }

    public final boolean h(M m10) {
        boolean z10;
        synchronized (this) {
            if (m10.b() == null) {
                z10 = false;
            } else {
                i(m10.getIndex());
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
    public final Ni.M i(int r6) {
        /*
            r5 = this;
            Ni.M[] r0 = r5.f16581a
            kotlin.jvm.internal.AbstractC6492s.f(r0)
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
            kotlin.jvm.internal.AbstractC6492s.f(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.AbstractC6492s.f(r4)
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
            kotlin.jvm.internal.AbstractC6492s.f(r6)
            r1 = 0
            r6.c(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ni.L.i(int):Ni.M");
    }

    public final M j() {
        M mI;
        synchronized (this) {
            mI = c() > 0 ? i(0) : null;
        }
        return mI;
    }
}
