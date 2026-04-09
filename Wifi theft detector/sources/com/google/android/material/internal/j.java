package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes2.dex */
public class j extends LinearLayoutCompat {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f10710p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f10711q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f10712r;

    /* renamed from: s, reason: collision with root package name */
    public int f10713s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10714t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10715u;

    public j(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f10710p;
        if (drawable != null) {
            if (this.f10715u) {
                this.f10715u = false;
                Rect rect = this.f10711q;
                Rect rect2 = this.f10712r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f10714t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f10713s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f10710p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10710p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f10710p.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f10710p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f10713s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10710p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f10715u = z10 | this.f10715u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f10715u = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f10710p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f10710p);
            }
            this.f10710p = drawable;
            this.f10715u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f10713s == 119) {
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
        if (this.f10713s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f10713s = i10;
            if (i10 == 119 && this.f10710p != null) {
                this.f10710p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10710p;
    }

    public j(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10711q = new Rect();
        this.f10712r = new Rect();
        this.f10713s = 119;
        this.f10714t = true;
        this.f10715u = false;
        TypedArray typedArrayI = a0.i(context, attributeSet, j4.l.ForegroundLinearLayout, i10, 0, new int[0]);
        this.f10713s = typedArrayI.getInt(j4.l.ForegroundLinearLayout_android_foregroundGravity, this.f10713s);
        Drawable drawable = typedArrayI.getDrawable(j4.l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f10714t = typedArrayI.getBoolean(j4.l.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayI.recycle();
    }
}
