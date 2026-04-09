package com.yandex.mobile.ads.impl;

import android.net.Uri;
import c9.C2077A;
import c9.C2078B;
import c9.C2092m;
import c9.C2100u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class cn1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f25720a;

    public static final class a {
        public static Uri a(Uri uri, p9.l modifier) {
            Map linkedHashMap;
            kotlin.jvm.internal.l.f(uri, "<this>");
            kotlin.jvm.internal.l.f(modifier, "modifier");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null) {
                int iL = C2077A.l(C2092m.T(queryParameterNames, 10));
                if (iL < 16) {
                    iL = 16;
                }
                linkedHashMap = new LinkedHashMap(iL);
                for (String str : queryParameterNames) {
                    linkedHashMap.put(str, uri.getQueryParameter(str));
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                linkedHashMap = C2100u.f18582b;
            }
            cn1 cn1Var = (cn1) ((ba2) modifier).invoke(new cn1(linkedHashMap));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (Map.Entry<String, String> entry : cn1Var.a().entrySet()) {
                builderClearQuery.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            Uri uriBuild = builderClearQuery.build();
            kotlin.jvm.internal.l.e(uriBuild, "build(...)");
            return uriBuild;
        }
    }

    public cn1(Map<String, String> rawParams) {
        kotlin.jvm.internal.l.f(rawParams, "rawParams");
        this.f25720a = C2078B.u(rawParams);
    }

    public final Map<String, String> a() {
        return this.f25720a;
    }

    public final void a(String key, String str) {
        kotlin.jvm.internal.l.f(key, "key");
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f25720a.put(key, str);
    }
}
