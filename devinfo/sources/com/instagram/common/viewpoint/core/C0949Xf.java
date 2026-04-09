package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0949Xf implements ViewpointAction<C0893Uw, V1> {
    public XM A00;

    public C0949Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.ViewpointAction
    public final void A6R(C2045rN<C0893Uw, V1> c2045rN, InterfaceC2036rD interfaceC2036rD) {
        switch (interfaceC2036rD.A9U(c2045rN)) {
            case A02:
            case A04:
                this.A00.A02(c2045rN, interfaceC2036rD);
                break;
        }
    }
}
