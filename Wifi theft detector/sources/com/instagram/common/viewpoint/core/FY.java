package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network/classes2.dex */
public final class FY extends RK implements InterfaceC1362Yo {
    public C1078Ng A00;
    public AbstractC1758fo A01;
    public C1759fp A02;
    public C1759fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1814gi A09;
    public final AnonymousClass67 A0A;

    public FY(AnonymousClass67 anonymousClass67, SparseBooleanArray sparseBooleanArray, C1759fp c1759fp, int i10, int i11, int i12, int i13, C1814gi c1814gi, C1078Ng c1078Ng) {
        super(anonymousClass67);
        this.A09 = c1814gi;
        this.A0A = anonymousClass67;
        this.A08 = sparseBooleanArray;
        this.A02 = c1759fp;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = c1078Ng;
    }

    private void A05(VA va, Y2 y22, String str, C1652e5 c1652e5) {
        if (this.A08.get(c1652e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C0869Fc(this, str, c1652e5, va, c1652e5.A04(), y22);
        this.A03 = new C1759fp(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new FZ(this, c1652e5));
    }

    public final ViewOnClickListenerC1012Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C1652e5 c1652e5, VA va, C1220Sx c1220Sx, Y2 y22, String str) {
        int iA02 = c1652e5.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c1652e5.A03().A0H().A08();
        String strA09 = c1652e5.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c1220Sx.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1652e5.A03().A0I().A0G(), c1652e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c1652e5.A03().A0J(), c1652e5.A04());
        this.A0A.A1Y(c1652e5.A04());
        A05(va, y22, str, c1652e5);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1362Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
