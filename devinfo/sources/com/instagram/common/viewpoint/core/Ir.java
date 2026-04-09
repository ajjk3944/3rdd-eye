package com.instagram.common.viewpoint.core;

import org.json.JSONException;

/* loaded from: assets/audience_network/classes2.dex */
public class Ir implements InterfaceC1222dE {
    public final /* synthetic */ C1436gi A00;
    public final /* synthetic */ String A01;

    public Ir(C1436gi c1436gi, String str) {
        this.A00 = c1436gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1222dE
    public final void A9s(String str) throws JSONException {
        C1230dM.A05(this.A00, str, this.A01);
    }
}
