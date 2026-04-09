package jcifs.smb1.smb1;

import java.util.Enumeration;

/* loaded from: classes4.dex */
abstract class C extends AbstractC6278l implements Enumeration {

    /* renamed from: s1, reason: collision with root package name */
    private static final int f50263s1 = Rg.a.d("jcifs.smb1.smb.client.transaction_buf_size", 65535) - 512;

    /* renamed from: G, reason: collision with root package name */
    private int f50269G;

    /* renamed from: H, reason: collision with root package name */
    private int f50270H;

    /* renamed from: N, reason: collision with root package name */
    protected int f50273N;

    /* renamed from: X, reason: collision with root package name */
    protected int f50274X;

    /* renamed from: Y, reason: collision with root package name */
    protected int f50275Y;

    /* renamed from: Z, reason: collision with root package name */
    protected int f50276Z;

    /* renamed from: f1, reason: collision with root package name */
    protected int f50277f1;

    /* renamed from: g1, reason: collision with root package name */
    protected int f50278g1;

    /* renamed from: h1, reason: collision with root package name */
    int f50279h1;

    /* renamed from: i1, reason: collision with root package name */
    int f50280i1;

    /* renamed from: l1, reason: collision with root package name */
    byte f50283l1;

    /* renamed from: o1, reason: collision with root package name */
    byte f50286o1;

    /* renamed from: q1, reason: collision with root package name */
    int f50288q1;

    /* renamed from: r1, reason: collision with root package name */
    byte[] f50289r1;

    /* renamed from: B, reason: collision with root package name */
    private int f50264B = 0;

    /* renamed from: C, reason: collision with root package name */
    private int f50265C = 0;

    /* renamed from: D, reason: collision with root package name */
    private int f50266D = 0;

    /* renamed from: E, reason: collision with root package name */
    private boolean f50267E = true;

    /* renamed from: F, reason: collision with root package name */
    private boolean f50268F = true;

    /* renamed from: k1, reason: collision with root package name */
    int f50282k1 = f50263s1;

    /* renamed from: m1, reason: collision with root package name */
    int f50284m1 = 0;

    /* renamed from: n1, reason: collision with root package name */
    int f50285n1 = 1;

    /* renamed from: p1, reason: collision with root package name */
    String f50287p1 = "";

    /* renamed from: j1, reason: collision with root package name */
    int f50281j1 = 1024;

    /* renamed from: I, reason: collision with root package name */
    protected int f50271I = 61;

    /* renamed from: J, reason: collision with root package name */
    protected int f50272J = 51;

    C() {
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        int iG;
        AbstractC6278l.x(this.f50279h1, bArr, i10);
        AbstractC6278l.x(this.f50280i1, bArr, i10 + 2);
        int i11 = i10 + 4;
        if (this.f50591c != 38) {
            AbstractC6278l.x(this.f50281j1, bArr, i11);
            AbstractC6278l.x(this.f50282k1, bArr, i10 + 6);
            bArr[i10 + 8] = this.f50283l1;
            bArr[i10 + 9] = 0;
            AbstractC6278l.x(this.f50264B, bArr, i10 + 10);
            AbstractC6278l.y(this.f50284m1, bArr, i10 + 12);
            bArr[i10 + 16] = 0;
            i11 = i10 + 18;
            bArr[i10 + 17] = 0;
        }
        AbstractC6278l.x(this.f50273N, bArr, i11);
        AbstractC6278l.x(this.f50274X, bArr, i11 + 2);
        int i12 = i11 + 4;
        if (this.f50591c == 38) {
            AbstractC6278l.x(this.f50275Y, bArr, i12);
            i12 = i11 + 6;
        }
        AbstractC6278l.x(this.f50276Z, bArr, i12);
        AbstractC6278l.x(this.f50276Z == 0 ? 0 : this.f50277f1, bArr, i12 + 2);
        int i13 = i12 + 4;
        if (this.f50591c == 38) {
            AbstractC6278l.x(this.f50278g1, bArr, i13);
            iG = i12 + 6;
        } else {
            int i14 = i12 + 5;
            bArr[i13] = (byte) this.f50285n1;
            int i15 = i12 + 6;
            bArr[i14] = 0;
            iG = i15 + G(bArr, i15);
        }
        return iG - i10;
    }

    abstract int E(byte[] bArr, int i10);

    abstract int F(byte[] bArr, int i10);

    abstract int G(byte[] bArr, int i10);

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        return 0;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f50267E;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        return 0;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (this.f50268F) {
            this.f50268F = false;
            int i10 = this.f50271I + (this.f50285n1 * 2);
            this.f50274X = i10 + 2;
            byte b10 = this.f50591c;
            if (b10 != -96) {
                if (b10 == 37 && !g()) {
                    int i11 = this.f50274X;
                    this.f50274X = i11 + u(this.f50287p1, i11);
                }
            } else if (b10 == -96) {
                this.f50274X = i10 + 4;
            }
            int i12 = this.f50274X;
            int i13 = i12 % 2;
            this.f50265C = i13;
            int i14 = i13 == 0 ? 0 : 2 - i13;
            this.f50265C = i14;
            this.f50274X = i12 + i14;
            int iF = F(this.f50289r1, this.f50269G);
            this.f50279h1 = iF;
            this.f50270H = iF;
            int i15 = this.f50288q1 - this.f50274X;
            int iMin = Math.min(iF, i15);
            this.f50273N = iMin;
            int i16 = i15 - iMin;
            int i17 = this.f50274X + iMin;
            this.f50277f1 = i17;
            int i18 = i17 % 2;
            this.f50266D = i18;
            int i19 = i18 == 0 ? 0 : 2 - i18;
            this.f50266D = i19;
            this.f50277f1 = i17 + i19;
            int iE = E(this.f50289r1, this.f50270H);
            this.f50280i1 = iE;
            this.f50276Z = Math.min(iE, i16);
        } else {
            if (this.f50591c != -96) {
                this.f50591c = (byte) 38;
            } else {
                this.f50591c = (byte) -95;
            }
            this.f50274X = 51;
            int i20 = this.f50279h1;
            int i21 = this.f50275Y;
            if (i20 - i21 > 0) {
                int i22 = 51 % 2;
                this.f50265C = i22;
                int i23 = i22 == 0 ? 0 : 2 - i22;
                this.f50265C = i23;
                this.f50274X = 51 + i23;
            }
            int i24 = i21 + this.f50273N;
            this.f50275Y = i24;
            int i25 = (this.f50288q1 - this.f50274X) - this.f50265C;
            int iMin2 = Math.min(i20 - i24, i25);
            this.f50273N = iMin2;
            int i26 = i25 - iMin2;
            int i27 = this.f50274X + iMin2;
            this.f50277f1 = i27;
            int i28 = i27 % 2;
            this.f50266D = i28;
            int i29 = i28 == 0 ? 0 : 2 - i28;
            this.f50266D = i29;
            this.f50277f1 = i27 + i29;
            int i30 = this.f50278g1 + this.f50276Z;
            this.f50278g1 = i30;
            this.f50276Z = Math.min(this.f50280i1 - i30, i26 - i29);
        }
        if (this.f50275Y + this.f50273N >= this.f50279h1 && this.f50278g1 + this.f50276Z >= this.f50280i1) {
            this.f50267E = false;
        }
        return this;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    void t() {
        super.t();
        this.f50267E = true;
        this.f50268F = true;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f50279h1 + ",totalDataCount=" + this.f50280i1 + ",maxParameterCount=" + this.f50281j1 + ",maxDataCount=" + this.f50282k1 + ",maxSetupCount=" + ((int) this.f50283l1) + ",flags=0x" + Ug.d.c(this.f50264B, 2) + ",timeout=" + this.f50284m1 + ",parameterCount=" + this.f50273N + ",parameterOffset=" + this.f50274X + ",parameterDisplacement=" + this.f50275Y + ",dataCount=" + this.f50276Z + ",dataOffset=" + this.f50277f1 + ",dataDisplacement=" + this.f50278g1 + ",setupCount=" + this.f50285n1 + ",pad=" + this.f50265C + ",pad1=" + this.f50266D);
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        int i11 = this.f50265C;
        int iB = (this.f50591c != 37 || g()) ? i10 : B(this.f50287p1, bArr, i10) + i10;
        if (this.f50273N > 0) {
            while (true) {
                int i12 = i11 - 1;
                if (i11 <= 0) {
                    break;
                }
                bArr[iB] = 0;
                iB++;
                i11 = i12;
            }
            System.arraycopy(this.f50289r1, this.f50269G, bArr, iB, this.f50273N);
            iB += this.f50273N;
        }
        if (this.f50276Z > 0) {
            int i13 = this.f50266D;
            while (true) {
                int i14 = i13 - 1;
                if (i13 <= 0) {
                    break;
                }
                bArr[iB] = 0;
                iB++;
                i13 = i14;
            }
            System.arraycopy(this.f50289r1, this.f50270H, bArr, iB, this.f50276Z);
            int i15 = this.f50270H;
            int i16 = this.f50276Z;
            this.f50270H = i15 + i16;
            iB += i16;
        }
        return iB - i10;
    }
}
