package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1997jv extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C1996ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1997jv(C1996ju c1996ju, Map map, Map map2) {
        this.A00 = c1996ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
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
