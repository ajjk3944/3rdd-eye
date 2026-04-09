package jcifs.smb1.smb1;

import org.snmp4j.asn1.BER;

/* loaded from: classes4.dex */
class T extends C {

    /* renamed from: t1, reason: collision with root package name */
    private int f50498t1 = 3;

    T(String str) {
        this.f50611w = str;
        this.f50591c = (byte) 50;
        this.f50286o1 = BER.ASN_SEQUENCE;
        this.f50280i1 = 0;
        this.f50281j1 = 0;
        this.f50282k1 = 4096;
        this.f50283l1 = (byte) 0;
    }

    @Override // jcifs.smb1.smb1.C
    int E(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.C
    int F(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50498t1, bArr, i10);
        int i11 = i10 + 2;
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
        return new String("Trans2GetDfsReferral[" + super.toString() + ",maxReferralLevel=0x" + this.f50498t1 + ",filename=" + this.f50611w + "]");
    }
}
