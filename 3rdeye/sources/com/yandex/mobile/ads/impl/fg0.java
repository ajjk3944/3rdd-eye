package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class fg0 {

    /* renamed from: a, reason: collision with root package name */
    private final h9 f27319a;

    public /* synthetic */ fg0(Context context, C4072a3 c4072a3) {
        this(context, c4072a3, new h9(context, c4072a3));
    }

    public final void a(String url, a8 adResponse, C4182q1 handler) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(handler, "handler");
        List<String> listT = adResponse.t();
        if (listT != null) {
            Iterator<T> it = listT.iterator();
            while (it.hasNext()) {
                this.f27319a.a((String) it.next(), m62.f30283d);
            }
        }
        this.f27319a.a(url, adResponse, handler);
    }

    public fg0(Context context, C4072a3 adConfiguration, h9 adTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        this.f27319a = adTracker;
    }
}
