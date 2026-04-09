package com.liuzh.deviceinfo.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.os.Bundle;
import com.liuzh.deviceinfo.R;
import hg.a;
import t7.m;
import wi.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class WidgetsActivity extends a {
    public static final /* synthetic */ int B = 0;

    public final void D(Class cls) {
        Bundle bundle = new Bundle();
        bundle.putString("widget", cls.getSimpleName());
        cg.a.f2848b.f(bundle, "apply_widget");
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        if (appWidgetManager == null || !h.f36757b || !appWidgetManager.isRequestPinAppWidgetSupported()) {
            E();
            return;
        }
        try {
            appWidgetManager.requestPinAppWidget(new ComponentName(this, (Class<?>) cls), null, null);
        } catch (Throwable unused) {
            E();
        }
    }

    public final void E() {
        m mVar = new m(this);
        mVar.y(R.string.how_to_add_widget);
        mVar.v(R.string.how_to_add_widget_desc);
        mVar.x(R.string.got_it, null);
        mVar.A().setCanceledOnTouchOutside(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05f8  */
    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r20) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.widget.WidgetsActivity.onCreate(android.os.Bundle):void");
    }
}
