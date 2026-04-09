package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2754Nr extends AbstractC3002Xm {
    public static byte[] A03;
    public C3272dL A00;
    public InterfaceC3001Xl A01;
    public final YQ A02;

    static {
        A05();
    }

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public C2754Nr(C3272dL c3272dL, InterfaceC3003Xn interfaceC3003Xn, C2915Ua c2915Ua, int i) {
        super(c3272dL);
        this.A00 = c3272dL;
        setGravity(16);
        A04();
        this.A02 = new YQ(this.A00, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC3013Xx(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public final void A06() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public final void A07() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public final void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public final void A09(float f10, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public final void A0A(C2735My c2735My, boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public int getToolbarHeight() {
        return AbstractC3002Xm.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public InterfaceC3001Xl getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setCTAClickListener(KE ke) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setFullscreen(boolean z10) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setPageDetails(N9 n9, String str, int i, NF nf) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setProgress(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setProgressImage(XX xx) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setProgressImmediate(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3002Xm
    public void setToolbarListener(InterfaceC3001Xl interfaceC3001Xl) {
        this.A01 = interfaceC3001Xl;
    }
}
