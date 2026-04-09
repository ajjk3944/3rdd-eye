package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1080aw extends RelativeLayout {
    public static InterfaceC0977Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1484hU A00;
    public C1436gi A01;
    public C0w A02;
    public M1 A03;
    public C1129bj A04;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
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
        A08 = XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (XX.A02 * 15.0f);
        A05 = new C0664Lv();
    }

    public C1080aw(C1436gi c1436gi) throws IllegalStateException {
        super(c1436gi);
        this.A01 = c1436gi;
        this.A02 = new C0w(c1436gi);
        YB.A0K(this.A02);
        this.A00 = new C7N();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1274e5> A01(AbstractC1601jd abstractC1601jd) {
        if (abstractC1601jd == null) {
            return new ArrayList<>();
        }
        List<NR> listA2G = abstractC1601jd.A2G();
        ArrayList<C1274e5> arrayList = new ArrayList<>(listA2G.size());
        for (int i4 = 0; i4 < listA2G.size(); i4++) {
            arrayList.add(new C1274e5(i4, listA2G.size(), listA2G.get(i4)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(UK uk2, int i4) {
        ArrayList<C1274e5> arrayListA01 = A01(uk2.A13());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new M1(this.A01, arrayListA01, uk2.A13(), this.A01.A02().A0A(), uk2, A05, uk2.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i4 == 0) {
            i4 = XX.A04.widthPixels;
        }
        this.A03.A0O(i4 - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(uk2, arrayListA01);
    }

    public final void A06(C1381fp c1381fp) {
        if (this.A03 != null) {
            this.A03.A0P(c1381fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), AbstractC0848Td.A1v, new C0849Te(A00(0, 51, 125)));
        }
        this.A02.A20(c1381fp);
    }

    public static InterfaceC0977Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        if (z3 && this.A03 != null) {
            this.A03.A0O((i11 - i4) - A07, 16, 0);
        }
        super.onLayout(z3, i4, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i4) {
        if (this.A04 != null) {
            this.A04.A00(i4);
        }
    }

    private void setupDotsLayout(UK uk2, ArrayList<C1274e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C0661Ls(this));
        this.A04 = new C1129bj(this.A01, uk2.A13().A28().A01(), arrayList.size());
        YB.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
