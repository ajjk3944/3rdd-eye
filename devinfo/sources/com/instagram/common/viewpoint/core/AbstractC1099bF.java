package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1099bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1436gi A07;
    public final ViewOnClickListenerC0634Kr A08;
    public final C1130bk A09;

    public static String A0h(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i4);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1099bF(C1436gi c1436gi, ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr, int i4, C0694Na c0694Na, boolean z3, String str, VA va2, InterfaceC0977Yh interfaceC0977Yh, C1381fp c1381fp, Y2 y22, C0700Ng c0700Ng, boolean z10, String str2) {
        super(c1436gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1436gi;
        this.A04 = i4;
        this.A03 = z10;
        this.A02 = str2;
        this.A09 = new C1130bk(c1436gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z10) {
            this.A00 = new LinearLayout(c1436gi);
            this.A01 = new TextView(c1436gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC0634Kr == null) {
            this.A08 = new ViewOnClickListenerC0634Kr(c1436gi, str, c0694Na, z3, va2, interfaceC0977Yh, c1381fp, y22, c0700Ng);
        } else {
            this.A08 = viewOnClickListenerC0634Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1140bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1436gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z3) {
    }

    public final ViewOnClickListenerC0634Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C0696Nc c0696Nc, String str, String str2, InterfaceC0951Xh interfaceC0951Xh, InterfaceC1114bU interfaceC1114bU) {
        this.A08.setCta(c0696Nc, str, new HashMap(), interfaceC0951Xh, interfaceC1114bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i4) {
    }
}
