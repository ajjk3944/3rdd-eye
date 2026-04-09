package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1602je extends AbstractC0784Qq<PX> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public NM A00;
    public final List<UK> A01;
    public final int A02;
    public final C1436gi A03;
    public final AbstractC1380fo A04 = new C1604jg(this);

    public AbstractC1602je(C0x c0x, List<UK> list, C1436gi c1436gi) {
        this.A03 = c1436gi;
        this.A02 = c0x.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A01(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i10 = this.A02;
        if (i4 == 0) {
            i10 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i10, 0, i4 >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    public final int A0B() {
        return this.A01.size();
    }

    public final void A0O(ImageView imageView, int i4) {
        UK uk2 = this.A01.get(i4);
        C0898Vb adCoverImage = uk2.getAdCoverImage();
        if (adCoverImage != null) {
            LM lmA04 = new LM(imageView, this.A03).A04();
            lmA04.A06(new C1603jf(this, i4, uk2));
            lmA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0P(NM nm2) {
        this.A00 = nm2;
    }

    public void A0Q(PX px, int i4) {
        px.A0p().setLayoutParams(A01(i4));
    }
}
