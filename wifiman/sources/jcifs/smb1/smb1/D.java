package jcifs.smb1.smb1;

import java.util.Enumeration;

/* loaded from: classes4.dex */
abstract class D extends AbstractC6278l implements Enumeration {

    /* renamed from: B, reason: collision with root package name */
    private int f50290B;

    /* renamed from: C, reason: collision with root package name */
    private int f50291C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f50292D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f50293E;

    /* renamed from: F, reason: collision with root package name */
    protected int f50294F;

    /* renamed from: G, reason: collision with root package name */
    protected int f50295G;

    /* renamed from: H, reason: collision with root package name */
    protected int f50296H;

    /* renamed from: I, reason: collision with root package name */
    protected int f50297I;

    /* renamed from: J, reason: collision with root package name */
    protected int f50298J;

    /* renamed from: N, reason: collision with root package name */
    protected int f50299N;

    /* renamed from: X, reason: collision with root package name */
    protected int f50300X;

    /* renamed from: Y, reason: collision with root package name */
    protected int f50301Y;

    /* renamed from: Z, reason: collision with root package name */
    protected int f50302Z;

    /* renamed from: f1, reason: collision with root package name */
    protected int f50303f1;

    /* renamed from: g1, reason: collision with root package name */
    int f50304g1;

    /* renamed from: h1, reason: collision with root package name */
    byte f50305h1;

    /* renamed from: i1, reason: collision with root package name */
    boolean f50306i1 = true;

    /* renamed from: j1, reason: collision with root package name */
    boolean f50307j1 = true;

    /* renamed from: k1, reason: collision with root package name */
    byte[] f50308k1 = null;

    D() {
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    abstract int E(byte[] bArr, int i10, int i11);

    abstract int F(byte[] bArr, int i10, int i11);

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        this.f50291C = 0;
        this.f50290B = 0;
        int i11 = this.f50296H;
        if (i11 > 0) {
            int i12 = this.f50297I - (i10 - this.f50593e);
            this.f50290B = i12;
            int i13 = i10 + i12;
            System.arraycopy(bArr, i13, this.f50308k1, this.f50302Z + this.f50298J, i11);
            i10 = i13 + this.f50296H;
        }
        int i14 = this.f50304g1;
        if (i14 > 0) {
            int i15 = this.f50299N - (i10 - this.f50593e);
            this.f50291C = i15;
            System.arraycopy(bArr, i10 + i15, this.f50308k1, this.f50303f1 + this.f50300X, i14);
        }
        if (!this.f50292D && this.f50298J + this.f50296H == this.f50294F) {
            this.f50292D = true;
        }
        if (!this.f50293E && this.f50300X + this.f50304g1 == this.f50295G) {
            this.f50293E = true;
        }
        if (this.f50292D && this.f50293E) {
            this.f50306i1 = false;
            F(this.f50308k1, this.f50302Z, this.f50294F);
            E(this.f50308k1, this.f50303f1, this.f50295G);
        }
        return this.f50290B + this.f50296H + this.f50291C + this.f50304g1;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f50596h == 0 && this.f50306i1;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        int iJ = AbstractC6278l.j(bArr, i10);
        this.f50294F = iJ;
        if (this.f50303f1 == 0) {
            this.f50303f1 = iJ;
        }
        this.f50295G = AbstractC6278l.j(bArr, i10 + 2);
        this.f50296H = AbstractC6278l.j(bArr, i10 + 6);
        this.f50297I = AbstractC6278l.j(bArr, i10 + 8);
        this.f50298J = AbstractC6278l.j(bArr, i10 + 10);
        this.f50304g1 = AbstractC6278l.j(bArr, i10 + 12);
        this.f50299N = AbstractC6278l.j(bArr, i10 + 14);
        this.f50300X = AbstractC6278l.j(bArr, i10 + 16);
        int i11 = bArr[i10 + 18] & 255;
        this.f50301Y = i11;
        int i12 = i10 + 20;
        if (i11 != 0 && Ug.e.f22464b > 2) {
            AbstractC6278l.f50590z.println("setupCount is not zero: " + this.f50301Y);
        }
        return i12 - i10;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (this.f50307j1) {
            this.f50307j1 = false;
        }
        return this;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    void t() {
        super.t();
        this.f50303f1 = 0;
        this.f50306i1 = true;
        this.f50307j1 = true;
        this.f50293E = false;
        this.f50292D = false;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f50294F + ",totalDataCount=" + this.f50295G + ",parameterCount=" + this.f50296H + ",parameterOffset=" + this.f50297I + ",parameterDisplacement=" + this.f50298J + ",dataCount=" + this.f50304g1 + ",dataOffset=" + this.f50299N + ",dataDisplacement=" + this.f50300X + ",setupCount=" + this.f50301Y + ",pad=" + this.f50290B + ",pad1=" + this.f50291C);
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
