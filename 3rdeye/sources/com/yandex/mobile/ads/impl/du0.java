package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class du0 implements gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f26324a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26325b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f26326c;

    /* renamed from: d, reason: collision with root package name */
    private final gu0.a f26327d;

    public /* synthetic */ du0(View view, float f10, Context context) {
        this(view, f10, context, new gu0.a());
    }

    @Override // com.yandex.mobile.ads.impl.gu0
    public final gu0.a a(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int iRound = Math.round(jh2.c(this.f26326c) * this.f26325b);
        ViewGroup.LayoutParams layoutParams = this.f26324a.getLayoutParams();
        kotlin.jvm.internal.l.e(layoutParams, "getLayoutParams(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = (int) Math.max(Math.min(size, iRound), 0.0d);
        gu0.a aVar = this.f26327d;
        aVar.f27985a = i;
        aVar.f27986b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f26327d;
    }

    public du0(View view, float f10, Context context, gu0.a measureSpecHolder) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(measureSpecHolder, "measureSpecHolder");
        this.f26324a = view;
        this.f26325b = f10;
        this.f26326c = context;
        this.f26327d = measureSpecHolder;
    }
}
