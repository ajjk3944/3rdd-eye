package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3073a6 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0g] */
    public static C21650g A00(final C3110ai c3110ai, final C2815Qc c2815Qc, final String str, final C23055s c23055s) {
        final boolean z10 = true;
        return new C22945h(c3110ai, c2815Qc, z10, str, c23055s) { // from class: com.facebook.ads.redexgen.X.0g
            public KE A00;
            public C3239cn A01;
            public final US A02 = this.A0I.A06().A02().A0A();
            public final C2815Qc A03;
            public final C23055s A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC2975Wl.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC2975Wl.A02 * 6.0f);

            {
                this.A03 = c2815Qc;
                this.A05 = str;
                this.A04 = c23055s;
                this.A03.A1L(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2625Ir
            public void setupNativeCtaExtension(C3239cn c3239cn) {
                N3 n3A21;
                this.A01 = c3239cn;
                int iA0Q = U7.A0Q(this.A0I.A06());
                C2735My c2735MyA01 = this.A03.A10().A1z().A01();
                C3272dL c3272dLA06 = this.A0I.A06();
                String strA0r = this.A03.A10().A0r();
                US us = this.A02;
                InterfaceC3003Xn dummyListener = C3044Zc.getDummyListener();
                C3345eX c3345eXA0b = this.A04.A0b();
                XH xhA1A = this.A03.A1A();
                if (this.A03.A10() == null) {
                    n3A21 = null;
                } else {
                    n3A21 = this.A03.A10().A21();
                }
                this.A00 = new KE(c3272dLA06, strA0r, c2735MyA01, us, dummyListener, c3345eXA0b, xhA1A, n3A21);
                this.A00.setCta(c3239cn.A03().A0J(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0Q == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    XP.A0N(this.A00, A07, 5, c2735MyA01.A0A(false));
                    ((C22945h) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0Q == 2) {
                    layoutParams.addRule(3, ((C22945h) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C22945h) this).A06.bringToFront();
                }
            }
        };
    }
}
