package com.lefan.signal.ui.satellite;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import q5.i;

/* loaded from: classes.dex */
public final class SatelliteView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f19241a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19242b;

    /* renamed from: c, reason: collision with root package name */
    public float f19243c;

    /* renamed from: d, reason: collision with root package name */
    public float f19244d;

    /* renamed from: e, reason: collision with root package name */
    public float f19245e;

    /* renamed from: f, reason: collision with root package name */
    public float f19246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SatelliteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        Paint paint = new Paint();
        this.f19241a = paint;
        Paint paint2 = new Paint();
        this.f19242b = paint2;
        this.f19246f = 10.0f;
        paint.setStrokeWidth(3.0f);
        paint.setColor(-3355444);
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(-3355444);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        int i = 0;
        while (i < 5) {
            Paint paint = this.f19242b;
            if (i >= 2) {
                canvas2 = canvas;
                float f2 = this.f19246f;
                float f5 = this.f19243c;
                float f6 = i - 2;
                float f7 = this.f19245e;
                float f8 = 2;
                float f9 = this.f19244d;
                canvas2.drawRect(((f2 + f5) * f6) + f2, (f7 * f8) + f9, ((f2 + f5) * f6) + f2 + f5, (f7 * f8) + f9 + f9, paint);
            } else if (i == 1) {
                float f10 = this.f19246f;
                float f11 = this.f19243c;
                float f12 = i + 1;
                float f13 = ((f10 + f11) * f12) + f10;
                float f14 = this.f19245e;
                canvas2 = canvas;
                canvas2.drawRect(f13, f14, ((f10 + f11) * f12) + f10 + f11, f14 + this.f19244d, paint);
            } else {
                canvas2 = canvas;
                float f15 = this.f19246f;
                float f16 = this.f19243c;
                float f17 = i + 1;
                float f18 = this.f19245e;
                canvas2.drawRect(((f15 + f16) * f17) + f15, f18, ((f15 + f16) * f17) + f15 + f16, f18 + this.f19244d, this.f19241a);
            }
            i++;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        float f2 = 3;
        this.f19243c = (size * f2) / 10;
        float f5 = (2 * size) / 9;
        this.f19244d = f5;
        float f6 = 1 * size;
        this.f19245e = f6 / 15;
        this.f19246f = f6 / 40;
        setMeasuredDimension((int) size, (int) (f5 * f2));
    }

    public final void setSatellites(int i) {
        Paint paint = this.f19242b;
        if (i < 3) {
            paint.setColor(-65536);
        } else if (i < 5) {
            paint.setColor(-256);
        } else {
            paint.setColor(-16711936);
        }
        invalidate();
    }
}
