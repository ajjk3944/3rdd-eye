package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.p51;

/* loaded from: classes3.dex */
public final class kg2 implements uo {

    /* renamed from: a, reason: collision with root package name */
    private final View f29659a;

    public kg2(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f29659a = view;
    }

    @Override // com.yandex.mobile.ads.impl.uo
    public final void a(ir0 link, wo clickListenerCreator) {
        kotlin.jvm.internal.l.f(link, "link");
        kotlin.jvm.internal.l.f(clickListenerCreator, "clickListenerCreator");
        Context context = this.f29659a.getContext();
        View.OnClickListener onClickListenerA = clickListenerCreator.a(link);
        kotlin.jvm.internal.l.c(context);
        v61 v61Var = new v61(context, onClickListenerA, new no(context, onClickListenerA), p51.a.a());
        this.f29659a.setOnTouchListener(v61Var);
        this.f29659a.setOnClickListener(v61Var);
    }
}
