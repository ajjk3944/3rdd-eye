package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1140bu {
    public static float A00(NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((XW.A00().widthPixels - (AbstractC1149c3.A08 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = YB.A01(16);
        int ctaTextHeight = AbstractC1121bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1149c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC1139bt A03(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr, String str) {
        return new ViewOnClickListenerC1139bt(viewOnClickListenerC0634Kr, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i4) {
        return A02(i4) < A01(d10);
    }

    public static boolean A06(int i4, int i10, double d10) {
        return i4 == 2 || A05(d10, i10);
    }
}
