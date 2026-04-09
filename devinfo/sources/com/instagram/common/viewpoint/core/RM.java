package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;

/* loaded from: assets/audience_network/classes2.dex */
public class RM {
    public static String[] A05 = {"40gNEszX7YLOKw1QAED", "e7K0z1bDPzofCfI", "ASnLeHz2bV9", "nmSIAJ68DE4LOtHWgfxbIilOKN", "hLnVaEL0YJl", "iKeUOsk7q", "", "C"};
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    private final int A00(int i4, int i10) {
        if (i4 > i10) {
            return 1;
        }
        if (i4 == i10) {
            return 2;
        }
        return 4;
    }

    public final void A01() {
        this.A00 = 0;
    }

    public final void A02(int i4) {
        this.A00 |= i4;
    }

    public final void A03(int i4, int i10, int i11, int i12) {
        this.A04 = i4;
        this.A03 = i10;
        this.A02 = i11;
        this.A01 = i12;
    }

    public final boolean A04() {
        if ((this.A00 & 7) != 0 && (this.A00 & (A00(this.A02, this.A04) << 0)) == 0) {
            return false;
        }
        if ((this.A00 & AppLovinMediationAdapter.ERROR_CHILD_USER) != 0 && (this.A00 & (A00(this.A02, this.A03) << 4)) == 0) {
            return false;
        }
        if ((this.A00 & 1792) != 0 && (this.A00 & (A00(this.A01, this.A04) << 8)) == 0) {
            return false;
        }
        if ((this.A00 & 28672) != 0 && (this.A00 & (A00(this.A01, this.A03) << 12)) == 0) {
            return false;
        }
        if (A05[0].length() == 6) {
            throw new RuntimeException();
        }
        A05[0] = "B0e1SHPnLLvWk0RI25GHgx";
        return true;
    }
}
