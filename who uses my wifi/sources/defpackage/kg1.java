package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kg1 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(mf1 mf1Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        mf1Var.u(bArr, 0, 10);
        mf1Var.i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }

    public final void b(jg1 jg1Var, long j, int i, int i2, int i3, ig1 ig1Var) {
        zt0.c0("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                c(jg1Var, ig1Var);
            }
        }
    }

    public final void c(jg1 jg1Var, ig1 ig1Var) {
        if (this.c > 0) {
            jg1Var.c(this.d, this.e, this.f, this.g, ig1Var);
            this.c = 0;
        }
    }
}
