package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class J extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    long f50349E;

    J() {
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
        this.f50349E = AbstractC6278l.j(bArr, i10) & 65535;
        return 8;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComWriteAndXResponse[" + super.toString() + ",count=" + this.f50349E + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
