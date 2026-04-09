package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class X extends C {

    /* renamed from: t1, reason: collision with root package name */
    private int f50524t1;

    X(String str, int i10) {
        this.f50611w = str;
        this.f50524t1 = i10;
        this.f50591c = (byte) 50;
        this.f50286o1 = (byte) 5;
        this.f50280i1 = 0;
        this.f50281j1 = 2;
        this.f50282k1 = 40;
        this.f50283l1 = (byte) 0;
    }

    @Override // jcifs.smb1.smb1.C
    int E(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.C
    int F(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50524t1, bArr, i10);
        bArr[i10 + 2] = 0;
        bArr[i10 + 3] = 0;
        bArr[i10 + 4] = 0;
        int i11 = i10 + 6;
        bArr[i10 + 5] = 0;
        return (i11 + B(this.f50611w, bArr, i11)) - i10;
    }

    @Override // jcifs.smb1.smb1.C
    int G(byte[] bArr, int i10) {
        bArr[i10] = this.f50286o1;
        bArr[i10 + 1] = 0;
        return 2;
    }

    @Override // jcifs.smb1.smb1.C, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("Trans2QueryPathInformation[" + super.toString() + ",informationLevel=0x" + Ug.d.c(this.f50524t1, 3) + ",filename=" + this.f50611w + "]");
    }
}
