package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class MC extends AbstractC1377Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C1104Og A03;
    public final C1814gi A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 24);
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

    public MC(C1814gi c1814gi, VA va, String str) {
        super(c1814gi, va, str);
        this.A04 = c1814gi;
        this.A03 = AbstractC1105Oh.A00(this.A04.A02());
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

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0O() {
        this.A00.setImageBitmap(YN.A01(YM.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC1396Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C1381Zh c1381Zh = new C1381Zh(this.A04);
        c1381Zh.setData(this.A03.A0H(), YM.HIDE_AD);
        c1381Zh.setOnClickListener(new ViewOnClickListenerC1397Zx(this, c1381Zh));
        C1381Zh c1381Zh2 = new C1381Zh(this.A04);
        c1381Zh2.setData(this.A03.A0L(), YM.REPORT_AD);
        c1381Zh2.setOnClickListener(new ViewOnClickListenerC1398Zy(this, c1381Zh2));
        C1381Zh c1381Zh3 = new C1381Zh(this.A04);
        c1381Zh3.setData(this.A03.A0M(), YM.AD_CHOICES_ICON);
        c1381Zh3.setOnClickListener(new ViewOnClickListenerC1399Zz(this, c1381Zh3));
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
        linearLayout.addView(c1381Zh, menuParams);
        linearLayout.addView(c1381Zh2, menuParams);
        linearLayout.addView(c1381Zh3, menuParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0Q(C1108Ok c1108Ok, EnumC1106Oi enumC1106Oi) {
        String strA0H;
        YM ym;
        int i10;
        this.A00.setOnClickListener(null);
        if (enumC1106Oi == EnumC1106Oi.A06) {
            strA0H = this.A03.A0F();
            ym = YM.REPORT_AD;
            i10 = -552389;
        } else {
            strA0H = this.A03.A0H();
            ym = YM.HIDE_AD;
            i10 = -13272859;
        }
        C1374Za c1374ZaA0H = new C1374Za(this.A04, this.A0D).A0H(strA0H);
        String title = this.A03.A0D();
        C1374Za c1374ZaA0G = c1374ZaA0H.A0G(title);
        String title2 = c1108Ok.A04();
        C1375Zb adHiddenView = c1374ZaA0G.A0E(title2).A0J(false).A0D(ym).A0C(i10).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c1108Ok, enumC1106Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0R(C1108Ok c1108Ok, EnumC1106Oi enumC1106Oi) {
        boolean isReportFlow = enumC1106Oi == EnumC1106Oi.A06;
        C1395Zv c1395Zv = new C1395Zv(this.A04, c1108Ok, this.A0D, isReportFlow ? YM.REPORT_AD : YM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC1400a0(this));
        this.A00.setContentDescription(A00(0, 4, 114));
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1395Zv, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final boolean A0S() {
        return true;
    }
}
