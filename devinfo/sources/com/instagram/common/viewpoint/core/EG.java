package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class EG extends AbstractC0723Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EG(EF ef2, double d10, double d11, double d12, boolean z3) {
        super(d10, d11, d12, z3);
        this.A00 = ef2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0723Od
    public final void A00(boolean z3, boolean z10, C0725Of c0725Of) {
        if ((!C0886Up.A0z(this.A00.A0D) || !this.A00.A0A) && z10) {
            this.A00.A0A = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC1314ek.A0B));
        }
    }
}
