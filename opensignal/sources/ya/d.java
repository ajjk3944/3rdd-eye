package ya;

import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* loaded from: classes.dex */
public final class d implements t, s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26042a;

    /* renamed from: d, reason: collision with root package name */
    public s f26043d;

    /* renamed from: g, reason: collision with root package name */
    public c[] f26044g = new c[0];

    /* renamed from: r, reason: collision with root package name */
    public long f26045r = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f26046x;

    public d(t tVar, long j) {
        this.f26042a = tVar;
        this.f26046x = j;
    }

    public final boolean a() {
        return this.f26045r != -9223372036854775807L;
    }

    @Override // ya.s
    public final void b(t tVar) {
        s sVar = this.f26043d;
        sVar.getClass();
        sVar.b(this);
    }

    @Override // ya.t0
    public final void c(u0 u0Var) {
        s sVar = this.f26043d;
        sVar.getClass();
        sVar.c(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.u0] */
    @Override // ya.u0
    public final long d() {
        long jD = this.f26042a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.f26046x;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    public final void e() {
        this.f26042a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f26045r = r0
            ya.c[] r0 = r5.f26044g
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f26040d = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            java.lang.Object r0 = r5.f26042a
            long r0 = r0.f(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            r6 = 0
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f26046x
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            qb.b.j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.f(long):long");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    public final void g(long j) {
        this.f26042a.g(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.u0] */
    @Override // ya.u0
    public final boolean i(long j) {
        return this.f26042a.i(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.u0] */
    @Override // ya.u0
    public final boolean isLoading() {
        return this.f26042a.isLoading();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    public final long k() {
        if (a()) {
            long j = this.f26045r;
            this.f26045r = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.f26042a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        qb.b.j(jK2 >= 0);
        long j7 = this.f26046x;
        qb.b.j(j7 == Long.MIN_VALUE || jK2 <= j7);
        return jK2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    public final TrackGroupArray l() {
        return this.f26042a.l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.u0] */
    @Override // ya.u0
    public final long m() {
        long jM = this.f26042a.m();
        if (jM != Long.MIN_VALUE) {
            long j = this.f26046x;
            if (j == Long.MIN_VALUE || jM < j) {
                return jM;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ya.u0] */
    @Override // ya.u0
    public final void o(long j) {
        this.f26042a.o(j);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        if (j == 0) {
            return 0L;
        }
        long j7 = qb.v.j(n1Var.f4341a, 0L, j);
        long j10 = n1Var.f4342b;
        long j11 = this.f26046x;
        long j12 = qb.v.j(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j);
        if (j7 != n1Var.f4341a || j12 != n1Var.f4342b) {
            n1Var = new n1(j7, j12);
        }
        return this.f26042a.p(j, n1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long s(ob.f[] r10, boolean[] r11, ya.s0[] r12, boolean[] r13, long r14) {
        /*
            r9 = this;
            int r0 = r12.length
            ya.c[] r0 = new ya.c[r0]
            r9.f26044g = r0
            int r0 = r12.length
            ya.s0[] r4 = new ya.s0[r0]
            r0 = 0
            r1 = r0
        La:
            int r2 = r12.length
            r8 = 0
            if (r1 >= r2) goto L1f
            ya.c[] r2 = r9.f26044g
            r3 = r12[r1]
            ya.c r3 = (ya.c) r3
            r2[r1] = r3
            if (r3 == 0) goto L1a
            ya.s0 r8 = r3.f26039a
        L1a:
            r4[r1] = r8
            int r1 = r1 + 1
            goto La
        L1f:
            java.lang.Object r1 = r9.f26042a
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            long r10 = r1.s(r2, r3, r4, r5, r6)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9.f26045r = r13
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 == 0) goto L49
            r13 = 0
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 < 0) goto L47
            long r13 = r9.f26046x
            r1 = -9223372036854775808
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 == 0) goto L49
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 > 0) goto L47
            goto L49
        L47:
            r13 = r0
            goto L4a
        L49:
            r13 = 1
        L4a:
            qb.b.j(r13)
        L4d:
            int r13 = r12.length
            if (r0 >= r13) goto L73
            r13 = r4[r0]
            if (r13 != 0) goto L59
            ya.c[] r13 = r9.f26044g
            r13[r0] = r8
            goto L6a
        L59:
            ya.c[] r14 = r9.f26044g
            r15 = r14[r0]
            if (r15 == 0) goto L63
            ya.s0 r15 = r15.f26039a
            if (r15 == r13) goto L6a
        L63:
            ya.c r15 = new ya.c
            r15.<init>(r9, r13)
            r14[r0] = r15
        L6a:
            ya.c[] r13 = r9.f26044g
            r13 = r13[r0]
            r12[r0] = r13
            int r0 = r0 + 1
            goto L4d
        L73:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.s(ob.f[], boolean[], ya.s0[], boolean[], long):long");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ya.t] */
    @Override // ya.t
    public final void u(s sVar, long j) {
        this.f26043d = sVar;
        this.f26042a.u(this, j);
    }
}
