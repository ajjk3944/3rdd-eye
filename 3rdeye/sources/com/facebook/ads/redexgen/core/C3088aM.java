package com.facebook.ads.redexgen.core;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3088aM extends LinearLayout {
    public static final int A06 = (int) (AbstractC2975Wl.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C3272dL A04;
    public final C3089aN[] A05;

    public C3088aM(C3272dL c3272dL, int i, int i10, int i11, int i12) {
        super(c3272dL);
        this.A00 = A06;
        this.A04 = c3272dL;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i11;
        this.A02 = i12;
        this.A05 = new C3089aN[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            this.A05[i13] = A00();
            addView(this.A05[i13]);
        }
        A01();
    }

    private C3089aN A00() {
        C3089aN c3089aN = new C3089aN(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c3089aN.setLayoutParams(starRatingViewParams);
        return c3089aN;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01() {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.aN[] r0 = r3.A05
            int r0 = r0.length
            if (r2 >= r0) goto L1b
            com.facebook.ads.redexgen.X.aN[] r0 = r3.A05
            r0 = r0[r2]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r2 != 0) goto L18
            r0 = 0
        L13:
            r1.leftMargin = r0
            int r2 = r2 + 1
            goto L1
        L18:
            int r0 = r3.A00
            goto L13
        L1b:
            r3.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3088aM.A01():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(float r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.aN[] r0 = r3.A05
            int r0 = r0.length
            if (r2 >= r0) goto L1f
            float r0 = (float) r2
            float r1 = r4 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1 = 0
        L15:
            com.facebook.ads.redexgen.X.aN[] r0 = r3.A05
            r0 = r0[r2]
            r0.setFillRatio(r1)
            int r2 = r2 + 1
            goto L1
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3088aM.A02(float):void");
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
