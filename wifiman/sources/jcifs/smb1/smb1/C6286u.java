package jcifs.smb1.smb1;

import java.util.Date;

/* renamed from: jcifs.smb1.smb1.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6286u extends AbstractC6268b {

    /* renamed from: X, reason: collision with root package name */
    private static final int f50649X = Rg.a.d("jcifs.smb1.smb.client.OpenAndX.ReadAndX", 1);

    /* renamed from: E, reason: collision with root package name */
    int f50650E;

    /* renamed from: F, reason: collision with root package name */
    int f50651F;

    /* renamed from: G, reason: collision with root package name */
    int f50652G;

    /* renamed from: H, reason: collision with root package name */
    int f50653H;

    /* renamed from: I, reason: collision with root package name */
    int f50654I;

    /* renamed from: J, reason: collision with root package name */
    int f50655J;

    /* renamed from: N, reason: collision with root package name */
    int f50656N;

    C6286u(String str, int i10, int i11, AbstractC6278l abstractC6278l) {
        super(abstractC6278l);
        this.f50611w = str;
        this.f50591c = (byte) 45;
        int i12 = i10 & 3;
        this.f50651F = i12;
        if (i12 == 3) {
            this.f50651F = 2;
        }
        this.f50651F = (this.f50651F | 64) & (-2);
        this.f50652G = 22;
        this.f50653H = 0;
        if ((i11 & 64) == 64) {
            if ((i11 & 16) == 16) {
                this.f50655J = 18;
                return;
            } else {
                this.f50655J = 2;
                return;
            }
        }
        if ((i11 & 16) != 16) {
            this.f50655J = 1;
        } else if ((i11 & 32) == 32) {
            this.f50655J = 16;
        } else {
            this.f50655J = 17;
        }
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        AbstractC6278l.x(this.f50650E, bArr, i10);
        AbstractC6278l.x(this.f50651F, bArr, i10 + 2);
        AbstractC6278l.x(this.f50652G, bArr, i10 + 4);
        AbstractC6278l.x(this.f50653H, bArr, i10 + 6);
        this.f50654I = 0;
        AbstractC6278l.y(0, bArr, i10 + 8);
        AbstractC6278l.x(this.f50655J, bArr, i10 + 12);
        AbstractC6278l.y(this.f50656N, bArr, i10 + 14);
        int i11 = i10 + 18;
        int i12 = 0;
        while (i12 < 8) {
            bArr[i11] = 0;
            i12++;
            i11++;
        }
        return i11 - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b
    int E(byte b10) {
        if (b10 == 46) {
            return f50649X;
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
        return new String("SmbComOpenAndX[" + super.toString() + ",flags=0x" + Ug.d.c(this.f50650E, 2) + ",desiredAccess=0x" + Ug.d.c(this.f50651F, 4) + ",searchAttributes=0x" + Ug.d.c(this.f50652G, 4) + ",fileAttributes=0x" + Ug.d.c(this.f50653H, 4) + ",creationTime=" + new Date(this.f50654I) + ",openFunction=0x" + Ug.d.c(this.f50655J, 2) + ",allocationSize=" + this.f50656N + ",fileName=" + this.f50611w + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        int i11;
        if (this.f50604p) {
            i11 = i10 + 1;
            bArr[i10] = 0;
        } else {
            i11 = i10;
        }
        return (i11 + B(this.f50611w, bArr, i11)) - i10;
    }
}
