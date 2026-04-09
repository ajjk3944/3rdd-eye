package jcifs.smb1.smb1;

import org.snmp4j.smi.Counter32;

/* loaded from: classes4.dex */
class H extends AbstractC6278l {

    /* renamed from: B, reason: collision with root package name */
    private int f50332B;

    /* renamed from: C, reason: collision with root package name */
    private int f50333C;

    /* renamed from: D, reason: collision with root package name */
    private int f50334D;

    /* renamed from: E, reason: collision with root package name */
    private int f50335E;

    /* renamed from: F, reason: collision with root package name */
    private int f50336F;

    /* renamed from: G, reason: collision with root package name */
    private byte[] f50337G;

    H() {
        this.f50591c = (byte) 11;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50332B, bArr, i10);
        AbstractC6278l.x(this.f50333C, bArr, i10 + 2);
        AbstractC6278l.y(this.f50334D, bArr, i10 + 4);
        AbstractC6278l.x(this.f50335E, bArr, i10 + 8);
        return (i10 + 10) - i10;
    }

    void E(int i10, long j10, int i11, byte[] bArr, int i12, int i13) {
        this.f50332B = i10;
        this.f50334D = (int) (j10 & Counter32.MAX_COUNTER32_VALUE);
        this.f50335E = i11;
        this.f50337G = bArr;
        this.f50336F = i12;
        this.f50333C = i13;
        this.f50612x = null;
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
        return new String("SmbComWrite[" + super.toString() + ",fid=" + this.f50332B + ",count=" + this.f50333C + ",offset=" + this.f50334D + ",remaining=" + this.f50335E + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        bArr[i10] = 1;
        AbstractC6278l.x(this.f50333C, bArr, i10 + 1);
        int i11 = i10 + 3;
        System.arraycopy(this.f50337G, this.f50336F, bArr, i11, this.f50333C);
        return (i11 + this.f50333C) - i10;
    }
}
