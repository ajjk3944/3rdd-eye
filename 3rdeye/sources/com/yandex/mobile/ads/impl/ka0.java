package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class ka0 implements InterfaceC4214v<ja0> {

    /* renamed from: a, reason: collision with root package name */
    private final ta0 f29571a;

    public ka0(ta0 feedbackRenderer) {
        kotlin.jvm.internal.l.f(feedbackRenderer, "feedbackRenderer");
        this.f29571a = feedbackRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4214v
    public final af0 a(View view, InterfaceC4200t interfaceC4200t) {
        ja0 action = (ja0) interfaceC4200t;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        Context context = view.getContext();
        ta0 ta0Var = this.f29571a;
        kotlin.jvm.internal.l.c(context);
        ta0Var.a(context, action);
        return new af0(false);
    }
}
