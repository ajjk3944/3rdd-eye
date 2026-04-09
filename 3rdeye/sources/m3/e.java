package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.l;

/* compiled from: NeedleIndicator.kt */
/* loaded from: classes.dex */
public final class e extends AbstractC5321b<e> {

    /* renamed from: g, reason: collision with root package name */
    public final Path f44069g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f44070h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public float f44071j;

    public e(Context context) {
        super(context);
        this.f44069g = new Path();
        this.f44070h = new Path();
        Paint paint = new Paint(1);
        this.i = paint;
        i(12.0f * this.f44061b);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // m3.AbstractC5321b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f44069g, this.f44060a);
        canvas.drawPath(this.f44070h, this.i);
    }

    @Override // m3.AbstractC5321b
    public final float b() {
        return this.f44071j;
    }

    @Override // m3.AbstractC5321b
    public final void j() {
        Path path = this.f44069g;
        path.reset();
        Path path2 = this.f44070h;
        path2.reset();
        float fC = c();
        l.c(this.f44062c);
        path.moveTo(fC, r3.getPadding());
        float f10 = (f() * 0.5f) + ((float) (Math.sin(Math.toRadians(260.0d)) * this.f44063d));
        l.c(this.f44062c);
        this.f44071j = f10 + r2.getPadding();
        float f11 = (f() * 0.5f) + ((float) (Math.cos(Math.toRadians(260.0d)) * this.f44063d));
        l.c(this.f44062c);
        path.lineTo(f11 + r2.getPadding(), this.f44071j);
        path.arcTo(new RectF(c() - this.f44063d, d() - this.f44063d, c() + this.f44063d, d() + this.f44063d), 260.0f, 20.0f);
        float f12 = this.f44063d * 0.25f;
        path2.addCircle(c(), d(), (this.f44063d - (0.5f * f12)) + 0.6f, Path.Direction.CW);
        this.f44060a.setColor(this.f44064e);
        int i = this.f44064e;
        Paint paint = this.i;
        paint.setColor(i);
        paint.setStrokeWidth(f12);
    }
}
