package com.applovin.impl;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y1;
import com.google.android.gms.common.internal.ImagesContract;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m1 extends z1 {
    private JSONObject i;

    public m1(com.applovin.impl.sdk.k kVar) {
        super(kVar, y1.b.ERROR);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void b() {
        this.i = JsonUtils.deserialize((String) this.f21886a.a(l4.f19756I));
    }

    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(B4.g.o(str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2), th, map);
    }

    public void a(String str, Throwable th, Map map) {
        map.put(AdRevenueConstants.SOURCE_KEY, str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        a(y1.f21818s0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put(AdRevenueConstants.SOURCE_KEY, str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(a2.a((AppLovinAdImpl) bVar));
            map.putAll(a2.a(bVar));
            boolean zQ0 = bVar.Q0();
            map.put("is_video_stream", String.valueOf(zQ0));
            if (zQ0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).q1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.S(), map);
            }
        }
        d(y1.f21828x0, map);
    }

    public void a(String str, String str2, int i, String str3) {
        List listA = a(str2);
        boolean z10 = listA != null;
        if (z10 && listA.contains(Integer.valueOf(i))) {
            return;
        }
        if (z10 || i >= 400) {
            HashMap map = new HashMap(4);
            map.put(AdRevenueConstants.SOURCE_KEY, str);
            map.put(ImagesContract.URL, com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i));
            map.put("error_message", a2.a(str3));
            d(y1.f21754A0, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.i, com.applovin.impl.sdk.utils.StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.i, "default", null) : integerList;
    }
}
