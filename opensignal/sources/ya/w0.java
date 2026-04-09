package ya;

import android.net.Uri;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w0 extends w1 {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f26185n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f26186b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26187c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26188d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26189e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26190f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26191g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26192h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26193i;
    public final boolean j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.android.exoplayer2.n0 f26194l;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.exoplayer2.l0 f26195m;

    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        com.google.android.exoplayer2.p0 p0Var = com.google.android.exoplayer2.p0.f4365s;
    }

    public w0(long j, long j7, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, com.google.android.exoplayer2.source.hls.l lVar, com.google.android.exoplayer2.n0 n0Var, com.google.android.exoplayer2.l0 l0Var) {
        this.f26186b = j;
        this.f26187c = j7;
        this.f26188d = j10;
        this.f26189e = j11;
        this.f26190f = j12;
        this.f26191g = j13;
        this.f26192h = z10;
        this.f26193i = z11;
        this.j = z12;
        this.k = lVar;
        n0Var.getClass();
        this.f26194l = n0Var;
        this.f26195m = l0Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int b(Object obj) {
        return f26185n.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final u1 f(int i10, u1 u1Var, boolean z10) {
        qb.b.i(i10, 1);
        Object obj = z10 ? f26185n : null;
        long j = -this.f26190f;
        u1Var.getClass();
        za.b bVar = za.b.f26804c;
        u1Var.f4594a = null;
        u1Var.f4595b = obj;
        u1Var.f4596c = 0;
        u1Var.f4597d = this.f26188d;
        u1Var.f4598e = j;
        u1Var.f4600g = bVar;
        u1Var.f4599f = false;
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final Object l(int i10) {
        qb.b.i(i10, 1);
        return f26185n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.v1 m(int r23, com.google.android.exoplayer2.v1 r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            qb.b.i(r2, r1)
            long r1 = r0.f26191g
            boolean r13 = r0.f26193i
            if (r13 == 0) goto L2c
            boolean r3 = r0.j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f26189e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = com.google.android.exoplayer2.v1.f4738r
            r19 = 0
            long r1 = r0.f26190f
            com.google.android.exoplayer2.n0 r4 = r0.f26194l
            java.lang.Object r5 = r0.k
            long r6 = r0.f26186b
            long r8 = r0.f26187c
            boolean r12 = r0.f26192h
            com.google.android.exoplayer2.l0 r14 = r0.f26195m
            long r10 = r0.f26189e
            r3 = r24
            r20 = r1
            r17 = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.w0.m(int, com.google.android.exoplayer2.v1, long):com.google.android.exoplayer2.v1");
    }

    @Override // com.google.android.exoplayer2.w1
    public final int o() {
        return 1;
    }
}
