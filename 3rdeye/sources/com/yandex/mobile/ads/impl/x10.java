package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import j6.q;
import org.json.JSONException;
import org.json.JSONObject;
import z6.C5865d;

/* loaded from: classes3.dex */
public final class x10 implements j6.m {
    @Override // j6.m
    public final void bindView(View view, N7.R3 div, C0675l divView, A7.d expressionResolver, C5865d path) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(path, "path");
    }

    @Override // j6.m
    public final View createView(N7.R3 div, C0675l divView, A7.d expressionResolver, C5865d path) throws JSONException {
        int color;
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(path, "path");
        String string = null;
        ProgressBar progressBar = new ProgressBar(divView.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = div.i;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            string = "#000000";
        } else if (jSONObject != null) {
            string = jSONObject.getString("progress_color");
        }
        try {
            color = Color.parseColor(string);
        } catch (Throwable unused) {
            color = -16777216;
        }
        Drawable drawable = progressBar.getContext().getDrawable(com.yandex.mobile.ads.R.drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // j6.m
    public final boolean isCustomTypeSupported(String type) {
        kotlin.jvm.internal.l.f(type, "type");
        return type.equals("close_progress_view");
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
