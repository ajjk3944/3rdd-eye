package P6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.gson.internal.c;
import kotlin.jvm.internal.l;

/* compiled from: ScaleDrawable.kt */
/* loaded from: classes.dex */
public final class b extends Drawable implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f10658b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10659c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10660d;

    public b(Drawable drawable, float f10) {
        this.f10658b = drawable;
        this.f10659c = f10;
        this.f10660d = f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        int iSave = canvas.save();
        try {
            canvas.scale(this.f10659c, this.f10660d);
            this.f10658b.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f10658b.getIntrinsicHeight() == -1) {
            return -1;
        }
        return c.y(r0.getIntrinsicHeight() * this.f10660d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f10658b.getIntrinsicWidth() == -1) {
            return -1;
        }
        return c.y(r0.getIntrinsicWidth() * this.f10659c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f10658b.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f10658b;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f10658b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10658b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f10658b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f10658b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }
}
