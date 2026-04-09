package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes3.dex */
public final class hu {

    /* renamed from: a, reason: collision with root package name */
    private final View f28366a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f28367b;

    /* renamed from: c, reason: collision with root package name */
    private final Path f28368c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f28369d;

    public /* synthetic */ hu(View view, float f10, float f11, float f12, float f13) {
        this(view, f10, f11, f12, f13, new RectF(), new Path());
    }

    public final void a(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (this.f28369d == null || this.f28368c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f28368c);
    }

    public hu(View roundView, float f10, float f11, float f12, float f13, RectF clipRect, Path clipPath) {
        kotlin.jvm.internal.l.f(roundView, "roundView");
        kotlin.jvm.internal.l.f(clipRect, "clipRect");
        kotlin.jvm.internal.l.f(clipPath, "clipPath");
        this.f28366a = roundView;
        this.f28367b = clipRect;
        this.f28368c = clipPath;
        this.f28369d = a(f10, f11, f12, f13);
    }

    private static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f28369d != null) {
            int measuredWidth = this.f28366a.getMeasuredWidth();
            int measuredHeight = this.f28366a.getMeasuredHeight();
            int paddingLeft = this.f28366a.getPaddingLeft();
            int paddingTop = this.f28366a.getPaddingTop();
            int paddingRight = measuredWidth - this.f28366a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f28366a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f28367b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f28368c.reset();
            this.f28368c.addRoundRect(this.f28367b, this.f28369d, Path.Direction.CW);
        }
    }
}
