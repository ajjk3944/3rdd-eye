package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.7X, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7X extends AbstractC1556ik {
    public static String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public C1547iZ A00;
    public final C1531iI A01;

    public C7X(C1531iI c1531iI, String str) {
        super(c1531iI.A0B, str, A00(c1531iI));
        this.A01 = c1531iI;
    }

    public static C1530iH A00(C1531iI c1531iI) {
        return new C1530iH(c1531iI);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1556ik
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5v();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AJM(OD.A03);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1556ik
    public final void A09() {
        this.A00 = new C1547iZ(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1556ik
    public final void A0D(boolean z3) {
        this.A05.AJn(z3);
    }

    public final C1531iI A0E() {
        return this.A01;
    }

    public final void A0F(Ad ad2, String str, AdExperienceType adExperienceType, boolean z3) {
        if (super.A00.A6U()) {
            return;
        }
        this.A01.A02(ad2);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z3);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z3;
        if (AbstractC0889Us.A09(this.A02) && AbstractC0889Us.A0B(this.A02)) {
            if (AbstractC0889Us.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0G(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(AdError.INTERNAL_ERROR_2003, OY.A00(new Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && Y1.A00() > this.A01.A01;
    }

    public final boolean A0I() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6p() == OD.A05;
    }

    public final boolean A0J(Ad ad2, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((SJ) rewardedVideoShowAdConfig).A00();
        long jA01 = ((SJ) rewardedVideoShowAdConfig).A01();
        if (super.A00.A6V()) {
            return false;
        }
        this.A01.A02(ad2);
        String[] strArr = A02;
        String str = strArr[7];
        String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(iA00);
                return true;
            }
            C1547iZ c1547iZ = this.A00;
            String[] strArr3 = A02;
            String str3 = strArr3[2];
            String str4 = strArr3[1];
            int iCharAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (iCharAt != appOrientation2) {
                String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c1547iZ != null) {
                    return this.A00.A0M(iA00, jA01);
                }
                this.A00 = new C1547iZ(this.A01, this, A04());
                this.A00.A0M(iA00, jA01);
                return false;
            }
        }
        throw new RuntimeException();
    }
}
