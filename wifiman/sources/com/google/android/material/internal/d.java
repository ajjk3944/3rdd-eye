package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.O;

/* loaded from: classes3.dex */
public abstract class d extends O {

    /* renamed from: p, reason: collision with root package name */
    private Drawable f37574p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f37575q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f37576r;

    /* renamed from: s, reason: collision with root package name */
    private int f37577s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f37578t;

    /* renamed from: u, reason: collision with root package name */
    boolean f37579u;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37575q = new Rect();
        this.f37576r = new Rect();
        this.f37577s = 119;
        this.f37578t = true;
        this.f37579u = false;
        TypedArray typedArrayI = k.i(context, attributeSet, O3.j.f17534w1, i10, 0, new int[0]);
        this.f37577s = typedArrayI.getInt(O3.j.f17550y1, this.f37577s);
        Drawable drawable = typedArrayI.getDrawable(O3.j.f17542x1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f37578t = typedArrayI.getBoolean(O3.j.f17558z1, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f37574p;
        if (drawable != null) {
            if (this.f37579u) {
                this.f37579u = false;
                Rect rect = this.f37575q;
                Rect rect2 = this.f37576r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f37578t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f37577s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f37574p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f37574p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f37574p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f37574p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f37577s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f37574p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37579u = z10 | this.f37579u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f37579u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f37574p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f37574p);
            }
            this.f37574p = drawable;
            this.f37579u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f37577s == 119) {
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
    public void setForegroundGravity(int i10) {
        if (this.f37577s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f37577s = i10;
            if (i10 == 119 && this.f37574p != null) {
                this.f37574p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f37574p;
    }
}
