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
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class i1 extends ListView {
    public g1 B;
    public boolean D;
    public final boolean E;
    public boolean F;
    public y3.d G;
    public b4.e H;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f20076a;

    /* renamed from: d, reason: collision with root package name */
    public int f20077d;

    /* renamed from: g, reason: collision with root package name */
    public int f20078g;

    /* renamed from: r, reason: collision with root package name */
    public int f20079r;

    /* renamed from: x, reason: collision with root package name */
    public int f20080x;

    /* renamed from: y, reason: collision with root package name */
    public int f20081y;

    public i1(Context context, boolean z10) {
        super(context, null, h.a.dropDownListViewStyle);
        this.f20076a = new Rect();
        this.f20077d = 0;
        this.f20078g = 0;
        this.f20079r = 0;
        this.f20080x = 0;
        this.E = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
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
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
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
        throw new UnsupportedOperationException("Method not decompiled: p.i1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f20076a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.H != null) {
            return;
        }
        super.drawableStateChanged();
        g1 g1Var = this.B;
        if (g1Var != null) {
            g1Var.f20061d = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.F && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.E || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.E || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.E || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.E && this.D) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.H = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.H == null) {
            b4.e eVar = new b4.e(27, this);
            this.H = eVar;
            post(eVar);
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
                if (i10 < 30 || !e1.f20052d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        e1.f20049a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        e1.f20050b.invoke(this, Integer.valueOf(iPointToPosition));
                        e1.f20051c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.F && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20081y = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b4.e eVar = this.H;
        if (eVar != null) {
            i1 i1Var = (i1) eVar.f2398d;
            i1Var.H = null;
            i1Var.removeCallbacks(eVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.D = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        g1 g1Var;
        if (drawable != null) {
            g1Var = new g1();
            Drawable drawable2 = g1Var.f20060a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            g1Var.f20060a = drawable;
            if (drawable != null) {
                drawable.setCallback(g1Var);
            }
            g1Var.f20061d = true;
        } else {
            g1Var = null;
        }
        this.B = g1Var;
        super.setSelector(g1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f20077d = rect.left;
        this.f20078g = rect.top;
        this.f20079r = rect.right;
        this.f20080x = rect.bottom;
    }
}
