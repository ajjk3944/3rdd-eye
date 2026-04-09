package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import h.f;
import h.j;
import p.d2;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public final boolean B;
    public boolean D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f933a;

    /* renamed from: d, reason: collision with root package name */
    public View f934d;

    /* renamed from: g, reason: collision with root package name */
    public View f935g;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f936r;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f937x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f938y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new p.a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f936r = typedArrayObtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.f937x = typedArrayObtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z10 = true;
        if (getId() == f.split_action_bar) {
            this.B = true;
            this.f938y = typedArrayObtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.B ? this.f936r != null || this.f937x != null : this.f938y != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f936r;
        if (drawable != null && drawable.isStateful()) {
            this.f936r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f937x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f937x.setState(getDrawableState());
        }
        Drawable drawable3 = this.f938y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f938y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f936r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f937x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f938y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f934d = findViewById(f.action_bar);
        this.f935g = findViewById(f.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f933a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (this.B) {
            Drawable drawable = this.f938y;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f936r == null) {
                z11 = false;
            } else if (this.f934d.getVisibility() == 0) {
                this.f936r.setBounds(this.f934d.getLeft(), this.f934d.getTop(), this.f934d.getRight(), this.f934d.getBottom());
            } else {
                View view = this.f935g;
                if (view == null || view.getVisibility() != 0) {
                    this.f936r.setBounds(0, 0, 0, 0);
                } else {
                    this.f936r.setBounds(this.f935g.getLeft(), this.f935g.getTop(), this.f935g.getRight(), this.f935g.getBottom());
                }
            }
            this.D = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f934d == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.E) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f934d == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f936r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f936r);
        }
        this.f936r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f934d;
            if (view != null) {
                this.f936r.setBounds(view.getLeft(), this.f934d.getTop(), this.f934d.getRight(), this.f934d.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.B ? !(this.f936r != null || this.f937x != null) : this.f938y == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f938y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f938y);
        }
        this.f938y = drawable;
        boolean z10 = this.B;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f938y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f936r != null || this.f937x != null) : this.f938y == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f937x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f937x);
        }
        this.f937x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.D && this.f937x != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.B ? !(this.f936r != null || this.f937x != null) : this.f938y == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        this.f933a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f936r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f937x;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f938y;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f936r;
        boolean z10 = this.B;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f937x && this.D) {
            return true;
        }
        return (drawable == this.f938y && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(d2 d2Var) {
    }
}
