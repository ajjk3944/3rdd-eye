package o5;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: g, reason: collision with root package name */
    public final long f18918g;

    /* renamed from: r, reason: collision with root package name */
    public final long f18919r;

    /* renamed from: x, reason: collision with root package name */
    public final long f18920x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f18921y;

    public e(androidx.media3.common.a1 a1Var, long j, long j7) throws f {
        super(a1Var);
        boolean z10 = false;
        if (a1Var.h() != 1) {
            throw new f(0);
        }
        androidx.media3.common.z0 z0VarM = a1Var.m(0, new androidx.media3.common.z0(), 0L);
        long jMax = Math.max(0L, j);
        if (!z0VarM.H && jMax != 0 && !z0VarM.D) {
            throw new f(1);
        }
        long jMax2 = j7 == Long.MIN_VALUE ? z0VarM.J : Math.max(0L, j7);
        long j10 = z0VarM.J;
        if (j10 != -9223372036854775807L) {
            jMax2 = jMax2 > j10 ? j10 : jMax2;
            if (jMax > jMax2) {
                throw new f(2);
            }
        }
        this.f18918g = jMax;
        this.f18919r = jMax2;
        this.f18920x = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (z0VarM.E && (jMax2 == -9223372036854775807L || (j10 != -9223372036854775807L && jMax2 == j10))) {
            z10 = true;
        }
        this.f18921y = z10;
    }

    @Override // o5.o, androidx.media3.common.a1
    public final androidx.media3.common.y0 f(int i10, androidx.media3.common.y0 y0Var, boolean z10) {
        this.f19002d.f(0, y0Var, z10);
        long j = y0Var.f1831x - this.f18918g;
        long j7 = this.f18920x;
        y0Var.h(y0Var.f1827a, y0Var.f1828d, 0, j7 != -9223372036854775807L ? j7 - j : -9223372036854775807L, j, androidx.media3.common.b.f1565y, false);
        return y0Var;
    }

    @Override // o5.o, androidx.media3.common.a1
    public final androidx.media3.common.z0 m(int i10, androidx.media3.common.z0 z0Var, long j) {
        this.f19002d.m(0, z0Var, 0L);
        long j7 = z0Var.M;
        long j10 = this.f18918g;
        z0Var.M = j7 + j10;
        z0Var.J = this.f18920x;
        z0Var.E = this.f18921y;
        long j11 = z0Var.I;
        if (j11 != -9223372036854775807L) {
            long jMax = Math.max(j11, j10);
            z0Var.I = jMax;
            long j12 = this.f18919r;
            if (j12 != -9223372036854775807L) {
                jMax = Math.min(jMax, j12);
            }
            z0Var.I = jMax - j10;
        }
        long jP = a5.d0.P(j10);
        long j13 = z0Var.f1846x;
        if (j13 != -9223372036854775807L) {
            z0Var.f1846x = j13 + jP;
        }
        long j14 = z0Var.f1847y;
        if (j14 != -9223372036854775807L) {
            z0Var.f1847y = j14 + jP;
        }
        return z0Var;
    }
}
