package W4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.apm.insight.R;
import com.lefan.signal.ui.sensor.SensorDetailActivity;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f4036a;

    /* renamed from: b, reason: collision with root package name */
    public float f4037b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4038c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4039d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f4040e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4041f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f4042g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f4043h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4044j;

    /* renamed from: k, reason: collision with root package name */
    public float f4045k;

    /* renamed from: l, reason: collision with root package name */
    public float f4046l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4047m;

    public a(SensorDetailActivity sensorDetailActivity) {
        super(sensorDetailActivity);
        this.f4036a = BitmapFactory.decodeResource(getResources(), R.drawable.bright);
        Paint paint = new Paint();
        this.f4038c = paint;
        Paint paint2 = new Paint();
        this.f4039d = paint2;
        Paint paint3 = new Paint();
        this.f4040e = paint3;
        Paint paint4 = new Paint();
        this.f4041f = paint4;
        Paint paint5 = new Paint();
        this.f4042g = paint5;
        Paint paint6 = new Paint();
        this.f4043h = paint6;
        this.f4047m = 40000;
        paint.setColor(-7829368);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setColor(getContext().getColor(R.color.text_color));
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint2.setTypeface(typeface);
        paint6.setAntiAlias(true);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(8.0f);
        paint3.setColor(-65281);
        paint4.setAntiAlias(true);
        paint4.setColor(Color.parseColor("#99115FEA"));
        paint4.setStyle(style);
        paint5.setColor(getContext().getColor(R.color.text_color));
        paint5.setTextAlign(align);
        paint5.setTypeface(typeface);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        float f2 = this.f4044j;
        canvas.rotate(180.0f, f2, f2);
        float f5 = this.f4044j - this.f4045k;
        for (int i = 0; i < 101; i++) {
            int i3 = i % 10;
            Paint paint = this.f4038c;
            if (i3 == 0) {
                float f6 = this.f4044j;
                canvas.drawLine(f6, (this.i * 5) + f5, f6, f5, paint);
                Integer numValueOf = Integer.valueOf(i * 400);
                if (R2.a.f3390d) {
                    Locale locale = F4.e.f1457a;
                    str2 = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                canvas.drawText(str2, this.f4044j, (this.i * 7) + f5, this.f4039d);
            } else {
                float f7 = this.f4044j;
                canvas.drawLine(f7, (this.i * 4) + f5, f7, f5, paint);
            }
            float f8 = this.f4044j;
            canvas.rotate(2.7f, f8, f8);
        }
        canvas.restore();
        float f9 = this.f4037b;
        float f10 = this.f4047m;
        float f11 = f9 / f10;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        int iArgb = Color.argb(Math.round((Color.alpha(-1) - r5) * f11) + Color.alpha(-16777216), Math.round((Color.red(-1) - r5) * f11) + Color.red(-16777216), Math.round((Color.green(-1) - r5) * f11) + Color.green(-16777216), Math.round(f11 * (Color.blue(-1) - r4)) + Color.blue(-16777216));
        Paint paint2 = this.f4043h;
        paint2.setColor(iArgb);
        float f12 = this.f4044j;
        canvas.drawCircle(f12, f12, this.f4046l, paint2);
        float f13 = this.f4044j;
        canvas.drawBitmap(this.f4036a, f13 - (r4.getWidth() / 2), this.f4044j - (r4.getHeight() / 2), (Paint) null);
        canvas.save();
        float f14 = this.f4037b;
        float f15 = f14 > f10 ? 90.0f : ((f14 / f10) * 270.0f) - 180.0f;
        float f16 = this.f4044j;
        canvas.rotate(f15, f16, f16);
        float f17 = this.f4044j;
        float f18 = f17 - this.f4045k;
        canvas.drawLine(f17, (this.i * 5) + f18, f17, f18, this.f4040e);
        canvas.restore();
        float f19 = this.f4044j;
        float f20 = this.f4045k;
        float f21 = 2;
        float f22 = this.i * f21;
        float f23 = (f19 - f20) + f22;
        float f24 = (f19 + f20) - f22;
        RectF rectF = new RectF(f23, f23, f24, f24);
        float f25 = this.f4037b;
        canvas.drawArc(rectF, 90.0f, f25 <= f10 ? 270.0f * (f25 / f10) : 270.0f, false, this.f4041f);
        Float fValueOf = Float.valueOf(this.f4037b);
        if (R2.a.f3390d) {
            Locale locale2 = F4.e.f1457a;
            str = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        float f26 = this.f4044j;
        float f27 = this.f4045k + f26;
        float f28 = this.i;
        float f29 = f27 - (f28 * f21);
        float f30 = (f28 * 4) + f26;
        Paint paint3 = this.f4042g;
        canvas.drawText(str, f29, f30, paint3);
        float f31 = this.f4044j;
        float f32 = this.f4045k + f31;
        float f33 = this.i;
        canvas.drawText("lx", f32 - (f21 * f33), (f33 * 7) + f31, paint3);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        this.f4044j = size / 2;
        double d6 = size;
        double d7 = 5;
        this.f4045k = (float) ((2.3d * d6) / d7);
        float f2 = size / 45;
        this.i = f2;
        this.f4039d.setTextSize(f2 * 1.2f);
        this.f4042g.setTextSize(this.i * 2.0f);
        this.f4046l = (float) ((d6 * 1.4d) / d7);
        this.f4041f.setStrokeWidth(this.i * 4);
        setMeasuredDimension(i, i);
    }

    public final void setBright(float f2) {
        if (Math.abs(this.f4037b - f2) < 5.0f) {
            return;
        }
        this.f4037b = f2;
        invalidate();
    }
}
