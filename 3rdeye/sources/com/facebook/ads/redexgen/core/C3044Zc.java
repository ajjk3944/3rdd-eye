package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3044Zc extends RelativeLayout {
    public static InterfaceC3003Xn A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC3433fy A00;
    public C3272dL A01;
    public C0K A02;
    public LE A03;
    public C3085aJ A04;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (AbstractC2975Wl.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (AbstractC2975Wl.A02 * 15.0f);
        A05 = new LD();
    }

    public C3044Zc(C3272dL c3272dL) throws IllegalStateException {
        super(c3272dL);
        this.A01 = c3272dL;
        this.A02 = new C0K(c3272dL);
        XP.A0I(this.A02);
        this.A00 = new C23206h();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C3239cn> A01(AbstractC3547hy abstractC3547hy) {
        if (abstractC3547hy == null) {
            return new ArrayList<>();
        }
        List<C2726Mp> listA27 = abstractC3547hy.A27();
        ArrayList<C3239cn> arrayList = new ArrayList<>(listA27.size());
        for (int i = 0; i < listA27.size(); i++) {
            arrayList.add(new C3239cn(i, listA27.size(), listA27.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C2815Qc c2815Qc, int i) {
        ArrayList<C3239cn> arrayListA01 = A01(c2815Qc.A10());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new LE(this.A01, arrayListA01, c2815Qc.A10(), this.A01.A02().A0A(), c2815Qc, A05, c2815Qc.A10().A25(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = AbstractC2975Wl.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c2815Qc, arrayListA01);
    }

    public final void A06(C3345eX c3345eX) {
        if (this.A03 != null) {
            this.A03.A0P(c3345eX);
        } else {
            this.A01.A08().AAy(A00(51, 7, 24), AbstractC2885Sv.A1v, new C2886Sw(A00(0, 51, 125)));
        }
        this.A02.A20(c3345eX);
    }

    public static InterfaceC3003Xn getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        if (z10 && this.A03 != null) {
            this.A03.A0O((i11 - i) - A07, 16, 0);
        }
        super.onLayout(z10, i, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(C2815Qc c2815Qc, ArrayList<C3239cn> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new L5(this));
        this.A04 = new C3085aJ(this.A01, c2815Qc.A10().A1z().A01(), arrayList.size());
        XP.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
