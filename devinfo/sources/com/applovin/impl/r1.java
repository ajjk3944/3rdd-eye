package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class r1 extends e2 {

    /* renamed from: i, reason: collision with root package name */
    private JSONObject f5187i;

    public r1(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.ERROR);
    }

    public void a(String str, Throwable th2) {
        a(str, th2, new HashMap());
    }

    public void b() {
        this.f5187i = JsonUtils.deserialize((String) this.f4017a.a(x4.K));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th2) {
        a(str, str2, th2, new HashMap());
    }

    public void a(String str, String str2, Throwable th2, Map map) {
        a(d.h.E(str, ":", str2), th2, map);
    }

    public void b(String str, String str2, Throwable th2) {
        this.f4017a.q0().a((i5) new r6(this.f4017a, "reportCaughtException", new ci.a((Object) this, str, str2, (Object) th2, 9)), d6.b.OTHER);
    }

    public void a(String str, Throwable th2, Map map) {
        map.put("source", str);
        map.put("top_main_method", th2.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th3 : th2.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th3.toString(), map2);
            arrayList.add(map2);
        }
        a(d2.N0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(f2.a((AppLovinAdImpl) bVar));
            map.putAll(f2.a(bVar));
            boolean zC0 = bVar.C0();
            map.put("is_video_stream", String.valueOf(zC0));
            if (zC0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).i1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.I(), map);
            }
        }
        d(d2.T0, map);
    }

    public void a(String str, String str2, int i4, String str3) {
        List listA = a(str2);
        boolean z3 = listA != null;
        if (z3 && listA.contains(Integer.valueOf(i4))) {
            return;
        }
        if (z3 || i4 >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i4));
            map.put("error_message", f2.a(str3));
            d(d2.W0, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f5187i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f5187i, "default", null) : integerList;
    }
}
