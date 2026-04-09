package W4;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import com.apm.insight.R;
import com.lefan.signal.ui.sensor.SensorDetailActivity;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class b extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Paint f4048C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f4049D;

    /* renamed from: E, reason: collision with root package name */
    public final Paint f4050E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint f4051F;

    /* renamed from: G, reason: collision with root package name */
    public final Paint f4052G;

    /* renamed from: H, reason: collision with root package name */
    public final Paint f4053H;

    /* renamed from: I, reason: collision with root package name */
    public final Paint f4054I;

    /* renamed from: J, reason: collision with root package name */
    public final Paint f4055J;

    /* renamed from: K, reason: collision with root package name */
    public final Path f4056K;

    /* renamed from: L, reason: collision with root package name */
    public final Path f4057L;
    public float M;

    /* renamed from: a, reason: collision with root package name */
    public float f4058a;

    /* renamed from: b, reason: collision with root package name */
    public float f4059b;

    /* renamed from: c, reason: collision with root package name */
    public float f4060c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4061d;

    /* renamed from: e, reason: collision with root package name */
    public float f4062e;

    /* renamed from: f, reason: collision with root package name */
    public float f4063f;

    /* renamed from: g, reason: collision with root package name */
    public float f4064g;

    /* renamed from: h, reason: collision with root package name */
    public float f4065h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4066j;

    /* renamed from: k, reason: collision with root package name */
    public float f4067k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f4068l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f4069m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f4070n;

    public b(SensorDetailActivity sensorDetailActivity) {
        super(sensorDetailActivity);
        this.f4059b = 100.0f;
        Paint paint = new Paint();
        this.f4068l = paint;
        Paint paint2 = new Paint();
        this.f4069m = paint2;
        Paint paint3 = new Paint();
        this.f4070n = paint3;
        Paint paint4 = new Paint();
        this.f4048C = paint4;
        Paint paint5 = new Paint();
        this.f4049D = paint5;
        Paint paint6 = new Paint();
        this.f4050E = paint6;
        Paint paint7 = new Paint();
        this.f4051F = paint7;
        Paint paint8 = new Paint();
        this.f4052G = paint8;
        Paint paint9 = new Paint();
        this.f4053H = paint9;
        Paint paint10 = new Paint();
        this.f4054I = paint10;
        Paint paint11 = new Paint();
        this.f4055J = paint11;
        paint.setColor(getContext().getColor(R.color.view_bg2));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        paint.setShadowLayer(20.0f, 0.0f, 0.0f, getContext().getColor(R.color.text_color));
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        paint3.setColor(-7829368);
        paint3.setAntiAlias(true);
        paint3.setStrokeWidth(2.0f);
        paint4.setStyle(style);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint4.setTypeface(typeface);
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        paint5.setStyle(style);
        paint5.setTypeface(typeface);
        paint5.setColor(getContext().getColor(R.color.text_color));
        paint5.setTextAlign(align);
        paint6.setColor(-65536);
        paint6.setStyle(style2);
        paint6.setAntiAlias(true);
        paint7.setStyle(style);
        paint7.setTypeface(typeface);
        paint7.setColor(-12303292);
        paint7.setTextSize(30.0f);
        paint7.setTextAlign(align);
        paint8.setColor(-65536);
        paint8.setStyle(style2);
        paint8.setAntiAlias(true);
        paint9.setAntiAlias(true);
        paint9.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint9.setStrokeCap(cap);
        paint10.setAntiAlias(true);
        paint10.setColor(-7829368);
        paint10.setStyle(style2);
        paint10.setStrokeCap(cap);
        paint11.setAntiAlias(true);
        paint11.setStyle(style);
        paint11.setTypeface(Typeface.DEFAULT);
        paint11.setColor(getContext().getColor(R.color.text_color));
        this.f4056K = new Path();
        this.f4057L = new Path();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.f4061d) {
            this.f4061d = false;
        } else {
            this.f4061d = true;
            this.f4060c = this.f4058a;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Resources.NotFoundException {
        String str;
        Canvas canvas2;
        String str2;
        int iX;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        float f2 = (float) (this.f4066j * 0.04d);
        float f5 = this.f4062e;
        float f6 = this.i;
        float f7 = this.f4063f;
        RectF rectF = new RectF((f5 - f6) - f2, (f7 - f6) - f2, f5 + f6 + f2, f7 + f6 + f2);
        canvas.drawArc(rectF, 60.0f, -120.0f, false, this.f4054I);
        Path path = this.f4056K;
        path.reset();
        String string = getResources().getString(R.string.string_magnetic);
        i.d(string, "getString(...)");
        Rect rect = new Rect();
        int length = string.length();
        Paint paint = this.f4055J;
        paint.getTextBounds(string, 0, length, rect);
        double d6 = 2 * this.i * 3.14d;
        double d7 = 360;
        double dWidth = (rect.width() / d6) * d7;
        path.addArc(rectF, (float) (60 + dWidth), -((float) dWidth));
        float f8 = 2;
        canvas.drawTextOnPath(string, path, -10.0f, paint.getTextSize() / f8, paint);
        Path path2 = new Path();
        Float fValueOf = Float.valueOf(this.f4059b);
        if (R2.a.f3390d) {
            Locale locale = F4.e.f1457a;
            str = String.format(F4.e.b(), "%.0fμT", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.0fμT", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        String str3 = str;
        paint.getTextBounds(str3, 0, str3.length(), new Rect());
        float fWidth = (float) ((r1.width() / d6) * d7);
        path2.addArc(rectF, -(60 + fWidth), fWidth);
        canvas.drawTextOnPath(str3, path2, -10.0f, paint.getTextSize() / f8, paint);
        canvas.rotate(150.0f, this.f4062e, this.f4063f);
        SweepGradient sweepGradient = new SweepGradient(this.f4062e, this.f4063f, new int[]{-65536, -65536, -65536, -256, -16711936, -16711936}, (float[]) null);
        Paint paint2 = this.f4053H;
        paint2.setShader(sweepGradient);
        float f9 = this.f4059b;
        if (f9 > 120.0f) {
            f9 = 120.0f;
        }
        canvas.drawArc(rectF, -90.0f, -f9, false, paint2);
        canvas.restore();
        float f10 = this.f4062e;
        float f11 = 100;
        canvas.drawLine(f10, this.f4063f - ((this.i * 65) / f11), f10, this.f4067k - this.f4065h, this.f4052G);
        if (this.f4061d) {
            float f12 = this.f4062e;
            float f13 = this.i;
            float f14 = this.f4063f;
            RectF rectF2 = new RectF(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (Math.abs(this.f4060c - this.f4058a) > 180.0f) {
                iX = R3.b.x(360.0f - Math.abs(this.f4060c - this.f4058a));
                if (this.f4060c > 180.0f) {
                    iX = -iX;
                }
            } else {
                iX = R3.b.x(this.f4060c - this.f4058a);
            }
            int i = iX;
            canvas2 = canvas;
            canvas2.drawArc(rectF2, 270.0f, i, false, this.f4050E);
            canvas2.drawText(i + "°", this.f4062e, (this.f4067k - this.f4065h) - 5, this.f4051F);
        } else {
            canvas2 = canvas;
        }
        canvas2.rotate(-this.f4058a, this.f4062e, this.f4063f);
        float f15 = this.f4062e;
        float f16 = this.i;
        float f17 = this.f4063f;
        canvas2.drawArc(new RectF(f15 - f16, f17 - f16, f15 + f16, f17 + f16), -85.0f, 350.0f, false, this.f4068l);
        Path path3 = this.f4057L;
        path3.reset();
        path3.moveTo(this.f4062e, this.f4067k - this.f4064g);
        path3.lineTo((this.f4064g / f8) + this.f4062e, this.f4067k);
        path3.lineTo(this.f4062e - (this.f4064g / f8), this.f4067k);
        path3.close();
        canvas2.drawPath(path3, this.f4069m);
        float f18 = this.f4063f - ((this.i * 70) / f11);
        for (int i3 = 0; i3 < 241; i3++) {
            int i6 = i3 % 20;
            Paint paint3 = this.f4070n;
            if (i6 == 0) {
                float f19 = this.f4062e;
                canvas2.drawLine(f19, f18 - 20, f19, f18, paint3);
                Paint paint4 = this.f4048C;
                if (i3 == 240) {
                    paint4.setColor(-65536);
                    canvas2.drawText(getResources().getString(R.string.north), this.f4062e, paint4.getTextSize() + f18 + 10, paint4);
                    return;
                }
                if (i3 == 180) {
                    paint4.setColor(getContext().getColor(R.color.text_color));
                    canvas2.drawText(getResources().getString(R.string.west), this.f4062e, paint4.getTextSize() + f18 + 10, paint4);
                }
                if (i3 == 120) {
                    paint4.setColor(-16776961);
                    canvas2.drawText(getResources().getString(R.string.south), this.f4062e, paint4.getTextSize() + f18 + 10, paint4);
                }
                if (i3 == 60) {
                    paint4.setColor(getContext().getColor(R.color.text_color));
                    canvas2.drawText(getResources().getString(R.string.east), this.f4062e, paint4.getTextSize() + f18 + 10, paint4);
                }
                Double dValueOf = Double.valueOf(i3 * 1.5d);
                if (R2.a.f3390d) {
                    Locale locale2 = F4.e.f1457a;
                    str2 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{dValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{dValueOf}, 1));
                }
                canvas2.drawText(str2, this.f4062e, f18 - ((f18 - this.f4067k) / f8), this.f4049D);
            } else if (i3 % 10 == 0) {
                float f20 = this.f4062e;
                canvas2.drawLine(f20, this.f4067k, f20, f18, paint3);
                canvas2 = canvas;
            } else {
                float f21 = this.f4062e;
                canvas2 = canvas;
                canvas2.drawLine(f21, f18 - 10, f21, f18, paint3);
            }
            canvas2.rotate(1.5f, this.f4062e, this.f4063f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        this.f4066j = size;
        float f2 = (float) (size * 0.4d);
        this.i = f2;
        float f5 = (float) (size * 0.05d);
        this.f4064g = f5;
        float f6 = (float) (f5 * 0.87d);
        this.f4065h = f6;
        float f7 = f6 + f2 + 50;
        this.f4063f = f7;
        float f8 = 2;
        this.f4062e = size / f8;
        this.f4067k = f7 - f2;
        this.f4068l.setStrokeWidth((float) (size * 0.004d));
        this.f4050E.setStrokeWidth((float) (this.f4066j * 0.015d));
        this.f4052G.setStrokeWidth((float) (this.f4066j * 0.005d));
        this.f4048C.setTextSize((float) (this.f4066j * 0.04d));
        this.f4049D.setTextSize((float) (this.f4066j * 0.03d));
        this.f4053H.setStrokeWidth((float) (this.f4066j * 0.018d));
        this.f4054I.setStrokeWidth((float) (this.f4066j * 0.018d));
        this.f4055J.setTextSize((float) (this.f4066j * 0.025d));
        setMeasuredDimension((int) this.f4066j, (int) (this.f4063f * f8));
    }
}
