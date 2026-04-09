package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class V1 {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", "n", "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC1273Uy A01 = EnumC1273Uy.A03;
    public EnumC1274Uz A02 = EnumC1274Uz.A06;
    public V0 A03 = V0.A02;
    public EnumC1272Ux A00 = EnumC1272Ux.A02;

    public final void A00() {
        this.A00 = EnumC1272Ux.A03;
    }

    public final void A01() {
        this.A02 = EnumC1274Uz.A04;
    }

    public final void A02() {
        this.A02 = EnumC1274Uz.A05;
    }

    public final void A03() {
        this.A03 = V0.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC1274Uz.A06) {
            EnumC1274Uz enumC1274Uz = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC1274Uz != EnumC1274Uz.A02 && this.A02 != EnumC1274Uz.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC1274Uz.A06 || this.A02 == EnumC1274Uz.A02;
    }

    public final boolean A06() {
        return this.A03 == V0.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC1272Ux.A03;
    }
}
