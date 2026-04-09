package o;

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
import com.apm.insight.R;
import java.lang.reflect.InvocationTargetException;
import n1.RunnableC2683a;

/* renamed from: o.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2732p0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f22603a;

    /* renamed from: b, reason: collision with root package name */
    public int f22604b;

    /* renamed from: c, reason: collision with root package name */
    public int f22605c;

    /* renamed from: d, reason: collision with root package name */
    public int f22606d;

    /* renamed from: e, reason: collision with root package name */
    public int f22607e;

    /* renamed from: f, reason: collision with root package name */
    public int f22608f;

    /* renamed from: g, reason: collision with root package name */
    public C2728n0 f22609g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22610h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22611j;

    /* renamed from: k, reason: collision with root package name */
    public U.d f22612k;

    /* renamed from: l, reason: collision with root package name */
    public RunnableC2683a f22613l;

    public C2732p0(Context context, boolean z6) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f22603a = new Rect();
        this.f22604b = 0;
        this.f22605c = 0;
        this.f22606d = 0;
        this.f22607e = 0;
        this.i = z6;
        setCacheColorHint(0);
    }

    public final int a(int i, int i3) {
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
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
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
        throw new UnsupportedOperationException("Method not decompiled: o.C2732p0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f22603a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f22613l != null) {
            return;
        }
        super.drawableStateChanged();
        C2728n0 c2728n0 = this.f22609g;
        if (c2728n0 != null) {
            c2728n0.f22596b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f22611j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.i && this.f22610h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f22613l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked == 10 && this.f22613l == null) {
            RunnableC2683a runnableC2683a = new RunnableC2683a(i3, this);
            this.f22613l = runnableC2683a;
            post(runnableC2683a);
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
                if (i < 30 || !AbstractC2724l0.f22569d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC2724l0.f22566a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC2724l0.f22567b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC2724l0.f22568c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f22611j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f22608f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC2683a runnableC2683a = this.f22613l;
        if (runnableC2683a != null) {
            C2732p0 c2732p0 = (C2732p0) runnableC2683a.f22171b;
            c2732p0.f22613l = null;
            c2732p0.removeCallbacks(runnableC2683a);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f22610h = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C2728n0 c2728n0;
        if (drawable != null) {
            c2728n0 = new C2728n0();
            Drawable drawable2 = c2728n0.f22595a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c2728n0.f22595a = drawable;
            if (drawable != null) {
                drawable.setCallback(c2728n0);
            }
            c2728n0.f22596b = true;
        } else {
            c2728n0 = null;
        }
        this.f22609g = c2728n0;
        super.setSelector(c2728n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f22604b = rect.left;
        this.f22605c = rect.top;
        this.f22606d = rect.right;
        this.f22607e = rect.bottom;
    }
}
