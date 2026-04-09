package e4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import w1.AbstractC8253a;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5420a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f46174i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f46175j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f46176k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f46177l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f46178a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f46179b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f46180c;

    /* renamed from: d, reason: collision with root package name */
    private int f46181d;

    /* renamed from: e, reason: collision with root package name */
    private int f46182e;

    /* renamed from: f, reason: collision with root package name */
    private int f46183f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f46184g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f46185h;

    public C5420a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f46184g;
        if (z10) {
            int[] iArr = f46176k;
            iArr[0] = 0;
            iArr[1] = this.f46183f;
            iArr[2] = this.f46182e;
            iArr[3] = this.f46181d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f46176k;
            iArr2[0] = 0;
            iArr2[1] = this.f46181d;
            iArr2[2] = this.f46182e;
            iArr2[3] = this.f46183f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = f46177l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f46179b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f46176k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f46185h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f46179b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f46174i;
        iArr[0] = this.f46183f;
        iArr[1] = this.f46182e;
        iArr[2] = this.f46181d;
        Paint paint = this.f46180c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f46175j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f46180c);
        canvas.restore();
    }

    public Paint c() {
        return this.f46178a;
    }

    public void d(int i10) {
        this.f46181d = AbstractC8253a.k(i10, 68);
        this.f46182e = AbstractC8253a.k(i10, 20);
        this.f46183f = AbstractC8253a.k(i10, 0);
        this.f46178a.setColor(this.f46181d);
    }

    public C5420a(int i10) {
        this.f46184g = new Path();
        Paint paint = new Paint();
        this.f46185h = paint;
        this.f46178a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f46179b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f46180c = new Paint(paint2);
    }
}
