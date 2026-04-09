package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bj1 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final kz2 f;
    public final kz2 g;
    public int h;
    public int i;

    public bj1(kz2 kz2Var, kz2 kz2Var2, boolean z) throws lq1 {
        this.g = kz2Var;
        this.f = kz2Var2;
        this.e = z;
        kz2Var2.E(12);
        this.a = kz2Var2.h();
        kz2Var.E(12);
        this.i = kz2Var.h();
        qb1.y("first_chunk must be 1", kz2Var.b() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        kz2 kz2Var = this.f;
        this.d = z ? kz2Var.j() : kz2Var.P();
        if (this.b == this.h) {
            kz2 kz2Var2 = this.g;
            this.c = kz2Var2.h();
            kz2Var2.G(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + kz2Var2.h() : -1;
        }
        return true;
    }
}
