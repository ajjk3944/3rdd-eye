package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import b9.m;
import j6.q;
import org.json.JSONObject;
import z6.C5865d;

/* loaded from: classes3.dex */
public abstract class w10 implements j6.m {
    private static Integer a(N7.R3 r32, String str) {
        Object objA;
        JSONObject jSONObject = r32.i;
        try {
            objA = Integer.valueOf(Color.parseColor(jSONObject != null ? jSONObject.optString(str) : null));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        return (Integer) (objA instanceof m.a ? null : objA);
    }

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
        ProgressBar progressBar = new ProgressBar(divView.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer numA = a(div, "progress_color");
        if (numA != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(numA.intValue()));
        }
        Integer numA2 = a(div, "background_color");
        if (numA2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(numA2.intValue()));
        }
        return progressBar;
    }

    @Override // j6.m
    public abstract /* synthetic */ boolean isCustomTypeSupported(String str);

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
