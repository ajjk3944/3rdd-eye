package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1702lJ implements InterfaceC0638Kv {
    public static byte[] A0E;
    public static String[] A0F = {"InS58bT42EZESXm9qvWYUvire34TyqEd", "0QsKXE5Mty2kdKkFlxzakLoeZj9v1JPl", "NRhrqdNeBR4CDjsc7Q9NAC", "KBnn09jRwf0uKhIPK3OJ0VUHuR4AgDGD", "Nq6SUzmzwDzIZ8w7Fc8GQLnhk8OKIhKk", "EhougHeDeIMt7rS1ZxwR1ONoVKreOkGZ", "d5GlJf2nLv2o9PLs5SG9FlMqVuWi5Y0h", "iroqlmoe0TAfPMqOpys1zY2UwesgA9Cl"};
    public long A01;
    public InterfaceC0543Hd A02;
    public L3 A03;
    public String A04;
    public boolean A05;
    public final L9 A0C;
    public final boolean[] A0D = new boolean[3];
    public final L4 A0B = new L4(32, 128);
    public final L4 A09 = new L4(33, 128);
    public final L4 A07 = new L4(34, 128);
    public final L4 A08 = new L4(39, 128);
    public final L4 A0A = new L4(40, 128);
    public long A00 = -9223372036854775807L;
    public final C02434v A06 = new C02434v();

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0E = new byte[]{7, 125, 121, 122, 29, 42, 46, 43, 42, 61, 93, 102, 109, 112, 120, 109, 107, 124, 109, 108, 40, 105, 123, 120, 109, 107, 124, 87, 122, 105, 124, 97, 103, 87, 97, 108, 107, 40, 126, 105, 100, 125, 109, 50, 40, Utf8.REPLACEMENT_BYTE, 32, 45, 44, 38, 102, 33, 44, Utf8.REPLACEMENT_BYTE, 42};
    }

    static {
        A03();
    }

    public C1702lJ(L9 l92) {
        this.A0C = l92;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.C1996qI A00(java.lang.String r22, com.instagram.common.viewpoint.core.L4 r23, com.instagram.common.viewpoint.core.L4 r24, com.instagram.common.viewpoint.core.L4 r25) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1702lJ.A00(java.lang.String, com.facebook.ads.redexgen.X.L4, com.facebook.ads.redexgen.X.L4, com.facebook.ads.redexgen.X.L4):com.facebook.ads.redexgen.X.qI");
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        AbstractC02203y.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j, int i4, int i10, long j8) {
        this.A03.A05(j, i4, this.A05);
        if (!this.A05) {
            this.A0B.A04(i10);
            this.A09.A04(i10);
            this.A07.A04(i10);
            if (this.A0B.A03() && this.A09.A03() && this.A07.A03()) {
                this.A02.A6e(A00(this.A04, this.A0B, this.A09, this.A07));
                this.A05 = true;
            }
        }
        L4 l42 = this.A08;
        if (A0F[2].length() == 29) {
            throw new RuntimeException();
        }
        A0F[7] = "vr6kqTkennNRVlA9BYLGssdVYhiLrcAb";
        if (l42.A04(i10)) {
            this.A06.A0j(this.A08.A01, HS.A02(this.A08.A01, this.A08.A00));
            this.A06.A0g(5);
            this.A0C.A02(j8, this.A06);
        }
        if (this.A0A.A04(i10)) {
            this.A06.A0j(this.A0A.A01, HS.A02(this.A0A.A01, this.A0A.A00));
            this.A06.A0g(5);
            this.A0C.A02(j8, this.A06);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j, int i4, int i10, long j8) {
        this.A03.A04(j, i4, i10, j8, this.A05);
        if (!this.A05) {
            this.A0B.A01(i10);
            this.A09.A01(i10);
            this.A07.A01(i10);
        }
        this.A08.A01(i10);
        String[] strArr = A0F;
        if (strArr[4].charAt(1) == strArr[6].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[3] = "1KFxNiiYNj5YwxcZPXf7qOLOZg48Utfw";
        strArr2[0] = "AJhXWbHH6DfoOyxWmdhumfQDrV4Rkjlm";
        this.A0A.A01(i10);
    }

    public static void A06(HU hu) {
        for (int i4 = 0; i4 < 4; i4++) {
            int i10 = 0;
            while (i10 < 6) {
                int i11 = 1;
                if (!hu.A0A()) {
                    hu.A04();
                } else {
                    int sizeId = i4 << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i4 > 1) {
                        hu.A03();
                    }
                    for (int coefNum = 0; coefNum < iMin; coefNum++) {
                        hu.A03();
                        String[] strArr = A0F;
                        String str = strArr[1];
                        String str2 = strArr[5];
                        int iCharAt = str.charAt(22);
                        int sizeId2 = str2.charAt(22);
                        if (iCharAt == sizeId2) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[1] = "RIQaKQF3d2DPjAKRmkcEP1Qw2m8MXhOp";
                        strArr2[5] = "Zvlj8YgWRgjcS6ffkQSgKy13bXSJEEo8";
                    }
                }
                if (i4 == 3) {
                    i11 = 3;
                }
                i10 += i11;
            }
        }
    }

    public static void A07(HU hu) {
        int iA04 = hu.A04();
        boolean zA0A = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < iA04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                zA0A = hu.A0A();
            }
            if (zA0A) {
                hu.A06();
                hu.A04();
                for (int i4 = 0; i4 <= numNegativePics; i4++) {
                    if (hu.A0A()) {
                        hu.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = hu.A04();
                int iA042 = hu.A04();
                numNegativePics = previousNumDeltaPocs + iA042;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    hu.A04();
                    hu.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < iA042; numShortTermRefPicSets2++) {
                    hu.A04();
                    hu.A06();
                }
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i4, int i10) {
        this.A03.A06(bArr, i4, i10);
        if (!this.A05) {
            this.A0B.A02(bArr, i4, i10);
            this.A09.A02(bArr, i4, i10);
            this.A07.A02(bArr, i4, i10);
        }
        this.A08.A02(bArr, i4, i10);
        this.A0A.A02(bArr, i4, i10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void A5A(C02434v c02434v) {
        A02();
        while (c02434v.A07() > 0) {
            int limit = c02434v.A09();
            int iA0A = c02434v.A0A();
            byte[] bArrA0l = c02434v.A0l();
            long j = this.A01;
            int offset = c02434v.A07();
            this.A01 = j + offset;
            InterfaceC0543Hd interfaceC0543Hd = this.A02;
            int offset2 = c02434v.A07();
            interfaceC0543Hd.AIr(c02434v, offset2);
            while (limit < iA0A) {
                int iA04 = HS.A04(bArrA0l, limit, iA0A, this.A0D);
                if (iA04 == iA0A) {
                    A08(bArrA0l, limit, iA0A);
                    return;
                }
                int bytesWrittenPastPosition = HS.A00(bArrA0l, iA04);
                int i4 = iA04 - limit;
                if (A0F[7].charAt(7) != 'e') {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[1] = "NnhvxMiSCkNhwXkURhMspTAR6cceqM1j";
                strArr[5] = "7ARxjazDMsknrtTfPy5OOEp3py29nWBE";
                if (i4 > 0) {
                    A08(bArrA0l, limit, iA04);
                }
                int lengthToNalUnit = iA0A - iA04;
                long j8 = this.A01 - lengthToNalUnit;
                int offset3 = i4 < 0 ? -i4 : 0;
                A04(j8, lengthToNalUnit, offset3, this.A00);
                long absolutePosition = this.A00;
                A05(j8, lengthToNalUnit, bytesWrittenPastPosition, absolutePosition);
                limit = iA04 + 3;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void A5c(HA ha2, LG lg2) {
        lg2.A05();
        this.A04 = lg2.A04();
        this.A02 = ha2.AKS(lg2.A03(), 2);
        this.A03 = new L3(this.A02);
        this.A0C.A03(ha2, lg2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AGp() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AGq(long j, int i4) {
        if (j != -9223372036854775807L) {
            this.A00 = j;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AJ5() {
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
        HS.A0H(this.A0D);
        this.A0B.A00();
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        this.A0A.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
