package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.ImageMetadata;
import h.AbstractC5932f;
import h.AbstractC5936j;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26972a;

    /* renamed from: b, reason: collision with root package name */
    private View f26973b;

    /* renamed from: c, reason: collision with root package name */
    private View f26974c;

    /* renamed from: d, reason: collision with root package name */
    private View f26975d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f26976e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f26977f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f26978g;

    /* renamed from: h, reason: collision with root package name */
    boolean f26979h;

    /* renamed from: i, reason: collision with root package name */
    boolean f26980i;

    /* renamed from: j, reason: collision with root package name */
    private int f26981j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C3877b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5936j.f48189a);
        this.f26976e = typedArrayObtainStyledAttributes.getDrawable(AbstractC5936j.f48194b);
        this.f26977f = typedArrayObtainStyledAttributes.getDrawable(AbstractC5936j.f48204d);
        this.f26981j = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5936j.f48234j, -1);
        boolean z10 = true;
        if (getId() == AbstractC5932f.f48051x) {
            this.f26979h = true;
            this.f26978g = typedArrayObtainStyledAttributes.getDrawable(AbstractC5936j.f48199c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f26979h ? this.f26976e != null || this.f26977f != null : this.f26978g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
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
        Drawable drawable = this.f26976e;
        if (drawable != null && drawable.isStateful()) {
            this.f26976e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f26977f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f26977f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f26978g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f26978g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f26973b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f26976e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f26977f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f26978g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26974c = findViewById(AbstractC5932f.f48028a);
        this.f26975d = findViewById(AbstractC5932f.f48033f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f26972a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f26973b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f26979h
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f26978g
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f26976e
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f26974c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f26976e
            android.view.View r7 = r4.f26974c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f26974c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f26974c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f26974c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f26975d
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f26976e
            android.view.View r7 = r4.f26975d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f26975d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f26975d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f26975d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f26976e
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f26980i = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f26977f
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f26974c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f26981j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), PduHandle.NONE);
        }
        super.onMeasure(i10, i11);
        if (this.f26974c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f26973b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f26974c) ? a(this.f26974c) : !b(this.f26975d) ? a(this.f26975d) : 0) + a(this.f26973b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : MPv3.MAX_MESSAGE_ID));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f26976e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f26976e);
        }
        this.f26976e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f26974c;
            if (view != null) {
                this.f26976e.setBounds(view.getLeft(), this.f26974c.getTop(), this.f26974c.getRight(), this.f26974c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f26979h ? !(this.f26976e != null || this.f26977f != null) : this.f26978g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f26978g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f26978g);
        }
        this.f26978g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f26979h && (drawable2 = this.f26978g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f26979h ? !(this.f26976e != null || this.f26977f != null) : this.f26978g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f26977f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f26977f);
        }
        this.f26977f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f26980i && (drawable2 = this.f26977f) != null) {
                drawable2.setBounds(this.f26973b.getLeft(), this.f26973b.getTop(), this.f26973b.getRight(), this.f26973b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f26979h ? !(this.f26976e != null || this.f26977f != null) : this.f26978g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(W w10) {
        View view = this.f26973b;
        if (view != null) {
            removeView(view);
        }
        this.f26973b = w10;
    }

    public void setTransitioning(boolean z10) {
        this.f26972a = z10;
        setDescendantFocusability(z10 ? ImageMetadata.HOT_PIXEL_MODE : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f26976e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f26977f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f26978g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f26976e && !this.f26979h) || (drawable == this.f26977f && this.f26980i) || ((drawable == this.f26978g && this.f26979h) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
