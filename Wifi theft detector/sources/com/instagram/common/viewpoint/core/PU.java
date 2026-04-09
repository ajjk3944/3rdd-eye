package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1349Yb {
    public static byte[] A03;
    public C1814gi A00;
    public InterfaceC1348Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C1814gi c1814gi, AbstractC1979jd abstractC1979jd, int i10) {
        super(c1814gi);
        this.A00 = c1814gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC1979jd, i10);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1365Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public final void A0C(float f10, int i10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public final void A0D(C1072Na c1072Na, boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public int getToolbarHeight() {
        return AbstractC1349Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public InterfaceC1348Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setCTAClickListener(ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setFullscreen(boolean z10) {
    }

    public void setInitialUnskippableSeconds(int i10) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setPageDetails(C1084Nm c1084Nm, String str, int i10, C1090Ns c1090Ns) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setProgress(float f10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setProgressImmediate(float f10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setToolbarActionMode(int i10) {
        this.A02.setToolbarActionMode(i10);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1349Yb
    public void setToolbarListener(InterfaceC1348Ya interfaceC1348Ya) {
        this.A01 = interfaceC1348Ya;
    }
}
