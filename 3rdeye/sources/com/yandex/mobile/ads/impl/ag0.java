package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hx1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ag0 extends vj<String> {

    /* renamed from: w, reason: collision with root package name */
    private final we1 f24642w;

    /* renamed from: x, reason: collision with root package name */
    private final qn1 f24643x;

    public /* synthetic */ ag0(Context context, C4072a3 c4072a3, C4198s4 c4198s4) {
        this(context, c4072a3, c4198s4, lu.a(), new we1(), qn1.f32297b.a());
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final tj<String> a(String url, String query) {
        JSONObject jSONObjectA;
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(query, "query");
        Context contextL = l();
        C4072a3 c4072a3F = f();
        hx1.f28410a.getClass();
        C4114g3 c4114g3 = new C4114g3(contextL, c4072a3F, url, query, this, this, hx1.a.a(contextL), new bg0(), new p7());
        h7 h7VarA = f().a();
        String strOptString = null;
        String strG = h7VarA != null ? h7VarA.g() : null;
        this.f24642w.getClass();
        if (strG != null && (jSONObjectA = iq0.a(strG)) != null && jSONObjectA.has("response")) {
            strOptString = jSONObjectA.optString("response");
        }
        if (strOptString != null) {
            this.f24643x.a(c4114g3, strOptString);
        }
        return c4114g3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, A9.E coroutineScope, we1 openBiddingReadyResponseProvider, qn1 responseStorage) {
        super(context, adLoadingPhasesManager, adConfiguration, coroutineScope);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(openBiddingReadyResponseProvider, "openBiddingReadyResponseProvider");
        kotlin.jvm.internal.l.f(responseStorage, "responseStorage");
        this.f24642w = openBiddingReadyResponseProvider;
        this.f24643x = responseStorage;
    }
}
