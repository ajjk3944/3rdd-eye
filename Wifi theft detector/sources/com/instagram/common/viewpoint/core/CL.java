package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1808gc {
    public final C0792Cb A00;
    public final EnumC1813gh A01;

    public CL(C0792Cb c0792Cb, EnumC1813gh enumC1813gh) {
        this.A00 = c0792Cb;
        this.A01 = enumC1813gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1808gc
    public void A4D(Map<InterfaceC1790gK, EnumC1813gh> map, Map<SyncModifiableBundle, EnumC1800gU> map2) {
        map.put(this.A00, this.A01);
    }
}
