package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class sk0 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f33096a;

    /* renamed from: b, reason: collision with root package name */
    private final im f33097b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f33098c;

    /* renamed from: d, reason: collision with root package name */
    private final View.OnClickListener f33099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk0(Context context, j10 dimensionConverter) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        this.f33096a = dimensionConverter;
        this.f33097b = new im(context, dimensionConverter);
        this.f33098c = new TextView(context);
        this.f33099d = new J3(this, 0);
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sk0 this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        boolean zIsSelected = this$0.f33097b.isSelected();
        this$0.f33097b.setSelected(!zIsSelected);
        this$0.f33098c.setVisibility(!zIsSelected ? 0 : 8);
    }

    public final void setDescription(String description) {
        kotlin.jvm.internal.l.f(description, "description");
        this.f33098c.setText(description);
    }

    private final void a(Context context) {
        setOrientation(0);
        this.f33096a.getClass();
        int iA = j10.a(context, 4.0f);
        setPadding(iA, iA, iA, iA);
        this.f33097b.setOnClickListener(this.f33099d);
        addView(this.f33097b);
        this.f33096a.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        int iY = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f33098c.setPadding(iY, iY, iY, iY);
        this.f33096a.getClass();
        int iY2 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iY2, -65536);
        this.f33098c.setBackgroundDrawable(gradientDrawable);
        addView(this.f33098c);
        this.f33096a.getClass();
        int iY3 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f33098c.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(iY3, 0, iY3, iY3);
        this.f33098c.setLayoutParams(layoutParams2);
        this.f33098c.setVisibility(8);
    }
}
