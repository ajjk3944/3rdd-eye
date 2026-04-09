package W4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import com.apm.insight.R;
import com.lefan.signal.ui.sensor.SensorDetailActivity;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class c extends View {

    /* renamed from: C, reason: collision with root package name */
    public final int[] f4071C;

    /* renamed from: D, reason: collision with root package name */
    public final Path f4072D;

    /* renamed from: a, reason: collision with root package name */
    public float f4073a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4074b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4075c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f4076d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f4077e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4078f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f4079g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f4080h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public float f4081j;

    /* renamed from: k, reason: collision with root package name */
    public float f4082k;

    /* renamed from: l, reason: collision with root package name */
    public float f4083l;

    /* renamed from: m, reason: collision with root package name */
    public float f4084m;

    /* renamed from: n, reason: collision with root package name */
    public float f4085n;

    public c(SensorDetailActivity sensorDetailActivity) {
        super(sensorDetailActivity);
        Paint paint = new Paint();
        this.f4074b = paint;
        Paint paint2 = new Paint();
        this.f4075c = paint2;
        Paint paint3 = new Paint();
        this.f4076d = paint3;
        Paint paint4 = new Paint();
        this.f4077e = paint4;
        Paint paint5 = new Paint();
        this.f4078f = paint5;
        Paint paint6 = new Paint();
        this.f4079g = paint6;
        Paint paint7 = new Paint();
        this.f4080h = paint7;
        this.i = new RectF();
        this.f4071C = new int[]{-16711936, -256, -65536};
        paint6.setColor(getContext().getColor(R.color.white));
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
        paint5.setStyle(style);
        paint5.setAntiAlias(true);
        paint5.setXfermode(new PorterDuffXfermode(mode));
        paint5.setStrokeCap(cap);
        paint5.setColor(Color.parseColor("#FD7347"));
        paint7.setColor(-16711936);
        paint7.setAntiAlias(true);
        paint4.setColor(getContext().getColor(R.color.text_color));
        paint4.setAntiAlias(true);
        paint4.setTypeface(typeface);
        paint4.setTextAlign(align);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(3.0f);
        this.f4072D = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.f4074b;
        RectF rectF = this.i;
        canvas.drawArc(rectF, 140.0f, 260.0f, false, paint);
        canvas.save();
        canvas.rotate(-130.0f, this.f4081j, this.f4082k);
        for (int i = 0; i < 101; i++) {
            int i3 = i % 10;
            Paint paint2 = this.f4075c;
            if (i3 == 0) {
                float f2 = this.f4081j;
                float f5 = this.f4085n;
                canvas.drawLine(f2, f5, f2, f5 - (this.f4084m * 4), paint2);
                Integer numValueOf = Integer.valueOf(i);
                if (R2.a.f3390d) {
                    Locale locale = F4.e.f1457a;
                    str2 = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                canvas.drawText(str2, this.f4081j, this.f4085n - (this.f4084m * 6), this.f4076d);
            } else {
                float f6 = this.f4081j;
                float f7 = this.f4085n;
                canvas.drawLine(f6, f7, f6, f7 - (this.f4084m * 2), paint2);
            }
            canvas.rotate(2.6f, this.f4081j, this.f4082k);
        }
        canvas.restore();
        float f8 = 100;
        float f9 = ((this.f4073a / f8) * 260.0f) - 130.0f;
        canvas.save();
        canvas.rotate(f9, this.f4081j, this.f4082k);
        Path path = this.f4072D;
        path.reset();
        path.moveTo(this.f4081j, (this.f4084m * 10) + (this.f4082k - this.f4083l));
        float f10 = 2;
        path.lineTo(this.f4081j - (this.f4084m * f10), this.f4082k);
        path.lineTo(this.f4081j, (this.f4084m * 4) + this.f4082k);
        path.lineTo((this.f4084m * f10) + this.f4081j, this.f4082k);
        canvas.drawPath(path, this.f4080h);
        canvas.restore();
        canvas.drawCircle(this.f4081j, this.f4082k, this.f4084m, this.f4079g);
        canvas.drawArc(rectF, 140.0f, (this.f4073a / f8) * 260.0f, false, this.f4078f);
        Float fValueOf = Float.valueOf(this.f4073a);
        if (R2.a.f3390d) {
            Locale locale2 = F4.e.f1457a;
            str = String.format(F4.e.b(), "%.1f%%", Arrays.copyOf(new Object[]{fValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%.1f%%", Arrays.copyOf(new Object[]{fValueOf}, 1));
        }
        canvas.drawText(str, this.f4081j, (this.f4084m * 30) + this.f4082k, this.f4077e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        float size = View.MeasureSpec.getSize(i);
        this.f4083l = (7 * size) / 20;
        float f2 = size / 2;
        this.f4081j = f2;
        this.f4082k = f2;
        float f5 = size / 30;
        Paint paint = this.f4074b;
        paint.setStrokeWidth(f5);
        this.f4078f.setStrokeWidth(f5);
        float f6 = size / 120;
        this.f4084m = f6;
        this.f4076d.setTextSize(f6 * 5);
        this.f4077e.setTextSize(this.f4084m * 8);
        float f7 = this.f4081j;
        float f8 = this.f4083l;
        float f9 = this.f4082k;
        this.i.set(f7 - f8, f9 - f8, f7 + f8, f9 + f8);
        this.f4085n = (this.f4082k - this.f4083l) - paint.getStrokeWidth();
        float f10 = this.f4081j;
        float f11 = this.f4082k;
        float f12 = f11 - this.f4083l;
        float f13 = this.f4084m;
        this.f4080h.setShader(new LinearGradient(f10, f12 + (10 * f13), f10, (f13 * 3) + f11, this.f4071C, (float[]) null, Shader.TileMode.CLAMP));
        setMeasuredDimension(i, (i * 88) / 100);
    }

    public final void setHumidity(float f2) {
        if (this.f4073a == f2) {
            return;
        }
        this.f4073a = f2;
        invalidate();
    }
}
