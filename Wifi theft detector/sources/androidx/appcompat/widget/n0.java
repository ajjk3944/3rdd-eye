package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class n0 implements i.f {
    public static Method G;
    public static Method H;
    public static Method I;
    public Runnable A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;

    /* renamed from: a, reason: collision with root package name */
    public Context f1244a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f1245b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f1246c;

    /* renamed from: d, reason: collision with root package name */
    public int f1247d;

    /* renamed from: e, reason: collision with root package name */
    public int f1248e;

    /* renamed from: f, reason: collision with root package name */
    public int f1249f;

    /* renamed from: g, reason: collision with root package name */
    public int f1250g;

    /* renamed from: h, reason: collision with root package name */
    public int f1251h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1252i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1253j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1254k;

    /* renamed from: l, reason: collision with root package name */
    public int f1255l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1256m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1257n;

    /* renamed from: o, reason: collision with root package name */
    public int f1258o;

    /* renamed from: p, reason: collision with root package name */
    public View f1259p;

    /* renamed from: q, reason: collision with root package name */
    public int f1260q;

    /* renamed from: r, reason: collision with root package name */
    public DataSetObserver f1261r;

    /* renamed from: s, reason: collision with root package name */
    public View f1262s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f1263t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f1264u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1265v;

    /* renamed from: w, reason: collision with root package name */
    public final i f1266w;

    /* renamed from: x, reason: collision with root package name */
    public final h f1267x;

    /* renamed from: y, reason: collision with root package name */
    public final g f1268y;

    /* renamed from: z, reason: collision with root package name */
    public final e f1269z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = n0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            n0.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            k0 k0Var;
            if (i10 == -1 || (k0Var = n0.this.f1246c) == null) {
                return;
            }
            k0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class c {
        @DoNotInline
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class d {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.q();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (n0.this.a()) {
                n0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            n0.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || n0.this.z() || n0.this.F.getContentView() == null) {
                return;
            }
            n0 n0Var = n0.this;
            n0Var.B.removeCallbacks(n0Var.f1266w);
            n0.this.f1266w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = n0.this.F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < n0.this.F.getWidth() && y10 >= 0 && y10 < n0.this.F.getHeight()) {
                n0 n0Var = n0.this;
                n0Var.B.postDelayed(n0Var.f1266w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            n0 n0Var2 = n0.this;
            n0Var2.B.removeCallbacks(n0Var2.f1266w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0 k0Var = n0.this.f1246c;
            if (k0Var == null || !k0Var.isAttachedToWindow() || n0.this.f1246c.getCount() <= n0.this.f1246c.getChildCount()) {
                return;
            }
            int childCount = n0.this.f1246c.getChildCount();
            n0 n0Var = n0.this;
            if (childCount <= n0Var.f1258o) {
                n0Var.F.setInputMethodMode(2);
                n0.this.show();
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public n0(@NonNull Context context) {
        this(context, null, c.a.listPopupWindowStyle);
    }

    public boolean A() {
        return this.E;
    }

    public final void B() {
        View view = this.f1259p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1259p);
            }
        }
    }

    public void C(View view) {
        this.f1262s = view;
    }

    public void D(int i10) {
        this.F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f1248e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f1255l = i10;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.E = z10;
        this.F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1264u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1265v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f1254k = true;
        this.f1253j = z10;
    }

    public final void N(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z10);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void O(int i10) {
        this.f1260q = i10;
    }

    public void P(int i10) {
        k0 k0Var = this.f1246c;
        if (!a() || k0Var == null) {
            return;
        }
        k0Var.setListSelectionHidden(false);
        k0Var.setSelection(i10);
        if (k0Var.getChoiceMode() != 0) {
            k0Var.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f1248e = i10;
    }

    @Override // i.f
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f1249f;
    }

    @Override // i.f
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f1246c = null;
        this.B.removeCallbacks(this.f1266w);
    }

    public void e(int i10) {
        this.f1249f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f1250g = i10;
        this.f1252i = true;
    }

    public int l() {
        if (this.f1252i) {
            return this.f1250g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1261r;
        if (dataSetObserver == null) {
            this.f1261r = new f();
        } else {
            ListAdapter listAdapter2 = this.f1245b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1245b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1261r);
        }
        k0 k0Var = this.f1246c;
        if (k0Var != null) {
            k0Var.setAdapter(this.f1245b);
        }
    }

    @Override // i.f
    public ListView o() {
        return this.f1246c;
    }

    public final int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        int i11;
        if (this.f1246c == null) {
            Context context = this.f1244a;
            this.A = new a();
            k0 k0VarR = r(context, !this.E);
            this.f1246c = k0VarR;
            Drawable drawable = this.f1263t;
            if (drawable != null) {
                k0VarR.setSelector(drawable);
            }
            this.f1246c.setAdapter(this.f1245b);
            this.f1246c.setOnItemClickListener(this.f1264u);
            this.f1246c.setFocusable(true);
            this.f1246c.setFocusableInTouchMode(true);
            this.f1246c.setOnItemSelectedListener(new b());
            this.f1246c.setOnScrollListener(this.f1268y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1265v;
            if (onItemSelectedListener != null) {
                this.f1246c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f1246c;
            View view2 = this.f1259p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f1260q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1260q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f1248e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.f1259p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f1252i) {
                this.f1250g = -i14;
            }
        } else {
            this.C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f1250g, this.F.getInputMethodMode() == 2);
        if (this.f1256m || this.f1247d == -1) {
            return iT + i10;
        }
        int i15 = this.f1248e;
        if (i15 == -2) {
            int i16 = this.f1244a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f1244a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f1246c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f1246c.getPaddingTop() + this.f1246c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void q() {
        k0 k0Var = this.f1246c;
        if (k0Var != null) {
            k0Var.setListSelectionHidden(true);
            k0Var.requestLayout();
        }
    }

    public k0 r(Context context, boolean z10) {
        return new k0(context, z10);
    }

    public View s() {
        return this.f1262s;
    }

    @Override // i.f
    public void show() {
        int iP = p();
        boolean z10 = z();
        androidx.core.widget.g.b(this.F, this.f1251h);
        if (this.F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f1248e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f1247d;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f1248e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f1248e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.F.setOutsideTouchable((this.f1257n || this.f1256m) ? false : true);
                this.F.update(s(), this.f1249f, this.f1250g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f1248e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f1247d;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iP);
        N(true);
        this.F.setOutsideTouchable((this.f1257n || this.f1256m) ? false : true);
        this.F.setTouchInterceptor(this.f1267x);
        if (this.f1254k) {
            androidx.core.widget.g.a(this.F, this.f1253j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        androidx.core.widget.g.c(this.F, s(), this.f1249f, this.f1250g, this.f1255l);
        this.f1246c.setSelection(-1);
        if (!this.E || this.f1246c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f1269z);
    }

    public final int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.F, view, i10, z10);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i10);
    }

    public Object u() {
        if (a()) {
            return this.f1246c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f1246c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f1246c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f1246c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f1248e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public n0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1247d = -2;
        this.f1248e = -2;
        this.f1251h = 1002;
        this.f1255l = 0;
        this.f1256m = false;
        this.f1257n = false;
        this.f1258o = Integer.MAX_VALUE;
        this.f1260q = 0;
        this.f1266w = new i();
        this.f1267x = new h();
        this.f1268y = new g();
        this.f1269z = new e();
        this.C = new Rect();
        this.f1244a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.ListPopupWindow, i10, i11);
        this.f1249f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1250g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1252i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i10, i11);
        this.F = qVar;
        qVar.setInputMethodMode(1);
    }
}
