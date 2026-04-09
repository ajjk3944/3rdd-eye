package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.content.Context;
import android.view.View;
import j6.q;
import z6.C5865d;

/* loaded from: classes3.dex */
public final class y10 implements j6.m {
    @Override // j6.m
    public final void bindView(View view, N7.R3 div, C0675l divView, A7.d expressionResolver, C5865d path) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(path, "path");
    }

    @Override // j6.m
    public final View createView(N7.R3 div, C0675l divView, A7.d expressionResolver, C5865d path) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(path, "path");
        Context context = divView.getContext();
        kotlin.jvm.internal.l.c(context);
        return new kn1(context);
    }

    @Override // j6.m
    public final boolean isCustomTypeSupported(String type) {
        kotlin.jvm.internal.l.f(type, "type");
        return "rating".equals(type);
    }

    @Override // j6.m
    public /* bridge */ /* synthetic */ q.c preload(N7.R3 r32, q.a aVar) {
        j6.l.c(r32, aVar);
        return q.c.a.f43053a;
    }

    @Override // j6.m
    public final void release(View view, N7.R3 div) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
    }
}
