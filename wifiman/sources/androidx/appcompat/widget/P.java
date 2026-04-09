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
import h.AbstractC5927a;
import h.AbstractC5936j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.InterfaceC6524e;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class P implements InterfaceC6524e {

    /* renamed from: G, reason: collision with root package name */
    private static Method f27165G;

    /* renamed from: H, reason: collision with root package name */
    private static Method f27166H;

    /* renamed from: A, reason: collision with root package name */
    private Runnable f27167A;

    /* renamed from: B, reason: collision with root package name */
    final Handler f27168B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f27169C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f27170D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f27171E;

    /* renamed from: F, reason: collision with root package name */
    PopupWindow f27172F;

    /* renamed from: a, reason: collision with root package name */
    private Context f27173a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f27174b;

    /* renamed from: c, reason: collision with root package name */
    L f27175c;

    /* renamed from: d, reason: collision with root package name */
    private int f27176d;

    /* renamed from: e, reason: collision with root package name */
    private int f27177e;

    /* renamed from: f, reason: collision with root package name */
    private int f27178f;

    /* renamed from: g, reason: collision with root package name */
    private int f27179g;

    /* renamed from: h, reason: collision with root package name */
    private int f27180h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27181i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27182j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27183k;

    /* renamed from: l, reason: collision with root package name */
    private int f27184l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27185m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27186n;

    /* renamed from: o, reason: collision with root package name */
    int f27187o;

    /* renamed from: p, reason: collision with root package name */
    private View f27188p;

    /* renamed from: q, reason: collision with root package name */
    private int f27189q;

    /* renamed from: r, reason: collision with root package name */
    private DataSetObserver f27190r;

    /* renamed from: s, reason: collision with root package name */
    private View f27191s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f27192t;

    /* renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f27193u;

    /* renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f27194v;

    /* renamed from: w, reason: collision with root package name */
    final i f27195w;

    /* renamed from: x, reason: collision with root package name */
    private final h f27196x;

    /* renamed from: y, reason: collision with root package name */
    private final g f27197y;

    /* renamed from: z, reason: collision with root package name */
    private final e f27198z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            View viewT = P.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            P.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            L l10;
            if (i10 == -1 || (l10 = P.this.f27175c) == null) {
                return;
            }
            l10.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (P.this.a()) {
                P.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            P.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (i10 != 1 || P.this.A() || P.this.f27172F.getContentView() == null) {
                return;
            }
            P p10 = P.this;
            p10.f27168B.removeCallbacks(p10.f27195w);
            P.this.f27195w.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = P.this.f27172F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < P.this.f27172F.getWidth() && y10 >= 0 && y10 < P.this.f27172F.getHeight()) {
                P p10 = P.this;
                p10.f27168B.postDelayed(p10.f27195w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            P p11 = P.this;
            p11.f27168B.removeCallbacks(p11.f27195w);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            L l10 = P.this.f27175c;
            if (l10 == null || !l10.isAttachedToWindow() || P.this.f27175c.getCount() <= P.this.f27175c.getChildCount()) {
                return;
            }
            int childCount = P.this.f27175c.getChildCount();
            P p10 = P.this;
            if (childCount <= p10.f27187o) {
                p10.f27172F.setInputMethodMode(2);
                P.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f27165G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f27166H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public P(Context context) {
        this(context, null, AbstractC5927a.f47930B);
    }

    private void C() {
        View view = this.f27188p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f27188p);
            }
        }
    }

    private void O(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f27172F, z10);
            return;
        }
        Method method = f27165G;
        if (method != null) {
            try {
                method.invoke(this.f27172F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        int i11;
        if (this.f27175c == null) {
            Context context = this.f27173a;
            this.f27167A = new a();
            L lS = s(context, !this.f27171E);
            this.f27175c = lS;
            Drawable drawable = this.f27192t;
            if (drawable != null) {
                lS.setSelector(drawable);
            }
            this.f27175c.setAdapter(this.f27174b);
            this.f27175c.setOnItemClickListener(this.f27193u);
            this.f27175c.setFocusable(true);
            this.f27175c.setFocusableInTouchMode(true);
            this.f27175c.setOnItemSelectedListener(new b());
            this.f27175c.setOnScrollListener(this.f27197y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f27194v;
            if (onItemSelectedListener != null) {
                this.f27175c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f27175c;
            View view2 = this.f27188p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f27189q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f27189q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f27177e;
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
            this.f27172F.setContentView(view);
        } else {
            View view3 = this.f27188p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f27172F.getBackground();
        if (background != null) {
            background.getPadding(this.f27169C);
            Rect rect = this.f27169C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f27181i) {
                this.f27179g = -i14;
            }
        } else {
            this.f27169C.setEmpty();
            i10 = 0;
        }
        int iU = u(t(), this.f27179g, this.f27172F.getInputMethodMode() == 2);
        if (this.f27185m || this.f27176d == -1) {
            return iU + i10;
        }
        int i15 = this.f27177e;
        if (i15 == -2) {
            int i16 = this.f27173a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f27169C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), PduHandle.NONE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f27173a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f27169C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f27175c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f27175c.getPaddingTop() + this.f27175c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f27172F, view, i10, z10);
    }

    public boolean A() {
        return this.f27172F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f27171E;
    }

    public void D(View view) {
        this.f27191s = view;
    }

    public void E(int i10) {
        this.f27172F.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f27172F.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.f27169C);
        Rect rect = this.f27169C;
        this.f27177e = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f27184l = i10;
    }

    public void H(Rect rect) {
        this.f27170D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f27172F.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f27171E = z10;
        this.f27172F.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f27172F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f27193u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f27194v = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f27183k = true;
        this.f27182j = z10;
    }

    public void P(int i10) {
        this.f27189q = i10;
    }

    public void Q(int i10) {
        L l10 = this.f27175c;
        if (!a() || l10 == null) {
            return;
        }
        l10.setListSelectionHidden(false);
        l10.setSelection(i10);
        if (l10.getChoiceMode() != 0) {
            l10.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f27177e = i10;
    }

    @Override // l.InterfaceC6524e
    public boolean a() {
        return this.f27172F.isShowing();
    }

    @Override // l.InterfaceC6524e
    public void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.g.b(this.f27172F, this.f27180h);
        if (this.f27172F.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f27177e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f27176d;
                if (i10 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f27172F.setWidth(this.f27177e == -1 ? -1 : 0);
                        this.f27172F.setHeight(0);
                    } else {
                        this.f27172F.setWidth(this.f27177e == -1 ? -1 : 0);
                        this.f27172F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.f27172F.setOutsideTouchable((this.f27186n || this.f27185m) ? false : true);
                this.f27172F.update(t(), this.f27178f, this.f27179g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f27177e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f27176d;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.f27172F.setWidth(width2);
        this.f27172F.setHeight(iQ);
        O(true);
        this.f27172F.setOutsideTouchable((this.f27186n || this.f27185m) ? false : true);
        this.f27172F.setTouchInterceptor(this.f27196x);
        if (this.f27183k) {
            androidx.core.widget.g.a(this.f27172F, this.f27182j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f27166H;
            if (method != null) {
                try {
                    method.invoke(this.f27172F, this.f27170D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f27172F, this.f27170D);
        }
        androidx.core.widget.g.c(this.f27172F, t(), this.f27178f, this.f27179g, this.f27184l);
        this.f27175c.setSelection(-1);
        if (!this.f27171E || this.f27175c.isInTouchMode()) {
            r();
        }
        if (this.f27171E) {
            return;
        }
        this.f27168B.post(this.f27198z);
    }

    public int c() {
        return this.f27178f;
    }

    @Override // l.InterfaceC6524e
    public void dismiss() {
        this.f27172F.dismiss();
        C();
        this.f27172F.setContentView(null);
        this.f27175c = null;
        this.f27168B.removeCallbacks(this.f27195w);
    }

    public void e(int i10) {
        this.f27178f = i10;
    }

    public Drawable h() {
        return this.f27172F.getBackground();
    }

    @Override // l.InterfaceC6524e
    public ListView j() {
        return this.f27175c;
    }

    public void k(Drawable drawable) {
        this.f27172F.setBackgroundDrawable(drawable);
    }

    public void l(int i10) {
        this.f27179g = i10;
        this.f27181i = true;
    }

    public int o() {
        if (this.f27181i) {
            return this.f27179g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f27190r;
        if (dataSetObserver == null) {
            this.f27190r = new f();
        } else {
            ListAdapter listAdapter2 = this.f27174b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f27174b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f27190r);
        }
        L l10 = this.f27175c;
        if (l10 != null) {
            l10.setAdapter(this.f27174b);
        }
    }

    public void r() {
        L l10 = this.f27175c;
        if (l10 != null) {
            l10.setListSelectionHidden(true);
            l10.requestLayout();
        }
    }

    L s(Context context, boolean z10) {
        return new L(context, z10);
    }

    public View t() {
        return this.f27191s;
    }

    public Object v() {
        if (a()) {
            return this.f27175c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f27175c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f27175c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f27175c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f27177e;
    }

    public P(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public P(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f27176d = -2;
        this.f27177e = -2;
        this.f27180h = 1002;
        this.f27184l = 0;
        this.f27185m = false;
        this.f27186n = false;
        this.f27187o = MPv3.MAX_MESSAGE_ID;
        this.f27189q = 0;
        this.f27195w = new i();
        this.f27196x = new h();
        this.f27197y = new g();
        this.f27198z = new e();
        this.f27169C = new Rect();
        this.f27173a = context;
        this.f27168B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5936j.f48246l1, i10, i11);
        this.f27178f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5936j.f48251m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5936j.f48255n1, 0);
        this.f27179g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f27181i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C3894t c3894t = new C3894t(context, attributeSet, i10, i11);
        this.f27172F = c3894t;
        c3894t.setInputMethodMode(1);
    }
}
