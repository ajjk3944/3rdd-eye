package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1494bW {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1I] */
    public static C1I A00(final C1531c7 c1531c7, final UK uk, final String str, final C6X c6x) {
        final boolean z10 = true;
        return new C6M(c1531c7, uk, z10, str, c6x) { // from class: com.facebook.ads.redexgen.X.1I
            public ViewOnClickListenerC1012Kr A00;
            public C1652e5 A01;
            public final VA A02 = this.A0I.A06().A02().A0A();
            public final UK A03;
            public final C6X A04;
            public final String A05;
            public static String[] A06 = {CampaignEx.JSON_KEY_AD_Q, "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (XX.A02 * (-4.0f));
            public static final int A07 = (int) (XX.A02 * 6.0f);

            {
                this.A03 = uk;
                this.A05 = str;
                this.A04 = c6x;
                this.A03.A1Q(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0975Jg
            public void setupNativeCtaExtension(C1652e5 c1652e5) {
                C1078Ng c1078NgA2A;
                this.A01 = c1652e5;
                int iA0Q = C1264Up.A0Q(this.A0I.A06());
                C1072Na c1072NaA01 = this.A03.A13().A28().A01();
                C1814gi c1814giA06 = this.A0I.A06();
                String strA0w = this.A03.A13().A0w();
                VA va = this.A02;
                InterfaceC1355Yh dummyListener = C1458aw.getDummyListener();
                C1759fp c1759fpA0b = this.A04.A0b();
                Y2 y2A1E = this.A03.A1E();
                if (this.A03.A13() == null) {
                    c1078NgA2A = null;
                } else {
                    c1078NgA2A = this.A03.A13().A2A();
                }
                this.A00 = new ViewOnClickListenerC1012Kr(c1814giA06, strA0w, c1072NaA01, va, dummyListener, c1759fpA0b, y2A1E, c1078NgA2A);
                this.A00.setCta(c1652e5.A03().A0J(), this.A05, new HashMap());
                this.A03.A1Q(this.A00);
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
                    YB.A0R(this.A00, A07, 5, c1072NaA01.A0A(false));
                    ((C6M) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0Q == 2) {
                    layoutParams.addRule(3, ((C6M) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C6M) this).A06.bringToFront();
                }
            }
        };
    }
}
