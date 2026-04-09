package com.yandex.mobile.ads.impl;

import L0.I;
import L0.X;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class vj2 {
    public static final o10 a(Context context) {
        L0.X xB;
        kotlin.jvm.internal.l.f(context, "context");
        try {
            xB = b(context);
        } catch (Throwable th) {
            fp0.b(th);
            xB = null;
        }
        if (xB == null) {
            return o10.f31122g;
        }
        X.k kVar = xB.f3850a;
        C0.e eVarF = kVar.f(135);
        kotlin.jvm.internal.l.e(eVarF, "getInsets(...)");
        C0.e eVarF2 = kVar.f(128);
        kotlin.jvm.internal.l.e(eVarF2, "getInsets(...)");
        int i = jh2.f29145b;
        return new o10(jh2.b(eVarF.f801a, context.getResources().getDisplayMetrics().density), jh2.b(eVarF.f802b, context.getResources().getDisplayMetrics().density), jh2.b(eVarF.f803c, context.getResources().getDisplayMetrics().density), jh2.b(eVarF.f804d, context.getResources().getDisplayMetrics().density), jh2.b(eVarF2.f802b, context.getResources().getDisplayMetrics().density), jh2.b(eVarF2.f804d, context.getResources().getDisplayMetrics().density));
    }

    private static L0.X b(Context context) {
        Activity activityA;
        if (ba.a(30)) {
            Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            kotlin.jvm.internal.l.e(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            return L0.X.h(null, currentWindowMetrics.getWindowInsets());
        }
        if (!ba.a(28) || (activityA = C4146l0.a()) == null) {
            return null;
        }
        View decorView = activityA.getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "getDecorView(...)");
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        return I.e.a(decorView);
    }
}
