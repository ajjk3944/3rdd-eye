package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C05783c extends AbstractC0834Dt {
    public final /* synthetic */ C0822Dh A00;

    public C05783c(C0822Dh c0822Dh) {
        this.A00 = c0822Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0835Du c0835Du) {
        if (this.A00.A01 == null || c0835Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C1715f7(this));
    }
}
