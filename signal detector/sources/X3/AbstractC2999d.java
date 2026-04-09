package x3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import d3.AbstractC2266a;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2999d extends LinearLayoutCompat {

    /* renamed from: D, reason: collision with root package name */
    public Drawable f24112D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f24113E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f24114F;

    /* renamed from: G, reason: collision with root package name */
    public int f24115G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f24116H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f24117I;

    public AbstractC2999d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f24113E = new Rect();
        this.f24114F = new Rect();
        this.f24115G = 119;
        this.f24116H = true;
        this.f24117I = false;
        AbstractC2993B.a(context, attributeSet, 0, 0);
        int[] iArr = AbstractC2266a.f19762q;
        AbstractC2993B.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f24115G = typedArrayObtainStyledAttributes.getInt(1, this.f24115G);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24116H = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24112D;
        if (drawable != null) {
            if (this.f24117I) {
                this.f24117I = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.f24116H;
                Rect rect = this.f24113E;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f24115G;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f24114F;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f5) {
        super.drawableHotspotChanged(f2, f5);
        Drawable drawable = this.f24112D;
        if (drawable != null) {
            drawable.setHotspot(f2, f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24112D;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f24112D.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f24112D;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f24115G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24112D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        this.f24117I = z6 | this.f24117I;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        this.f24117I = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f24112D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f24112D);
            }
            this.f24112D = drawable;
            this.f24117I = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24115G == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f24115G != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f24115G = i;
            if (i == 119 && this.f24112D != null) {
                this.f24112D.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24112D;
    }
}
