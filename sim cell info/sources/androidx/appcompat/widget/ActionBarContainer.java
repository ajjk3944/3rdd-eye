package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private boolean f687b;

    /* renamed from: c, reason: collision with root package name */
    private View f688c;

    /* renamed from: d, reason: collision with root package name */
    private View f689d;

    /* renamed from: e, reason: collision with root package name */
    private View f690e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f691f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f692g;

    /* renamed from: h, reason: collision with root package name */
    Drawable f693h;

    /* renamed from: i, reason: collision with root package name */
    boolean f694i;

    /* renamed from: j, reason: collision with root package name */
    boolean f695j;

    /* renamed from: k, reason: collision with root package name */
    private int f696k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0.s.R(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f133a);
        this.f691f = typedArrayObtainStyledAttributes.getDrawable(a.j.f135b);
        this.f692g = typedArrayObtainStyledAttributes.getDrawable(a.j.f139d);
        this.f696k = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.j.f151j, -1);
        boolean z2 = true;
        if (getId() == a.f.H) {
            this.f694i = true;
            this.f693h = typedArrayObtainStyledAttributes.getDrawable(a.j.f137c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f694i ? this.f691f != null || this.f692g != null : this.f693h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f691f;
        if (drawable != null && drawable.isStateful()) {
            this.f691f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f692g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f692g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f693h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f693h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f688c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f691f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f692g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f693h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f689d = findViewById(a.f.f72a);
        this.f690e = findViewById(a.f.f77f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f687b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        View view2 = this.f688c;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view2.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f694i) {
            Drawable drawable3 = this.f693h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f691f != null) {
                if (this.f689d.getVisibility() == 0) {
                    drawable2 = this.f691f;
                    left = this.f689d.getLeft();
                    top = this.f689d.getTop();
                    right = this.f689d.getRight();
                    view = this.f689d;
                } else {
                    View view3 = this.f690e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f691f.setBounds(0, 0, 0, 0);
                        z4 = true;
                    } else {
                        drawable2 = this.f691f;
                        left = this.f690e.getLeft();
                        top = this.f690e.getTop();
                        right = this.f690e.getRight();
                        view = this.f690e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z4 = true;
            }
            this.f695j = z5;
            if (!z5 || (drawable = this.f692g) == null) {
                z3 = z4;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f689d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f696k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f689d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f688c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f689d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f689d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f690e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f690e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f688c
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f691f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f691f);
        }
        this.f691f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f689d;
            if (view != null) {
                this.f691f.setBounds(view.getLeft(), this.f689d.getTop(), this.f689d.getRight(), this.f689d.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f694i ? this.f691f != null || this.f692g != null : this.f693h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f693h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f693h);
        }
        this.f693h = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f694i && (drawable2 = this.f693h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f694i ? !(this.f691f != null || this.f692g != null) : this.f693h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f692g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f692g);
        }
        this.f692g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f695j && (drawable2 = this.f692g) != null) {
                drawable2.setBounds(this.f688c.getLeft(), this.f688c.getTop(), this.f688c.getRight(), this.f688c.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f694i ? this.f691f != null || this.f692g != null : this.f693h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f688c;
        if (view != null) {
            removeView(view);
        }
        this.f688c = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f687b = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f691f;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f692g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f693h;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f691f && !this.f694i) || (drawable == this.f692g && this.f695j) || ((drawable == this.f693h && this.f694i) || super.verifyDrawable(drawable));
    }
}
