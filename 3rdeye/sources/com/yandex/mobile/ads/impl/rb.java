package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* loaded from: classes3.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    private final s50 f32578a;

    /* renamed from: b, reason: collision with root package name */
    private final ze1 f32579b;

    /* renamed from: c, reason: collision with root package name */
    private final C4111g0 f32580c;

    public /* synthetic */ rb(s50 s50Var, ze1 ze1Var) {
        this(s50Var, ze1Var, new C4111g0());
    }

    public final void a(View view, cb action) {
        Activity activityB;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        this.f32580c.getClass();
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        while (true) {
            activityB = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activityB = activity;
                break;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                break;
            }
        }
        if (activityB == null) {
            activityB = C4146l0.b();
        }
        if (activityB == null || !aa.a((Context) activityB)) {
            return;
        }
        try {
            a(activityB, new ub(activityB), action);
        } catch (Throwable unused) {
        }
    }

    public rb(s50 eventListenerController, ze1 openUrlHandler, C4111g0 activityContextProvider) {
        kotlin.jvm.internal.l.f(eventListenerController, "eventListenerController");
        kotlin.jvm.internal.l.f(openUrlHandler, "openUrlHandler");
        kotlin.jvm.internal.l.f(activityContextProvider, "activityContextProvider");
        this.f32578a = eventListenerController;
        this.f32579b = openUrlHandler;
        this.f32580c = activityContextProvider;
    }

    private final void a(Activity activity, ub ubVar, cb cbVar) {
        new gb(new ib(activity, ubVar, new fb(activity, ubVar), new hb()).a(), ubVar, this.f32578a, this.f32579b, new Handler(Looper.getMainLooper())).a(cbVar.c(), cbVar.d());
    }
}
