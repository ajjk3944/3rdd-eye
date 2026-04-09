package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class FD extends AbstractC2819Qg implements InterfaceC3010Xu {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public N3 A00;
    public AbstractC3344eW A01;
    public C3345eX A02;
    public C3345eX A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C3272dL A06;
    public final C22945h A07;

    public FD(C22945h c22945h, SparseBooleanArray sparseBooleanArray, C3345eX c3345eX, int i, C3272dL c3272dL, N3 n32) {
        super(c22945h);
        this.A06 = c3272dL;
        this.A07 = c22945h;
        this.A05 = sparseBooleanArray;
        this.A02 = c3345eX;
        this.A04 = i;
        this.A00 = n32;
    }

    private void A05(US us, XH xh, String str, C3239cn c3239cn) {
        if (this.A05.get(c3239cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new FF(this, str, c3239cn, us, c3239cn.A04(), xh);
        this.A03 = new C3345eX(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new FE(this, c3239cn));
    }

    public final void A0p(C3239cn c3239cn, US us, SF sf, XH xh, String str, int i, int i10, int i11) {
        int iA02 = c3239cn.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c3239cn);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = iA02 == 0 ? i11 : i10;
        if (iA02 < this.A04 - 1) {
            i11 = i10;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i11, 0);
        String strA08 = c3239cn.A03().A0H().A08();
        String strA09 = c3239cn.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1T()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(sf.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c3239cn.A03().A0J(), c3239cn.A04());
        this.A07.A1U(c3239cn.A04());
        A05(us, xh, str, c3239cn);
    }

    public final void A0q(C3345eX c3345eX) {
        this.A02 = c3345eX;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3010Xu
    public final void AIV() {
        this.A07.A1O();
    }
}
