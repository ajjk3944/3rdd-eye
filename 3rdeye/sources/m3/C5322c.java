package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.l;

/* compiled from: KiteIndicator.kt */
/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5322c extends AbstractC5321b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f44065g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f44066h;
    public float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5322c(Context context, int i) {
        super(context);
        this.f44065g = i;
        switch (i) {
            case 1:
                super(context);
                this.f44066h = new Path();
                i(12.0f * this.f44061b);
                break;
            default:
                this.f44066h = new Path();
                i(12.0f * this.f44061b);
                break;
        }
    }

    @Override // m3.AbstractC5321b
    public final void a(Canvas canvas) {
        switch (this.f44065g) {
            case 0:
                canvas.drawPath(this.f44066h, this.f44060a);
                break;
            default:
                canvas.drawPath(this.f44066h, this.f44060a);
                break;
        }
    }

    @Override // m3.AbstractC5321b
    public final float b() {
        switch (this.f44065g) {
        }
        return this.i;
    }

    @Override // m3.AbstractC5321b
    public float e() {
        switch (this.f44065g) {
            case 1:
                float f10 = f() / 5.0f;
                l.c(this.f44062c);
                return f10 + r1.getPadding();
            default:
                return super.e();
        }
    }

    @Override // m3.AbstractC5321b
    public final void j() {
        switch (this.f44065g) {
            case 0:
                Path path = this.f44066h;
                path.reset();
                float fC = c();
                l.c(this.f44062c);
                path.moveTo(fC, r2.getPadding());
                float f10 = f() * 0.5f;
                l.c(this.f44062c);
                this.i = f10 + r2.getPadding();
                path.lineTo(c() - this.f44063d, this.i);
                path.lineTo(c(), this.i + this.f44063d);
                path.lineTo(c() + this.f44063d, this.i);
                this.f44060a.setColor(this.f44064e);
                break;
            default:
                Path path2 = this.f44066h;
                path2.reset();
                float fC2 = c();
                float f11 = f() / 5.0f;
                l.c(this.f44062c);
                path2.moveTo(fC2, f11 + r4.getPadding());
                float f12 = (f() * 3.0f) / 5.0f;
                l.c(this.f44062c);
                this.i = f12 + r2.getPadding();
                path2.lineTo(c() - this.f44063d, this.i);
                path2.lineTo(c() + this.f44063d, this.i);
                float fC3 = c();
                float f13 = this.f44063d;
                float f14 = fC3 - f13;
                float f15 = this.i - f13;
                float fC4 = c();
                float f16 = this.f44063d;
                path2.addArc(new RectF(f14, f15, fC4 + f16, this.i + f16), 0.0f, 180.0f);
                this.f44060a.setColor(this.f44064e);
                break;
        }
    }
}
