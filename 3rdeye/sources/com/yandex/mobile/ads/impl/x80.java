package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hx1;

/* loaded from: classes3.dex */
public class x80 extends vj<String> {

    /* renamed from: w, reason: collision with root package name */
    private final fa0 f35215w;

    public /* synthetic */ x80(Context context, C4072a3 c4072a3, C4198s4 c4198s4, fa0 fa0Var) {
        this(context, c4072a3, c4198s4, fa0Var, lu.a());
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final tj<String> a(String url, String query) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(query, "query");
        Context contextL = l();
        C4072a3 c4072a3F = f();
        fa0 fa0Var = this.f35215w;
        hx1.f28410a.getClass();
        return new u80(contextL, c4072a3F, url, query, this, this, fa0Var, hx1.a.a(contextL), new bg0(), new p7());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, fa0 fa0Var, A9.E coroutineScope) {
        super(context, adLoadingPhasesManager, adConfiguration, coroutineScope);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        this.f35215w = fa0Var;
    }
}
