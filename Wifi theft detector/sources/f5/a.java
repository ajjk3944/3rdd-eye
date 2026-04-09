package f5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f21131i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f21132j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f21133k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f21134l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f21135a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f21136b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f21137c;

    /* renamed from: d, reason: collision with root package name */
    public int f21138d;

    /* renamed from: e, reason: collision with root package name */
    public int f21139e;

    /* renamed from: f, reason: collision with root package name */
    public int f21140f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f21141g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f21142h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f21141g;
        if (z10) {
            int[] iArr = f21133k;
            iArr[0] = 0;
            iArr[1] = this.f21140f;
            iArr[2] = this.f21139e;
            iArr[3] = this.f21138d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f21133k;
            iArr2[0] = 0;
            iArr2[1] = this.f21138d;
            iArr2[2] = this.f21139e;
            iArr2[3] = this.f21140f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f21134l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f21136b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f21133k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f21142h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f21136b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f21131i;
        iArr[0] = this.f21140f;
        iArr[1] = this.f21139e;
        iArr[2] = this.f21138d;
        Paint paint = this.f21137c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f21132j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f21137c);
        canvas.restore();
    }

    public Paint c() {
        return this.f21135a;
    }

    public void d(int i10) {
        this.f21138d = j0.a.k(i10, 68);
        this.f21139e = j0.a.k(i10, 20);
        this.f21140f = j0.a.k(i10, 0);
        this.f21135a.setColor(this.f21138d);
    }

    public a(int i10) {
        this.f21141g = new Path();
        Paint paint = new Paint();
        this.f21142h = paint;
        this.f21135a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f21136b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f21137c = new Paint(paint2);
    }
}
