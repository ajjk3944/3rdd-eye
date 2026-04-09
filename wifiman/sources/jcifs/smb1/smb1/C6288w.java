package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6288w extends AbstractC6278l {
    C6288w(String str) {
        this.f50611w = str;
        this.f50591c = (byte) 8;
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
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComQueryInformation[" + super.toString() + ",filename=" + this.f50611w + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        bArr[i10] = 4;
        return (i11 + B(this.f50611w, bArr, i11)) - i10;
    }
}
