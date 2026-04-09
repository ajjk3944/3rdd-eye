package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4076b0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4221w f25035a;

    public C4076b0(C4072a3 adConfiguration, a8 adResponse, yo reporter, h91 nativeOpenUrlHandlerCreator, x61 nativeAdViewAdapter, g51 nativeAdEventController, C4221w actionHandlerProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(actionHandlerProvider, "actionHandlerProvider");
        this.f25035a = actionHandlerProvider;
    }

    public final af0 a(View view, List<? extends InterfaceC4200t> list) {
        kotlin.jvm.internal.l.f(view, "view");
        af0 af0Var = new af0(list == null || list.isEmpty());
        if (list != null) {
            for (InterfaceC4200t interfaceC4200t : list) {
                C4221w c4221w = this.f25035a;
                Context context = view.getContext();
                kotlin.jvm.internal.l.e(context, "getContext(...)");
                InterfaceC4214v<? extends InterfaceC4200t> interfaceC4214vA = c4221w.a(context, interfaceC4200t);
                if (interfaceC4214vA == null) {
                    interfaceC4214vA = null;
                }
                if (interfaceC4214vA != null) {
                    af0Var = new af0(af0Var.a() || interfaceC4214vA.a(view, interfaceC4200t).a());
                }
            }
        }
        return af0Var;
    }
}
