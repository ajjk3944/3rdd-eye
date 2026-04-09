package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919ti implements InterfaceC1542mi {
    @Override // com.google.android.gms.internal.ads.InterfaceC1542mi
    public final void a(HashMap map) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Fb)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p2.j.f22785C.f22795h.i().F(Boolean.parseBoolean(str));
    }
}
