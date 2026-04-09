package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.l;

/* compiled from: SpindleIndicator.kt */
/* loaded from: classes.dex */
public final class h extends AbstractC5321b<h> {

    /* renamed from: g, reason: collision with root package name */
    public final Path f44074g;

    public h(Context context) {
        super(context);
        this.f44074g = new Path();
        i(16.0f * this.f44061b);
    }

    @Override // m3.AbstractC5321b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f44074g, this.f44060a);
    }

    @Override // m3.AbstractC5321b
    public final float e() {
        float f10 = f() * 0.18f;
        l.c(this.f44062c);
        return f10 + r1.getPadding();
    }

    @Override // m3.AbstractC5321b
    public final void j() {
        Path path = this.f44074g;
        path.reset();
        path.moveTo(c(), d());
        float fC = c() - this.f44063d;
        float f10 = f() * 0.34f;
        l.c(this.f44062c);
        float padding = f10 + r4.getPadding();
        float fC2 = c();
        float f11 = f() * 0.18f;
        l.c(this.f44062c);
        path.quadTo(fC, padding, fC2, f11 + r6.getPadding());
        float fC3 = c() + this.f44063d;
        float f12 = f() * 0.34f;
        l.c(this.f44062c);
        path.quadTo(fC3, f12 + r3.getPadding(), c(), d());
        this.f44060a.setColor(this.f44064e);
    }
}
