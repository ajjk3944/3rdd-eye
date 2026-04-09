package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class l02 implements InterfaceC4214v<k02> {

    /* renamed from: a, reason: collision with root package name */
    private final wx1 f29841a;

    /* renamed from: b, reason: collision with root package name */
    private final t02 f29842b;

    public l02(wx1 showSocialActionsReporter, t02 socialActionRenderer) {
        kotlin.jvm.internal.l.f(showSocialActionsReporter, "showSocialActionsReporter");
        kotlin.jvm.internal.l.f(socialActionRenderer, "socialActionRenderer");
        this.f29841a = showSocialActionsReporter;
        this.f29842b = socialActionRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4214v
    public final af0 a(View view, InterfaceC4200t interfaceC4200t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        k02 action = (k02) interfaceC4200t;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        this.f29841a.a(action.c());
        this.f29842b.a(view, action);
        return new af0(false);
    }
}
