package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2437Bi implements InterfaceC3393fK {
    public final By A00;
    public final EnumC3398fP A01;

    public AbstractC2437Bi(By by, EnumC3398fP enumC3398fP) {
        this.A00 = by;
        this.A01 = enumC3398fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3393fK
    public void A45(Map<InterfaceC3376f2, EnumC3398fP> map, Map<SyncModifiableBundle, EnumC3385fC> map2) {
        map.put(this.A00, this.A01);
    }
}
