package x7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;
import w7.C5741a;

/* compiled from: TextDrawable.kt */
/* renamed from: x7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5780b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final C5741a f47803a;

    /* renamed from: b, reason: collision with root package name */
    public final C5779a f47804b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f47805c = new RectF();

    public C5780b(C5741a c5741a) {
        this.f47803a = c5741a;
        this.f47804b = new C5779a(c5741a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        RectF rectF = this.f47805c;
        rectF.set(getBounds());
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        C5779a c5779a = this.f47804b;
        c5779a.getClass();
        String str = c5779a.f47800d;
        if (str != null) {
            float f10 = fCenterX - c5779a.f47801e;
            C5741a c5741a = c5779a.f47797a;
            canvas.drawText(str, f10 + c5741a.f47500c, fCenterY + c5779a.f47802f + c5741a.f47501d, c5779a.f47799c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C5741a c5741a = this.f47803a;
        return (int) (Math.abs(c5741a.f47501d) + c5741a.f47498a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (Math.abs(this.f47803a.f47500c) + this.f47805c.width());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
