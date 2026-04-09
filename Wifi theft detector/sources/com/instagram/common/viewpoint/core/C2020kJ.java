package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2020kJ implements InterfaceC1069Mw {
    public final /* synthetic */ C1814gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2020kJ(JSONObject jSONObject, C1814gi c1814gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1814gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1069Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1069Mw
    public final Collection<String> A7p() {
        return AbstractC1070Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1069Mw
    public final EnumC1068Mv A8K() {
        return AbstractC1070Mx.A00(this.A02);
    }
}
