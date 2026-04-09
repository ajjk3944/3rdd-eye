package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1808gc {
    public final EnumC1800gU A00;
    public final AbstractC05552d A01;

    public CM(AbstractC05552d abstractC05552d, EnumC1800gU enumC1800gU) {
        this.A01 = abstractC05552d;
        this.A00 = enumC1800gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1808gc
    public void A4D(Map<InterfaceC1790gK, EnumC1813gh> map, Map<SyncModifiableBundle, EnumC1800gU> map2) {
        map2.put(null, this.A00);
    }
}
