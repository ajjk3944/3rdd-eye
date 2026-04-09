package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class V extends C {

    /* renamed from: t1, reason: collision with root package name */
    private int f50516t1;

    V(int i10) {
        this.f50591c = (byte) 50;
        this.f50286o1 = (byte) 3;
        this.f50516t1 = i10;
        this.f50279h1 = 2;
        this.f50280i1 = 0;
        this.f50281j1 = 0;
        this.f50282k1 = 800;
        this.f50283l1 = (byte) 0;
    }

    @Override // jcifs.smb1.smb1.C
    int E(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.C
    int F(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50516t1, bArr, i10);
        return (i10 + 2) - i10;
    }

    @Override // jcifs.smb1.smb1.C
    int G(byte[] bArr, int i10) {
        bArr[i10] = this.f50286o1;
        bArr[i10 + 1] = 0;
        return 2;
    }

    @Override // jcifs.smb1.smb1.C, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + Ug.d.c(this.f50516t1, 3) + "]");
    }
}
