package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.instagram.common.viewpoint.core.AbstractC0971Yb;
import com.instagram.common.viewpoint.core.AbstractC1140bu;
import com.instagram.common.viewpoint.core.C0694Na;
import com.instagram.common.viewpoint.core.C0706Nm;
import com.instagram.common.viewpoint.core.C0712Ns;
import com.instagram.common.viewpoint.core.C1273e4;
import com.instagram.common.viewpoint.core.C1436gi;
import com.instagram.common.viewpoint.core.InterfaceC0970Ya;
import com.instagram.common.viewpoint.core.InterfaceC0977Yh;
import com.instagram.common.viewpoint.core.VI;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC0634Kr;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC0986Yq;
import com.instagram.common.viewpoint.core.XX;
import com.instagram.common.viewpoint.core.YB;
import com.instagram.common.viewpoint.core.YM;
import com.instagram.common.viewpoint.core.YZ;
import com.instagram.common.viewpoint.core.ZC;
import com.instagram.common.viewpoint.core.ZK;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class FullScreenAdToolbar extends AbstractC0971Yb {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public YZ A00;
    public InterfaceC0970Ya A01;
    public InterfaceC0970Ya A02;
    public ZC A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final VI A07;
    public final InterfaceC0977Yh A08;
    public final ZK A09;
    public final C1273e4 A0A;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (XX.A02 * 10.0f);
        A0H = (int) (XX.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (XX.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1436gi c1436gi, InterfaceC0977Yh interfaceC0977Yh, VI vi2, int i4, int i10, boolean z3) {
        super(c1436gi);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z3;
        this.A08 = interfaceC0977Yh;
        this.A07 = vi2;
        setGravity(16);
        this.A09 = new ZK(c1436gi, i4, z3);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC0986Yq(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c1436gi);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C1273e4(c1436gi);
            YB.A0G(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i10 != -1) {
                A0G(c1436gi, i10);
                return;
            }
            return;
        }
        if (i10 != -1) {
            A0G(c1436gi, i10);
        }
        this.A06 = new RelativeLayout(c1436gi);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C1273e4(c1436gi);
        YB.A0G(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.setVisibility(z3 ? 0 : 8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A08() {
        super.A08();
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        if (this.A03 != null) {
            this.A03.setVisibility(8);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A09() {
        this.A09.A02();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0A() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0B() {
        this.A01 = getToolbarListener();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0C(float f10, int i4) {
        this.A09.A03(f10, i4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0D(C0694Na c0694Na, boolean z3) {
        boolean z10 = this.A04;
        int iA05 = c0694Na.A05(z10);
        this.A0A.A02(c0694Na.A0B(z10), iA05);
        boolean z11 = this.A05;
        String strA02 = A02(8, 9, 52);
        if (!z11) {
            if (this.A00 != null) {
                this.A00.setIconColors(iA05);
                this.A00.setContentDescription(strA02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(iA05);
            this.A03.setContentDescription(strA02);
        }
        this.A09.A04(c0694Na, z10, z3);
        if (z10) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            YB.A0V(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        YB.A0N(this, 0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final boolean A0E() {
        return this.A09.A05();
    }

    public final void A0F(C0706Nm c0706Nm, String str, int i4) {
        this.A09.setInitialUnskippableSeconds(i4);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c0706Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c0706Nm, str, this.A07, this.A08);
        }
    }

    public final void A0G(C1436gi c1436gi, int i4) {
        if (this.A00 != null) {
            YB.A0J(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new YZ(c1436gi, i4);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new ZC(c1436gi);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public int getToolbarHeight() {
        return AbstractC0971Yb.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public InterfaceC0970Ya getToolbarListener() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setAdReportingVisible(boolean z3) {
        A04(!this.A05 ? this.A00 : this.A03, z3);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setCTAClickListener(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
        this.A0A.setOnClickListener(AbstractC1140bu.A03(viewOnClickListenerC0634Kr, A02(17, 7, 47)));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setFullscreen(boolean z3) {
        this.A04 = z3;
    }

    public void setOnlyPageDetails(C0706Nm c0706Nm) {
        if (c0706Nm != null) {
            this.A0A.setPageDetails(c0706Nm);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setPageDetails(C0706Nm c0706Nm, String str, int i4, C0712Ns c0712Ns) {
        this.A09.setInitialUnskippableSeconds(i4);
        this.A0A.setPageDetails(c0706Nm);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c0706Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c0706Nm, str, this.A07, this.A08);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setPageDetailsVisible(boolean z3) {
        this.A06.removeAllViews();
        if (z3) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z3);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgress(float f10) {
        this.A09.setProgress(f10);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressImage(YM ym) {
        this.A09.setProgressImage(ym);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressImmediate(float f10) {
        this.A09.setProgressImmediate(f10);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressSpinnerInvisible(boolean z3) {
        this.A09.setProgressSpinnerInvisible(z3);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            YB.A0S(view, 0, -16777216, A0E);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setToolbarActionMode(int i4) {
        this.A09.setToolbarActionMode(i4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setToolbarListener(InterfaceC0970Ya interfaceC0970Ya) {
        this.A02 = interfaceC0970Ya;
    }
}
