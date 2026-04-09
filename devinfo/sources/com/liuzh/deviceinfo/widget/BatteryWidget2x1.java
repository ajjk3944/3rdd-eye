package com.liuzh.deviceinfo.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import bi.d;
import oi.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class BatteryWidget2x1 extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21391a = 0;

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (context == null || appWidgetManager == null || iArr == null) {
            return;
        }
        d.c(new a(iArr, context, appWidgetManager, 0));
    }
}
