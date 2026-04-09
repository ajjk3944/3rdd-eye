package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p1 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f30806a;

    /* renamed from: b, reason: collision with root package name */
    public int f30807b;

    /* renamed from: c, reason: collision with root package name */
    public int f30808c;

    /* renamed from: d, reason: collision with root package name */
    public int f30809d;

    /* renamed from: e, reason: collision with root package name */
    public int f30810e;

    /* renamed from: f, reason: collision with root package name */
    public int f30811f;
    public m1 g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30812h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30813i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public j4.d f30814k;

    /* renamed from: l, reason: collision with root package name */
    public o1 f30815l;

    public p1(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f30806a = new Rect();
        this.f30807b = 0;
        this.f30808c = 0;
        this.f30809d = 0;
        this.f30810e = 0;
        this.f30813i = z3;
        setCacheColorHint(0);
    }

    public final int a(int i4, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i4, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f30806a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f30815l != null) {
            return;
        }
        super.drawableStateChanged();
        m1 m1Var = this.g;
        if (m1Var != null) {
            m1Var.f30768b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f30813i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f30813i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f30813i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f30813i && this.f30812h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f30815l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (actionMasked == 10 && this.f30815l == null) {
            o1 o1Var = new o1(i10, this);
            this.f30815l = o1Var;
            post(o1Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i4 < 30 || !k1.f30749d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        k1.f30746a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        k1.f30747b.invoke(this, Integer.valueOf(iPointToPosition));
                        k1.f30748c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f30811f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        o1 o1Var = this.f30815l;
        if (o1Var != null) {
            p1 p1Var = (p1) o1Var.f30800b;
            p1Var.f30815l = null;
            p1Var.removeCallbacks(o1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f30812h = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        m1 m1Var;
        if (drawable != null) {
            m1Var = new m1();
            Drawable drawable2 = m1Var.f30767a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            m1Var.f30767a = drawable;
            if (drawable != null) {
                drawable.setCallback(m1Var);
            }
            m1Var.f30768b = true;
        } else {
            m1Var = null;
        }
        this.g = m1Var;
        super.setSelector(m1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f30807b = rect.left;
        this.f30808c = rect.top;
        this.f30809d = rect.right;
        this.f30810e = rect.bottom;
    }
}
