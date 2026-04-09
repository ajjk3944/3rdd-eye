package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pk0 implements gx0 {
    public final ec f;
    public final ac g;
    public xt0 h;
    public int i;
    public boolean j;
    public long k;

    public pk0(ec ecVar) {
        this.f = ecVar;
        ac acVarB = ecVar.b();
        this.g = acVarB;
        xt0 xt0Var = acVarB.f;
        this.h = xt0Var;
        this.i = xt0Var != null ? xt0Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
    }

    @Override // defpackage.gx0
    public final long e(ac acVar, long j) {
        xt0 xt0Var;
        xt0 xt0Var2;
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        xt0 xt0Var3 = this.h;
        ac acVar2 = this.g;
        if (xt0Var3 != null && (xt0Var3 != (xt0Var2 = acVar2.f) || this.i != xt0Var2.b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (!this.f.d(this.k + 1)) {
            return -1L;
        }
        if (this.h == null && (xt0Var = acVar2.f) != null) {
            this.h = xt0Var;
            this.i = xt0Var.b;
        }
        long jMin = Math.min(8192L, acVar2.g - this.k);
        long j2 = this.k;
        j41.a(acVar2.g, j2, jMin);
        if (jMin != 0) {
            acVar.g += jMin;
            xt0 xt0Var4 = acVar2.f;
            while (true) {
                long j3 = xt0Var4.c - xt0Var4.b;
                if (j2 < j3) {
                    break;
                }
                j2 -= j3;
                xt0Var4 = xt0Var4.f;
            }
            long j4 = jMin;
            while (j4 > 0) {
                xt0 xt0VarC = xt0Var4.c();
                int i = (int) (xt0VarC.b + j2);
                xt0VarC.b = i;
                xt0VarC.c = Math.min(i + ((int) j4), xt0VarC.c);
                xt0 xt0Var5 = acVar.f;
                if (xt0Var5 == null) {
                    xt0VarC.g = xt0VarC;
                    xt0VarC.f = xt0VarC;
                    acVar.f = xt0VarC;
                } else {
                    xt0Var5.g.b(xt0VarC);
                }
                j4 -= xt0VarC.c - xt0VarC.b;
                xt0Var4 = xt0Var4.f;
                j2 = 0;
            }
        }
        this.k += jMin;
        return jMin;
    }
}
