package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mf2 implements lb4 {
    public final vj4 a = new vj4();
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // defpackage.lb4
    public final boolean a(kb4 kb4Var) {
        int i;
        long j = kb4Var.d;
        boolean z = true;
        char c = j > this.c ? (char) 0 : j < this.b ? (char) 2 : (char) 1;
        vj4 vj4Var = this.a;
        synchronized (vj4Var) {
            i = vj4Var.g * 65536;
        }
        int i2 = this.f;
        if (c != 2 && (c != 1 || !this.g || i >= i2)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // defpackage.lb4
    public final void b(kb4 kb4Var, nj4[] nj4VarArr) {
        int i;
        this.f = 0;
        for (nj4 nj4Var : nj4VarArr) {
            if (nj4Var != null) {
                int i2 = this.f;
                int i3 = nj4Var.a().c;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f = i2 + i;
            }
        }
        this.a.c(this.f);
    }

    @Override // defpackage.lb4
    public final long c() {
        return 0L;
    }

    @Override // defpackage.lb4
    public final void d(xd4 xd4Var) {
        this.f = 0;
        this.g = false;
    }

    @Override // defpackage.lb4
    public final void e(xd4 xd4Var) {
        this.f = 0;
        this.g = false;
        vj4 vj4Var = this.a;
        synchronized (vj4Var) {
            vj4Var.c(0);
        }
    }

    @Override // defpackage.lb4
    public final boolean f(kb4 kb4Var) {
        long j = kb4Var.f ? this.e : this.d;
        return j <= 0 || kb4Var.d >= j;
    }

    @Override // defpackage.lb4
    public final void h(xd4 xd4Var) {
        this.f = 0;
        this.g = false;
        vj4 vj4Var = this.a;
        synchronized (vj4Var) {
            vj4Var.c(0);
        }
    }

    @Override // defpackage.lb4
    public final rj4 i(xd4 xd4Var) {
        return this.a;
    }
}
