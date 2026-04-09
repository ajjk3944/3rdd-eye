package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2568Gl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public final boolean A00(int i) {
        int i10;
        int i11;
        int padding;
        int bitrateIndex;
        int version;
        int version2;
        if (!AbstractC2569Gm.A06(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (padding = (i >>> 12) & 15) == 0 || padding == 15 || (bitrateIndex = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.A05 = i10;
        int version3 = 3 - i11;
        this.A06 = AbstractC2569Gm.A08[version3];
        int version4 = AbstractC2569Gm.A07[bitrateIndex];
        this.A03 = version4;
        if (i10 == 2) {
            int version5 = this.A03;
            this.A03 = version5 / 2;
        } else if (i10 == 0) {
            int version6 = this.A03;
            this.A03 = version6 / 4;
        }
        int samplingRateIndex = (i >>> 9) & 1;
        int version7 = AbstractC2569Gm.A02(i10, i11);
        this.A04 = version7;
        if (i11 == 3) {
            if (i10 == 3) {
                int version8 = padding - 1;
                version2 = AbstractC2569Gm.A02[version8];
            } else {
                int version9 = padding - 1;
                version2 = AbstractC2569Gm.A06[version9];
            }
            this.A00 = version2;
            int version10 = this.A00;
            int i12 = version10 * 12;
            int version11 = this.A03;
            this.A02 = ((i12 / version11) + samplingRateIndex) * 4;
        } else {
            if (i10 == 3) {
                if (i11 != 2) {
                    int version12 = padding - 1;
                    version = AbstractC2569Gm.A0C()[version12];
                } else {
                    int version13 = padding - 1;
                    version = AbstractC2569Gm.A03[version13];
                }
                this.A00 = version;
                int version14 = this.A00;
                int i13 = version14 * 144;
                int version15 = this.A03;
                this.A02 = (i13 / version15) + samplingRateIndex;
            } else {
                int version16 = padding - 1;
                this.A00 = AbstractC2569Gm.A05[version16];
                int bitrateIndex2 = i11 == 1 ? 72 : 144;
                int version17 = this.A00;
                int bitrateIndex3 = bitrateIndex2 * version17;
                int version18 = this.A03;
                this.A02 = (bitrateIndex3 / version18) + samplingRateIndex;
            }
        }
        int version19 = i >> 6;
        this.A01 = (version19 & 3) == 3 ? 1 : 2;
        return true;
    }
}
