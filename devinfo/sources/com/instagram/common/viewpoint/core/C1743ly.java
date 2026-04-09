package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1743ly extends AbstractC0592Jb {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public HJ A00;
    public C1744lz A01;

    private int A00(C02434v c02434v) {
        int i4 = (c02434v.A0l()[2] & 255) >> 4;
        if (i4 == 6 || i4 == 7) {
            c02434v.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int iCharAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (iCharAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c02434v.A0S();
        }
        int result = HF.A00(c02434v, i4);
        c02434v.A0f(0);
        return result;
    }

    public static boolean A01(C02434v c02434v) {
        return c02434v.A07() >= 5 && c02434v.A0I() == 127 && c02434v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    public final long A09(C02434v c02434v) {
        if (!A02(c02434v.A0l())) {
            return -1L;
        }
        return A00(c02434v);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    public final void A0B(boolean z3) {
        super.A0B(z3);
        if (z3) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0592Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C02434v c02434v, long j, C0591Ja c0591Ja) {
        byte[] bArrA0l = c02434v.A0l();
        HJ hj2 = this.A00;
        if (hj2 == null) {
            HJ hj3 = new HJ(bArrA0l, 17);
            this.A00 = hj3;
            c0591Ja.A00 = hj3.A08(Arrays.copyOfRange(bArrA0l, 9, c02434v.A0A()), null);
            return true;
        }
        if ((bArrA0l[0] & 127) == 3) {
            HI hiA03 = HH.A03(c02434v);
            HJ streamMetadata = hj2.A09(hiA03);
            this.A00 = streamMetadata;
            this.A01 = new C1744lz(streamMetadata, hiA03);
            return true;
        }
        if (!A02(bArrA0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j);
            c0591Ja.A01 = this.A01;
        }
        C1996qI c1996qI = c0591Ja.A00;
        String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        AbstractC02203y.A01(c1996qI);
        return false;
    }
}
