package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1116bW {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1I] */
    public static C1I A00(final C1153c7 c1153c7, final UK uk2, final String str, final C6X c6x) {
        final boolean z3 = true;
        return new C6M(c1153c7, uk2, z3, str, c6x) { // from class: com.facebook.ads.redexgen.X.1I
            public ViewOnClickListenerC0634Kr A00;
            public C1274e5 A01;
            public final VA A02 = this.A0I.A06().A02().A0A();
            public final UK A03;
            public final C6X A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (XX.A02 * (-4.0f));
            public static final int A07 = (int) (XX.A02 * 6.0f);

            {
                this.A03 = uk2;
                this.A05 = str;
                this.A04 = c6x;
                this.A03.A1Q(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0597Jg
            public void setupNativeCtaExtension(C1274e5 c1274e5) {
                C0700Ng c0700NgA2A;
                this.A01 = c1274e5;
                int iA0Q = C0886Up.A0Q(this.A0I.A06());
                C0694Na c0694NaA01 = this.A03.A13().A28().A01();
                C1436gi c1436giA06 = this.A0I.A06();
                String strA0w = this.A03.A13().A0w();
                VA va2 = this.A02;
                InterfaceC0977Yh dummyListener = C1080aw.getDummyListener();
                C1381fp c1381fpA0b = this.A04.A0b();
                Y2 y2A1E = this.A03.A1E();
                if (this.A03.A13() == null) {
                    c0700NgA2A = null;
                } else {
                    c0700NgA2A = this.A03.A13().A2A();
                }
                this.A00 = new ViewOnClickListenerC0634Kr(c1436giA06, strA0w, c0694NaA01, va2, dummyListener, c1381fpA0b, y2A1E, c0700NgA2A);
                this.A00.setCta(c1274e5.A03().A0J(), this.A05, new HashMap());
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
                    YB.A0R(this.A00, A07, 5, c0694NaA01.A0A(false));
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
