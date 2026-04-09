package defpackage;

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
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class i70 implements uv0 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final r6 E;
    public final Context f;
    public ListAdapter g;
    public kq h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public al s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final f70 w = new f70(this, 1);
    public final h70 x = new h70(0, this);
    public final g70 y = new g70(this);
    public final f70 z = new f70(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public i70(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hn0.o, i, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        r6 r6Var = new r6(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, hn0.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            jl0.c(r6Var, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        r6Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : ob1.h(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.E = r6Var;
        r6Var.setInputMethodMode(1);
    }

    @Override // defpackage.uv0
    public final boolean a() {
        return this.E.isShowing();
    }

    public final int b() {
        return this.k;
    }

    @Override // defpackage.uv0
    public final void c() {
        int i;
        int paddingBottom;
        kq kqVar;
        kq kqVar2 = this.h;
        Context context = this.f;
        r6 r6Var = this.E;
        if (kqVar2 == null) {
            kq kqVarQ = q(context, !this.D);
            this.h = kqVarQ;
            kqVarQ.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new lq(1, this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            r6Var.setContentView(this.h);
        }
        Drawable background = r6Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.n) {
                this.l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = d70.a(r6Var, this.t, this.l, r6Var.getInputMethodMode() == 2);
        int i3 = this.i;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.j;
            int iA2 = this.h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = r6Var.getInputMethodMode() == 2;
        jl0.d(r6Var, this.m);
        if (r6Var.isShowing()) {
            if (this.t.isAttachedToWindow()) {
                int width = this.j;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        r6Var.setWidth(this.j == -1 ? -1 : 0);
                        r6Var.setHeight(0);
                    } else {
                        r6Var.setWidth(this.j == -1 ? -1 : 0);
                        r6Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                r6Var.setOutsideTouchable(true);
                int i5 = width;
                View view = this.t;
                int i6 = this.k;
                int i7 = this.l;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                r6Var.update(view, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.j;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        r6Var.setWidth(width2);
        r6Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(r6Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            e70.b(r6Var, true);
        }
        r6Var.setOutsideTouchable(true);
        r6Var.setTouchInterceptor(this.x);
        if (this.p) {
            jl0.c(r6Var, this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(r6Var, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            e70.a(r6Var, this.C);
        }
        r6Var.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (kqVar = this.h) != null) {
            kqVar.setListSelectionHidden(true);
            kqVar.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    public final Drawable d() {
        return this.E.getBackground();
    }

    @Override // defpackage.uv0
    public final void dismiss() {
        r6 r6Var = this.E;
        r6Var.dismiss();
        r6Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    public final void f(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.l = i;
        this.n = true;
    }

    @Override // defpackage.uv0
    public final kq h() {
        return this.h;
    }

    public final void k(int i) {
        this.k = i;
    }

    public final int n() {
        if (this.n) {
            return this.l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        al alVar = this.s;
        if (alVar == null) {
            this.s = new al(1, this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(alVar);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        kq kqVar = this.h;
        if (kqVar != null) {
            kqVar.setAdapter(this.g);
        }
    }

    public kq q(Context context, boolean z) {
        return new kq(context, z);
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.j = rect.left + rect.right + i;
    }
}
