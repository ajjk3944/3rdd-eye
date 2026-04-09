package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f2 {
    public static Map a(AppLovinAdImpl appLovinAdImpl) {
        HashMap map = new HashMap(10);
        if (appLovinAdImpl != null) {
            CollectionUtils.putStringIfValid("ad_domain", appLovinAdImpl.getAdDomain(), map);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinAdImpl.getAdIdNumber()), map);
            MaxAdFormat maxAdFormatD = appLovinAdImpl.getAdZone().d();
            CollectionUtils.putStringIfValid("ad_format", maxAdFormatD != null ? maxAdFormatD.getLabel() : null, map);
            CollectionUtils.putStringIfValid("ad_zone_id", appLovinAdImpl.getAdZone().e(), map);
            CollectionUtils.putStringIfValid("clcode", appLovinAdImpl.getClCode(), map);
            CollectionUtils.putStringIfValid("dsp_id", appLovinAdImpl.getDspId(), map);
            CollectionUtils.putStringIfValid("dsp_name", appLovinAdImpl.getDspName(), map);
            CollectionUtils.putStringIfValid("ad_size", appLovinAdImpl.getSize().getLabel(), map);
            CollectionUtils.putStringIfValid("ad_event_id", appLovinAdImpl.getMediationServeId(), map);
            CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinAdImpl.isOpenMeasurementEnabled()), map);
            if (appLovinAdImpl instanceof com.applovin.impl.sdk.ad.b) {
                CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(((com.applovin.impl.sdk.ad.b) appLovinAdImpl).y0()), map);
            }
        }
        return map;
    }

    public static String b(com.applovin.impl.sdk.ad.b bVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "reshow_count", bVar.R());
        return jSONObject.toString();
    }

    public static Map a(com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        if (bVar != null) {
            com.applovin.impl.sdk.k sdk = bVar.getSdk();
            if (((Boolean) sdk.a(x4.L)).booleanValue()) {
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList(bVar.l().keySet());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String path = Uri.parse((String) obj).getPath();
                    map2.put(path, Formatter.formatFileSize(com.applovin.impl.sdk.k.o(), new File(path).length()));
                }
                map.put("path", map2.toString());
            }
            if ((bVar instanceof com.applovin.impl.sdk.ad.a) && ((Boolean) sdk.a(x4.M)).booleanValue()) {
                map.put("details", ((com.applovin.impl.sdk.ad.a) bVar).g1());
            }
        }
        return map;
    }

    public static Map a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        HashMap map = new HashMap(7);
        if (appLovinNativeAdImpl == null) {
            return map;
        }
        CollectionUtils.putStringIfValid("ad_domain", appLovinNativeAdImpl.getAdDomain(), map);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinNativeAdImpl.getAdIdNumber()), map);
        CollectionUtils.putStringIfValid("clcode", appLovinNativeAdImpl.getClCode(), map);
        CollectionUtils.putStringIfValid("dsp_id", appLovinNativeAdImpl.getDspId(), map);
        CollectionUtils.putStringIfValid("dsp_name", appLovinNativeAdImpl.getDspName(), map);
        CollectionUtils.putStringIfValid("ad_size", AppLovinAdSize.NATIVE.toString(), map);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinNativeAdImpl.getMediationServeId(), map);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinNativeAdImpl.isOpenMeasurementEnabled()), map);
        return map;
    }

    public static Map a(y2 y2Var) {
        Map mapA = a((k3) y2Var);
        CollectionUtils.putStringIfValid("bcode", y2Var.B(), mapA);
        CollectionUtils.putStringIfValid("creative_id", y2Var.getCreativeId(), mapA);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, y2Var.getAdUnitId(), mapA);
        CollectionUtils.putStringIfValid("ad_event_id", y2Var.Q(), mapA);
        CollectionUtils.putStringIfValid("ad_format", y2Var.getFormat().getLabel(), mapA);
        CollectionUtils.putStringIfValid("dsp_id", y2Var.getDspId(), mapA);
        CollectionUtils.putStringIfValid("dsp_name", y2Var.getDspName(), mapA);
        return mapA;
    }

    public static Map a(k3 k3Var) {
        HashMap map = new HashMap(3);
        CollectionUtils.putStringIfValid("network_name", k3Var.c(), map);
        String strB = k3Var.b();
        CollectionUtils.putStringIfValid("adapter_class", strB, map);
        CollectionUtils.putStringIfValid("adapter_version", w3.a(strB).getAdapterVersion(), map);
        return map;
    }

    public static Map a(MaxError maxError) {
        HashMap map = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), map);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        return map;
    }

    public static String a(String str) {
        return StringUtils.prefixToIndex(1000, str);
    }
}
