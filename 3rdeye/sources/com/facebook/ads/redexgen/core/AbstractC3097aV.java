package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3097aV {
    public static float A00(C2726Mp c2726Mp) {
        int height = c2726Mp.A0H().A01();
        int width = c2726Mp.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((AbstractC2974Wk.A00().widthPixels - (AbstractC3106ae.A07 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = XP.A01(16);
        int ctaTextHeight = AbstractC3077aB.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC3106ae.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = AbstractC2974Wk.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC3096aU A03(KE ke, String str) {
        return new ViewOnClickListenerC3096aU(ke, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i) {
        return A02(i) < A01(d10);
    }

    public static boolean A06(int i, int i10, double d10) {
        return i == 2 || A05(d10, i10);
    }
}
