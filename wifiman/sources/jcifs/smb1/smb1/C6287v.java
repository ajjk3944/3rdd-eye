package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6287v extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    int f50657E;

    /* renamed from: F, reason: collision with root package name */
    int f50658F;

    /* renamed from: G, reason: collision with root package name */
    int f50659G;

    /* renamed from: H, reason: collision with root package name */
    int f50660H;

    /* renamed from: I, reason: collision with root package name */
    int f50661I;

    /* renamed from: J, reason: collision with root package name */
    int f50662J;

    /* renamed from: N, reason: collision with root package name */
    int f50663N;

    /* renamed from: X, reason: collision with root package name */
    int f50664X;

    /* renamed from: Y, reason: collision with root package name */
    long f50665Y;

    C6287v() {
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        this.f50657E = AbstractC6278l.j(bArr, i10);
        this.f50658F = AbstractC6278l.j(bArr, i10 + 2);
        this.f50665Y = AbstractC6278l.s(bArr, i10 + 4);
        this.f50659G = AbstractC6278l.k(bArr, i10 + 8);
        this.f50660H = AbstractC6278l.j(bArr, i10 + 12);
        this.f50661I = AbstractC6278l.j(bArr, i10 + 14);
        this.f50662J = AbstractC6278l.j(bArr, i10 + 16);
        this.f50663N = AbstractC6278l.j(bArr, i10 + 18);
        this.f50664X = AbstractC6278l.k(bArr, i10 + 20);
        return (i10 + 26) - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComOpenAndXResponse[" + super.toString() + ",fid=" + this.f50657E + ",fileAttributes=" + this.f50658F + ",lastWriteTime=" + this.f50665Y + ",dataSize=" + this.f50659G + ",grantedAccess=" + this.f50660H + ",fileType=" + this.f50661I + ",deviceState=" + this.f50662J + ",action=" + this.f50663N + ",serverFid=" + this.f50664X + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
