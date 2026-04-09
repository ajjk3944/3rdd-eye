package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class EH extends AbstractC1101Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EH(EF ef, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = ef;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1101Od
    public final void A00(boolean z10, boolean z11, C1103Of c1103Of) {
        if ((!C1264Up.A0z(this.A00.A0D) || !this.A00.A09) && z11) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC1692ek.A03));
        }
    }
}
