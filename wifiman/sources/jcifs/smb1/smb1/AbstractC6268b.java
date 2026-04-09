package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC6268b extends AbstractC6278l {

    /* renamed from: B, reason: collision with root package name */
    private byte f50541B;

    /* renamed from: C, reason: collision with root package name */
    private int f50542C;

    /* renamed from: D, reason: collision with root package name */
    AbstractC6278l f50543D;

    AbstractC6268b() {
        this.f50541B = (byte) -1;
        this.f50542C = 0;
        this.f50543D = null;
    }

    int E(byte b10) {
        return 0;
    }

    int F(byte[] bArr, int i10) {
        byte b10;
        int i11 = i10 + 1;
        byte b11 = bArr[i10];
        this.f50602n = b11;
        if (b11 != 0) {
            this.f50541B = bArr[i11];
            int iJ = AbstractC6278l.j(bArr, i10 + 3);
            this.f50542C = iJ;
            if (iJ == 0) {
                this.f50541B = (byte) -1;
            }
            if (this.f50602n > 2) {
                m(bArr, i10 + 5);
                if (this.f50591c == -94 && ((r) this).f50646i1) {
                    this.f50602n += 8;
                }
            }
            i11 += this.f50602n * 2;
        }
        int iJ2 = AbstractC6278l.j(bArr, i11);
        this.f50603o = iJ2;
        int iF = i11 + 2;
        if (iJ2 != 0) {
            h(bArr, iF);
            iF += this.f50603o;
        }
        int i12 = this.f50596h;
        if (i12 != 0 || (b10 = this.f50541B) == -1) {
            this.f50541B = (byte) -1;
            this.f50543D = null;
        } else {
            AbstractC6278l abstractC6278l = this.f50543D;
            if (abstractC6278l == null) {
                this.f50541B = (byte) -1;
                throw new RuntimeException("no andx command supplied with response");
            }
            int i13 = this.f50593e;
            int i14 = this.f50542C + i13;
            abstractC6278l.f50593e = i13;
            abstractC6278l.f50591c = b10;
            abstractC6278l.f50596h = i12;
            abstractC6278l.f50592d = this.f50592d;
            abstractC6278l.f50597i = this.f50597i;
            abstractC6278l.f50598j = this.f50598j;
            abstractC6278l.f50599k = this.f50599k;
            abstractC6278l.f50600l = this.f50600l;
            abstractC6278l.f50601m = this.f50601m;
            abstractC6278l.f50604p = this.f50604p;
            if (abstractC6278l instanceof AbstractC6268b) {
                iF = i14 + ((AbstractC6268b) abstractC6278l).F(bArr, i14);
            } else {
                int iM = i14 + 1;
                int i15 = abstractC6278l.f50602n;
                bArr[i14] = (byte) (i15 & 255);
                if (i15 != 0 && i15 > 2) {
                    iM += abstractC6278l.m(bArr, iM);
                }
                this.f50543D.f50603o = AbstractC6278l.j(bArr, iM);
                int i16 = iM + 2;
                AbstractC6278l abstractC6278l2 = this.f50543D;
                if (abstractC6278l2.f50603o != 0) {
                    abstractC6278l2.h(bArr, i16);
                    i16 += this.f50543D.f50603o;
                }
                iF = i16;
            }
            this.f50543D.f50605q = true;
        }
        return iF - i10;
    }

    int G(byte[] bArr, int i10) {
        int iG;
        int i11 = i10 + 3;
        int iA = A(bArr, i10 + 5);
        int i12 = iA + 4;
        int i13 = iA + 5 + i10;
        int i14 = i12 / 2;
        this.f50602n = i14;
        bArr[i10] = (byte) (i14 & 255);
        int iV = v(bArr, i13 + 2);
        this.f50603o = iV;
        bArr[i13] = (byte) (iV & 255);
        bArr[i13 + 1] = (byte) ((iV >> 8) & 255);
        int i15 = i13 + 2 + iV;
        AbstractC6278l abstractC6278l = this.f50543D;
        if (abstractC6278l == null || !L.f50362L0 || this.f50595g >= E(abstractC6278l.f50591c)) {
            this.f50541B = (byte) -1;
            this.f50543D = null;
            bArr[i10 + 1] = -1;
            bArr[i10 + 2] = 0;
            bArr[i11] = -34;
            bArr[i10 + 4] = -34;
            return i15 - i10;
        }
        this.f50543D.f50595g = this.f50595g + 1;
        bArr[i10 + 1] = this.f50541B;
        bArr[i10 + 2] = 0;
        int i16 = i15 - this.f50593e;
        this.f50542C = i16;
        AbstractC6278l.x(i16, bArr, i11);
        AbstractC6278l abstractC6278l2 = this.f50543D;
        abstractC6278l2.f50604p = this.f50604p;
        if (abstractC6278l2 instanceof AbstractC6268b) {
            abstractC6278l2.f50600l = this.f50600l;
            iG = i15 + ((AbstractC6268b) abstractC6278l2).G(bArr, i15);
        } else {
            abstractC6278l2.f50602n = abstractC6278l2.A(bArr, i15);
            AbstractC6278l abstractC6278l3 = this.f50543D;
            int i17 = abstractC6278l3.f50602n;
            int i18 = i17 + 1 + i15;
            int i19 = i17 / 2;
            abstractC6278l3.f50602n = i19;
            bArr[i15] = (byte) (i19 & 255);
            abstractC6278l3.f50603o = abstractC6278l3.v(bArr, i18 + 2);
            int i20 = this.f50543D.f50603o;
            bArr[i18] = (byte) (i20 & 255);
            bArr[i18 + 1] = (byte) ((i20 >> 8) & 255);
            iG = i20 + i18 + 2;
        }
        return iG - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int e(byte[] bArr, int i10) {
        this.f50593e = i10;
        int i11 = i(bArr, i10) + i10;
        int iF = (i11 + F(bArr, i11)) - i10;
        this.f50594f = iF;
        return iF;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int f(byte[] bArr, int i10) {
        this.f50593e = i10;
        int iW = w(bArr, i10) + i10;
        int iG = (iW + G(bArr, iW)) - i10;
        this.f50594f = iG;
        C6279m c6279m = this.f50612x;
        if (c6279m != null) {
            c6279m.b(bArr, this.f50593e, iG, this, this.f50613y);
        }
        return this.f50594f;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String(super.toString() + ",andxCommand=0x" + Ug.d.c(this.f50541B, 2) + ",andxOffset=" + this.f50542C);
    }

    AbstractC6268b(AbstractC6278l abstractC6278l) {
        this.f50541B = (byte) -1;
        this.f50542C = 0;
        this.f50543D = null;
        if (abstractC6278l != null) {
            this.f50543D = abstractC6278l;
            this.f50541B = abstractC6278l.f50591c;
        }
    }
}
