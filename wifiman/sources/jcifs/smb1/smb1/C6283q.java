package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6283q extends AbstractC6268b {

    /* renamed from: E, reason: collision with root package name */
    private int f50622E;

    /* renamed from: F, reason: collision with root package name */
    private int f50623F;

    /* renamed from: G, reason: collision with root package name */
    private int f50624G;

    /* renamed from: H, reason: collision with root package name */
    private int f50625H;

    /* renamed from: I, reason: collision with root package name */
    private int f50626I;

    /* renamed from: J, reason: collision with root package name */
    private int f50627J;

    /* renamed from: N, reason: collision with root package name */
    private long f50628N;

    /* renamed from: X, reason: collision with root package name */
    private byte f50629X;

    /* renamed from: Y, reason: collision with root package name */
    private int f50630Y;

    /* renamed from: Z, reason: collision with root package name */
    int f50631Z;

    /* renamed from: f1, reason: collision with root package name */
    int f50632f1;

    C6283q(String str, int i10, int i11, int i12, int i13, int i14, AbstractC6278l abstractC6278l) {
        super(abstractC6278l);
        this.f50611w = str;
        this.f50591c = (byte) -94;
        this.f50632f1 = i11 | 137;
        this.f50623F = i13;
        this.f50624G = i12;
        if ((i10 & 64) == 64) {
            if ((i10 & 16) == 16) {
                this.f50625H = 5;
            } else {
                this.f50625H = 4;
            }
        } else if ((i10 & 16) != 16) {
            this.f50625H = 1;
        } else if ((i10 & 32) == 32) {
            this.f50625H = 2;
        } else {
            this.f50625H = 3;
        }
        if ((i14 & 1) == 0) {
            this.f50626I = i14 | 64;
        } else {
            this.f50626I = i14;
        }
        this.f50627J = 2;
        this.f50629X = (byte) 3;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        bArr[i10] = 0;
        this.f50630Y = i10 + 1;
        AbstractC6278l.y(this.f50631Z, bArr, i10 + 3);
        AbstractC6278l.y(this.f50622E, bArr, i10 + 7);
        AbstractC6278l.y(this.f50632f1, bArr, i10 + 11);
        AbstractC6278l.z(this.f50628N, bArr, i10 + 15);
        AbstractC6278l.y(this.f50623F, bArr, i10 + 23);
        AbstractC6278l.y(this.f50624G, bArr, i10 + 27);
        AbstractC6278l.y(this.f50625H, bArr, i10 + 31);
        AbstractC6278l.y(this.f50626I, bArr, i10 + 35);
        AbstractC6278l.y(this.f50627J, bArr, i10 + 39);
        bArr[i10 + 43] = this.f50629X;
        return (i10 + 44) - i10;
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
        return new String("SmbComNTCreateAndX[" + super.toString() + ",flags=0x" + Ug.d.c(this.f50631Z, 2) + ",rootDirectoryFid=" + this.f50622E + ",desiredAccess=0x" + Ug.d.c(this.f50632f1, 4) + ",allocationSize=" + this.f50628N + ",extFileAttributes=0x" + Ug.d.c(this.f50623F, 4) + ",shareAccess=0x" + Ug.d.c(this.f50624G, 4) + ",createDisposition=0x" + Ug.d.c(this.f50625H, 4) + ",createOptions=0x" + Ug.d.c(this.f50626I, 8) + ",impersonationLevel=0x" + Ug.d.c(this.f50627J, 4) + ",securityFlags=0x" + Ug.d.c(this.f50629X, 2) + ",name=" + this.f50611w + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        int iB = B(this.f50611w, bArr, i10);
        AbstractC6278l.x(this.f50604p ? this.f50611w.length() * 2 : iB, bArr, this.f50630Y);
        return iB;
    }
}
