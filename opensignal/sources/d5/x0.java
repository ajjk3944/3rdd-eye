package d5;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f7100c;

    /* renamed from: a, reason: collision with root package name */
    public final long f7101a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7102b;

    static {
        x0 x0Var = new x0(0L, 0L);
        new x0(Long.MAX_VALUE, Long.MAX_VALUE);
        new x0(Long.MAX_VALUE, 0L);
        new x0(0L, Long.MAX_VALUE);
        f7100c = x0Var;
    }

    public x0(long j, long j7) {
        a5.a.e(j >= 0);
        a5.a.e(j7 >= 0);
        this.f7101a = j;
        this.f7102b = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r0 = r11.f7101a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r5 = r11.f7102b
            if (r4 != 0) goto Lf
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            return r12
        Lf:
            int r4 = a5.d0.f105a
            long r7 = r12 - r0
            long r0 = r0 ^ r12
            long r9 = r12 ^ r7
            long r0 = r0 & r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r7 = -9223372036854775808
        L1d:
            long r0 = r12 + r5
            long r9 = r12 ^ r0
            long r4 = r5 ^ r0
            long r4 = r4 & r9
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2d:
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L39
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L39
            r2 = r4
            goto L3a
        L39:
            r2 = r3
        L3a:
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 > 0) goto L43
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L43
            r3 = r4
        L43:
            if (r2 == 0) goto L58
            if (r3 == 0) goto L58
            long r0 = r14 - r12
            long r0 = java.lang.Math.abs(r0)
            long r12 = r16 - r12
            long r12 = java.lang.Math.abs(r12)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 > 0) goto L5d
            goto L5a
        L58:
            if (r2 == 0) goto L5b
        L5a:
            return r14
        L5b:
            if (r3 == 0) goto L5e
        L5d:
            return r16
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.x0.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f7101a == x0Var.f7101a && this.f7102b == x0Var.f7102b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7101a) * 31) + ((int) this.f7102b);
    }
}
