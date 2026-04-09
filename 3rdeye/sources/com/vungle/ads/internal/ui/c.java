package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.presenter.g;
import com.vungle.ads.internal.util.b;

/* compiled from: PresenterAppLeftCallback.kt */
/* loaded from: classes2.dex */
public final class c implements b.InterfaceC0396b {
    private final com.vungle.ads.internal.presenter.a bus;
    private final String placementRefId;

    public c(com.vungle.ads.internal.presenter.a aVar, String str) {
        this.bus = aVar;
        this.placementRefId = str;
    }

    @Override // com.vungle.ads.internal.util.b.InterfaceC0396b
    public void onLeftApplication() {
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext(g.OPEN, "adLeftApplication", this.placementRefId);
        }
    }
}
