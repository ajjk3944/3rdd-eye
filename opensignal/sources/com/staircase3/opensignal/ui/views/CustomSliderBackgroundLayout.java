package com.staircase3.opensignal.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import qk.e;
import qk.f;
import se.b;

/* loaded from: classes.dex */
public class CustomSliderBackgroundLayout extends FrameLayout {
    public float B;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final Bitmap H;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6166a;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f6167d;

    /* renamed from: g, reason: collision with root package name */
    public int f6168g;

    /* renamed from: r, reason: collision with root package name */
    public float f6169r;

    /* renamed from: x, reason: collision with root package name */
    public int f6170x;

    /* renamed from: y, reason: collision with root package name */
    public int f6171y;

    public CustomSliderBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6166a = new Paint();
        this.f6167d = new Paint();
        this.f6168g = 0;
        this.f6169r = 0.0f;
        this.f6170x = 0;
        this.f6171y = 0;
        this.B = 0.0f;
        this.D = b.t(getContext(), 8);
        this.E = b.t(getContext(), 8);
        this.F = b.t(getContext(), 26);
        this.G = b.t(getContext(), 26);
        this.H = BitmapFactory.decodeResource(getResources(), f.ic_no_data_collected);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i10 = this.F;
        int i11 = (width - (i10 + this.G)) / (this.f6168g - 1);
        int i12 = this.f6170x;
        Paint paint = this.f6166a;
        paint.setColor(i12);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        int i13 = this.f6171y;
        Paint paint2 = this.f6167d;
        paint2.setColor(i13);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(this.B);
        int dimension = (int) getResources().getDimension(e.tick_no_data);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.H, dimension, dimension, true);
        float width2 = bitmapCreateScaledBitmap.getWidth() / 2;
        float f10 = height / 2;
        RectF rectF = new RectF(i10 + width2, f10 - ((this.f6169r / 2.0f) - b.t(getContext(), 1)), width - r5, ((this.f6169r / 2.0f) - b.t(getContext(), 1)) + f10);
        int i14 = this.D;
        int i15 = this.E;
        canvas.drawRoundRect(rectF, i14, i15, paint);
        canvas.drawRoundRect(new RectF(i10 + width2, (f10 - (this.f6169r / 2.0f)) - b.t(getContext(), 1), width - r5, ((this.f6169r / 2.0f) + f10) - b.t(getContext(), 1)), i14, i15, paint2);
        int[] iArr = {0, (int) getResources().getDimension(e.tick_1), (int) getResources().getDimension(e.tick_2), (int) getResources().getDimension(e.tick_3), (int) getResources().getDimension(e.tick_4)};
        canvas.drawBitmap(bitmapCreateScaledBitmap, i10 - width2, height / 3, paint);
        bitmapCreateScaledBitmap.recycle();
        for (int i16 = 1; i16 < this.f6168g; i16++) {
            int i17 = i16 * i11;
            canvas.drawCircle(i10 + i17, f10, iArr[i16], paint);
            canvas.drawCircle(i17 + i10, f10, iArr[i16], paint2);
        }
    }

    public void setBackdropFillColor(int i10) {
        this.f6170x = i10;
    }

    public void setBackdropStrokeColor(int i10) {
        this.f6171y = i10;
    }

    public void setBackdropStrokeWidth(float f10) {
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        this.B = f10;
    }

    public void setHorizontalBarThickness(float f10) {
        if (f10 < 2.0f) {
            f10 = 2.0f;
        }
        this.f6169r = f10;
    }

    public void setTickMarkCount(int i10) {
        if (i10 < 2) {
            i10 = 2;
        }
        this.f6168g = i10;
    }

    public void setTickMarkRadius(float f10) {
    }
}
