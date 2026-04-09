package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C07027y extends AbstractC1953j4 {
    public final /* synthetic */ C07007w A00;
    public final /* synthetic */ AbstractC1983jh A01;
    public final /* synthetic */ C06897l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07027y(C07007w c07007w, boolean z10, boolean z11, C06897l c06897l, AbstractC1983jh abstractC1983jh) {
        super(z10);
        this.A00 = c07007w;
        this.A03 = z11;
        this.A02 = c06897l;
        this.A01 = abstractC1983jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1953j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1953j4
    public final void A01(boolean z10) {
        if (!C1264Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC1599dD.A01(this.A00.A04, this.A02, 0, new C1992jq(this));
    }
}
