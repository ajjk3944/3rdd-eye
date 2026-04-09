package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class K extends AbstractC6278l {

    /* renamed from: B, reason: collision with root package name */
    long f50350B;

    K() {
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
        this.f50350B = AbstractC6278l.j(bArr, i10) & 65535;
        return 8;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComWriteResponse[" + super.toString() + ",count=" + this.f50350B + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
