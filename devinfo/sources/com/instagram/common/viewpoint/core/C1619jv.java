package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1619jv extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C1618ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1619jv(C1618ju c1618ju, Map map, Map map2) {
        this.A00 = c1618ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        if (!TextUtils.isEmpty(this.A00.A01.A7O())) {
            HashMap map = new HashMap();
            Map<String, String> extraData = this.A02;
            map.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            map.putAll(extraData2);
            this.A00.A0A.A0A().AC3(this.A00.A01.A7O(), map);
        }
    }
}
