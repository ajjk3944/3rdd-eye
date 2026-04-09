package vu;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f23975a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f23976b = new int[10];

    public final int a() {
        if ((this.f23975a & 128) != 0) {
            return this.f23976b[7];
        }
        return 65535;
    }

    public final void b(c0 c0Var) {
        br.l.e(c0Var, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & c0Var.f23975a) != 0) {
                c(i10, c0Var.f23976b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f23976b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f23975a = (1 << i10) | this.f23975a;
            iArr[i10] = i11;
        }
    }
}
