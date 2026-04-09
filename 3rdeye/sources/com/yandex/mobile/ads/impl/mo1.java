package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class mo1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f30473a;

    /* renamed from: b, reason: collision with root package name */
    private final h9 f30474b;

    /* renamed from: c, reason: collision with root package name */
    private final lo1 f30475c;

    public /* synthetic */ mo1(Context context, a8 a8Var, C4072a3 c4072a3, e9 e9Var, List list) {
        this(context, a8Var, c4072a3, e9Var, list, new h9(context, c4072a3), new lo1(context, c4072a3, a8Var, e9Var));
    }

    public final void a(j91 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f30475c.a(reportParameterManager);
    }

    public final void a() {
        List<String> list = this.f30473a;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f30474b.a(it.next(), m62.i);
            }
        }
        this.f30475c.a();
    }

    public mo1(Context context, a8<?> adResponse, C4072a3 adConfiguration, e9 adStructureType, List<String> list, h9 adTracker, lo1 renderReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(renderReporter, "renderReporter");
        this.f30473a = list;
        this.f30474b = adTracker;
        this.f30475c = renderReporter;
    }
}
