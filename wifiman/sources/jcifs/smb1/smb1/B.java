package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class B extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    private String f50258E;

    /* renamed from: F, reason: collision with root package name */
    private String f50259F;

    /* renamed from: G, reason: collision with root package name */
    private String f50260G;

    /* renamed from: H, reason: collision with root package name */
    boolean f50261H;

    /* renamed from: I, reason: collision with root package name */
    byte[] f50262I;

    B(AbstractC6278l abstractC6278l) {
        super(abstractC6278l);
        this.f50258E = "";
        this.f50259F = "";
        this.f50260G = "";
        this.f50262I = null;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        int length;
        if (this.f50606r) {
            byte[] bArr2 = this.f50262I;
            System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
            length = this.f50262I.length + i10;
        } else {
            length = i10;
        }
        String strN = n(bArr, length);
        this.f50258E = strN;
        int iU = length + u(strN, length);
        String strO = o(bArr, iU, i10 + this.f50603o, 255, this.f50604p);
        this.f50259F = strO;
        int iU2 = iU + u(strO, iU);
        if (!this.f50606r) {
            String strO2 = o(bArr, iU2, i10 + this.f50603o, 255, this.f50604p);
            this.f50260G = strO2;
            iU2 += u(strO2, iU2);
        }
        return iU2 - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        this.f50261H = (bArr[i10] & 1) == 1;
        int i11 = i10 + 2;
        if (this.f50606r) {
            int iJ = AbstractC6278l.j(bArr, i11);
            i11 = i10 + 4;
            this.f50262I = new byte[iJ];
        }
        return i11 - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComSessionSetupAndXResponse[" + super.toString() + ",isLoggedInAsGuest=" + this.f50261H + ",nativeOs=" + this.f50258E + ",nativeLanMan=" + this.f50259F + ",primaryDomain=" + this.f50260G + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
