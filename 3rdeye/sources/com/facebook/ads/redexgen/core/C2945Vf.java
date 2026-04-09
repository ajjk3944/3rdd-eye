package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2945Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C2945Vf(VN vn) {
        this.A00 = vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C3996pu<UE, UJ> c3996pu, InterfaceC3987pk interfaceC3987pk) {
        switch (interfaceC3987pk.A9M(c3996pu)) {
            case A02:
            case A04:
                this.A00.A02(c3996pu, interfaceC3987pk);
                break;
        }
    }
}
