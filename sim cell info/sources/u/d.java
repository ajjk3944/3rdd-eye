package u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h, reason: collision with root package name */
    static final PorterDuff.Mode f3342h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private int f3343b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f3344c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3345d;

    /* renamed from: e, reason: collision with root package name */
    f f3346e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3347f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f3348g;

    d(Drawable drawable) {
        this.f3346e = d();
        b(drawable);
    }

    d(f fVar, Resources resources) {
        this.f3346e = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f3346e);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f3346e;
        if (fVar == null || (constantState = fVar.f3351b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f3346e;
        ColorStateList colorStateList = fVar.f3352c;
        PorterDuff.Mode mode = fVar.f3353d;
        if (colorStateList == null || mode == null) {
            this.f3345d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f3345d || colorForState != this.f3343b || mode != this.f3344c) {
                setColorFilter(colorForState, mode);
                this.f3343b = colorForState;
                this.f3344c = mode;
                this.f3345d = true;
                return true;
            }
        }
        return false;
    }

    @Override // u.c
    public final Drawable a() {
        return this.f3348g;
    }

    @Override // u.c
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f3348g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3348g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f3346e;
            if (fVar != null) {
                fVar.f3351b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3348g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f3346e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f3348g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f3346e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f3346e.f3350a = getChangingConfigurations();
        return this.f3346e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f3348g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3348g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3348g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f3348g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f3348g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3348g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f3348g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f3348g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f3348g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f3348g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f3346e) == null) ? null : fVar.f3352c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3348g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f3348g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f3347f && super.mutate() == this) {
            this.f3346e = d();
            Drawable drawable = this.f3348g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f3346e;
            if (fVar != null) {
                Drawable drawable2 = this.f3348g;
                fVar.f3351b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3347f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3348g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f3348g.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f3348g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        this.f3348g.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f3348g.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3348g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f3348g.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f3348g.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f3348g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintList(ColorStateList colorStateList) {
        this.f3346e.f3352c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3346e.f3353d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f3348g.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
