package jcifs.smb1.smb1;

import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
class F extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    boolean f50328E;

    /* renamed from: F, reason: collision with root package name */
    boolean f50329F;

    /* renamed from: G, reason: collision with root package name */
    String f50330G;

    /* renamed from: H, reason: collision with root package name */
    String f50331H;

    F(AbstractC6278l abstractC6278l) {
        super(abstractC6278l);
        this.f50331H = "";
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        int iQ = q(bArr, i10, 32);
        try {
            this.f50330G = new String(bArr, i10, iQ, "ASCII");
            return ((iQ + 1) + i10) - i10;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        this.f50328E = (b10 & 1) == 1;
        this.f50329F = (b10 & 2) == 2;
        return 2;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComTreeConnectAndXResponse[" + super.toString() + ",supportSearchBits=" + this.f50328E + ",shareIsInDfs=" + this.f50329F + ",service=" + this.f50330G + ",nativeFileSystem=" + this.f50331H + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
