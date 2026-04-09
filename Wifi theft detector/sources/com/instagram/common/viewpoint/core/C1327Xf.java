package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1327Xf implements ViewpointAction<C1271Uw, V1> {
    public XM A00;

    public C1327Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.ViewpointAction
    public final void A6R(C2423rN<C1271Uw, V1> c2423rN, InterfaceC2414rD interfaceC2414rD) {
        switch (interfaceC2414rD.A9U(c2423rN)) {
            case A02:
            case A04:
                this.A00.A02(c2423rN, interfaceC2414rD);
                break;
        }
    }
}
