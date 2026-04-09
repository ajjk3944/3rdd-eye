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
public abstract class AbstractC1477bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1814gi A07;
    public final ViewOnClickListenerC1012Kr A08;
    public final C1508bk A09;

    public static String A0h(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i10);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1477bF(C1814gi c1814gi, ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr, int i10, C1072Na c1072Na, boolean z10, String str, VA va, InterfaceC1355Yh interfaceC1355Yh, C1759fp c1759fp, Y2 y22, C1078Ng c1078Ng, boolean z11, String str2) {
        super(c1814gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1814gi;
        this.A04 = i10;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C1508bk(c1814gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c1814gi);
            this.A01 = new TextView(c1814gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1012Kr == null) {
            this.A08 = new ViewOnClickListenerC1012Kr(c1814gi, str, c1072Na, z10, va, interfaceC1355Yh, c1759fp, y22, c1078Ng);
        } else {
            this.A08 = viewOnClickListenerC1012Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1518bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1814gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z10) {
    }

    public final ViewOnClickListenerC1012Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1074Nc c1074Nc, String str, String str2, InterfaceC1329Xh interfaceC1329Xh, InterfaceC1492bU interfaceC1492bU) {
        this.A08.setCta(c1074Nc, str, new HashMap(), interfaceC1329Xh, interfaceC1492bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
