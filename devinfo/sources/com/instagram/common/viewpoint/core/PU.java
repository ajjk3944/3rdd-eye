package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC0971Yb {
    public static byte[] A03;
    public C1436gi A00;
    public InterfaceC0970Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C1436gi c1436gi, AbstractC1601jd abstractC1601jd, int i4) {
        super(c1436gi);
        this.A00 = c1436gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC1601jd, i4);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC0987Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0C(float f10, int i4) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final void A0D(C0694Na c0694Na, boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public int getToolbarHeight() {
        return AbstractC0971Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public InterfaceC0970Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setAdReportingVisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setCTAClickListener(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setFullscreen(boolean z3) {
    }

    public void setInitialUnskippableSeconds(int i4) {
        this.A02.setInitialUnskippableSeconds(i4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setPageDetails(C0706Nm c0706Nm, String str, int i4, C0712Ns c0712Ns) {
        this.A02.setInitialUnskippableSeconds(i4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setPageDetailsVisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgress(float f10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressImmediate(float f10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setProgressSpinnerInvisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setToolbarActionMode(int i4) {
        this.A02.setToolbarActionMode(i4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0971Yb
    public void setToolbarListener(InterfaceC0970Ya interfaceC0970Ya) {
        this.A01 = interfaceC0970Ya;
    }
}
