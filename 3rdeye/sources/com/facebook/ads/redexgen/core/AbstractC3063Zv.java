package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3063Zv extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C3272dL A07;
    public final KE A08;
    public final C3086aK A09;

    public static String A0d(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0e() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0h(int i);

    static {
        A0e();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC3063Zv(C3272dL c3272dL, KE ke, int i, C2735My c2735My, boolean z10, String str, US us, InterfaceC3003Xn interfaceC3003Xn, C3345eX c3345eX, XH xh, N3 n32, boolean z11, String str2) {
        super(c3272dL);
        this.A02 = A0d(0, 0, 37);
        XP.A0I(this);
        this.A07 = c3272dL;
        this.A04 = i;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C3086aK(c3272dL);
        XP.A0K(this.A09, 0);
        XP.A0I(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c3272dL);
            this.A01 = new TextView(c3272dL);
            XP.A0I(this.A01);
        }
        if (ke == null) {
            this.A08 = new KE(c3272dL, str, c2735My, z10, us, interfaceC3003Xn, c3345eX, xh, n32);
        } else {
            this.A08 = ke;
        }
        XP.A0E(1001, this.A08);
        this.A05 = AbstractC3097aV.A03(this.A08, A0d(0, 9, 52));
        this.A06 = new RelativeLayout(c3272dL);
        this.A06.setLayoutParams(A0B);
        XP.A0I(this.A06);
    }

    public void A0f() {
    }

    public void A0g() {
        this.A09.setOnClickListener(this.A05);
    }

    public final KE getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C2733Mw c2733Mw, C2736Mz c2736Mz, String str, String str2, InterfaceC2985Wv interfaceC2985Wv, InterfaceC3072a4 interfaceC3072a4) {
        this.A08.setCta(c2736Mz, str, new HashMap(), interfaceC2985Wv, interfaceC3072a4);
        new KZ(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
