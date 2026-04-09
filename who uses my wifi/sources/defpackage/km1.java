package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class km1 {
    public final jg1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public km1(jg1 jg1Var) {
        this.a = jg1Var;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i, long j, boolean z) {
        zt0.b0(this.h != -9223372036854775807L);
        if (this.e == 182 && z && this.b) {
            long j2 = j - this.g;
            this.a.c(this.h, this.d ? 1 : 0, (int) j2, i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
