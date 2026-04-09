package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.content.Context;
import android.view.View;
import t6.InterfaceC5609a;

/* loaded from: classes3.dex */
public final class r20 implements InterfaceC5609a {

    /* renamed from: a, reason: collision with root package name */
    private final q20 f32433a;

    /* renamed from: b, reason: collision with root package name */
    private final t20 f32434b;

    public static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final q20 f32435a;

        /* renamed from: b, reason: collision with root package name */
        private final s20 f32436b;

        public a(q20 clickHandler, s20 clickData) {
            kotlin.jvm.internal.l.f(clickHandler, "clickHandler");
            kotlin.jvm.internal.l.f(clickData, "clickData");
            this.f32435a = clickHandler;
            this.f32436b = clickData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view != null) {
                this.f32435a.a(this.f32436b.a(), view);
            }
        }
    }

    public /* synthetic */ r20(q20 q20Var) {
        this(q20Var, new t20(0));
    }

    @Override // t6.InterfaceC5609a
    public void beforeBindView(C0675l divView, A7.d expressionResolver, View view, N7.S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
    }

    @Override // t6.InterfaceC5609a
    public final void bindView(C0675l divView, A7.d expressionResolver, View view, N7.S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        Context context = view.getContext();
        s20 s20VarA = this.f32434b.a(div);
        if (s20VarA != null) {
            a aVar = new a(this.f32433a, s20VarA);
            kotlin.jvm.internal.l.c(context);
            no noVar = new no(context, aVar);
            view.setOnTouchListener(noVar);
            view.setOnClickListener(noVar);
        }
    }

    @Override // t6.InterfaceC5609a
    public final boolean matches(N7.S2 div) {
        kotlin.jvm.internal.l.f(div, "div");
        return this.f32434b.a(div) != null;
    }

    @Override // t6.InterfaceC5609a
    public void preprocess(N7.S2 div, A7.d expressionResolver) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
    }

    @Override // t6.InterfaceC5609a
    public final void unbindView(C0675l divView, A7.d expressionResolver, View view, N7.S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }

    public r20(q20 clickHandler, t20 clickExtensionParser) {
        kotlin.jvm.internal.l.f(clickHandler, "clickHandler");
        kotlin.jvm.internal.l.f(clickExtensionParser, "clickExtensionParser");
        this.f32433a = clickHandler;
        this.f32434b = clickExtensionParser;
    }
}
