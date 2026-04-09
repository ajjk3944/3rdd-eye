package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6281o extends AbstractC6278l {

    /* renamed from: B, reason: collision with root package name */
    private int f50620B;

    /* renamed from: C, reason: collision with root package name */
    private long f50621C;

    C6281o(int i10, long j10) {
        this.f50620B = i10;
        this.f50621C = j10;
        this.f50591c = (byte) 4;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50620B, bArr, i10);
        AbstractC6278l.D(this.f50621C, bArr, i10 + 2);
        return 6;
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
        return new String("SmbComClose[" + super.toString() + ",fid=" + this.f50620B + ",lastWriteTime=" + this.f50621C + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
