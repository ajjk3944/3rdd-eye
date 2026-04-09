package Ug;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class f extends MessageDigest implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int[] f22465a;

    /* renamed from: b, reason: collision with root package name */
    private long f22466b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f22467c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f22468d;

    public f() {
        super("MD4");
        this.f22465a = new int[4];
        this.f22467c = new byte[64];
        this.f22468d = new int[16];
        engineReset();
    }

    private int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i10 + (((~i11) & i13) | (i12 & i11)) + i14;
        return (i16 >>> (32 - i15)) | (i16 << i15);
    }

    private int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i10 + ((i11 & (i12 | i13)) | (i12 & i13)) + i14 + 1518500249;
        return (i16 >>> (32 - i15)) | (i16 << i15);
    }

    private int d(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i10 + ((i11 ^ i12) ^ i13) + i14 + 1859775393;
        return (i16 >>> (32 - i15)) | (i16 << i15);
    }

    private void e(byte[] bArr, int i10) {
        int i11 = i10;
        for (int i12 = 0; i12 < 16; i12++) {
            int[] iArr = this.f22468d;
            int i13 = i11 + 3;
            int i14 = ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
            i11 += 4;
            iArr[i12] = i14 | ((bArr[i13] & 255) << 24);
        }
        int[] iArr2 = this.f22465a;
        int i15 = iArr2[0];
        int i16 = iArr2[1];
        int i17 = iArr2[2];
        int i18 = iArr2[3];
        int iB = b(i15, i16, i17, i18, this.f22468d[0], 3);
        int iB2 = b(i18, iB, i16, i17, this.f22468d[1], 7);
        int iB3 = b(i17, iB2, iB, i16, this.f22468d[2], 11);
        int iB4 = b(i16, iB3, iB2, iB, this.f22468d[3], 19);
        int iB5 = b(iB, iB4, iB3, iB2, this.f22468d[4], 3);
        int iB6 = b(iB2, iB5, iB4, iB3, this.f22468d[5], 7);
        int iB7 = b(iB3, iB6, iB5, iB4, this.f22468d[6], 11);
        int iB8 = b(iB4, iB7, iB6, iB5, this.f22468d[7], 19);
        int iB9 = b(iB5, iB8, iB7, iB6, this.f22468d[8], 3);
        int iB10 = b(iB6, iB9, iB8, iB7, this.f22468d[9], 7);
        int iB11 = b(iB7, iB10, iB9, iB8, this.f22468d[10], 11);
        int iB12 = b(iB8, iB11, iB10, iB9, this.f22468d[11], 19);
        int iB13 = b(iB9, iB12, iB11, iB10, this.f22468d[12], 3);
        int iB14 = b(iB10, iB13, iB12, iB11, this.f22468d[13], 7);
        int iB15 = b(iB11, iB14, iB13, iB12, this.f22468d[14], 11);
        int iB16 = b(iB12, iB15, iB14, iB13, this.f22468d[15], 19);
        int iC = c(iB13, iB16, iB15, iB14, this.f22468d[0], 3);
        int iC2 = c(iB14, iC, iB16, iB15, this.f22468d[4], 5);
        int iC3 = c(iB15, iC2, iC, iB16, this.f22468d[8], 9);
        int iC4 = c(iB16, iC3, iC2, iC, this.f22468d[12], 13);
        int iC5 = c(iC, iC4, iC3, iC2, this.f22468d[1], 3);
        int iC6 = c(iC2, iC5, iC4, iC3, this.f22468d[5], 5);
        int iC7 = c(iC3, iC6, iC5, iC4, this.f22468d[9], 9);
        int iC8 = c(iC4, iC7, iC6, iC5, this.f22468d[13], 13);
        int iC9 = c(iC5, iC8, iC7, iC6, this.f22468d[2], 3);
        int iC10 = c(iC6, iC9, iC8, iC7, this.f22468d[6], 5);
        int iC11 = c(iC7, iC10, iC9, iC8, this.f22468d[10], 9);
        int iC12 = c(iC8, iC11, iC10, iC9, this.f22468d[14], 13);
        int iC13 = c(iC9, iC12, iC11, iC10, this.f22468d[3], 3);
        int iC14 = c(iC10, iC13, iC12, iC11, this.f22468d[7], 5);
        int iC15 = c(iC11, iC14, iC13, iC12, this.f22468d[11], 9);
        int iC16 = c(iC12, iC15, iC14, iC13, this.f22468d[15], 13);
        int iD = d(iC13, iC16, iC15, iC14, this.f22468d[0], 3);
        int iD2 = d(iC14, iD, iC16, iC15, this.f22468d[8], 9);
        int iD3 = d(iC15, iD2, iD, iC16, this.f22468d[4], 11);
        int iD4 = d(iC16, iD3, iD2, iD, this.f22468d[12], 15);
        int iD5 = d(iD, iD4, iD3, iD2, this.f22468d[2], 3);
        int iD6 = d(iD2, iD5, iD4, iD3, this.f22468d[10], 9);
        int iD7 = d(iD3, iD6, iD5, iD4, this.f22468d[6], 11);
        int iD8 = d(iD4, iD7, iD6, iD5, this.f22468d[14], 15);
        int iD9 = d(iD5, iD8, iD7, iD6, this.f22468d[1], 3);
        int iD10 = d(iD6, iD9, iD8, iD7, this.f22468d[9], 9);
        int iD11 = d(iD7, iD10, iD9, iD8, this.f22468d[5], 11);
        int iD12 = d(iD8, iD11, iD10, iD9, this.f22468d[13], 15);
        int iD13 = d(iD9, iD12, iD11, iD10, this.f22468d[3], 3);
        int iD14 = d(iD10, iD13, iD12, iD11, this.f22468d[11], 9);
        int iD15 = d(iD11, iD14, iD13, iD12, this.f22468d[7], 11);
        int iD16 = d(iD12, iD15, iD14, iD13, this.f22468d[15], 15);
        int[] iArr3 = this.f22465a;
        iArr3[0] = iArr3[0] + iD13;
        iArr3[1] = iArr3[1] + iD16;
        iArr3[2] = iArr3[2] + iD15;
        iArr3[3] = iArr3[3] + iD14;
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        return new f(this);
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        int i10 = (int) (this.f22466b % 64);
        int i11 = i10 < 56 ? 56 - i10 : 120 - i10;
        int i12 = i11 + 8;
        byte[] bArr = new byte[i12];
        bArr[0] = -128;
        for (int i13 = 0; i13 < 8; i13++) {
            bArr[i11 + i13] = (byte) ((this.f22466b * 8) >>> (i13 * 8));
        }
        engineUpdate(bArr, 0, i12);
        byte[] bArr2 = new byte[16];
        for (int i14 = 0; i14 < 4; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                bArr2[(i14 * 4) + i15] = (byte) (this.f22465a[i14] >>> (i15 * 8));
            }
        }
        engineReset();
        return bArr2;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        int[] iArr = this.f22465a;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        this.f22466b = 0L;
        for (int i10 = 0; i10 < 64; i10++) {
            this.f22467c[i10] = 0;
        }
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b10) {
        long j10 = this.f22466b;
        int i10 = (int) (j10 % 64);
        this.f22466b = j10 + 1;
        byte[] bArr = this.f22467c;
        bArr[i10] = b10;
        if (i10 == 63) {
            e(bArr, 0);
        }
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            long j10 = i11;
            if (i10 + j10 <= bArr.length) {
                long j11 = this.f22466b;
                int i12 = (int) (j11 % 64);
                this.f22466b = j11 + j10;
                int i13 = 64 - i12;
                int i14 = 0;
                if (i11 >= i13) {
                    System.arraycopy(bArr, i10, this.f22467c, i12, i13);
                    e(this.f22467c, 0);
                    while (true) {
                        int i15 = i13 + 64;
                        if (i13 + 63 >= i11) {
                            break;
                        }
                        e(bArr, i13 + i10);
                        i13 = i15;
                    }
                    i12 = 0;
                    i14 = i13;
                }
                if (i14 < i11) {
                    System.arraycopy(bArr, i10 + i14, this.f22467c, i12, i11 - i14);
                    return;
                }
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private f(f fVar) {
        this();
        this.f22465a = (int[]) fVar.f22465a.clone();
        this.f22467c = (byte[]) fVar.f22467c.clone();
        this.f22466b = fVar.f22466b;
    }
}
