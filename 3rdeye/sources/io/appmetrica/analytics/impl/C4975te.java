package io.appmetrica.analytics.impl;

import com.singular.sdk.internal.Constants;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4975te {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41691a;

    public C4975te() {
        HashMap map = new HashMap();
        this.f41691a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", Constants.REVENUE_PRODUCT_CATEGORY_KEY);
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put("auto_inapp_collecting", "aic");
        map.put("attribution", "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f41691a.containsKey(str) ? (String) this.f41691a.get(str) : str;
    }
}
