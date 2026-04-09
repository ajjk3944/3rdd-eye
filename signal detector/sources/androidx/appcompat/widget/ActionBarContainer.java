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
import com.apm.insight.R;
import g.AbstractC2327a;
import o.C2703b;
import o.L0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4788a;

    /* renamed from: b, reason: collision with root package name */
    public View f4789b;

    /* renamed from: c, reason: collision with root package name */
    public View f4790c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4791d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4792e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4793f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4794g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4795h;
    public final int i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2703b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20114a);
        boolean z6 = false;
        this.f4791d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f4792e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4794g = true;
            this.f4793f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4794g ? !(this.f4791d != null || this.f4792e != null) : this.f4793f == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4791d;
        if (drawable != null && drawable.isStateful()) {
            this.f4791d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4792e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4792e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4793f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4793f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4791d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4792e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4793f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4789b = findViewById(R.id.action_bar);
        this.f4790c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4788a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        boolean z7 = true;
        if (this.f4794g) {
            Drawable drawable = this.f4793f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f4791d == null) {
                z7 = false;
            } else if (this.f4789b.getVisibility() == 0) {
                this.f4791d.setBounds(this.f4789b.getLeft(), this.f4789b.getTop(), this.f4789b.getRight(), this.f4789b.getBottom());
            } else {
                View view = this.f4790c;
                if (view == null || view.getVisibility() != 0) {
                    this.f4791d.setBounds(0, 0, 0, 0);
                } else {
                    this.f4791d.setBounds(this.f4790c.getLeft(), this.f4790c.getTop(), this.f4790c.getRight(), this.f4790c.getBottom());
                }
            }
            this.f4795h = false;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        if (this.f4789b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i6 = this.i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i3)), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i3);
        if (this.f4789b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4791d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4791d);
        }
        this.f4791d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4789b;
            if (view != null) {
                this.f4791d.setBounds(view.getLeft(), this.f4789b.getTop(), this.f4789b.getRight(), this.f4789b.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f4794g ? !(this.f4791d != null || this.f4792e != null) : this.f4793f == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4793f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4793f);
        }
        this.f4793f = drawable;
        boolean z6 = this.f4794g;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f4793f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f4791d != null || this.f4792e != null) : this.f4793f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4792e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4792e);
        }
        this.f4792e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4795h && this.f4792e != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f4794g ? !(this.f4791d != null || this.f4792e != null) : this.f4793f == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f4788a = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z6 = i == 0;
        Drawable drawable = this.f4791d;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f4792e;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f4793f;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4791d;
        boolean z6 = this.f4794g;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f4792e && this.f4795h) {
            return true;
        }
        return (drawable == this.f4793f && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(L0 l02) {
    }
}
