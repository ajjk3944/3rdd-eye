package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import o.C5384b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14519b;

    /* renamed from: c, reason: collision with root package name */
    public b f14520c;

    /* renamed from: d, reason: collision with root package name */
    public View f14521d;

    /* renamed from: e, reason: collision with root package name */
    public View f14522e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f14523f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f14524g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f14525h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14526j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14527k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C5384b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4353a.f37876a);
        boolean z10 = false;
        this.f14523f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f14524g = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f14527k = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.i = true;
            this.f14525h = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.i ? !(this.f14523f != null || this.f14524g != null) : this.f14525h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14523f;
        if (drawable != null && drawable.isStateful()) {
            this.f14523f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f14524g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f14524g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f14525h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f14525h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f14520c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14523f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14524g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f14525h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f14521d = findViewById(R.id.action_bar);
        this.f14522e = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f14519b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
  0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            androidx.appcompat.widget.b r8 = r6.f14520c
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.i
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f14525h
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f14523f
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f14521d
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f14523f
            android.view.View r9 = r6.f14521d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f14521d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f14521d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f14521d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f14522e
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f14523f
            android.view.View r9 = r6.f14522e
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f14522e
            int r10 = r10.getTop()
            android.view.View r1 = r6.f14522e
            int r1 = r1.getRight()
            android.view.View r3 = r6.f14522e
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f14523f
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f14526j = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f14524g
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int iA;
        int i11;
        if (this.f14521d == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f14527k) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i10);
        if (this.f14521d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        b bVar = this.f14520c;
        if (bVar == null || bVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f14521d;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f14522e;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f14522e);
        } else {
            iA = a(this.f14521d);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f14520c) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i10) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f14523f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f14523f);
        }
        this.f14523f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f14521d;
            if (view != null) {
                this.f14523f.setBounds(view.getLeft(), this.f14521d.getTop(), this.f14521d.getRight(), this.f14521d.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.i ? !(this.f14523f != null || this.f14524g != null) : this.f14525h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f14525h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f14525h);
        }
        this.f14525h = drawable;
        boolean z10 = this.i;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f14525h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f14523f != null || this.f14524g != null) : this.f14525h == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f14524g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f14524g);
        }
        this.f14524g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f14526j && (drawable2 = this.f14524g) != null) {
                drawable2.setBounds(this.f14520c.getLeft(), this.f14520c.getTop(), this.f14520c.getRight(), this.f14520c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.i ? !(this.f14523f != null || this.f14524g != null) : this.f14525h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b bVar) {
        b bVar2 = this.f14520c;
        if (bVar2 != null) {
            removeView(bVar2);
        }
        this.f14520c = bVar;
        if (bVar != null) {
            addView(bVar);
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f14519b = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.f14523f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f14524g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f14525h;
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
        Drawable drawable2 = this.f14523f;
        boolean z10 = this.i;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f14524g && this.f14526j) {
            return true;
        }
        return (drawable == this.f14525h && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
