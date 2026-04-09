package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t1 implements o.c0 {
    public static final Method W;
    public static final Method X;
    public int B;
    public boolean E;
    public boolean F;
    public boolean G;
    public ie.e J;
    public View K;
    public AdapterView.OnItemClickListener L;
    public AdapterView.OnItemSelectedListener M;
    public final Handler R;
    public Rect T;
    public boolean U;
    public final v V;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20171a;

    /* renamed from: d, reason: collision with root package name */
    public ListAdapter f20172d;

    /* renamed from: g, reason: collision with root package name */
    public i1 f20173g;

    /* renamed from: y, reason: collision with root package name */
    public int f20176y;

    /* renamed from: r, reason: collision with root package name */
    public final int f20174r = -2;

    /* renamed from: x, reason: collision with root package name */
    public int f20175x = -2;
    public final int D = 1002;
    public int H = 0;
    public final int I = Integer.MAX_VALUE;
    public final q1 N = new q1(this, 1);
    public final s1 O = new s1(this);
    public final r1 P = new r1(this);
    public final q1 Q = new q1(this, 0);
    public final Rect S = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                W = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public t1(Context context, AttributeSet attributeSet, int i10, int i11) {
        int resourceId;
        this.f20171a = context;
        this.R = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.ListPopupWindow, i10, 0);
        this.f20176y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.B = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.E = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        v vVar = new v(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.j.PopupWindow, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(h.j.PopupWindow_overlapAnchor)) {
            vVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(h.j.PopupWindow_overlapAnchor, false));
        }
        int i12 = h.j.PopupWindow_android_popupBackground;
        vVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i12) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i12, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i12) : ic.a.r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.V = vVar;
        vVar.setInputMethodMode(1);
    }

    @Override // o.c0
    public final boolean a() {
        return this.V.isShowing();
    }

    public final int b() {
        return this.f20176y;
    }

    public final void d(int i10) {
        this.f20176y = i10;
    }

    @Override // o.c0
    public final void dismiss() {
        v vVar = this.V;
        vVar.dismiss();
        vVar.setContentView(null);
        this.f20173g = null;
        this.R.removeCallbacks(this.N);
    }

    public final Drawable f() {
        return this.V.getBackground();
    }

    @Override // o.c0
    public final void g() {
        int i10;
        int paddingBottom;
        i1 i1Var;
        i1 i1Var2 = this.f20173g;
        Context context = this.f20171a;
        v vVar = this.V;
        if (i1Var2 == null) {
            i1 i1VarQ = q(context, !this.U);
            this.f20173g = i1VarQ;
            i1VarQ.setAdapter(this.f20172d);
            this.f20173g.setOnItemClickListener(this.L);
            this.f20173g.setFocusable(true);
            this.f20173g.setFocusableInTouchMode(true);
            this.f20173g.setOnItemSelectedListener(new n1(this));
            this.f20173g.setOnScrollListener(this.P);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.M;
            if (onItemSelectedListener != null) {
                this.f20173g.setOnItemSelectedListener(onItemSelectedListener);
            }
            vVar.setContentView(this.f20173g);
        }
        Drawable background = vVar.getBackground();
        Rect rect = this.S;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.E) {
                this.B = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = o1.a(vVar, this.K, this.B, vVar.getInputMethodMode() == 2);
        int i12 = this.f20174r;
        if (i12 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i13 = this.f20175x;
            int iA2 = this.f20173g.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f20173g.getPaddingBottom() + this.f20173g.getPaddingTop() + i10 : 0);
        }
        boolean z10 = vVar.getInputMethodMode() == 2;
        vVar.setWindowLayoutType(this.D);
        if (vVar.isShowing()) {
            if (this.K.isAttachedToWindow()) {
                int width = this.f20175x;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.K.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        vVar.setWidth(this.f20175x == -1 ? -1 : 0);
                        vVar.setHeight(0);
                    } else {
                        vVar.setWidth(this.f20175x == -1 ? -1 : 0);
                        vVar.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                vVar.setOutsideTouchable(true);
                int i14 = width;
                View view = this.K;
                int i15 = this.f20176y;
                int i16 = this.B;
                int i17 = i14 < 0 ? -1 : i14;
                if (i12 < 0) {
                    i12 = -1;
                }
                vVar.update(view, i15, i16, i17, i12);
                return;
            }
            return;
        }
        int width2 = this.f20175x;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.K.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        vVar.setWidth(width2);
        vVar.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = W;
            if (method != null) {
                try {
                    method.invoke(vVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            p1.b(vVar, true);
        }
        vVar.setOutsideTouchable(true);
        vVar.setTouchInterceptor(this.O);
        if (this.G) {
            vVar.setOverlapAnchor(this.F);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = X;
            if (method2 != null) {
                try {
                    method2.invoke(vVar, this.T);
                } catch (Exception e4) {
                    io.sentry.android.core.e0.c("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            p1.a(vVar, this.T);
        }
        vVar.showAsDropDown(this.K, this.f20176y, this.B, this.H);
        this.f20173g.setSelection(-1);
        if ((!this.U || this.f20173g.isInTouchMode()) && (i1Var = this.f20173g) != null) {
            i1Var.setListSelectionHidden(true);
            i1Var.requestLayout();
        }
        if (this.U) {
            return;
        }
        this.R.post(this.Q);
    }

    @Override // o.c0
    public final i1 j() {
        return this.f20173g;
    }

    public final void k(Drawable drawable) {
        this.V.setBackgroundDrawable(drawable);
    }

    public final void l(int i10) {
        this.B = i10;
        this.E = true;
    }

    public final int o() {
        if (this.E) {
            return this.B;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        ie.e eVar = this.J;
        if (eVar == null) {
            this.J = new ie.e(1, this);
        } else {
            ListAdapter listAdapter2 = this.f20172d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(eVar);
            }
        }
        this.f20172d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.J);
        }
        i1 i1Var = this.f20173g;
        if (i1Var != null) {
            i1Var.setAdapter(this.f20172d);
        }
    }

    public i1 q(Context context, boolean z10) {
        return new i1(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.V.getBackground();
        if (background == null) {
            this.f20175x = i10;
            return;
        }
        Rect rect = this.S;
        background.getPadding(rect);
        this.f20175x = rect.left + rect.right + i10;
    }
}
