package com.yandex.mobile.ads.impl;

import android.net.Uri;
import c9.C2078B;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e30 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f26654a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f26655b;

    /* renamed from: c, reason: collision with root package name */
    private final hq0 f26656c;

    public /* synthetic */ e30(C4072a3 c4072a3, a8 a8Var) {
        this(c4072a3, a8Var, c4072a3.q().c(), new hq0());
    }

    public final void a(Uri uri, JSONObject jSONObject) {
        Map map;
        kotlin.jvm.internal.l.f(uri, "uri");
        String queryParameter = uri.getQueryParameter("eventName");
        if (queryParameter != null) {
            if (queryParameter.length() == 0) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                if (jSONObject != null) {
                    this.f26656c.getClass();
                    map = C2078B.u(hq0.a(jSONObject));
                } else {
                    map = new HashMap();
                }
                this.f26655b.a(new ip1(queryParameter, (Map<String, Object>) map, this.f26654a.a()));
            }
        }
    }

    public e30(C4072a3 adConfiguration, a8<?> adResponse, mp1 reporter, hq0 jsonConvertor) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(jsonConvertor, "jsonConvertor");
        this.f26654a = adResponse;
        this.f26655b = reporter;
        this.f26656c = jsonConvertor;
    }
}
