package o5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c1 extends androidx.media3.common.a1 {
    public static final Object J = new Object();
    public final long B;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final Object G;
    public final androidx.media3.common.e0 H;
    public final androidx.media3.common.z I;

    /* renamed from: d, reason: collision with root package name */
    public final long f18902d;

    /* renamed from: g, reason: collision with root package name */
    public final long f18903g;

    /* renamed from: r, reason: collision with root package name */
    public final long f18904r;

    /* renamed from: x, reason: collision with root package name */
    public final long f18905x;

    /* renamed from: y, reason: collision with root package name */
    public final long f18906y;

    static {
        androidx.media3.common.v vVar = new androidx.media3.common.v();
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        List list = Collections.EMPTY_LIST;
        oe.u0 u0Var2 = oe.u0.f19383x;
        androidx.media3.common.c0 c0Var = androidx.media3.common.c0.f1577g;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new androidx.media3.common.b0(uri, null, null, list, u0Var2);
        }
        new androidx.media3.common.x(vVar);
        androidx.media3.common.g0 g0Var = androidx.media3.common.g0.f1655e0;
    }

    public c1(long j, long j7, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, j5.j jVar, androidx.media3.common.e0 e0Var, androidx.media3.common.z zVar) {
        this.f18902d = j;
        this.f18903g = j7;
        this.f18904r = j10;
        this.f18905x = j11;
        this.f18906y = j12;
        this.B = j13;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = jVar;
        e0Var.getClass();
        this.H = e0Var;
        this.I = zVar;
    }

    @Override // androidx.media3.common.a1
    public final int b(Object obj) {
        return J.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.a1
    public final androidx.media3.common.y0 f(int i10, androidx.media3.common.y0 y0Var, boolean z10) {
        a5.a.g(i10, 1);
        Object obj = z10 ? J : null;
        long j = -this.f18906y;
        y0Var.getClass();
        y0Var.h(null, obj, 0, this.f18904r, j, androidx.media3.common.b.f1565y, false);
        return y0Var;
    }

    @Override // androidx.media3.common.a1
    public final int h() {
        return 1;
    }

    @Override // androidx.media3.common.a1
    public final Object l(int i10) {
        a5.a.g(i10, 1);
        return J;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.common.z0 m(int r25, androidx.media3.common.z0 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            a5.a.g(r2, r1)
            long r1 = r0.B
            boolean r14 = r0.E
            if (r14 == 0) goto L2d
            boolean r3 = r0.F
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f18905x
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = androidx.media3.common.z0.N
            r21 = 0
            long r1 = r0.f18906y
            androidx.media3.common.e0 r5 = r0.H
            java.lang.Object r6 = r0.G
            long r7 = r0.f18902d
            long r9 = r0.f18903g
            boolean r13 = r0.D
            androidx.media3.common.z r15 = r0.I
            long r11 = r0.f18905x
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c1.m(int, androidx.media3.common.z0, long):androidx.media3.common.z0");
    }

    @Override // androidx.media3.common.a1
    public final int o() {
        return 1;
    }
}
