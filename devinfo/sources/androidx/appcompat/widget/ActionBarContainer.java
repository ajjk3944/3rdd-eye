package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.liuzh.deviceinfo.R;
import h.a;
import p.b;
import p.n2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f695a;

    /* renamed from: b, reason: collision with root package name */
    public View f696b;

    /* renamed from: c, reason: collision with root package name */
    public View f697c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f698d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f699e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f700f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f701h;

    /* renamed from: i, reason: collision with root package name */
    public final int f702i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f24776a);
        boolean z3 = false;
        this.f698d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f699e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f702i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.g = true;
            this.f700f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.g ? !(this.f698d != null || this.f699e != null) : this.f700f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f698d;
        if (drawable != null && drawable.isStateful()) {
            this.f698d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f699e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f699e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f700f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f700f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f698d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f699e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f700f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f696b = findViewById(R.id.action_bar);
        this.f697c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f695a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        boolean z10 = true;
        if (this.g) {
            Drawable drawable = this.f700f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f698d == null) {
                z10 = false;
            } else if (this.f696b.getVisibility() == 0) {
                this.f698d.setBounds(this.f696b.getLeft(), this.f696b.getTop(), this.f696b.getRight(), this.f696b.getBottom());
            } else {
                View view = this.f697c;
                if (view == null || view.getVisibility() != 0) {
                    this.f698d.setBounds(0, 0, 0, 0);
                } else {
                    this.f698d.setBounds(this.f697c.getLeft(), this.f697c.getTop(), this.f697c.getRight(), this.f697c.getBottom());
                }
            }
            this.f701h = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11;
        if (this.f696b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f702i) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i4, i10);
        if (this.f696b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f698d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f698d);
        }
        this.f698d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f696b;
            if (view != null) {
                this.f698d.setBounds(view.getLeft(), this.f696b.getTop(), this.f696b.getRight(), this.f696b.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.g ? !(this.f698d != null || this.f699e != null) : this.f700f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f700f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f700f);
        }
        this.f700f = drawable;
        boolean z3 = this.g;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f700f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f698d != null || this.f699e != null) : this.f700f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f699e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f699e);
        }
        this.f699e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f701h && this.f699e != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.g ? !(this.f698d != null || this.f699e != null) : this.f700f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f695a = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f698d;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f699e;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f700f;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f698d;
        boolean z3 = this.g;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f699e && this.f701h) {
            return true;
        }
        return (drawable == this.f700f && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    public void setTabContainer(n2 n2Var) {
    }
}
