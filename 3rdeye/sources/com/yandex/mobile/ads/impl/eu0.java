package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class eu0 implements gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f27041a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27042b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27043c;

    /* renamed from: d, reason: collision with root package name */
    private final gu0.a f27044d;

    public eu0(View view, float f10, Context context, gu0.a measureSpecHolder) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(measureSpecHolder, "measureSpecHolder");
        this.f27041a = view;
        this.f27042b = f10;
        this.f27043c = context;
        this.f27044d = measureSpecHolder;
    }

    @Override // com.yandex.mobile.ads.impl.gu0
    public final gu0.a a(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        Context context = this.f27043c;
        int i11 = jh2.f29145b;
        kotlin.jvm.internal.l.f(context, "context");
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f27042b);
        ViewGroup.LayoutParams layoutParams = this.f27041a.getLayoutParams();
        kotlin.jvm.internal.l.e(layoutParams, "getLayoutParams(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f27044d.f27985a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, iRound), 0.0d), mode);
        gu0.a aVar = this.f27044d;
        aVar.f27986b = i10;
        return aVar;
    }
}
