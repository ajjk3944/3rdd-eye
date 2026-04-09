package u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class e extends d {

    /* renamed from: i, reason: collision with root package name */
    private static Method f3349i;

    e(Drawable drawable) {
        super(drawable);
        g();
    }

    e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }

    private void g() {
        if (f3349i == null) {
            try {
                f3349i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    @Override // u.d
    protected boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3348g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f3348g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f3348g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f3348g;
        if (drawable != null && (method = f3349i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        this.f3348g.setHotspot(f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f3348g.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // u.d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // u.d, android.graphics.drawable.Drawable, u.b
    public void setTint(int i2) {
        if (c()) {
            super.setTint(i2);
        } else {
            this.f3348g.setTint(i2);
        }
    }

    @Override // u.d, android.graphics.drawable.Drawable, u.b
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f3348g.setTintList(colorStateList);
        }
    }

    @Override // u.d, android.graphics.drawable.Drawable, u.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f3348g.setTintMode(mode);
        }
    }
}
