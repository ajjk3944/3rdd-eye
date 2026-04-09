package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6291z extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    byte[] f50677E;

    /* renamed from: F, reason: collision with root package name */
    int f50678F;

    /* renamed from: G, reason: collision with root package name */
    int f50679G;

    /* renamed from: H, reason: collision with root package name */
    int f50680H;

    /* renamed from: I, reason: collision with root package name */
    int f50681I;

    C6291z(byte[] bArr, int i10) {
        this.f50677E = bArr;
        this.f50678F = i10;
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
        this.f50679G = AbstractC6278l.j(bArr, i10 + 2);
        this.f50680H = AbstractC6278l.j(bArr, i10 + 6);
        this.f50681I = AbstractC6278l.j(bArr, i10 + 8);
        return (i10 + 20) - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComReadAndXResponse[" + super.toString() + ",dataCompactionMode=" + this.f50679G + ",dataLength=" + this.f50680H + ",dataOffset=" + this.f50681I + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
