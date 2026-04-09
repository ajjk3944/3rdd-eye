package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class f0 extends ListView {

    /* renamed from: b, reason: collision with root package name */
    private final Rect f936b;

    /* renamed from: c, reason: collision with root package name */
    private int f937c;

    /* renamed from: d, reason: collision with root package name */
    private int f938d;

    /* renamed from: e, reason: collision with root package name */
    private int f939e;

    /* renamed from: f, reason: collision with root package name */
    private int f940f;

    /* renamed from: g, reason: collision with root package name */
    private int f941g;

    /* renamed from: h, reason: collision with root package name */
    private Field f942h;

    /* renamed from: i, reason: collision with root package name */
    private a f943i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f944j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f945k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f946l;

    /* renamed from: m, reason: collision with root package name */
    private a0.w f947m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.core.widget.f f948n;

    /* renamed from: o, reason: collision with root package name */
    b f949o;

    private static class a extends d.c {

        /* renamed from: c, reason: collision with root package name */
        private boolean f950c;

        a(Drawable drawable) {
            super(drawable);
            this.f950c = true;
        }

        void c(boolean z2) {
            this.f950c = z2;
        }

        @Override // d.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f950c) {
                super.draw(canvas);
            }
        }

        @Override // d.c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f950c) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // d.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f950c) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // d.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f950c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // d.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f950c) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.f949o = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.f949o = null;
            f0Var.drawableStateChanged();
        }
    }

    f0(Context context, boolean z2) throws NoSuchFieldException {
        super(context, null, a.a.f25z);
        this.f936b = new Rect();
        this.f937c = 0;
        this.f938d = 0;
        this.f939e = 0;
        this.f940f = 0;
        this.f945k = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f942h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.f946l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f941g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        a0.w wVar = this.f947m;
        if (wVar != null) {
            wVar.b();
            this.f947m = null;
        }
    }

    private void b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f936b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f936b);
        selector.draw(canvas);
    }

    private void f(int i2, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f936b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f937c;
        rect.top -= this.f938d;
        rect.right += this.f939e;
        rect.bottom += this.f940f;
        try {
            boolean z2 = this.f942h.getBoolean(this);
            if (view.isEnabled() != z2) {
                this.f942h.set(this, Boolean.valueOf(!z2));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void g(int i2, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        f(i2, view);
        if (z2) {
            Rect rect = this.f936b;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            u.a.j(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i2, View view, float f2, float f3) throws IllegalAccessException, IllegalArgumentException {
        g(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        u.a.j(selector, f2, f3);
    }

    private void i(View view, int i2, float f2, float f3) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f946l = true;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i4 = this.f941g;
        if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f941g = i2;
        float left = f2 - view.getLeft();
        float top = f3 - view.getTop();
        if (i3 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f946l;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z2) {
        a aVar = this.f943i;
        if (aVar != null) {
            aVar.c(z2);
        }
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i2, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return (i6 < 0 || i7 <= i6 || i9 <= 0 || measuredHeight == i5) ? i5 : i9;
            }
            if (i6 >= 0 && i7 >= i6) {
                i9 = measuredHeight;
            }
            i7++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f949o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f948n
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f948n = r9
        L5a:
            androidx.core.widget.f r9 = r7.f948n
            r9.m(r2)
            androidx.core.widget.f r9 = r7.f948n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f948n
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f945k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f945k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f945k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f945k && this.f944j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f949o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f949o == null) {
            b bVar = new b();
            this.f949o = bVar;
            bVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f941g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f949o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z2) {
        this.f944j = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f943i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f937c = rect.left;
        this.f938d = rect.top;
        this.f939e = rect.right;
        this.f940f = rect.bottom;
    }
}
