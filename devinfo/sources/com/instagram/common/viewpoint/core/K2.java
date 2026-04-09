package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.applovin.shadow.okio.Utf8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class K2 {
    public static byte[] A07;
    public static String[] A08 = {"kwH2IgvZBGVpLaminurwcFHn", "J6e0tkh1Ff6tZSOwzR7AwbvIu8fVWeGQ", "bmiWbLOqDwiyYFUNe9As1QTlUgH4xYog", "dMXPCdyZdj7A6mfCnV5k3qiAvM2EcvhL", "upBvpVjUbbd4tW9uVknw3ChYtDg3XaKB", "lx9xVZ51GyjZV5dkAVxa", "4OpeXOwoxJhsdURDQeyl4TBKgN5cofiY", "16zjJfNWedSO35u1fMpvBODfGSUbEH9B"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C0611Ju A04;
    public final C0612Jv A05;
    public final K1 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0611Ju A04(C02424u c02424u, int i4) {
        int iA04;
        int iA042;
        int iA043;
        int iA044;
        int i10 = 8;
        int iA045 = c02424u.A04(8);
        c02424u.A09(8);
        int i11 = i4 - 2;
        int[] iArrA0F = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        while (i11 > 0) {
            int iA046 = c02424u.A04(i10);
            int iA047 = c02424u.A04(i10);
            int i12 = i11 - 2;
            int[] iArr = (iA047 & 128) != 0 ? iArrA0F : (iA047 & 64) != 0 ? iArrA0G : iArrA0H;
            int i13 = iA047 & 1;
            String[] strArr = A08;
            if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A08[3] = "yhDNrhcDigDR24Kxe5BS389mQBs2ZM2v";
            if (i13 != 0) {
                iA04 = c02424u.A04(i10);
                iA042 = c02424u.A04(i10);
                iA043 = c02424u.A04(i10);
                iA044 = c02424u.A04(i10);
                i11 = i12 - 4;
            } else {
                iA04 = c02424u.A04(6) << 2;
                iA042 = c02424u.A04(4) << 4;
                iA043 = c02424u.A04(4) << 4;
                iA044 = c02424u.A04(2) << 6;
                i11 = i12 - 2;
            }
            if (iA04 == 0) {
                iA042 = 0;
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[7] = "NRFOfVblegIP33K9RsgAL0VferudmJOb";
                iA043 = 0;
                iA044 = 255;
            }
            iArr[iA046] = A00(255 - (iA044 & 255), C5C.A07((int) (iA04 + ((iA042 - 128) * 1.402d)), 0, 255), C5C.A07((int) ((iA04 - ((iA043 - 128) * 0.34414d)) - ((iA042 - 128) * 0.71414d)), 0, 255), C5C.A07((int) (iA04 + ((iA043 - 128) * 1.772d)), 0, 255));
            i10 = 8;
        }
        return new C0611Ju(iA045, iArrA0F, iArrA0G, iArrA0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0612Jv A05(C02424u c02424u) {
        int iA04;
        int iA042;
        int iA043;
        int iA044;
        c02424u.A09(4);
        boolean zA0H = c02424u.A0H();
        c02424u.A09(3);
        int iA045 = c02424u.A04(16);
        int iA046 = c02424u.A04(16);
        if (zA0H) {
            iA04 = c02424u.A04(16);
            iA044 = c02424u.A04(16);
            iA042 = c02424u.A04(16);
            iA043 = c02424u.A04(16);
        } else {
            iA04 = 0;
            iA042 = 0;
            iA043 = iA046;
            iA044 = iA045;
        }
        return new C0612Jv(iA045, iA046, iA04, iA044, iA042, iA043);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0616Jz A08(C02424u c02424u, int i4) {
        int i10 = 8;
        int iA04 = c02424u.A04(8);
        c02424u.A09(4);
        boolean zA0H = c02424u.A0H();
        c02424u.A09(3);
        int iA042 = c02424u.A04(16);
        int iA043 = c02424u.A04(16);
        int iA044 = c02424u.A04(3);
        int iA045 = c02424u.A04(3);
        c02424u.A09(2);
        int iA046 = c02424u.A04(8);
        int iA047 = c02424u.A04(8);
        int iA048 = c02424u.A04(4);
        int iA049 = c02424u.A04(2);
        c02424u.A09(2);
        int i11 = i4 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iA0410 = c02424u.A04(16);
            int iA0411 = c02424u.A04(2);
            int iA0412 = c02424u.A04(2);
            int iA0413 = c02424u.A04(12);
            c02424u.A09(4);
            int iA0414 = c02424u.A04(12);
            i11 -= 6;
            int iA0415 = 0;
            int iA0416 = 0;
            if (iA0411 == 1 || iA0411 == 2) {
                iA0415 = c02424u.A04(i10);
                iA0416 = c02424u.A04(i10);
                i11 -= 2;
            }
            sparseArray.put(iA0410, new K0(iA0411, iA0412, iA0413, iA0414, iA0415, iA0416));
            i10 = 8;
        }
        return new C0616Jz(iA04, zA0H, iA042, iA043, iA044, iA045, iA046, iA047, iA048, iA049, sparseArray);
    }

    public static String A09(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{Utf8.REPLACEMENT_BYTE, 26, 15, 26, 91, 29, 18, 30, 23, 31, 91, 23, 30, 21, 28, 15, 19, 91, 30, 3, 24, 30, 30, 31, 8, 91, 23, 18, 22, 18, 15, 98, 80, 68, 118, 71, 84, 85, 67, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<C1946pT> A0I(byte[] bArr, int i4) {
        C02424u c02424u = new C02424u(bArr, i4);
        while (c02424u.A01() >= 48 && c02424u.A04(8) == 15) {
            A0B(c02424u, this.A06);
        }
        C0614Jx c0614Jx = this.A06.A01;
        if (c0614Jx == null) {
            return Collections.emptyList();
        }
        C0612Jv c0612Jv = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c0612Jv.A05 + 1 != this.A00.getWidth() || c0612Jv.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(c0612Jv.A05 + 1, c0612Jv.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C0615Jy> sparseArray = c0614Jx.A03;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            this.A01.save();
            C0615Jy c0615JyValueAt = sparseArray.valueAt(i10);
            C0616Jz c0616Jz = this.A06.A08.get(sparseArray.keyAt(i10));
            int i11 = c0615JyValueAt.A00 + c0612Jv.A02;
            int i12 = c0615JyValueAt.A01 + c0612Jv.A04;
            this.A01.clipRect(i11, i12, Math.min(c0616Jz.A08 + i11, c0612Jv.A01), Math.min(c0616Jz.A02 + i12, c0612Jv.A03));
            C0611Ju c0611Ju = this.A06.A06.get(c0616Jz.A00);
            if (c0611Ju == null && (c0611Ju = this.A06.A04.get(c0616Jz.A00)) == null) {
                c0611Ju = this.A04;
            }
            SparseArray<K0> sparseArray2 = c0616Jz.A09;
            for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                int iKeyAt = sparseArray2.keyAt(i13);
                K0 k0ValueAt = sparseArray2.valueAt(i13);
                C0613Jw c0613Jw = this.A06.A07.get(iKeyAt);
                if (c0613Jw == null) {
                    c0613Jw = this.A06.A05.get(iKeyAt);
                }
                if (c0613Jw != null) {
                    A0C(c0613Jw, c0611Ju, c0616Jz.A01, i11 + k0ValueAt.A02, i12 + k0ValueAt.A05, c0613Jw.A01 ? null : this.A02, this.A01);
                }
            }
            if (A08[4].charAt(14) != '9') {
                throw new RuntimeException();
            }
            A08[0] = "Y9Cu9eZ8R7HUBmBBCZ1DilUT";
            if (c0616Jz.A0A) {
                this.A03.setColor(c0616Jz.A01 == 3 ? c0611Ju.A03[c0616Jz.A07] : c0616Jz.A01 == 2 ? c0611Ju.A02[c0616Jz.A06] : c0611Ju.A01[c0616Jz.A05]);
                this.A01.drawRect(i11, i12, c0616Jz.A08 + i11, c0616Jz.A02 + i12, this.A03);
            }
            arrayList.add(new C02103o().A0D(Bitmap.createBitmap(this.A00, i11, i12, c0616Jz.A08, c0616Jz.A02)).A04(i11 / c0612Jv.A05).A0A(0).A07(i12 / c0612Jv.A00, 0).A09(0).A06(c0616Jz.A08 / c0612Jv.A05).A03(c0616Jz.A02 / c0612Jv.A00).A0H());
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
            this.A01.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public K2(int i4, int i10) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0612Jv(719, 575, 0, 719, 0, 575);
        this.A04 = new C0611Ju(0, A0F(), A0G(), A0H());
        this.A06 = new K1(i4, i10);
    }

    public static int A00(int i4, int i10, int i11, int i12) {
        return (i4 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    public static int A01(C02424u c02424u, int[] iArr, byte[] bArr, int i4, int i10, Paint paint, Canvas canvas) {
        boolean z3 = false;
        do {
            int iA04 = 0;
            int iA042 = c02424u.A04(2);
            if (iA042 != 0) {
                iA04 = 1;
            } else if (c02424u.A0H()) {
                iA04 = c02424u.A04(3) + 3;
                iA042 = c02424u.A04(2);
            } else if (c02424u.A0H()) {
                iA04 = 1;
                iA042 = 0;
            } else {
                switch (c02424u.A04(2)) {
                    case 0:
                        z3 = true;
                        iA042 = 0;
                        break;
                    case 1:
                        iA04 = 2;
                        iA042 = 0;
                        break;
                    case 2:
                        int iA043 = c02424u.A04(4);
                        if (A08[7].charAt(9) != 'e') {
                            A08[7] = "PWQusWjmzTX1R8w37TeIuijcGSqhz46U";
                            iA04 = iA043 + 12;
                            iA042 = c02424u.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    case 3:
                        iA04 = c02424u.A04(8) + 29;
                        iA042 = c02424u.A04(2);
                        break;
                    default:
                        iA042 = 0;
                        break;
                }
            }
            if (iA04 != 0 && paint != null) {
                if (bArr != null) {
                    iA042 = bArr[iA042];
                }
                paint.setColor(iArr[iA042]);
                canvas.drawRect(i4, i10, i4 + iA04, i10 + 1, paint);
            }
            i4 += iA04;
        } while (!z3);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[PHI: r0
  0x0071: PHI (r0v20 int) = (r0v18 int), (r0v23 int) binds: [B:25:0x0080, B:22:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(com.instagram.common.viewpoint.core.C02424u r14, int[] r15, byte[] r16, int r17, int r18, android.graphics.Paint r19, android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.K2.A02(com.facebook.ads.redexgen.X.4u, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int A03(C02424u c02424u, int[] iArr, byte[] bArr, int i4, int i10, Paint paint, Canvas canvas) {
        int runLength;
        int i11 = i4;
        boolean z3 = false;
        do {
            int iA04 = c02424u.A04(8);
            if (iA04 != 0) {
                runLength = 1;
            } else if (!c02424u.A0H()) {
                runLength = c02424u.A04(7);
                if (runLength != 0) {
                    iA04 = 0;
                } else {
                    z3 = true;
                    runLength = 0;
                    iA04 = 0;
                }
            } else {
                runLength = c02424u.A04(7);
                iA04 = c02424u.A04(8);
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[3] = "mqxvpcZRbZaRJOXRSA703vBu0XWYN9Vd";
                canvas.drawRect(i11, i10, i11 + runLength, i10 + 1, paint);
            }
            i11 += runLength;
        } while (!z3);
        return i11;
    }

    public static C0613Jw A06(C02424u c02424u) {
        int iA04 = c02424u.A04(16);
        c02424u.A09(4);
        int objectCodingMethod = c02424u.A04(2);
        boolean zA0H = c02424u.A0H();
        c02424u.A09(1);
        byte[] bottomFieldData = C5C.A07;
        byte[] bArr = C5C.A07;
        if (objectCodingMethod == 1) {
            int numberOfCodes = c02424u.A04(8);
            c02424u.A09(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int iA042 = c02424u.A04(16);
            int topFieldDataLength = c02424u.A04(16);
            int objectId = A08[4].charAt(14);
            if (objectId != 57) {
                throw new RuntimeException();
            }
            A08[7] = "H05iJqDXaQUoFjCcOPsdhLa69PYGJoEl";
            if (iA042 > 0) {
                bottomFieldData = new byte[iA042];
                c02424u.A0G(bottomFieldData, 0, iA042);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                c02424u.A0G(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new C0613Jw(iA04, zA0H, bottomFieldData, bArr);
    }

    public static C0614Jx A07(C02424u c02424u, int i4) {
        int iA04 = c02424u.A04(8);
        int iA042 = c02424u.A04(4);
        int iA043 = c02424u.A04(2);
        c02424u.A09(2);
        int i10 = i4 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int remainingLength = c02424u.A04(8);
            c02424u.A09(8);
            int version = c02424u.A04(16);
            int timeoutSecs = c02424u.A04(16);
            i10 -= 6;
            sparseArray.put(remainingLength, new C0615Jy(version, timeoutSecs));
        }
        return new C0614Jx(iA04, iA042, iA043, sparseArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0B(com.instagram.common.viewpoint.core.C02424u r7, com.instagram.common.viewpoint.core.K1 r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.K2.A0B(com.facebook.ads.redexgen.X.4u, com.facebook.ads.redexgen.X.K1):void");
    }

    public static void A0C(C0613Jw c0613Jw, C0611Ju c0611Ju, int i4, int i10, int i11, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i4 == 3) {
            iArr = c0611Ju.A03;
        } else if (i4 == 2) {
            iArr = c0611Ju.A02;
        } else {
            iArr = c0611Ju.A01;
        }
        A0D(c0613Jw.A03, iArr, i4, i10, i11, paint, canvas);
        A0D(c0613Jw.A02, iArr, i4, i10, i11 + 1, paint, canvas);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i4, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i12 = i11;
        C02424u c02424u = new C02424u(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        byte[] bArrA0E = null;
        int line = i10;
        while (c02424u.A01() != 0) {
            switch (c02424u.A04(8)) {
                case 16:
                    if (i4 == 3) {
                        bArr2 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i4 == 2) {
                        bArr2 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        bArr2 = null;
                    }
                    line = A01(c02424u, iArr, bArr2, line, i12, paint, canvas);
                    c02424u.A06();
                    break;
                case 17:
                    if (i4 == 3) {
                        bArr3 = bArrA0E == null ? A0B : bArrA0E;
                    } else {
                        bArr3 = null;
                    }
                    line = A02(c02424u, iArr, bArr3, line, i12, paint, canvas);
                    c02424u.A06();
                    break;
                case 18:
                    line = A03(c02424u, iArr, null, line, i12, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c02424u);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c02424u);
                    break;
                case 34:
                    bArrA0E = A0E(16, 8, c02424u);
                    break;
                case 240:
                    i12 += 2;
                    line = i10;
                    break;
            }
        }
    }

    public static byte[] A0E(int i4, int i10, C02424u c02424u) {
        byte[] bArr = new byte[i4];
        for (int i11 = 0; i11 < i4; i11++) {
            bArr[i11] = (byte) c02424u.A04(i10);
        }
        return bArr;
    }

    public static int[] A0F() {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -16777216;
        String[] strArr = A08;
        if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
            throw new RuntimeException();
        }
        A08[1] = "Jw8cEdbjQQjFC79Gk6sPH9AUdvvWBQg4";
        iArr[3] = -8421505;
        return iArr;
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i4 = 1; i4 < iArr.length; i4++) {
            if (i4 < 8) {
                int i10 = (i4 & 1) != 0 ? 255 : 0;
                iArr[i4] = A00(255, i10, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = (i4 & 1) != 0 ? 127 : 0;
                int i12 = (i4 & 2) != 0 ? 127 : 0;
                int i13 = i4 & 4;
                if (A08[4].charAt(14) != '9') {
                    throw new RuntimeException();
                }
                A08[3] = "UrHD9QQTZDyJKzMppguU3aPtXoZ0irSR";
                iArr[i4] = A00(255, i11, i12, i13 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0029, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.K2.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
