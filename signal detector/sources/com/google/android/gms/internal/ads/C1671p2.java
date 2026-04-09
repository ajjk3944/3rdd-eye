package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1671p2 {

    /* renamed from: a, reason: collision with root package name */
    public final T0 f16098a;

    /* renamed from: d, reason: collision with root package name */
    public C2 f16101d;

    /* renamed from: e, reason: collision with root package name */
    public C1509m2 f16102e;

    /* renamed from: f, reason: collision with root package name */
    public int f16103f;

    /* renamed from: g, reason: collision with root package name */
    public int f16104g;

    /* renamed from: h, reason: collision with root package name */
    public int f16105h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final TP f16106j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16109m;

    /* renamed from: b, reason: collision with root package name */
    public final B2 f16099b = new B2();

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f16100c = new C2036vr();

    /* renamed from: k, reason: collision with root package name */
    public final C2036vr f16107k = new C2036vr(1);

    /* renamed from: l, reason: collision with root package name */
    public final C2036vr f16108l = new C2036vr();

    public C1671p2(T0 t02, C2 c22, C1509m2 c1509m2, TP tp) {
        this.f16098a = t02;
        this.f16101d = c22;
        this.f16102e = c1509m2;
        this.f16106j = tp;
        this.f16101d = c22;
        this.f16102e = c1509m2;
        t02.e(tp);
        a();
    }

    public final void a() {
        B2 b22 = this.f16099b;
        b22.f7105d = 0;
        b22.f7116p = 0L;
        b22.f7117q = false;
        b22.f7111k = false;
        b22.f7115o = false;
        b22.f7113m = null;
        this.f16103f = 0;
        this.f16105h = 0;
        this.f16104g = 0;
        this.i = 0;
        this.f16109m = false;
    }

    public final int b() {
        int i = !this.f16109m ? this.f16101d.f7499g[this.f16103f] : this.f16099b.f7110j[this.f16103f] ? 1 : 0;
        return e() != null ? i | 1073741824 : i;
    }

    public final boolean c() {
        this.f16103f++;
        if (!this.f16109m) {
            return false;
        }
        int i = this.f16104g + 1;
        this.f16104g = i;
        int[] iArr = this.f16099b.f7108g;
        int i3 = this.f16105h;
        if (i != iArr[i3]) {
            return true;
        }
        this.f16105h = i3 + 1;
        this.f16104g = 0;
        return false;
    }

    public final int d(int i, int i3) {
        C2036vr c2036vr;
        A2 a2E = e();
        if (a2E == null) {
            return 0;
        }
        int length = a2E.f6920d;
        B2 b22 = this.f16099b;
        if (length != 0) {
            c2036vr = b22.f7114n;
        } else {
            byte[] bArr = a2E.f6921e;
            String str = Vt.f12096a;
            length = bArr.length;
            C2036vr c2036vr2 = this.f16108l;
            c2036vr2.z(length, bArr);
            c2036vr = c2036vr2;
        }
        boolean z6 = b22.f7111k && b22.f7112l[this.f16103f];
        boolean z7 = z6 || i3 != 0;
        int i6 = true != z7 ? 0 : 128;
        C2036vr c2036vr3 = this.f16107k;
        c2036vr3.f17354a[0] = (byte) (i6 | length);
        c2036vr3.E(0);
        T0 t02 = this.f16098a;
        t02.b(c2036vr3, 1, 1);
        t02.b(c2036vr, length, 1);
        if (!z7) {
            return length + 1;
        }
        C2036vr c2036vr4 = this.f16100c;
        if (!z6) {
            c2036vr4.y(8);
            byte[] bArr2 = c2036vr4.f17354a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i3;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            t02.b(c2036vr4, 8, 1);
            return length + 9;
        }
        int i7 = length + 1;
        C2036vr c2036vr5 = b22.f7114n;
        int iL = c2036vr5.L();
        c2036vr5.G(-2);
        int i8 = (iL * 6) + 2;
        if (i3 != 0) {
            c2036vr4.y(i8);
            byte[] bArr3 = c2036vr4.f17354a;
            c2036vr5.H(0, i8, bArr3);
            int i9 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
            bArr3[2] = (byte) ((i9 >> 8) & 255);
            bArr3[3] = (byte) (i9 & 255);
        } else {
            c2036vr4 = c2036vr5;
        }
        t02.b(c2036vr4, i8, 1);
        return i7 + i8;
    }

    public final A2 e() {
        if (!this.f16109m) {
            return null;
        }
        B2 b22 = this.f16099b;
        C1509m2 c1509m2 = b22.f7102a;
        String str = Vt.f12096a;
        int i = c1509m2.f15506a;
        A2 a22 = b22.f7113m;
        if (a22 == null) {
            a22 = this.f16101d.f7493a.f17818l[i];
        }
        if (a22 == null || !a22.f6917a) {
            return null;
        }
        return a22;
    }
}
