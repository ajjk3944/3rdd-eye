package com.instagram.common.viewpoint.core;

import org.json.JSONException;

/* loaded from: assets/audience_network/classes2.dex */
public class Ir implements InterfaceC1600dE {
    public final /* synthetic */ C1814gi A00;
    public final /* synthetic */ String A01;

    public Ir(C1814gi c1814gi, String str) {
        this.A00 = c1814gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1600dE
    public final void A9s(String str) throws JSONException {
        C1608dM.A05(this.A00, str, this.A01);
    }
}
