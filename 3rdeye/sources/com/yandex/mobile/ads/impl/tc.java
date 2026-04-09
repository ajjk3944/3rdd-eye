package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class tc extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f33523a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Drawable> f33524b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.l.f(drawable, "drawable");
        this.f33523a = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        kotlin.jvm.internal.l.f(paint, "paint");
        if (this.f33523a != -1) {
            super.draw(canvas, charSequence, i, i10, f10, i11, i12, i13, paint);
            return;
        }
        WeakReference<Drawable> weakReference = this.f33524b;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f33524b = new WeakReference<>(drawable);
            kotlin.jvm.internal.l.c(drawable);
        }
        canvas.save();
        canvas.translate(f10, com.google.gson.internal.c.y(((i11 + i13) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.l.f(paint, "paint");
        WeakReference<Drawable> weakReference = this.f33524b;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f33524b = new WeakReference<>(drawable);
            kotlin.jvm.internal.l.c(drawable);
        }
        Rect bounds = drawable.getBounds();
        kotlin.jvm.internal.l.e(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
