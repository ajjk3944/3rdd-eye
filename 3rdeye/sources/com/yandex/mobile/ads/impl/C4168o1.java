package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;

/* renamed from: com.yandex.mobile.ads.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4168o1 implements InterfaceC4133j1 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4133j1
    public final InterfaceC4126i1 a(Activity activity, RelativeLayout rootLayout, C4188r1 listener, C4070a1 eventController, Intent intent, Window window, C4236y0 c4236y0) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(intent, "intent");
        kotlin.jvm.internal.l.f(window, "window");
        if (c4236y0 == null) {
            return null;
        }
        return new C4161n1(activity, c4236y0, new C4181q0(c4236y0.b().q().c()));
    }
}
