package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1118bY extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C1595jT A02;
    public final C1436gi A03;
    public final VA A04;
    public final InterfaceC0977Yh A05;

    public C1118bY(C1436gi c1436gi, C1595jT c1595jT, VA va2, InterfaceC0977Yh interfaceC0977Yh, int i4, int i10) {
        super(c1436gi);
        this.A03 = c1436gi;
        this.A02 = c1595jT;
        this.A04 = va2;
        this.A05 = interfaceC0977Yh;
        this.A00 = i4;
        this.A01 = new LinearLayout(c1436gi);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i10);
    }

    private void A00() {
        int i4 = 0;
        while (true) {
            int iA23 = this.A02.A23();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int iCharAt = str.charAt(18);
            int i10 = str2.charAt(18);
            if (iCharAt == i10) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i4 < iA23) {
                LF lf2 = new LF(this.A03, this.A02.A27(i4), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i11 = LF.A0C;
                int i12 = LF.A0C;
                int i13 = LF.A0C;
                int i14 = LF.A0C;
                layoutParams.setMargins(i11, i12, i13, i14);
                lf2.setLayoutParams(layoutParams);
                this.A01.addView(lf2);
                i4++;
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

    private void setLayoutOrientation(int i4) {
        if (i4 != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
        }
    }
}
