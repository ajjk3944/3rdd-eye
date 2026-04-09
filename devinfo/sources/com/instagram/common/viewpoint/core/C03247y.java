package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C03247y extends AbstractC1575j4 {
    public final /* synthetic */ C03227w A00;
    public final /* synthetic */ AbstractC1605jh A01;
    public final /* synthetic */ C03117l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03247y(C03227w c03227w, boolean z3, boolean z10, C03117l c03117l, AbstractC1605jh abstractC1605jh) {
        super(z3);
        this.A00 = c03227w;
        this.A03 = z10;
        this.A02 = c03117l;
        this.A01 = abstractC1605jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1575j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1575j4
    public final void A01(boolean z3) {
        if (!C0886Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC1221dD.A01(this.A00.A04, this.A02, 0, new C1614jq(this));
    }
}
