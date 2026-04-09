package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.l;

/* compiled from: NormalIndicator.kt */
/* loaded from: classes.dex */
public final class g extends AbstractC5321b<g> {

    /* renamed from: g, reason: collision with root package name */
    public final Path f44072g;

    /* renamed from: h, reason: collision with root package name */
    public float f44073h;

    public g(Context context) {
        super(context);
        this.f44072g = new Path();
        i(12.0f * this.f44061b);
    }

    @Override // m3.AbstractC5321b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f44072g, this.f44060a);
    }

    @Override // m3.AbstractC5321b
    public final float b() {
        return this.f44073h;
    }

    @Override // m3.AbstractC5321b
    public final void j() {
        Path path = this.f44072g;
        path.reset();
        float fC = c();
        l.c(this.f44062c);
        path.moveTo(fC, r2.getPadding());
        float f10 = (f() * 2.0f) / 3.0f;
        l.c(this.f44062c);
        this.f44073h = f10 + r2.getPadding();
        path.lineTo(c() - this.f44063d, this.f44073h);
        path.lineTo(c() + this.f44063d, this.f44073h);
        float fC2 = c();
        float f11 = this.f44063d;
        float f12 = fC2 - f11;
        float f13 = this.f44073h - f11;
        float fC3 = c();
        float f14 = this.f44063d;
        path.addArc(new RectF(f12, f13, fC3 + f14, this.f44073h + f14), 0.0f, 180.0f);
        this.f44060a.setColor(this.f44064e);
    }
}
