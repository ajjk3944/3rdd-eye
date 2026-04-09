package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C02003c extends AbstractC0456Dt {
    public final /* synthetic */ C0444Dh A00;

    public C02003c(C0444Dh c0444Dh) {
        this.A00 = c0444Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0457Du c0457Du) {
        if (this.A00.A01 == null || c0457Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C1337f7(this));
    }
}
