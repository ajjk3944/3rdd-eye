package jcifs.smb1.smb1;

import java.util.Date;

/* loaded from: classes4.dex */
class r extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    byte f50633E;

    /* renamed from: F, reason: collision with root package name */
    int f50634F;

    /* renamed from: G, reason: collision with root package name */
    int f50635G;

    /* renamed from: H, reason: collision with root package name */
    int f50636H;

    /* renamed from: I, reason: collision with root package name */
    int f50637I;

    /* renamed from: J, reason: collision with root package name */
    int f50638J;

    /* renamed from: N, reason: collision with root package name */
    long f50639N;

    /* renamed from: X, reason: collision with root package name */
    long f50640X;

    /* renamed from: Y, reason: collision with root package name */
    long f50641Y;

    /* renamed from: Z, reason: collision with root package name */
    long f50642Z;

    /* renamed from: f1, reason: collision with root package name */
    long f50643f1;

    /* renamed from: g1, reason: collision with root package name */
    long f50644g1;

    /* renamed from: h1, reason: collision with root package name */
    boolean f50645h1;

    /* renamed from: i1, reason: collision with root package name */
    boolean f50646i1;

    r() {
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
        this.f50633E = bArr[i10];
        this.f50634F = AbstractC6278l.j(bArr, i10 + 1);
        this.f50635G = AbstractC6278l.k(bArr, i10 + 3);
        this.f50639N = AbstractC6278l.r(bArr, i10 + 7);
        this.f50640X = AbstractC6278l.r(bArr, i10 + 15);
        this.f50641Y = AbstractC6278l.r(bArr, i10 + 23);
        this.f50642Z = AbstractC6278l.r(bArr, i10 + 31);
        this.f50636H = AbstractC6278l.k(bArr, i10 + 39);
        this.f50643f1 = AbstractC6278l.l(bArr, i10 + 43);
        this.f50644g1 = AbstractC6278l.l(bArr, i10 + 51);
        this.f50637I = AbstractC6278l.j(bArr, i10 + 59);
        this.f50638J = AbstractC6278l.j(bArr, i10 + 61);
        int i11 = i10 + 64;
        this.f50645h1 = (bArr[i10 + 63] & 255) > 0;
        return i11 - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComNTCreateAndXResponse[" + super.toString() + ",oplockLevel=" + ((int) this.f50633E) + ",fid=" + this.f50634F + ",createAction=0x" + Ug.d.c(this.f50635G, 4) + ",creationTime=" + new Date(this.f50639N) + ",lastAccessTime=" + new Date(this.f50640X) + ",lastWriteTime=" + new Date(this.f50641Y) + ",changeTime=" + new Date(this.f50642Z) + ",extFileAttributes=0x" + Ug.d.c(this.f50636H, 4) + ",allocationSize=" + this.f50643f1 + ",endOfFile=" + this.f50644g1 + ",fileType=" + this.f50637I + ",deviceState=" + this.f50638J + ",directory=" + this.f50645h1 + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
