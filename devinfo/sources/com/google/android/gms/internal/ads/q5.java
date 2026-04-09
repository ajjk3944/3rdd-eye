package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f15206a;

    /* renamed from: d, reason: collision with root package name */
    public d6 f15209d;

    /* renamed from: e, reason: collision with root package name */
    public n5 f15210e;

    /* renamed from: f, reason: collision with root package name */
    public int f15211f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f15212h;

    /* renamed from: i, reason: collision with root package name */
    public int f15213i;
    public final mx1 j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15216m;

    /* renamed from: b, reason: collision with root package name */
    public final c6 f15207b = new c6();

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f15208c = new sk0();

    /* renamed from: k, reason: collision with root package name */
    public final sk0 f15214k = new sk0(1);

    /* renamed from: l, reason: collision with root package name */
    public final sk0 f15215l = new sk0();

    public q5(u2 u2Var, d6 d6Var, n5 n5Var, mx1 mx1Var) {
        this.f15206a = u2Var;
        this.f15209d = d6Var;
        this.f15210e = n5Var;
        this.j = mx1Var;
        this.f15209d = d6Var;
        this.f15210e = n5Var;
        u2Var.f(mx1Var);
        a();
    }

    public final void a() {
        c6 c6Var = this.f15207b;
        c6Var.f9985d = 0;
        c6Var.f9995p = 0L;
        c6Var.f9996q = false;
        c6Var.f9990k = false;
        c6Var.f9994o = false;
        c6Var.f9992m = null;
        this.f15211f = 0;
        this.f15212h = 0;
        this.g = 0;
        this.f15213i = 0;
        this.f15216m = false;
    }

    public final int b() {
        int i4 = !this.f15216m ? this.f15209d.g[this.f15211f] : this.f15207b.j[this.f15211f] ? 1 : 0;
        return e() != null ? i4 | 1073741824 : i4;
    }

    public final boolean c() {
        this.f15211f++;
        if (!this.f15216m) {
            return false;
        }
        int i4 = this.g + 1;
        this.g = i4;
        int[] iArr = this.f15207b.g;
        int i10 = this.f15212h;
        if (i4 != iArr[i10]) {
            return true;
        }
        this.f15212h = i10 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i4, int i10) {
        sk0 sk0Var;
        b6 b6VarE = e();
        if (b6VarE == null) {
            return 0;
        }
        int length = b6VarE.f9600d;
        c6 c6Var = this.f15207b;
        if (length != 0) {
            sk0Var = c6Var.f9993n;
        } else {
            byte[] bArr = b6VarE.f9601e;
            String str = bq0.f9768a;
            length = bArr.length;
            sk0 sk0Var2 = this.f15215l;
            sk0Var2.z(length, bArr);
            sk0Var = sk0Var2;
        }
        boolean z3 = c6Var.f9990k && c6Var.f9991l[this.f15211f];
        boolean z10 = z3 || i10 != 0;
        int i11 = true != z10 ? 0 : 128;
        sk0 sk0Var3 = this.f15214k;
        sk0Var3.f16446a[0] = (byte) (i11 | length);
        sk0Var3.E(0);
        u2 u2Var = this.f15206a;
        u2Var.c(sk0Var3, 1, 1);
        u2Var.c(sk0Var, length, 1);
        if (!z10) {
            return length + 1;
        }
        sk0 sk0Var4 = this.f15208c;
        if (!z3) {
            sk0Var4.y(8);
            byte[] bArr2 = sk0Var4.f16446a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i10;
            bArr2[4] = (byte) ((i4 >> 24) & 255);
            bArr2[5] = (byte) ((i4 >> 16) & 255);
            bArr2[6] = (byte) ((i4 >> 8) & 255);
            bArr2[7] = (byte) (i4 & 255);
            u2Var.c(sk0Var4, 8, 1);
            return length + 9;
        }
        int i12 = length + 1;
        sk0 sk0Var5 = c6Var.f9993n;
        int iL = sk0Var5.L();
        sk0Var5.G(-2);
        int i13 = (iL * 6) + 2;
        if (i10 != 0) {
            sk0Var4.y(i13);
            byte[] bArr3 = sk0Var4.f16446a;
            sk0Var5.H(0, i13, bArr3);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            sk0Var4 = sk0Var5;
        }
        u2Var.c(sk0Var4, i13, 1);
        return i12 + i13;
    }

    public final b6 e() {
        if (!this.f15216m) {
            return null;
        }
        c6 c6Var = this.f15207b;
        n5 n5Var = c6Var.f9982a;
        String str = bq0.f9768a;
        int i4 = n5Var.f14148a;
        b6 b6Var = c6Var.f9992m;
        if (b6Var == null) {
            b6Var = this.f15209d.f10337a.f9222l[i4];
        }
        if (b6Var == null || !b6Var.f9597a) {
            return null;
        }
        return b6Var;
    }
}
