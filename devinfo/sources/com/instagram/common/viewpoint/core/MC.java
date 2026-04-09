package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class MC extends AbstractC0999Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C0726Og A03;
    public final C1436gi A04;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (XX.A02 * 8.0f);
        A07 = (int) (XX.A02 * 10.0f);
        A06 = (int) (XX.A02 * 44.0f);
    }

    public MC(C1436gi c1436gi, VA va2, String str) {
        super(c1436gi, va2, str);
        this.A04 = c1436gi;
        this.A03 = AbstractC0727Oh.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        YB.A0N(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0O() {
        this.A00.setImageBitmap(YN.A01(YM.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC1018Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C1003Zh c1003Zh = new C1003Zh(this.A04);
        c1003Zh.setData(this.A03.A0H(), YM.HIDE_AD);
        c1003Zh.setOnClickListener(new ViewOnClickListenerC1019Zx(this, c1003Zh));
        C1003Zh c1003Zh2 = new C1003Zh(this.A04);
        c1003Zh2.setData(this.A03.A0L(), YM.REPORT_AD);
        c1003Zh2.setOnClickListener(new ViewOnClickListenerC1020Zy(this, c1003Zh2));
        C1003Zh c1003Zh3 = new C1003Zh(this.A04);
        c1003Zh3.setData(this.A03.A0M(), YM.AD_CHOICES_ICON);
        c1003Zh3.setOnClickListener(new ViewOnClickListenerC1021Zz(this, c1003Zh3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c1003Zh, menuParams);
        linearLayout.addView(c1003Zh2, menuParams);
        linearLayout.addView(c1003Zh3, menuParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0Q(C0730Ok c0730Ok, EnumC0728Oi enumC0728Oi) {
        String strA0H;
        YM ym;
        int i4;
        this.A00.setOnClickListener(null);
        if (enumC0728Oi == EnumC0728Oi.A06) {
            strA0H = this.A03.A0F();
            ym = YM.REPORT_AD;
            i4 = -552389;
        } else {
            strA0H = this.A03.A0H();
            ym = YM.HIDE_AD;
            i4 = -13272859;
        }
        C0996Za c0996ZaA0H = new C0996Za(this.A04, this.A0D).A0H(strA0H);
        String title = this.A03.A0D();
        C0996Za c0996ZaA0G = c0996ZaA0H.A0G(title);
        String title2 = c0730Ok.A04();
        C0997Zb adHiddenView = c0996ZaA0G.A0E(title2).A0J(false).A0D(ym).A0C(i4).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c0730Ok, enumC0728Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0R(C0730Ok c0730Ok, EnumC0728Oi enumC0728Oi) {
        boolean isReportFlow = enumC0728Oi == EnumC0728Oi.A06;
        C1017Zv c1017Zv = new C1017Zv(this.A04, c0730Ok, this.A0D, isReportFlow ? YM.REPORT_AD : YM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC1022a0(this));
        this.A00.setContentDescription(A00(0, 4, 114));
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1017Zv, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final boolean A0S() {
        return true;
    }
}
