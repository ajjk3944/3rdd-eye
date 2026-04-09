package ya;

import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* loaded from: classes.dex */
public final class d0 implements t, s {

    /* renamed from: a, reason: collision with root package name */
    public final t f26047a;

    /* renamed from: d, reason: collision with root package name */
    public final long f26048d;

    /* renamed from: g, reason: collision with root package name */
    public s f26049g;

    public d0(t tVar, long j) {
        this.f26047a = tVar;
        this.f26048d = j;
    }

    @Override // ya.s
    public final void b(t tVar) {
        s sVar = this.f26049g;
        sVar.getClass();
        sVar.b(this);
    }

    @Override // ya.t0
    public final void c(u0 u0Var) {
        s sVar = this.f26049g;
        sVar.getClass();
        sVar.c(this);
    }

    @Override // ya.u0
    public final long d() {
        long jD = this.f26047a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f26048d;
    }

    @Override // ya.t
    public final void e() {
        this.f26047a.e();
    }

    @Override // ya.t
    public final long f(long j) {
        long j7 = this.f26048d;
        return this.f26047a.f(j - j7) + j7;
    }

    @Override // ya.t
    public final void g(long j) {
        this.f26047a.g(j - this.f26048d);
    }

    @Override // ya.u0
    public final boolean i(long j) {
        return this.f26047a.i(j - this.f26048d);
    }

    @Override // ya.u0
    public final boolean isLoading() {
        return this.f26047a.isLoading();
    }

    @Override // ya.t
    public final long k() {
        long jK = this.f26047a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.f26048d;
    }

    @Override // ya.t
    public final TrackGroupArray l() {
        return this.f26047a.l();
    }

    @Override // ya.u0
    public final long m() {
        long jM = this.f26047a.m();
        if (jM == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jM + this.f26048d;
    }

    @Override // ya.u0
    public final void o(long j) {
        this.f26047a.o(j - this.f26048d);
    }

    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        long j7 = this.f26048d;
        return this.f26047a.p(j - j7, n1Var) + j7;
    }

    @Override // ya.t
    public final long s(ob.f[] fVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j) {
        s0[] s0VarArr2 = new s0[s0VarArr.length];
        int i10 = 0;
        while (true) {
            s0 s0Var = null;
            if (i10 >= s0VarArr.length) {
                break;
            }
            e0 e0Var = (e0) s0VarArr[i10];
            if (e0Var != null) {
                s0Var = e0Var.f26052a;
            }
            s0VarArr2[i10] = s0Var;
            i10++;
        }
        t tVar = this.f26047a;
        long j7 = this.f26048d;
        long jS = tVar.s(fVarArr, zArr, s0VarArr2, zArr2, j - j7);
        for (int i11 = 0; i11 < s0VarArr.length; i11++) {
            s0 s0Var2 = s0VarArr2[i11];
            if (s0Var2 == null) {
                s0VarArr[i11] = null;
            } else {
                s0 s0Var3 = s0VarArr[i11];
                if (s0Var3 == null || ((e0) s0Var3).f26052a != s0Var2) {
                    s0VarArr[i11] = new e0(s0Var2, j7);
                }
            }
        }
        return jS + j7;
    }

    @Override // ya.t
    public final void u(s sVar, long j) {
        this.f26049g = sVar;
        this.f26047a.u(this, j - this.f26048d);
    }
}
