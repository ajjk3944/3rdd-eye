package e8;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.y3;
import m8.g;

/* loaded from: classes.dex */
public final class b extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f7971a;

    /* renamed from: d, reason: collision with root package name */
    public final g f7972d;

    /* renamed from: g, reason: collision with root package name */
    public float f7973g;

    /* renamed from: r, reason: collision with root package name */
    public float f7974r;

    /* renamed from: x, reason: collision with root package name */
    public float f7975x = 1.0f;

    public b(Drawable drawable, g gVar) {
        this.f7971a = drawable;
        this.f7972d = gVar;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f7973g, this.f7974r);
            float f10 = this.f7975x;
            canvas.scale(f10, f10);
            this.f7971a.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7971a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f7971a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7971a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7971a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f7971a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f7971a;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7971a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f7973g = 0.0f;
            this.f7974r = 0.0f;
            this.f7975x = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dG = y3.g(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f7972d);
        double d6 = 2;
        int iE = dr.a.E((iWidth - (intrinsicWidth * dG)) / d6);
        int iE2 = dr.a.E((iHeight - (intrinsicHeight * dG)) / d6);
        drawable.setBounds(iE, iE2, intrinsicWidth + iE, intrinsicHeight + iE2);
        this.f7973g = rect.left;
        this.f7974r = rect.top;
        this.f7975x = (float) dG;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f7971a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f7971a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f7971a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7971a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f7971a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f7971a.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f7971a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f7971a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f7971a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f7971a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
