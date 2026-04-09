package com.facebook.ads.redexgen.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CY implements InterfaceC3314e2 {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC3313e1 A01 = EnumC3313e1.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public CY(View view, int i, int i10, int i11) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i10;
        this.A03 = i11;
    }

    private void A06(int i, int i10) {
        this.A01 = i == this.A04 ? EnumC3313e1.A03 : EnumC3313e1.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i, i10);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C3320e8(this, i, i10));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i10, boolean z10) {
        if (z10) {
            A06(i, i10);
        } else {
            ((TextView) this.A05).setTextColor(i10);
            this.A01 = i10 == this.A03 ? EnumC3313e1.A02 : EnumC3313e1.A04;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3314e2
    public final void A42(boolean z10, boolean z11) {
        int endColor = z11 ? this.A03 : this.A04;
        int startColor = z11 ? this.A04 : this.A03;
        A07(endColor, startColor, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3314e2
    public final EnumC3313e1 A93() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3314e2
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
