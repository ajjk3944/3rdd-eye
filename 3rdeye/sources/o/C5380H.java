package o;

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
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import g.C4353a;
import java.lang.reflect.Method;
import n.InterfaceC5344f;

/* compiled from: ListPopupWindow.java */
/* renamed from: o.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5380H implements InterfaceC5344f {

    /* renamed from: B, reason: collision with root package name */
    public static final Method f44528B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f44529C;

    /* renamed from: D, reason: collision with root package name */
    public static final Method f44530D;

    /* renamed from: A, reason: collision with root package name */
    public final C5396n f44531A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f44532b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f44533c;

    /* renamed from: d, reason: collision with root package name */
    public C5376D f44534d;

    /* renamed from: g, reason: collision with root package name */
    public int f44537g;

    /* renamed from: h, reason: collision with root package name */
    public int f44538h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44539j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44540k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f44541l;

    /* renamed from: o, reason: collision with root package name */
    public d f44544o;

    /* renamed from: p, reason: collision with root package name */
    public View f44545p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f44546q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f44547r;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f44552w;

    /* renamed from: y, reason: collision with root package name */
    public Rect f44554y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f44555z;

    /* renamed from: e, reason: collision with root package name */
    public final int f44535e = -2;

    /* renamed from: f, reason: collision with root package name */
    public int f44536f = -2;
    public final int i = 1002;

    /* renamed from: m, reason: collision with root package name */
    public int f44542m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final int f44543n = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public final g f44548s = new g();

    /* renamed from: t, reason: collision with root package name */
    public final f f44549t = new f();

    /* renamed from: u, reason: collision with root package name */
    public final e f44550u = new e();

    /* renamed from: v, reason: collision with root package name */
    public final c f44551v = new c();

    /* renamed from: x, reason: collision with root package name */
    public final Rect f44553x = new Rect();

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$a */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i, z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$b */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5376D c5376d = C5380H.this.f44534d;
            if (c5376d != null) {
                c5376d.setListSelectionHidden(true);
                c5376d.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C5380H c5380h = C5380H.this;
            if (c5380h.f44531A.isShowing()) {
                c5380h.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C5380H.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C5396n c5396n;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            C5380H c5380h = C5380H.this;
            if (action == 0 && (c5396n = c5380h.f44531A) != null && c5396n.isShowing() && x10 >= 0 && x10 < c5380h.f44531A.getWidth() && y10 >= 0 && y10 < c5380h.f44531A.getHeight()) {
                c5380h.f44552w.postDelayed(c5380h.f44548s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            c5380h.f44552w.removeCallbacks(c5380h.f44548s);
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5380H c5380h = C5380H.this;
            C5376D c5376d = c5380h.f44534d;
            if (c5376d == null || !c5376d.isAttachedToWindow() || c5380h.f44534d.getCount() <= c5380h.f44534d.getChildCount() || c5380h.f44534d.getChildCount() > c5380h.f44543n) {
                return;
            }
            c5380h.f44531A.setInputMethodMode(2);
            c5380h.show();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f44528B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f44530D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f44529C = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C5380H(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f44532b = context;
        this.f44552w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4353a.f37889o, i, 0);
        this.f44537g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f44538h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f44539j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C5396n c5396n = new C5396n(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C4353a.f37893s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            R0.g.c(c5396n, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c5396n.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : A9.I.w(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f44531A = c5396n;
        c5396n.setInputMethodMode(1);
    }

    @Override // n.InterfaceC5344f
    public final boolean a() {
        return this.f44531A.isShowing();
    }

    public final Drawable b() {
        return this.f44531A.getBackground();
    }

    public final int c() {
        return this.f44537g;
    }

    @Override // n.InterfaceC5344f
    public final void dismiss() {
        C5396n c5396n = this.f44531A;
        c5396n.dismiss();
        c5396n.setContentView(null);
        this.f44534d = null;
        this.f44552w.removeCallbacks(this.f44548s);
    }

    public final void e(int i) {
        this.f44537g = i;
    }

    @Override // n.InterfaceC5344f
    public final C5376D h() {
        return this.f44534d;
    }

    public final void i(Drawable drawable) {
        this.f44531A.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.f44538h = i;
        this.f44539j = true;
    }

    public final int m() {
        if (this.f44539j) {
            return this.f44538h;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        d dVar = this.f44544o;
        if (dVar == null) {
            this.f44544o = new d();
        } else {
            ListAdapter listAdapter2 = this.f44533c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f44533c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f44544o);
        }
        C5376D c5376d = this.f44534d;
        if (c5376d != null) {
            c5376d.setAdapter(this.f44533c);
        }
    }

    public C5376D p(Context context, boolean z10) {
        return new C5376D(context, z10);
    }

    public final void q(int i) {
        Drawable background = this.f44531A.getBackground();
        if (background == null) {
            this.f44536f = i;
            return;
        }
        Rect rect = this.f44553x;
        background.getPadding(rect);
        this.f44536f = rect.left + rect.right + i;
    }

    @Override // n.InterfaceC5344f
    public void show() {
        int i;
        int iA;
        int paddingBottom;
        C5376D c5376d;
        C5376D c5376d2 = this.f44534d;
        C5396n c5396n = this.f44531A;
        Context context = this.f44532b;
        if (c5376d2 == null) {
            C5376D c5376dP = p(context, !this.f44555z);
            this.f44534d = c5376dP;
            c5376dP.setAdapter(this.f44533c);
            this.f44534d.setOnItemClickListener(this.f44546q);
            this.f44534d.setFocusable(true);
            this.f44534d.setFocusableInTouchMode(true);
            this.f44534d.setOnItemSelectedListener(new C5379G(this));
            this.f44534d.setOnScrollListener(this.f44550u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f44547r;
            if (onItemSelectedListener != null) {
                this.f44534d.setOnItemSelectedListener(onItemSelectedListener);
            }
            c5396n.setContentView(this.f44534d);
        }
        Drawable background = c5396n.getBackground();
        Rect rect = this.f44553x;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i = rect.bottom + i10;
            if (!this.f44539j) {
                this.f44538h = -i10;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z10 = c5396n.getInputMethodMode() == 2;
        View view = this.f44545p;
        int i11 = this.f44538h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f44529C;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c5396n, view, Integer.valueOf(i11), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = c5396n.getMaxAvailableHeight(view, i11);
            }
        } else {
            iA = a.a(c5396n, view, i11, z10);
        }
        int i12 = this.f44535e;
        if (i12 == -1) {
            paddingBottom = iA + i;
        } else {
            int i13 = this.f44536f;
            int iA2 = this.f44534d.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), RecyclerView.UNDEFINED_DURATION), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f44534d.getPaddingBottom() + this.f44534d.getPaddingTop() + i : 0);
        }
        boolean z11 = this.f44531A.getInputMethodMode() == 2;
        R0.g.d(c5396n, this.i);
        if (c5396n.isShowing()) {
            if (this.f44545p.isAttachedToWindow()) {
                int width = this.f44536f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f44545p.getWidth();
                }
                if (i12 == -1) {
                    i12 = z11 ? paddingBottom : -1;
                    if (z11) {
                        c5396n.setWidth(this.f44536f == -1 ? -1 : 0);
                        c5396n.setHeight(0);
                    } else {
                        c5396n.setWidth(this.f44536f == -1 ? -1 : 0);
                        c5396n.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                c5396n.setOutsideTouchable(true);
                int i14 = width;
                View view2 = this.f44545p;
                int i15 = this.f44537g;
                int i16 = this.f44538h;
                if (i14 < 0) {
                    i14 = -1;
                }
                c5396n.update(view2, i15, i16, i14, i12 < 0 ? -1 : i12);
                return;
            }
            return;
        }
        int width2 = this.f44536f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f44545p.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        c5396n.setWidth(width2);
        c5396n.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f44528B;
            if (method2 != null) {
                try {
                    method2.invoke(c5396n, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(c5396n, true);
        }
        c5396n.setOutsideTouchable(true);
        c5396n.setTouchInterceptor(this.f44549t);
        if (this.f44541l) {
            R0.g.c(c5396n, this.f44540k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f44530D;
            if (method3 != null) {
                try {
                    method3.invoke(c5396n, this.f44554y);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            b.a(c5396n, this.f44554y);
        }
        c5396n.showAsDropDown(this.f44545p, this.f44537g, this.f44538h, this.f44542m);
        this.f44534d.setSelection(-1);
        if ((!this.f44555z || this.f44534d.isInTouchMode()) && (c5376d = this.f44534d) != null) {
            c5376d.setListSelectionHidden(true);
            c5376d.requestLayout();
        }
        if (this.f44555z) {
            return;
        }
        this.f44552w.post(this.f44551v);
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: o.H$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                C5380H c5380h = C5380H.this;
                if (c5380h.f44531A.getInputMethodMode() == 2 || c5380h.f44531A.getContentView() == null) {
                    return;
                }
                Handler handler = c5380h.f44552w;
                g gVar = c5380h.f44548s;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i10, int i11) {
        }
    }
}
