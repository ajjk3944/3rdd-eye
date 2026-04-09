package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2438Bj implements InterfaceC3393fK {
    public final EnumC3385fC A00;
    public final AbstractC22101z A01;

    public AbstractC2438Bj(AbstractC22101z abstractC22101z, EnumC3385fC enumC3385fC) {
        this.A01 = abstractC22101z;
        this.A00 = enumC3385fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3393fK
    public void A45(Map<InterfaceC3376f2, EnumC3398fP> map, Map<SyncModifiableBundle, EnumC3385fC> map2) {
        map2.put(null, this.A00);
    }
}
