package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6290y extends AbstractC6268b {

    /* renamed from: N, reason: collision with root package name */
    private static final int f50670N = Rg.a.d("jcifs.smb1.smb.client.ReadAndX.Close", 1);

    /* renamed from: E, reason: collision with root package name */
    private long f50671E;

    /* renamed from: F, reason: collision with root package name */
    private int f50672F;

    /* renamed from: G, reason: collision with root package name */
    private int f50673G;

    /* renamed from: H, reason: collision with root package name */
    int f50674H;

    /* renamed from: I, reason: collision with root package name */
    int f50675I;

    /* renamed from: J, reason: collision with root package name */
    int f50676J;

    C6290y(int i10, long j10, int i11, AbstractC6278l abstractC6278l) {
        super(abstractC6278l);
        this.f50672F = i10;
        this.f50671E = j10;
        this.f50675I = i11;
        this.f50674H = i11;
        this.f50591c = (byte) 46;
        this.f50673G = -1;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50672F, bArr, i10);
        AbstractC6278l.y(this.f50671E, bArr, i10 + 2);
        AbstractC6278l.x(this.f50674H, bArr, i10 + 6);
        AbstractC6278l.x(this.f50675I, bArr, i10 + 8);
        AbstractC6278l.y(this.f50673G, bArr, i10 + 10);
        AbstractC6278l.x(this.f50676J, bArr, i10 + 14);
        AbstractC6278l.y(this.f50671E >> 32, bArr, i10 + 16);
        return (i10 + 20) - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b
    int E(byte b10) {
        if (b10 == 4) {
            return f50670N;
        }
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

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComReadAndX[" + super.toString() + ",fid=" + this.f50672F + ",offset=" + this.f50671E + ",maxCount=" + this.f50674H + ",minCount=" + this.f50675I + ",openTimeout=" + this.f50673G + ",remaining=" + this.f50676J + ",offset=" + this.f50671E + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
