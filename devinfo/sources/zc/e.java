package zc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import p.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e extends u1 {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f38211p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f38212q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f38213r;

    /* renamed from: s, reason: collision with root package name */
    public int f38214s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f38215t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38216u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f38212q = new Rect();
        this.f38213r = new Rect();
        this.f38214s = 119;
        this.f38215t = true;
        this.f38216u = false;
        m.a(context, attributeSet, 0, 0);
        int[] iArr = ic.a.f25953n;
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f38214s = typedArrayObtainStyledAttributes.getInt(1, this.f38214s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f38215t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f38211p;
        if (drawable != null) {
            if (this.f38216u) {
                this.f38216u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f38215t;
                Rect rect = this.f38212q;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i4 = this.f38214s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f38213r;
                Gravity.apply(i4, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f38211p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f38211p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f38211p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f38211p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f38214s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f38211p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        this.f38216u = z3 | this.f38216u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.f38216u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f38211p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f38211p);
            }
            this.f38211p = drawable;
            this.f38216u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f38214s == 119) {
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
    public void setForegroundGravity(int i4) {
        if (this.f38214s != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & AppLovinMediationAdapter.ERROR_CHILD_USER) == 0) {
                i4 |= 48;
            }
            this.f38214s = i4;
            if (i4 == 119 && this.f38211p != null) {
                this.f38211p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f38211p;
    }
}
