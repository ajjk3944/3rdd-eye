package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.yandex.mobile.ads.impl.yc1;
import j6.q;
import org.json.JSONObject;
import z6.C5865d;

/* loaded from: classes3.dex */
public final class v10 implements j6.m {
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
        yc1.a aVar = yc1.f35708c;
        kotlin.jvm.internal.l.c(context);
        b82 b82VarC = aVar.a(context).c();
        JSONObject jSONObject = div.i;
        Object obj = jSONObject != null ? jSONObject.get("on_image_url") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = jSONObject != null ? jSONObject.get("off_image_url") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        e52 e52Var = new e52(context);
        if (str != null) {
            e52Var.setCheckedIcon(new BitmapDrawable(context.getResources(), b82VarC.a(str)));
        }
        if (str2 != null) {
            e52Var.setUncheckedIcon(new BitmapDrawable(context.getResources(), b82VarC.a(str2)));
        }
        return e52Var;
    }

    @Override // j6.m
    public final boolean isCustomTypeSupported(String type) {
        kotlin.jvm.internal.l.f(type, "type");
        return "mute_button".equals(type);
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
