package jcifs.smb1.smb1;

import jcifs.smb1.smb1.Q;

/* loaded from: classes4.dex */
class A extends AbstractC6268b {

    /* renamed from: Z, reason: collision with root package name */
    private static final int f50247Z = Rg.a.d("jcifs.smb1.smb.client.SessionSetupAndX.TreeConnectAndX", 1);

    /* renamed from: f1, reason: collision with root package name */
    private static final boolean f50248f1 = Rg.a.a("jcifs.smb1.smb.client.disablePlainTextPasswords", true);

    /* renamed from: E, reason: collision with root package name */
    private byte[] f50249E;

    /* renamed from: F, reason: collision with root package name */
    private byte[] f50250F;

    /* renamed from: G, reason: collision with root package name */
    private byte[] f50251G;

    /* renamed from: H, reason: collision with root package name */
    private int f50252H;

    /* renamed from: I, reason: collision with root package name */
    private int f50253I;

    /* renamed from: J, reason: collision with root package name */
    private String f50254J;

    /* renamed from: N, reason: collision with root package name */
    private String f50255N;

    /* renamed from: X, reason: collision with root package name */
    P f50256X;

    /* renamed from: Y, reason: collision with root package name */
    Object f50257Y;

    A(P p10, AbstractC6278l abstractC6278l, Object obj) throws SmbException {
        super(abstractC6278l);
        this.f50251G = null;
        this.f50591c = (byte) 115;
        this.f50256X = p10;
        this.f50257Y = obj;
        Q q10 = p10.f50437h;
        this.f50252H = q10.f50446B;
        int i10 = q10.f50445A;
        this.f50253I = i10;
        Q.a aVar = q10.f50463v;
        int i11 = aVar.f50474g;
        if (i11 != 1) {
            if (i11 != 0) {
                throw new SmbException("Unsupported");
            }
            if (!(obj instanceof C6277k)) {
                throw new SmbException("Unsupported credential type");
            }
            C6277k c6277k = (C6277k) obj;
            this.f50249E = new byte[0];
            this.f50250F = new byte[0];
            String str = c6277k.f50582b;
            this.f50254J = str;
            if (this.f50604p) {
                this.f50254J = str.toUpperCase();
            }
            this.f50255N = c6277k.f50581a.toUpperCase();
            return;
        }
        if (!(obj instanceof C6277k)) {
            if (!(obj instanceof byte[])) {
                throw new SmbException("Unsupported credential type");
            }
            this.f50251G = (byte[]) obj;
            return;
        }
        C6277k c6277k2 = (C6277k) obj;
        if (c6277k2 == C6277k.f50577p) {
            this.f50249E = new byte[0];
            this.f50250F = new byte[0];
            this.f50253I = Integer.MAX_VALUE & i10;
        } else if (aVar.f50475h) {
            this.f50249E = c6277k2.d(aVar.f50483p);
            byte[] bArrR = c6277k2.r(p10.f50437h.f50463v.f50483p);
            this.f50250F = bArrR;
            if (this.f50249E.length == 0 && bArrR.length == 0) {
                throw new RuntimeException("Null setup prohibited.");
            }
        } else {
            if (f50248f1) {
                throw new RuntimeException("Plain text passwords are disabled");
            }
            if (this.f50604p) {
                String strN = c6277k2.n();
                this.f50249E = new byte[0];
                byte[] bArr = new byte[(strN.length() + 1) * 2];
                this.f50250F = bArr;
                B(strN, bArr, 0);
            } else {
                String strN2 = c6277k2.n();
                byte[] bArr2 = new byte[(strN2.length() + 1) * 2];
                this.f50249E = bArr2;
                this.f50250F = new byte[0];
                B(strN2, bArr2, 0);
            }
        }
        String str2 = c6277k2.f50582b;
        this.f50254J = str2;
        if (this.f50604p) {
            this.f50254J = str2.toUpperCase();
        }
        this.f50255N = c6277k2.f50581a.toUpperCase();
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        int i11;
        AbstractC6278l.x(this.f50256X.f50437h.f50466y, bArr, i10);
        AbstractC6278l.x(this.f50256X.f50437h.f50465x, bArr, i10 + 2);
        Q q10 = this.f50256X.f50437h;
        AbstractC6278l.x(1L, bArr, i10 + 4);
        AbstractC6278l.y(this.f50252H, bArr, i10 + 6);
        int i12 = i10 + 10;
        if (this.f50251G != null) {
            AbstractC6278l.x(r1.length, bArr, i12);
            i11 = i10 + 12;
        } else {
            AbstractC6278l.x(this.f50249E.length, bArr, i12);
            AbstractC6278l.x(this.f50250F.length, bArr, i10 + 12);
            i11 = i10 + 14;
        }
        bArr[i11] = 0;
        bArr[i11 + 1] = 0;
        bArr[i11 + 2] = 0;
        bArr[i11 + 3] = 0;
        AbstractC6278l.y(this.f50253I, bArr, i11 + 4);
        return (i11 + 8) - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b
    int E(byte b10) {
        if (b10 == 117) {
            return f50247Z;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SmbComSessionSetupAndX[");
        sb2.append(super.toString());
        sb2.append(",snd_buf_size=");
        sb2.append(this.f50256X.f50437h.f50466y);
        sb2.append(",maxMpxCount=");
        sb2.append(this.f50256X.f50437h.f50465x);
        sb2.append(",VC_NUMBER=");
        Q q10 = this.f50256X.f50437h;
        sb2.append(1);
        sb2.append(",sessionKey=");
        sb2.append(this.f50252H);
        sb2.append(",lmHash.length=");
        byte[] bArr = this.f50249E;
        sb2.append(bArr == null ? 0 : bArr.length);
        sb2.append(",ntHash.length=");
        byte[] bArr2 = this.f50250F;
        sb2.append(bArr2 != null ? bArr2.length : 0);
        sb2.append(",capabilities=");
        sb2.append(this.f50253I);
        sb2.append(",accountName=");
        sb2.append(this.f50254J);
        sb2.append(",primaryDomain=");
        sb2.append(this.f50255N);
        sb2.append(",NATIVE_OS=");
        Q q11 = this.f50256X.f50437h;
        sb2.append(L.f50374X0);
        sb2.append(",NATIVE_LANMAN=");
        Q q12 = this.f50256X.f50437h;
        sb2.append(L.f50375Y0);
        sb2.append("]");
        return new String(sb2.toString());
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        int iB;
        byte[] bArr2 = this.f50251G;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            iB = this.f50251G.length + i10;
        } else {
            byte[] bArr3 = this.f50249E;
            System.arraycopy(bArr3, 0, bArr, i10, bArr3.length);
            int length = this.f50249E.length + i10;
            byte[] bArr4 = this.f50250F;
            System.arraycopy(bArr4, 0, bArr, length, bArr4.length);
            int length2 = length + this.f50250F.length;
            int iB2 = length2 + B(this.f50254J, bArr, length2);
            iB = iB2 + B(this.f50255N, bArr, iB2);
        }
        Q q10 = this.f50256X.f50437h;
        int iB3 = iB + B(L.f50374X0, bArr, iB);
        Q q11 = this.f50256X.f50437h;
        return (iB3 + B(L.f50375Y0, bArr, iB3)) - i10;
    }
}
