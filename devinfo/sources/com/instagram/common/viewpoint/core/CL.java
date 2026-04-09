package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1430gc {
    public final C0414Cb A00;
    public final EnumC1435gh A01;

    public CL(C0414Cb c0414Cb, EnumC1435gh enumC1435gh) {
        this.A00 = c0414Cb;
        this.A01 = enumC1435gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1430gc
    public void A4D(Map<InterfaceC1412gK, EnumC1435gh> map, Map<SyncModifiableBundle, EnumC1422gU> map2) {
        map.put(this.A00, this.A01);
    }
}
