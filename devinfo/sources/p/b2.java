package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b2 implements o.c0 {
    public static final Method A;
    public static final Method B;
    public static final Method C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f30631a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f30632b;

    /* renamed from: c, reason: collision with root package name */
    public p1 f30633c;

    /* renamed from: f, reason: collision with root package name */
    public int f30636f;
    public int g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30638i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30639k;

    /* renamed from: n, reason: collision with root package name */
    public jd.e f30642n;

    /* renamed from: o, reason: collision with root package name */
    public View f30643o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f30644p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f30645q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f30650v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f30652x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30653y;

    /* renamed from: z, reason: collision with root package name */
    public final y f30654z;

    /* renamed from: d, reason: collision with root package name */
    public final int f30634d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f30635e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f30637h = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;

    /* renamed from: l, reason: collision with root package name */
    public int f30640l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f30641m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final y1 f30646r = new y1(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final a2 f30647s = new a2(this);

    /* renamed from: t, reason: collision with root package name */
    public final z1 f30648t = new z1(this);

    /* renamed from: u, reason: collision with root package name */
    public final y1 f30649u = new y1(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f30651w = new Rect();

    static {
        int i4 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i4 <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public b2(Context context, AttributeSet attributeSet, int i4, int i10) {
        int resourceId;
        this.f30631a = context;
        this.f30650v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f24788o, i4, 0);
        this.f30636f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f30638i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i4, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f24792s, i4, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            yVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : jm.a.l(resourceId, context));
        typedArrayObtainStyledAttributes2.recycle();
        this.f30654z = yVar;
        yVar.setInputMethodMode(1);
    }

    @Override // o.c0
    public final boolean a() {
        return this.f30654z.isShowing();
    }

    public final int b() {
        return this.f30636f;
    }

    public final void c(int i4) {
        this.f30636f = i4;
    }

    @Override // o.c0
    public final void dismiss() {
        y yVar = this.f30654z;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f30633c = null;
        this.f30650v.removeCallbacks(this.f30646r);
    }

    public final Drawable f() {
        return this.f30654z.getBackground();
    }

    @Override // o.c0
    public final p1 h() {
        return this.f30633c;
    }

    public final void j(Drawable drawable) {
        this.f30654z.setBackgroundDrawable(drawable);
    }

    public final void k(int i4) {
        this.g = i4;
        this.f30638i = true;
    }

    public final int n() {
        if (this.f30638i) {
            return this.g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        jd.e eVar = this.f30642n;
        if (eVar == null) {
            this.f30642n = new jd.e(3, this);
        } else {
            ListAdapter listAdapter2 = this.f30632b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(eVar);
            }
        }
        this.f30632b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f30642n);
        }
        p1 p1Var = this.f30633c;
        if (p1Var != null) {
            p1Var.setAdapter(this.f30632b);
        }
    }

    public p1 p(Context context, boolean z3) {
        return new p1(context, z3);
    }

    public final void q(int i4) {
        Drawable background = this.f30654z.getBackground();
        if (background == null) {
            this.f30635e = i4;
            return;
        }
        Rect rect = this.f30651w;
        background.getPadding(rect);
        this.f30635e = rect.left + rect.right + i4;
    }

    @Override // o.c0
    public final void show() {
        int i4;
        int iA;
        int paddingBottom;
        p1 p1Var;
        p1 p1Var2 = this.f30633c;
        Context context = this.f30631a;
        y yVar = this.f30654z;
        if (p1Var2 == null) {
            p1 p1VarP = p(context, !this.f30653y);
            this.f30633c = p1VarP;
            p1VarP.setAdapter(this.f30632b);
            this.f30633c.setOnItemClickListener(this.f30644p);
            this.f30633c.setFocusable(true);
            this.f30633c.setFocusableInTouchMode(true);
            this.f30633c.setOnItemSelectedListener(new v1(i, this));
            this.f30633c.setOnScrollListener(this.f30648t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f30645q;
            if (onItemSelectedListener != null) {
                this.f30633c.setOnItemSelectedListener(onItemSelectedListener);
            }
            yVar.setContentView(this.f30633c);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.f30651w;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i4 = rect.bottom + i10;
            if (!this.f30638i) {
                this.g = -i10;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        boolean z3 = yVar.getInputMethodMode() == 2;
        View view = this.f30643o;
        int i11 = this.g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(yVar, view, Integer.valueOf(i11), Boolean.valueOf(z3))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = yVar.getMaxAvailableHeight(view, i11);
            }
        } else {
            iA = w1.a(yVar, view, i11, z3);
        }
        int i12 = this.f30634d;
        if (i12 == -1) {
            paddingBottom = iA + i4;
        } else {
            int i13 = this.f30635e;
            int iA2 = this.f30633c.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), LinearLayoutManager.INVALID_OFFSET), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f30633c.getPaddingBottom() + this.f30633c.getPaddingTop() + i4 : 0);
        }
        boolean z10 = yVar.getInputMethodMode() == 2;
        yVar.setWindowLayoutType(this.f30637h);
        if (yVar.isShowing()) {
            if (this.f30643o.isAttachedToWindow()) {
                int width = this.f30635e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f30643o.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        yVar.setWidth(this.f30635e == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.f30635e == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                View view2 = this.f30643o;
                int i14 = width;
                int i15 = this.f30636f;
                int i16 = this.g;
                int i17 = i14 < 0 ? -1 : i14;
                if (i12 < 0) {
                    i12 = -1;
                }
                yVar.update(view2, i15, i16, i17, i12);
                return;
            }
            return;
        }
        int width2 = this.f30635e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f30643o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        yVar.setWidth(width2);
        yVar.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            x1.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.f30647s);
        if (this.f30639k) {
            yVar.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.f30652x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            x1.a(yVar, this.f30652x);
        }
        yVar.showAsDropDown(this.f30643o, this.f30636f, this.g, this.f30640l);
        this.f30633c.setSelection(-1);
        if ((!this.f30653y || this.f30633c.isInTouchMode()) && (p1Var = this.f30633c) != null) {
            p1Var.setListSelectionHidden(true);
            p1Var.requestLayout();
        }
        if (this.f30653y) {
            return;
        }
        this.f30650v.post(this.f30649u);
    }
}
