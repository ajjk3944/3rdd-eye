package com.yandex.mobile.ads.impl;

import android.view.View;
import c9.C2077A;
import c9.C2092m;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class gg {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f27682a;

    public gg(xo clickListenerFactory, List<? extends ag<?>> assets, C4210u2 adClickHandler, x61 viewAdapter, qo1 renderedTimer, ck0 impressionEventsObservable, ir0 ir0Var) {
        ir0 ir0Var2;
        C4210u2 c4210u2;
        x61 x61Var;
        qo1 qo1Var;
        ck0 ck0Var;
        xo xoVar;
        kotlin.jvm.internal.l.f(clickListenerFactory, "clickListenerFactory");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(adClickHandler, "adClickHandler");
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        int iL = C2077A.l(C2092m.T(assets, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL < 16 ? 16 : iL);
        for (ag<?> agVar : assets) {
            String strB = agVar.b();
            ir0 ir0VarA = agVar.a();
            if (ir0VarA == null) {
                ir0Var2 = ir0Var;
                xoVar = clickListenerFactory;
                c4210u2 = adClickHandler;
                x61Var = viewAdapter;
                qo1Var = renderedTimer;
                ck0Var = impressionEventsObservable;
            } else {
                ir0Var2 = ir0VarA;
                c4210u2 = adClickHandler;
                x61Var = viewAdapter;
                qo1Var = renderedTimer;
                ck0Var = impressionEventsObservable;
                xoVar = clickListenerFactory;
            }
            linkedHashMap.put(strB, xoVar.a(agVar, ir0Var2, c4210u2, x61Var, qo1Var, ck0Var));
        }
        this.f27682a = linkedHashMap;
    }

    public final void a(View view, String assetName) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(assetName, "assetName");
        View.OnClickListener onClickListener = (View.OnClickListener) this.f27682a.get(assetName);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
