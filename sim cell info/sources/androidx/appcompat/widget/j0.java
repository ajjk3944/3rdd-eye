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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j0 implements g.e {
    private static Method I;
    private static Method J;
    private static Method K;
    private final e A;
    private final c B;
    private Runnable C;
    final Handler D;
    private final Rect E;
    private Rect F;
    private boolean G;
    PopupWindow H;

    /* renamed from: b, reason: collision with root package name */
    private Context f1000b;

    /* renamed from: c, reason: collision with root package name */
    private ListAdapter f1001c;

    /* renamed from: d, reason: collision with root package name */
    f0 f1002d;

    /* renamed from: e, reason: collision with root package name */
    private int f1003e;

    /* renamed from: f, reason: collision with root package name */
    private int f1004f;

    /* renamed from: g, reason: collision with root package name */
    private int f1005g;

    /* renamed from: h, reason: collision with root package name */
    private int f1006h;

    /* renamed from: i, reason: collision with root package name */
    private int f1007i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1008j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1009k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1010l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1011m;

    /* renamed from: n, reason: collision with root package name */
    private int f1012n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1013o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1014p;

    /* renamed from: q, reason: collision with root package name */
    int f1015q;

    /* renamed from: r, reason: collision with root package name */
    private View f1016r;

    /* renamed from: s, reason: collision with root package name */
    private int f1017s;

    /* renamed from: t, reason: collision with root package name */
    private DataSetObserver f1018t;

    /* renamed from: u, reason: collision with root package name */
    private View f1019u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f1020v;

    /* renamed from: w, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1021w;

    /* renamed from: x, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1022x;

    /* renamed from: y, reason: collision with root package name */
    final g f1023y;

    /* renamed from: z, reason: collision with root package name */
    private final f f1024z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = j0.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            j0.this.i();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            f0 f0Var;
            if (i2 == -1 || (f0Var = j0.this.f1002d) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.r();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.a()) {
                j0.this.i();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || j0.this.w() || j0.this.H.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.D.removeCallbacks(j0Var.f1023y);
            j0.this.f1023y.run();
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.H) != null && popupWindow.isShowing() && x2 >= 0 && x2 < j0.this.H.getWidth() && y2 >= 0 && y2 < j0.this.H.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.D.postDelayed(j0Var.f1023y, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            j0 j0Var2 = j0.this;
            j0Var2.D.removeCallbacks(j0Var2.f1023y);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f1002d;
            if (f0Var == null || !a0.s.C(f0Var) || j0.this.f1002d.getCount() <= j0.this.f1002d.getChildCount()) {
                return;
            }
            int childCount = j0.this.f1002d.getChildCount();
            j0 j0Var = j0.this;
            if (childCount <= j0Var.f1015q) {
                j0Var.H.setInputMethodMode(2);
                j0.this.i();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                J = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1003e = -2;
        this.f1004f = -2;
        this.f1007i = 1002;
        this.f1009k = true;
        this.f1012n = 0;
        this.f1013o = false;
        this.f1014p = false;
        this.f1015q = Integer.MAX_VALUE;
        this.f1017s = 0;
        this.f1023y = new g();
        this.f1024z = new f();
        this.A = new e();
        this.B = new c();
        this.E = new Rect();
        this.f1000b = context;
        this.D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.o1, i2, i3);
        this.f1005g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.j.p1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.j.q1, 0);
        this.f1006h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1008j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.H = qVar;
        qVar.setInputMethodMode(1);
    }

    private void J(boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.H.setIsClippedToScreen(z2);
            return;
        }
        Method method = I;
        if (method != null) {
            try {
                method.invoke(this.H, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[PHI: r1
  0x012b: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0120, B:47:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.q():int");
    }

    private int u(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.H.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = J;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.H, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.H.getMaxAvailableHeight(view, i2);
    }

    private void y() {
        View view = this.f1016r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1016r);
            }
        }
    }

    public void A(int i2) {
        this.H.setAnimationStyle(i2);
    }

    public void B(int i2) {
        Drawable background = this.H.getBackground();
        if (background == null) {
            M(i2);
            return;
        }
        background.getPadding(this.E);
        Rect rect = this.E;
        this.f1004f = rect.left + rect.right + i2;
    }

    public void C(int i2) {
        this.f1012n = i2;
    }

    public void D(Rect rect) {
        this.F = rect != null ? new Rect(rect) : null;
    }

    public void E(int i2) {
        this.H.setInputMethodMode(i2);
    }

    public void F(boolean z2) {
        this.G = z2;
        this.H.setFocusable(z2);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.H.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1021w = onItemClickListener;
    }

    public void I(boolean z2) {
        this.f1011m = true;
        this.f1010l = z2;
    }

    public void K(int i2) {
        this.f1017s = i2;
    }

    public void L(int i2) {
        f0 f0Var = this.f1002d;
        if (!a() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i2);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i2, true);
        }
    }

    public void M(int i2) {
        this.f1004f = i2;
    }

    @Override // g.e
    public boolean a() {
        return this.H.isShowing();
    }

    public void c(int i2) {
        this.f1005g = i2;
    }

    public int d() {
        return this.f1005g;
    }

    @Override // g.e
    public void dismiss() {
        this.H.dismiss();
        y();
        this.H.setContentView(null);
        this.f1002d = null;
        this.D.removeCallbacks(this.f1023y);
    }

    @Override // g.e
    public ListView e() {
        return this.f1002d;
    }

    @Override // g.e
    public void i() {
        int iQ = q();
        boolean zW = w();
        androidx.core.widget.h.b(this.H, this.f1007i);
        if (this.H.isShowing()) {
            if (a0.s.C(t())) {
                int width = this.f1004f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i2 = this.f1003e;
                if (i2 == -1) {
                    if (!zW) {
                        iQ = -1;
                    }
                    if (zW) {
                        this.H.setWidth(this.f1004f == -1 ? -1 : 0);
                        this.H.setHeight(0);
                    } else {
                        this.H.setWidth(this.f1004f == -1 ? -1 : 0);
                        this.H.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iQ = i2;
                }
                this.H.setOutsideTouchable((this.f1014p || this.f1013o) ? false : true);
                this.H.update(t(), this.f1005g, this.f1006h, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f1004f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i3 = this.f1003e;
        if (i3 == -1) {
            iQ = -1;
        } else if (i3 != -2) {
            iQ = i3;
        }
        this.H.setWidth(width2);
        this.H.setHeight(iQ);
        J(true);
        this.H.setOutsideTouchable((this.f1014p || this.f1013o) ? false : true);
        this.H.setTouchInterceptor(this.f1024z);
        if (this.f1011m) {
            androidx.core.widget.h.a(this.H, this.f1010l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(this.H, this.F);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.H.setEpicenterBounds(this.F);
        }
        androidx.core.widget.h.c(this.H, t(), this.f1005g, this.f1006h, this.f1012n);
        this.f1002d.setSelection(-1);
        if (!this.G || this.f1002d.isInTouchMode()) {
            r();
        }
        if (this.G) {
            return;
        }
        this.D.post(this.B);
    }

    public int j() {
        if (this.f1008j) {
            return this.f1006h;
        }
        return 0;
    }

    public void l(Drawable drawable) {
        this.H.setBackgroundDrawable(drawable);
    }

    public void m(int i2) {
        this.f1006h = i2;
        this.f1008j = true;
    }

    public Drawable n() {
        return this.H.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1018t;
        if (dataSetObserver == null) {
            this.f1018t = new d();
        } else {
            ListAdapter listAdapter2 = this.f1001c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1001c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1018t);
        }
        f0 f0Var = this.f1002d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1001c);
        }
    }

    public void r() {
        f0 f0Var = this.f1002d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    f0 s(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public View t() {
        return this.f1019u;
    }

    public int v() {
        return this.f1004f;
    }

    public boolean w() {
        return this.H.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.G;
    }

    public void z(View view) {
        this.f1019u = view;
    }
}
