package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class s12 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private Rect f32838a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f32839b;

    /* renamed from: c, reason: collision with root package name */
    private int f32840c;

    /* renamed from: d, reason: collision with root package name */
    private int f32841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s12(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        this.f32838a = new Rect();
        this.f32839b = new Paint();
        Context context2 = getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        this.f32840c = jh2.a(context2, 1.0f);
        Context context3 = getContext();
        kotlin.jvm.internal.l.e(context3, "getContext(...)");
        this.f32841d = jh2.a(context3, 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        int iA = jh2.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f32839b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f32840c);
        paint.setColor(iA);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i = 0; i < lineCount; i++) {
            int lineBounds = getLineBounds(i, this.f32838a);
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal) + layout.getPrimaryHorizontal(lineEnd - 1);
            float f10 = lineBounds + this.f32841d;
            canvas.drawLine(primaryHorizontal, f10, primaryHorizontal2, f10, paint);
        }
        super.onDraw(canvas);
    }
}
