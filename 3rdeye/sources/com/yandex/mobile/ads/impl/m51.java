package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.kk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m51 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30214a;

    /* renamed from: b, reason: collision with root package name */
    private final yp1 f30215b;

    /* renamed from: c, reason: collision with root package name */
    private final kk.a<a8<p61>> f30216c;

    /* renamed from: d, reason: collision with root package name */
    private final qn1 f30217d;

    /* renamed from: e, reason: collision with root package name */
    private final we1 f30218e;

    public /* synthetic */ m51(Context context, yp1 yp1Var, kk.a aVar) {
        this(context, yp1Var, aVar, qn1.f32297b.a(), new we1());
    }

    public final l51 a(bq1<p61> requestPolicy, C4072a3 adConfiguration, h7 adRequestData, String url, String query) {
        JSONObject jSONObjectA;
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(query, "query");
        l51 l51Var = new l51(this.f30214a, requestPolicy, adConfiguration, url, query, this.f30215b, this.f30216c, new f61(requestPolicy), new o61());
        String strG = adRequestData.g();
        this.f30218e.getClass();
        String strOptString = (strG == null || (jSONObjectA = iq0.a(strG)) == null || !jSONObjectA.has("response")) ? null : jSONObjectA.optString("response");
        String strK = adRequestData.k();
        if (strOptString == null) {
            strOptString = strK;
        }
        if (strOptString != null) {
            this.f30217d.a(l51Var, strOptString);
        }
        return l51Var;
    }

    public m51(Context context, yp1 requestListener, kk.a<a8<p61>> responseListener, qn1 responseStorage, we1 openBiddingReadyResponseProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        kotlin.jvm.internal.l.f(responseListener, "responseListener");
        kotlin.jvm.internal.l.f(responseStorage, "responseStorage");
        kotlin.jvm.internal.l.f(openBiddingReadyResponseProvider, "openBiddingReadyResponseProvider");
        this.f30214a = context;
        this.f30215b = requestListener;
        this.f30216c = responseListener;
        this.f30217d = responseStorage;
        this.f30218e = openBiddingReadyResponseProvider;
    }
}
