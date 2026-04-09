package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.g9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3443g9 implements InterfaceC2798Pl {
    public static byte[] A01;
    public final /* synthetic */ C23196g A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C3443g9(C23196g c23196g) {
        this.A00 = c23196g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void A4C(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC2819Qg abstractC2819QgA0F = C23196g.A0F(view);
        if (abstractC2819QgA0F != null) {
            if (abstractC2819QgA0F.A0i() || abstractC2819QgA0F.A0l()) {
                abstractC2819QgA0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + abstractC2819QgA0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void A5o(int i) {
        AbstractC2819Qg abstractC2819QgA0F;
        View view = A79(i);
        if (view != null && (abstractC2819QgA0F = C23196g.A0F(view)) != null) {
            if (!abstractC2819QgA0F.A0i() || abstractC2819QgA0F.A0l()) {
                abstractC2819QgA0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + abstractC2819QgA0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final View A79(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final int A7A() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final AbstractC2819Qg A7D(View view) {
        return C23196g.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final int A9z(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void ADA(View view) {
        AbstractC2819Qg abstractC2819QgA0F = C23196g.A0F(view);
        if (abstractC2819QgA0F != null) {
            abstractC2819QgA0F.A0D(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void ADv(View view) {
        AbstractC2819Qg abstractC2819QgA0F = C23196g.A0F(view);
        if (abstractC2819QgA0F != null) {
            abstractC2819QgA0F.A0E(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void AHg() {
        int iA7A = A7A();
        for (int i = 0; i < iA7A; i++) {
            View viewA79 = A79(i);
            this.A00.A1g(viewA79);
            viewA79.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void AHm(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2798Pl
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
