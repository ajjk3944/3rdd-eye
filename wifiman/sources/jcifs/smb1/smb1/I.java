package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class I extends AbstractC6268b {

    /* renamed from: Z, reason: collision with root package name */
    private static final int f50338Z = Rg.a.d("jcifs.smb1.smb.client.WriteAndX.ReadAndX", 1);

    /* renamed from: f1, reason: collision with root package name */
    private static final int f50339f1 = Rg.a.d("jcifs.smb1.smb.client.WriteAndX.Close", 1);

    /* renamed from: E, reason: collision with root package name */
    private int f50340E;

    /* renamed from: F, reason: collision with root package name */
    private int f50341F;

    /* renamed from: G, reason: collision with root package name */
    private int f50342G;

    /* renamed from: H, reason: collision with root package name */
    private int f50343H;

    /* renamed from: I, reason: collision with root package name */
    private int f50344I;

    /* renamed from: J, reason: collision with root package name */
    private byte[] f50345J;

    /* renamed from: N, reason: collision with root package name */
    private long f50346N;

    /* renamed from: X, reason: collision with root package name */
    private int f50347X;

    /* renamed from: Y, reason: collision with root package name */
    int f50348Y;

    I() {
        super(null);
        this.f50591c = (byte) 47;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        int i11 = this.f50593e;
        int i12 = (i10 - i11) + 26;
        this.f50343H = i12;
        int i13 = (i12 - i11) % 4;
        this.f50347X = i13;
        int i14 = i13 == 0 ? 0 : 4 - i13;
        this.f50347X = i14;
        this.f50343H = i12 + i14;
        AbstractC6278l.x(this.f50340E, bArr, i10);
        AbstractC6278l.y(this.f50346N, bArr, i10 + 2);
        int i15 = i10 + 6;
        int i16 = 0;
        while (i16 < 4) {
            bArr[i15] = -1;
            i16++;
            i15++;
        }
        AbstractC6278l.x(this.f50348Y, bArr, i15);
        AbstractC6278l.x(this.f50341F, bArr, i15 + 2);
        bArr[i15 + 4] = 0;
        bArr[i15 + 5] = 0;
        AbstractC6278l.x(this.f50342G, bArr, i15 + 6);
        AbstractC6278l.x(this.f50343H, bArr, i15 + 8);
        AbstractC6278l.y(this.f50346N >> 32, bArr, i15 + 10);
        return (i15 + 14) - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b
    int E(byte b10) {
        if (b10 == 46) {
            return f50338Z;
        }
        if (b10 == 4) {
            return f50339f1;
        }
        return 0;
    }

    void H(int i10, long j10, int i11, byte[] bArr, int i12, int i13) {
        this.f50340E = i10;
        this.f50346N = j10;
        this.f50341F = i11;
        this.f50345J = bArr;
        this.f50344I = i12;
        this.f50342G = i13;
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

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComWriteAndX[" + super.toString() + ",fid=" + this.f50340E + ",offset=" + this.f50346N + ",writeMode=" + this.f50348Y + ",remaining=" + this.f50341F + ",dataLength=" + this.f50342G + ",dataOffset=" + this.f50343H + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        int i11 = i10;
        while (true) {
            int i12 = this.f50347X;
            this.f50347X = i12 - 1;
            if (i12 <= 0) {
                System.arraycopy(this.f50345J, this.f50344I, bArr, i11, this.f50342G);
                return (i11 + this.f50342G) - i10;
            }
            bArr[i11] = -18;
            i11++;
        }
    }
}
