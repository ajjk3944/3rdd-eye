package com.lefan.signal.ui.sensor;

import A3.C0133b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import q5.i;

/* loaded from: classes.dex */
public final class TemperatureView extends View {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f19270C = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f19271a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19272b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f19273c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f19274d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f19275e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f19276f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19277g;

    /* renamed from: h, reason: collision with root package name */
    public float f19278h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f19279j;

    /* renamed from: k, reason: collision with root package name */
    public float f19280k;

    /* renamed from: l, reason: collision with root package name */
    public float f19281l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f19282m;

    /* renamed from: n, reason: collision with root package name */
    public float f19283n;

    public TemperatureView(SensorDetailActivity sensorDetailActivity) {
        super(sensorDetailActivity);
        Paint paint = new Paint();
        this.f19271a = paint;
        Paint paint2 = new Paint();
        this.f19272b = paint2;
        Paint paint3 = new Paint();
        this.f19273c = paint3;
        Paint paint4 = new Paint();
        this.f19274d = paint4;
        Paint paint5 = new Paint();
        this.f19275e = paint5;
        Paint paint6 = new Paint();
        this.f19276f = paint6;
        Paint paint7 = new Paint();
        this.f19277g = paint7;
        this.f19282m = new RectF();
        paint.setColor(-3355444);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint3.setColor(getContext().getColor(R.color.text_color));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint3.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(3.0f);
        paint4.setColor(-16776961);
        paint4.setAntiAlias(true);
        paint4.setTypeface(typeface);
        paint4.setTextAlign(align);
        paint5.setTypeface(typeface);
        paint5.setTextAlign(align);
        paint5.setAntiAlias(true);
        paint6.setTextAlign(align);
        paint6.setColor(getContext().getColor(R.color.text_color));
        paint7.setStyle(style);
        paint7.setAntiAlias(true);
        paint7.setXfermode(new PorterDuffXfermode(mode));
        paint7.setStrokeCap(cap);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(3.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8 A[PHI: r1
  0x00d8: PHI (r1v8 float) = (r1v3 float), (r1v11 float) binds: [B:30:0x00ed, B:26:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da A[PHI: r14
  0x00da: PHI (r14v8 float) = (r14v7 float), (r14v21 float) binds: [B:30:0x00ed, B:26:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.sensor.TemperatureView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        this.f19280k = (7 * size) / 20;
        float f2 = size / 2;
        this.i = f2;
        this.f19279j = f2;
        float f5 = size / 30;
        Paint paint = this.f19271a;
        paint.setStrokeWidth(f5);
        this.f19277g.setStrokeWidth(f5);
        float f6 = size / 120;
        this.f19281l = f6;
        this.f19273c.setTextSize(f6 * 5);
        this.f19274d.setTextSize(this.f19281l * 8);
        this.f19275e.setTextSize(this.f19281l * 10);
        this.f19276f.setTextSize(this.f19281l * 6);
        float f7 = this.i;
        float f8 = this.f19280k;
        float f9 = this.f19279j;
        this.f19282m.set(f7 - f8, f9 - f8, f7 + f8, f9 + f8);
        this.f19283n = (this.f19279j - this.f19280k) - paint.getStrokeWidth();
        setMeasuredDimension(i, (int) (i * 0.75d));
    }

    public final void setTemperature(float f2) {
        float f5 = this.f19278h;
        if (f5 == f2) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f2);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new C0133b(6, this));
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemperatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        Paint paint = new Paint();
        this.f19271a = paint;
        Paint paint2 = new Paint();
        this.f19272b = paint2;
        Paint paint3 = new Paint();
        this.f19273c = paint3;
        Paint paint4 = new Paint();
        this.f19274d = paint4;
        Paint paint5 = new Paint();
        this.f19275e = paint5;
        Paint paint6 = new Paint();
        this.f19276f = paint6;
        Paint paint7 = new Paint();
        this.f19277g = paint7;
        this.f19282m = new RectF();
        paint.setColor(-3355444);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint3.setColor(getContext().getColor(R.color.text_color));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint3.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(3.0f);
        paint4.setColor(-16776961);
        paint4.setAntiAlias(true);
        paint4.setTypeface(typeface);
        paint4.setTextAlign(align);
        paint5.setTypeface(typeface);
        paint5.setTextAlign(align);
        paint5.setAntiAlias(true);
        paint6.setTextAlign(align);
        paint6.setColor(getContext().getColor(R.color.text_color));
        paint7.setStyle(style);
        paint7.setAntiAlias(true);
        paint7.setXfermode(new PorterDuffXfermode(mode));
        paint7.setStrokeCap(cap);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(3.0f);
    }
}
