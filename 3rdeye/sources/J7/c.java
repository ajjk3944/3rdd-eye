package j7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;

/* compiled from: NinePatchDrawable.kt */
/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public int f43085a;

    /* renamed from: b, reason: collision with root package name */
    public int f43086b;

    /* renamed from: c, reason: collision with root package name */
    public int f43087c;

    /* renamed from: d, reason: collision with root package name */
    public int f43088d;

    /* renamed from: e, reason: collision with root package name */
    public NinePatch f43089e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f43090f = new Paint(3);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        NinePatch ninePatch = this.f43089e;
        if (ninePatch != null) {
            ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.f43090f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f43090f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        l.f(bounds, "bounds");
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f43090f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
