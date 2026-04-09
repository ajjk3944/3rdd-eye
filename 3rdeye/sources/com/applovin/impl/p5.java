package com.applovin.impl;

import N7.G8;
import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final String f20674g;

    /* renamed from: h, reason: collision with root package name */
    private final List f20675h;
    private final a3 i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f20676j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f20677k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f20678l;

    /* renamed from: m, reason: collision with root package name */
    private final MaxError f20679m;

    public p5(String str, List list, Map map, Map map2, MaxError maxError, a3 a3Var, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskFireMediationPostbacks", kVar);
        this.f20674g = G8.s(str, "_urls");
        this.f20675h = list;
        this.f20676j = a7.a(map, kVar);
        this.f20677k = map2 == null ? new HashMap() : map2;
        this.f20679m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.i = a3Var;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z10 && a3Var != null) {
            map3.put("AppLovin-Ad-Network-Name", a3Var.c());
        }
        if (a3Var instanceof q2) {
            q2 q2Var = (q2) a3Var;
            map3.put("AppLovin-Ad-Unit-Id", q2Var.getAdUnitId());
            map3.put("AppLovin-Ad-Format", q2Var.getFormat().getLabel());
            if (z10) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", q2Var.P());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f20678l = map3;
    }

    private void a(String str, Map map) {
        b().e0().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.f20678l).a(false).c(map).c(((Boolean) this.f21692a.a(g3.f19389S7)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f21692a.a(g3.f19388S6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f20675h;
        if (list != null) {
            return list;
        }
        a3 a3Var = this.i;
        if (a3Var != null) {
            return a3Var.b(this.f20674g);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        List listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return;
        }
        Map mapE = e();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b((String) it.next(), this.f20676j), this.f20679m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f20677k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapE.containsKey(queryParameter)) {
                    a3 a3Var = this.i;
                    if (a3Var != null) {
                        map.put(str, a3Var.a((String) mapE.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            map.putAll(this.f21692a.B().e());
            a(builderClearQuery.build().toString(), map);
        }
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
