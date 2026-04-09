package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.l;

/* compiled from: LineIndicator.kt */
/* renamed from: m3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5323d extends AbstractC5321b<C5323d> {

    /* renamed from: g, reason: collision with root package name */
    public final float f44067g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f44068h;

    public C5323d(Context context, float f10) {
        super(context);
        this.f44067g = f10;
        this.f44068h = new Path();
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException("Length must be between [0,1].");
        }
        i(8.0f * this.f44061b);
    }

    @Override // m3.AbstractC5321b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f44068h, this.f44060a);
    }

    @Override // m3.AbstractC5321b
    public final float b() {
        return d() * this.f44067g;
    }

    @Override // m3.AbstractC5321b
    public final void j() {
        Path path = this.f44068h;
        path.reset();
        float fC = c();
        l.c(this.f44062c);
        path.moveTo(fC, r2.getPadding());
        path.lineTo(c(), d() * this.f44067g);
        Paint paint = this.f44060a;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f44063d);
        paint.setColor(this.f44064e);
    }
}
