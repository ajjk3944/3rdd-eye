package m3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.l;

/* compiled from: TriangleIndicator.kt */
/* loaded from: classes.dex */
public final class i extends AbstractC5321b<i> {

    /* renamed from: g, reason: collision with root package name */
    public Path f44075g;

    /* renamed from: h, reason: collision with root package name */
    public float f44076h;

    @Override // m3.AbstractC5321b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f44075g, this.f44060a);
    }

    @Override // m3.AbstractC5321b
    public final float b() {
        return this.f44076h + this.f44063d;
    }

    @Override // m3.AbstractC5321b
    public final float e() {
        return this.f44076h;
    }

    @Override // m3.AbstractC5321b
    public final void j() {
        this.f44075g = new Path();
        k3.e eVar = this.f44062c;
        l.c(eVar);
        float padding = eVar.getPadding();
        k3.e eVar2 = this.f44062c;
        l.c(eVar2);
        this.f44076h = (5.0f * this.f44061b) + eVar2.getSpeedometerWidth() + padding;
        this.f44075g.moveTo(c(), this.f44076h);
        Path path = this.f44075g;
        float fC = c();
        float f10 = this.f44063d;
        path.lineTo(fC - f10, this.f44076h + f10);
        Path path2 = this.f44075g;
        float fC2 = c();
        float f11 = this.f44063d;
        path2.lineTo(fC2 + f11, this.f44076h + f11);
        this.f44075g.moveTo(0.0f, 0.0f);
        this.f44060a.setShader(new LinearGradient(c(), this.f44076h, c(), this.f44076h + this.f44063d, this.f44064e, Color.argb(0, Color.red(this.f44064e), Color.green(this.f44064e), Color.blue(this.f44064e)), Shader.TileMode.CLAMP));
    }
}
