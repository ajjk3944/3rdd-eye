package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2117f extends z1 {
    public C2117f(com.applovin.impl.sdk.k kVar) {
        super(kVar, y1.b.AD);
    }

    public void a(y1 y1Var, com.applovin.impl.sdk.ad.b bVar) {
        a(y1Var, bVar, new HashMap());
    }

    public void a(y1 y1Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(y1Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(y1 y1Var, C2145t c2145t, AppLovinError appLovinError) {
        a(y1Var, c2145t, null, appLovinError, new HashMap());
    }

    private void a(y1 y1Var, C2145t c2145t, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f21886a.a(l4.f19748H)).booleanValue() && this.f21886a.G0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(a2.a((AppLovinAdImpl) bVar));
        } else if (c2145t != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", c2145t.e(), map);
            MaxAdFormat maxAdFormatD = c2145t.d();
            if (maxAdFormatD != null) {
                CollectionUtils.putStringIfValid("ad_format", maxAdFormatD.getLabel(), map);
            }
        }
        AppLovinAdSize appLovinAdSizeA = a(c2145t, bVar);
        if (appLovinAdSizeA != null) {
            CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeA.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(y1Var, map);
    }

    private AppLovinAdSize a(C2145t c2145t, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize appLovinAdSizeF = c2145t != null ? c2145t.f() : null;
        if (appLovinAdSizeF != null) {
            return appLovinAdSizeF;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
