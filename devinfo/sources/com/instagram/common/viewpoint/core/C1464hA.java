package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.hA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1464hA extends PS {
    public static String[] A02 = {"mOKLXDYLG6rjJ8Uhc3dA94WggTy9aTCY", "BGa58WlKg30brm3iaXDpmKRreNqQx6sP", "OEIW0kNKyti99uOllTeGQwyl2xTRs9Rh", "66ZfANP52P8mfwFN1T5txUDlKbhE7PV5", "bDC5rvyouDOgyvzMPOhXiUUV9GXsFm8X", "OYxAj3HMhtWdnmP8KTtjhXT1I6nqQa9s", "h9E4hr1XPZf2wtmTKQKy9uKgM46lwlc6", "41TCzlsMJFbrsVbgrjJGy8KkwVmNtDJ0"};
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ S3 A01;

    public C1464hA(S3 s32) {
        this.A01 = s32;
    }

    @Override // com.instagram.common.viewpoint.core.PS
    public final int A01() {
        return this.A00.size();
    }

    @Override // com.instagram.common.viewpoint.core.PS
    public final int A02(Object obj) {
        int index = this.A00.indexOf(obj);
        if (index >= 0) {
            return index;
        }
        return -2;
    }

    @Override // com.instagram.common.viewpoint.core.PS
    public final Object A04(ViewGroup viewGroup, int i4) {
        View adView;
        if (this.A01.A01 != null) {
            adView = this.A01.A01.createView(this.A00.get(i4), i4);
        } else {
            adView = this.A01.A02 != null ? NativeAdView.render(this.A01.A06, this.A00.get(i4), this.A01.A02, this.A01.A03) : NativeAdView.render(this.A01.A06, this.A00.get(i4), this.A01.A03);
        }
        viewGroup.addView(adView);
        return adView;
    }

    @Override // com.instagram.common.viewpoint.core.PS
    public final void A07(ViewGroup viewGroup, int i4, Object obj) {
        if (i4 < this.A00.size()) {
            S3 s32 = this.A01;
            if (A02[4].charAt(30) == 'x') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "v77RhDbNLQhSOdbZwI5GIdcCxuAqz5PX";
            strArr[7] = "TxIZGVGrDJLkO7AUrnSGEi4CFfNom122";
            if (s32.A01 != null) {
                this.A01.A01.destroyView(this.A00.get(i4), (View) obj);
            } else {
                this.A00.get(i4).unregisterView();
            }
        }
        viewGroup.removeView((View) obj);
    }

    @Override // com.instagram.common.viewpoint.core.PS
    public final boolean A08(View view, Object obj) {
        return view == obj;
    }

    public final void A09() {
        this.A00.clear();
        int iMin = Math.min(this.A01.A00, this.A01.A04.getUniqueNativeAdCount());
        for (int i4 = 0; i4 < iMin; i4++) {
            NativeAd ad2 = this.A01.A04.nextNativeAd();
            UK.A0L(ad2.getInternalNativeAd()).A1l(true);
            this.A00.add(ad2);
        }
        A05();
    }
}
