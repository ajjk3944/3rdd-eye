package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xt0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public xt0 f;
    public xt0 g;

    public xt0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final xt0 a() {
        xt0 xt0Var = this.f;
        xt0 xt0Var2 = xt0Var != this ? xt0Var : null;
        xt0 xt0Var3 = this.g;
        xt0Var3.f = xt0Var;
        this.f.g = xt0Var3;
        this.f = null;
        this.g = null;
        return xt0Var2;
    }

    public final void b(xt0 xt0Var) {
        xt0Var.g = this;
        xt0Var.f = this.f;
        this.f.g = xt0Var;
        this.f = xt0Var;
    }

    public final xt0 c() {
        this.d = true;
        return new xt0(this.a, this.b, this.c);
    }

    public final void d(xt0 xt0Var, int i) {
        boolean z = xt0Var.e;
        byte[] bArr = xt0Var.a;
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i2 = xt0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (xt0Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = xt0Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            xt0Var.c -= xt0Var.b;
            xt0Var.b = 0;
        }
        System.arraycopy(this.a, this.b, bArr, xt0Var.c, i);
        xt0Var.c += i;
        this.b += i;
    }

    public xt0(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }
}
