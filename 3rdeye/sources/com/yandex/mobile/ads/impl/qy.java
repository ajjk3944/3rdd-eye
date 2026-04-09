package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class qy implements InterfaceC4214v<py> {

    /* renamed from: a, reason: collision with root package name */
    private final ty f32373a;

    public qy(ty deeplinkRenderer) {
        kotlin.jvm.internal.l.f(deeplinkRenderer, "deeplinkRenderer");
        this.f32373a = deeplinkRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4214v
    public final af0 a(View view, InterfaceC4200t interfaceC4200t) {
        py action = (py) interfaceC4200t;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        Context context = view.getContext();
        ty tyVar = this.f32373a;
        kotlin.jvm.internal.l.c(context);
        tyVar.a(context, action);
        return new af0(true);
    }
}
