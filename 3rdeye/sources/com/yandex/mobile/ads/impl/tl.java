package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.gu0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class tl extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f33664a;

    /* renamed from: b, reason: collision with root package name */
    private final gu0 f33665b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33666c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f33667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(Context context, j10 dimensionConverter, gu0 emptySizeMeasureSpecProvider) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        kotlin.jvm.internal.l.f(emptySizeMeasureSpecProvider, "emptySizeMeasureSpecProvider");
        this.f33664a = dimensionConverter;
        this.f33665b = emptySizeMeasureSpecProvider;
        this.f33666c = j10.a(context, 0.5f);
        this.f33667d = new Paint();
        a(context);
    }

    private final void a(Context context) {
        this.f33664a.getClass();
        int iA = j10.a(context, 1.0f);
        this.f33667d.setStyle(Paint.Style.STROKE);
        this.f33667d.setStrokeWidth(iA);
        this.f33667d.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = this.f33666c;
        canvas.drawRect(f10, f10, getWidth() - this.f33666c, getHeight() - this.f33666c, this.f33667d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z10, i, i10, i11, i12);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z10, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        gu0.a aVarA = this.f33665b.a(i, i10);
        super.onMeasure(aVarA.f27985a, aVarA.f27986b);
    }

    public final void setColor(int i) {
        if (this.f33667d.getColor() != i) {
            this.f33667d.setColor(i);
            requestLayout();
        }
    }
}
