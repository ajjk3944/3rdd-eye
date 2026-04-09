package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2526Ev extends AbstractC2819Qg implements InterfaceC3010Xu {
    public N3 A00;
    public AbstractC3344eW A01;
    public C3345eX A02;
    public C3345eX A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C3272dL A09;
    public final C5Q A0A;

    public C2526Ev(C5Q c5q, SparseBooleanArray sparseBooleanArray, C3345eX c3345eX, int i, int i10, int i11, int i12, C3272dL c3272dL, N3 n32) {
        super(c5q);
        this.A09 = c3272dL;
        this.A0A = c5q;
        this.A08 = sparseBooleanArray;
        this.A02 = c3345eX;
        this.A04 = i;
        this.A05 = i10;
        this.A06 = i11;
        this.A07 = i12;
        this.A00 = n32;
    }

    private void A05(US us, XH xh, String str, C3239cn c3239cn) {
        if (this.A08.get(c3239cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C2528Ex(this, str, c3239cn, us, c3239cn.A04(), xh);
        this.A03 = new C3345eX(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C2527Ew(this, c3239cn));
    }

    public final KE A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C3239cn c3239cn, US us, SF sf, XH xh, String str) {
        int iA02 = c3239cn.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c3239cn.A03().A0H().A08();
        String strA09 = c3239cn.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1T()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(sf.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c3239cn.A03().A0I().A0F(), c3239cn.A03().A0I().A04());
        this.A0A.setCTAInfo(c3239cn.A03().A0J(), c3239cn.A04());
        this.A0A.A1W(c3239cn.A04());
        A05(us, xh, str, c3239cn);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3010Xu
    public final void AIV() {
        this.A0A.A1O();
    }
}
