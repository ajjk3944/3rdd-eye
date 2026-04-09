package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1430gc {
    public final EnumC1422gU A00;
    public final AbstractC01772d A01;

    public CM(AbstractC01772d abstractC01772d, EnumC1422gU enumC1422gU) {
        this.A01 = abstractC01772d;
        this.A00 = enumC1422gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1430gc
    public void A4D(Map<InterfaceC1412gK, EnumC1435gh> map, Map<SyncModifiableBundle, EnumC1422gU> map2) {
        map2.put(null, this.A00);
    }
}
