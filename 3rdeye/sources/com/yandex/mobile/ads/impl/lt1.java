package com.yandex.mobile.ads.impl;

import T1.CallableC1599k;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class lt1 {

    /* renamed from: a, reason: collision with root package name */
    private final q32 f30101a;

    public /* synthetic */ lt1() {
        this(new q32());
    }

    public final Point a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        q32 q32Var = this.f30101a;
        Callable callable = new Callable() { // from class: com.yandex.mobile.ads.impl.J1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lt1.a(windowManager);
            }
        };
        q32Var.getClass();
        Display display = (Display) q32.a(callable, windowManager, "getting display", "WindowManager");
        Object point = new Point(0, 0);
        q32 q32Var2 = this.f30101a;
        CallableC1599k callableC1599k = new CallableC1599k(display, point, this, 1);
        q32Var2.getClass();
        Object objA = q32.a(callableC1599k, display, "getting display metrics", "Display");
        if (objA != null) {
            point = objA;
        }
        return (Point) point;
    }

    public lt1(q32 systemServiceUtils) {
        kotlin.jvm.internal.l.f(systemServiceUtils, "systemServiceUtils");
        this.f30101a = systemServiceUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Display a(WindowManager windowManager) {
        kotlin.jvm.internal.l.f(windowManager, "$windowManager");
        return windowManager.getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point a(Display display, Point defaultPoint, lt1 this$0) {
        kotlin.jvm.internal.l.f(defaultPoint, "$defaultPoint");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        if (display == null) {
            return defaultPoint;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
