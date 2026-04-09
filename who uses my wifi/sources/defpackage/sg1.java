package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sg1 {
    public final rg1 a;
    public final jg1 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public sg1(int i, rg1 rg1Var, jg1 jg1Var) {
        int i2 = rg1Var.d;
        this.a = rg1Var;
        int iB = rg1Var.b();
        boolean z = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z = false;
            }
        }
        zt0.D(z);
        int i3 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.c = (iB == 2 ? 1667497984 : 1651965952) | i3;
        this.e = v23.t(i2, rg1Var.b * 1000000, rg1Var.c, RoundingMode.DOWN);
        this.b = jg1Var;
        this.d = iB == 2 ? 1650720768 | i3 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final bg1 a(long j) {
        if (this.k == 0) {
            dg1 dg1Var = new dg1(0L, this.l);
            return new bg1(dg1Var, dg1Var);
        }
        int i = (int) (j / ((this.e * 1) / this.f));
        int iO = v23.o(this.n, i, true, true);
        if (this.n[iO] == i) {
            dg1 dg1VarB = b(iO);
            return new bg1(dg1VarB, dg1VarB);
        }
        dg1 dg1VarB2 = b(iO);
        int i2 = iO + 1;
        return i2 < this.m.length ? new bg1(dg1VarB2, b(i2)) : new bg1(dg1VarB2, dg1VarB2);
    }

    public final dg1 b(int i) {
        return new dg1(((this.e * 1) / this.f) * this.n[i], this.m[i]);
    }
}
