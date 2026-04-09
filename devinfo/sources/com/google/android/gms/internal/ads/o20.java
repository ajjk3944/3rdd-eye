package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o20 implements h20 {
    @Override // com.google.android.gms.internal.ads.h20
    public final void a(HashMap map) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Hb)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ua.j.C.f35265h.i().F(Boolean.parseBoolean(str));
    }
}
