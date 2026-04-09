package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C05973x extends E2 {
    public final /* synthetic */ C0827Dm A00;

    public C05973x(C0827Dm c0827Dm) {
        this.A00 = c0827Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E3 e32) {
        if ((this.A00.A03 && this.A00.A02) || !this.A00.A05 || !this.A00.A04) {
            return;
        }
        this.A00.A05 = false;
        if (!this.A00.A0G(EnumC1727fJ.A03) && !this.A00.A06) {
            if (!this.A00.A0G(EnumC1727fJ.A02)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A06 = false;
        this.A00.A07.postDelayed(new C0829Do(this), this.A00.A00);
    }
}
