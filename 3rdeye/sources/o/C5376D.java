package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import j.C5162c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DropDownListView.java */
/* renamed from: o.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5376D extends ListView {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f44499b;

    /* renamed from: c, reason: collision with root package name */
    public int f44500c;

    /* renamed from: d, reason: collision with root package name */
    public int f44501d;

    /* renamed from: e, reason: collision with root package name */
    public int f44502e;

    /* renamed from: f, reason: collision with root package name */
    public int f44503f;

    /* renamed from: g, reason: collision with root package name */
    public int f44504g;

    /* renamed from: h, reason: collision with root package name */
    public d f44505h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f44506j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44507k;

    /* renamed from: l, reason: collision with root package name */
    public R0.f f44508l;

    /* renamed from: m, reason: collision with root package name */
    public f f44509m;

    /* compiled from: DropDownListView.java */
    /* renamed from: o.D$a */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: o.D$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f44510a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f44511b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f44512c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f44513d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f44510a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f44511b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f44512c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f44513d = true;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: o.D$c */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: o.D$d */
    public static class d extends C5162c {

        /* renamed from: c, reason: collision with root package name */
        public boolean f44514c;

        @Override // j.C5162c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f44514c) {
                super.draw(canvas);
            }
        }

        @Override // j.C5162c, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f44514c) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // j.C5162c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i10, int i11, int i12) {
            if (this.f44514c) {
                super.setHotspotBounds(i, i10, i11, i12);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f44514c) {
                return this.f42672b.setState(iArr);
            }
            return false;
        }

        @Override // j.C5162c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f44514c) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: o.D$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f44515a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
            f44515a = declaredField;
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: o.D$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5376D c5376d = C5376D.this;
            c5376d.f44509m = null;
            c5376d.drawableStateChanged();
        }
    }

    public C5376D(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f44499b = new Rect();
        this.f44500c = 0;
        this.f44501d = 0;
        this.f44502e = 0;
        this.f44503f = 0;
        this.f44506j = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f44505h;
        if (dVar != null) {
            dVar.f44514c = z10;
        }
    }

    public final int a(int i, int i10) {
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
            view.measure(i, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
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

    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5376D.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f44499b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f44509m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f44507k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f44506j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f44506j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f44506j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f44506j && this.i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f44509m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f44509m == null) {
            f fVar = new f();
            this.f44509m = fVar;
            post(fVar);
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
                if (i < 30 || !b.f44513d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        b.f44510a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b.f44511b.invoke(this, Integer.valueOf(iPointToPosition));
                        b.f44512c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f44507k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f44504g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f44509m;
        if (fVar != null) {
            C5376D c5376d = C5376D.this;
            c5376d.f44509m = null;
            c5376d.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = null;
        if (drawable != null) {
            d dVar2 = new d();
            Drawable drawable2 = dVar2.f42672b;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            dVar2.f42672b = drawable;
            drawable.setCallback(dVar2);
            dVar2.f44514c = true;
            dVar = dVar2;
        }
        this.f44505h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f44500c = rect.left;
        this.f44501d = rect.top;
        this.f44502e = rect.right;
        this.f44503f = rect.bottom;
    }
}
