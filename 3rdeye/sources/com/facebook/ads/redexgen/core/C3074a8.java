package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3074a8 extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C3545hw A02;
    public final C3272dL A03;
    public final US A04;
    public final InterfaceC3003Xn A05;

    public C3074a8(C3272dL c3272dL, C3545hw c3545hw, US us, InterfaceC3003Xn interfaceC3003Xn, int i, int i10) {
        super(c3272dL);
        this.A03 = c3272dL;
        this.A02 = c3545hw;
        this.A04 = us;
        this.A05 = interfaceC3003Xn;
        this.A00 = i;
        this.A01 = new LinearLayout(c3272dL);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i10);
    }

    private void A00() {
        int i = 0;
        while (true) {
            int iA1u = this.A02.A1u();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int iCharAt = str.charAt(18);
            int i10 = str2.charAt(18);
            if (iCharAt == i10) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i < iA1u) {
                KI ki = new KI(this.A03, this.A02.A1x(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i11 = KI.A0C;
                int i12 = KI.A0C;
                int i13 = KI.A0C;
                int i14 = KI.A0C;
                layoutParams.setMargins(i11, i12, i13, i14);
                ki.setLayoutParams(layoutParams);
                this.A01.addView(ki);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
        }
    }
}
