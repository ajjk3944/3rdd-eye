package ag;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* renamed from: ag.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC3850h extends m {

    /* renamed from: f, reason: collision with root package name */
    private static final BigInteger f26255f = BigInteger.valueOf(2147483647L);

    /* renamed from: c, reason: collision with root package name */
    protected boolean f26256c;

    /* renamed from: d, reason: collision with root package name */
    protected BigInteger f26257d = BigInteger.ZERO;

    /* renamed from: e, reason: collision with root package name */
    protected long f26258e;

    AbstractC3850h() {
    }

    @Override // ag.m
    boolean d(Iterator it, Consumer consumer) {
        if (!this.f26256c) {
            return super.d(it, consumer);
        }
        try {
            Object next = it.next();
            this.f26257d = this.f26257d.add(BigInteger.ONE);
            consumer.accept(next);
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void e(java.util.Iterator r11, java.util.function.Consumer r12, java.math.BigInteger r13) {
        /*
            r10 = this;
            java.math.BigInteger r0 = r10.f26257d
            int r0 = r0.signum()
            if (r0 <= 0) goto Le
            java.math.BigInteger r0 = r10.f26257d
            java.math.BigInteger r13 = r13.subtract(r0)
        Le:
            java.math.BigInteger r0 = ag.AbstractC3850h.f26255f
            int r0 = r13.compareTo(r0)
            r1 = 0
            if (r0 < 0) goto L1a
            r0 = 1
            r2 = r1
            goto L20
        L1a:
            int r0 = r13.intValue()
            r2 = r0
            r0 = r1
        L20:
            r3 = 0
            if (r0 != 0) goto L2e
            long r5 = r10.f26258e     // Catch: java.lang.Throwable -> L2c
            long r7 = (long) r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L75
            goto L2e
        L2c:
            r11 = move-exception
            goto L60
        L2e:
            java.lang.Object r5 = r11.next()     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            long r6 = r10.f26258e     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            r8 = 1
            long r6 = r6 + r8
            r10.f26258e = r6     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L5c
            r10.f26258e = r3     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            java.math.BigInteger r6 = r10.f26257d     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            java.math.BigInteger r7 = ag.AbstractC3850h.f26255f     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            java.math.BigInteger r6 = r6.add(r7)     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            r10.f26257d = r6     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            java.math.BigInteger r13 = r13.subtract(r7)     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            int r6 = r13.compareTo(r7)     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            if (r6 >= 0) goto L5c
            int r0 = r13.intValue()     // Catch: java.lang.Throwable -> L2c java.util.NoSuchElementException -> L75
            r2 = r0
            r0 = r1
        L5c:
            r12.accept(r5)     // Catch: java.lang.Throwable -> L2c
            goto L20
        L60:
            long r12 = r10.f26258e
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L74
            java.math.BigInteger r0 = r10.f26257d
            java.math.BigInteger r12 = java.math.BigInteger.valueOf(r12)
            java.math.BigInteger r12 = r0.add(r12)
            r10.f26257d = r12
            r10.f26258e = r3
        L74:
            throw r11
        L75:
            long r11 = r10.f26258e
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L89
            java.math.BigInteger r13 = r10.f26257d
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r11)
            java.math.BigInteger r11 = r13.add(r11)
            r10.f26257d = r11
            r10.f26258e = r3
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.AbstractC3850h.e(java.util.Iterator, java.util.function.Consumer, java.math.BigInteger):void");
    }
}
