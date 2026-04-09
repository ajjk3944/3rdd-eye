package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ly0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30126a;

    /* renamed from: b, reason: collision with root package name */
    private final fx0<?, ?> f30127b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f30128c;

    public ly0(Context context, fx0 mediatedAdController, LinkedHashMap mediatedReportData) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediatedAdController, "mediatedAdController");
        kotlin.jvm.internal.l.f(mediatedReportData, "mediatedReportData");
        this.f30126a = context;
        this.f30127b = mediatedAdController;
        this.f30128c = mediatedReportData;
    }

    public final void a() {
        this.f30127b.e(this.f30126a, this.f30128c);
    }
}
