package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.yandex.mobile.ads.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4208u0 implements InterfaceC4133j1 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4133j1
    public final InterfaceC4126i1 a(Activity activity, RelativeLayout rootLayout, C4188r1 listener, C4070a1 eventController, Intent intent, Window window, C4236y0 c4236y0) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(intent, "intent");
        kotlin.jvm.internal.l.f(window, "window");
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return null;
        }
        try {
            C4203t2 c4203t2 = new C4203t2(activity);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setId(1);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(r7.b());
            return new C4201t0(activity, rootLayout, listener, window, stringExtra, c4203t2, linearLayout, t7.c(activity), t7.d(activity), new l82(new k82()));
        } catch (gj2 unused) {
            return null;
        }
    }
}
