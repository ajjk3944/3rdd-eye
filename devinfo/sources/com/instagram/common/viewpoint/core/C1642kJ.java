package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1642kJ implements InterfaceC0691Mw {
    public final /* synthetic */ C1436gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1642kJ(JSONObject jSONObject, C1436gi c1436gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1436gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0691Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0691Mw
    public final Collection<String> A7p() {
        return AbstractC0692Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0691Mw
    public final EnumC0690Mv A8K() {
        return AbstractC0692Mx.A00(this.A02);
    }
}
