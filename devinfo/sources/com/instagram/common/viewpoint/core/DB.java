package com.instagram.common.viewpoint.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DB implements InterfaceC1350fK {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC1349fJ A01 = EnumC1349fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public DB(View view, int i4, int i10, int i11) {
        this.A02 = i4;
        this.A05 = view;
        this.A04 = i10;
        this.A03 = i11;
    }

    private void A06(int i4, int i10) {
        this.A01 = i4 == this.A04 ? EnumC1349fJ.A03 : EnumC1349fJ.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i4, i10);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C1356fQ(this, i4, i10));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i4, int i10, boolean z3) {
        if (z3) {
            A06(i4, i10);
        } else {
            ((TextView) this.A05).setTextColor(i10);
            this.A01 = i10 == this.A03 ? EnumC1349fJ.A02 : EnumC1349fJ.A04;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final void A4A(boolean z3, boolean z10) {
        int endColor = z10 ? this.A03 : this.A04;
        int startColor = z10 ? this.A04 : this.A03;
        A07(endColor, startColor, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final EnumC1349fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
