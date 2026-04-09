package W4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.view.View;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.lefan.signal.ui.sensor.SensorDetailActivity;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Path f4086C;

    /* renamed from: a, reason: collision with root package name */
    public float f4087a;

    /* renamed from: b, reason: collision with root package name */
    public float f4088b;

    /* renamed from: c, reason: collision with root package name */
    public float f4089c;

    /* renamed from: d, reason: collision with root package name */
    public float f4090d;

    /* renamed from: e, reason: collision with root package name */
    public float f4091e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4092f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f4093g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f4094h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f4095j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f4096k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f4097l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f4098m;

    /* renamed from: n, reason: collision with root package name */
    public RectF f4099n;

    public d(SensorDetailActivity sensorDetailActivity) {
        super(sensorDetailActivity);
        Paint paint = new Paint();
        this.f4092f = paint;
        Paint paint2 = new Paint();
        this.f4093g = paint2;
        Paint paint3 = new Paint();
        this.f4094h = paint3;
        Paint paint4 = new Paint();
        this.i = paint4;
        Paint paint5 = new Paint();
        this.f4095j = paint5;
        Paint paint6 = new Paint();
        this.f4096k = paint6;
        Paint paint7 = new Paint();
        this.f4097l = paint7;
        this.f4098m = new int[]{-16711936, -256, -65536};
        paint.setColor(getContext().getColor(R.color.white));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint4.setColor(-16711936);
        paint4.setAntiAlias(true);
        paint3.setColor(-7829368);
        paint5.setAntiAlias(true);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint5.setTypeface(typeface);
        paint6.setTypeface(typeface);
        int color = getContext().getColor(R.color.text_color);
        paint5.setColor(color);
        paint6.setColor(color);
        paint7.setColor(color);
        this.f4086C = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(90.0f, this.f4088b, this.f4089c);
        RectF rectF = this.f4099n;
        i.b(rectF);
        canvas.drawArc(rectF, 50.0f, 260.0f, false, this.f4093g);
        canvas.restore();
        canvas.save();
        canvas.rotate(-130.0f, this.f4088b, this.f4089c);
        for (int i = 0; i < 31; i++) {
            int i3 = i % 5;
            Paint paint = this.f4094h;
            if (i3 == 0) {
                float f2 = this.f4088b;
                float f5 = this.f4089c - this.f4090d;
                float f6 = this.f4091e;
                canvas.drawLine(f2, (2 * f6) + f5, f2, (f6 * 7) + f5, paint);
                Float fValueOf = Float.valueOf(i / 10.0f);
                if (R2.a.f3390d) {
                    Locale locale = F4.e.f1457a;
                    str2 = String.format(F4.e.b(), "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                }
                float f7 = this.f4088b;
                Rect rect = new Rect();
                int length = str2.length();
                Paint paint2 = this.f4095j;
                paint2.getTextBounds(str2, 0, length, rect);
                canvas.drawText(str2, f7 - (rect.width() / 2), (this.f4091e * 13) + (this.f4089c - this.f4090d), paint2);
            } else {
                float f8 = this.f4088b;
                float f9 = this.f4089c - this.f4090d;
                float f10 = this.f4091e;
                canvas.drawLine(f8, (2 * f10) + f9, f8, (f10 * 4) + f9, paint);
            }
            canvas.rotate(8.666667f, this.f4088b, this.f4089c);
        }
        canvas.restore();
        float f11 = this.f4087a;
        float f12 = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        float f13 = ((f11 / f12) * 260) / 3;
        float f14 = f13 > 260.0f ? 130.0f : f13 - 130;
        canvas.save();
        canvas.rotate(f14, this.f4088b, this.f4089c);
        Path path = this.f4086C;
        path.reset();
        path.moveTo(this.f4088b, (this.f4091e * 10) + (this.f4089c - this.f4090d));
        float f15 = 2;
        path.lineTo(this.f4088b - (this.f4091e * f15), this.f4089c);
        path.lineTo(this.f4088b, (this.f4091e * 4) + this.f4089c);
        path.lineTo((this.f4091e * f15) + this.f4088b, this.f4089c);
        canvas.drawPath(path, this.i);
        canvas.restore();
        canvas.drawCircle(this.f4088b, this.f4089c, this.f4091e, this.f4092f);
        Float fValueOf2 = Float.valueOf(this.f4087a / f12);
        if (R2.a.f3390d) {
            Locale locale2 = F4.e.f1457a;
            str = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
        }
        float f16 = this.f4088b;
        Rect rect2 = new Rect();
        int length2 = str.length();
        Paint paint3 = this.f4096k;
        paint3.getTextBounds(str, 0, length2, rect2);
        float f17 = 30;
        canvas.drawText(str, f16 - (rect2.width() / 2), (this.f4091e * f17) + this.f4089c, paint3);
        float f18 = this.f4088b;
        Rect rect3 = new Rect();
        Paint paint4 = this.f4097l;
        paint4.getTextBounds("kPa", 0, 3, rect3);
        canvas.drawText("kPa", f18 - (rect3.width() / 2), (this.f4091e * f17) + (this.f4089c - this.f4090d), paint4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        float f2 = 2;
        this.f4088b = size / f2;
        float f5 = 10;
        float f6 = (4 * size) / f5;
        this.f4090d = f6;
        this.f4089c = (f6 * 2.1f) / f2;
        Paint paint = this.f4093g;
        paint.setStrokeWidth(size / 40);
        float f7 = size / 120;
        this.f4091e = f7;
        float f8 = 3;
        this.f4094h.setStrokeWidth(f7 / f8);
        float f9 = this.f4088b;
        float f10 = this.f4090d;
        float f11 = this.f4089c;
        this.f4099n = new RectF(f9 - f10, f11 - f10, f9 + f10, f11 + f10);
        paint.setShader(new SweepGradient(this.f4089c, this.f4090d, this.f4098m, (float[]) null));
        float f12 = this.f4088b;
        float f13 = this.f4089c;
        float f14 = f13 - this.f4090d;
        float f15 = this.f4091e;
        this.i.setShader(new LinearGradient(f12, (f5 * f15) + f14, f12, (f15 * f8) + f13, this.f4098m, (float[]) null, Shader.TileMode.CLAMP));
        this.f4095j.setTextSize(this.f4091e * 6);
        this.f4096k.setTextSize(this.f4091e * 8);
        this.f4097l.setTextSize(this.f4091e * 5);
        setMeasuredDimension(i, (int) (this.f4090d * 1.8d));
    }

    public final void setPressure(float f2) {
        if (f2 == this.f4087a) {
            return;
        }
        this.f4087a = f2;
        invalidate();
    }
}
