package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;
import androidx.core.view.t2;

/* loaded from: classes2.dex */
public abstract class d0 {

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10688a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10689b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10690c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f10691d;

        public a(boolean z10, boolean z11, boolean z12, d dVar) {
            this.f10688a = z10;
            this.f10689b = z11;
            this.f10690c = z12;
            this.f10691d = dVar;
        }

        @Override // com.google.android.material.internal.d0.d
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, e eVar) {
            if (this.f10688a) {
                eVar.f10697d += windowInsetsCompat.i();
            }
            boolean zL = d0.l(view);
            if (this.f10689b) {
                if (zL) {
                    eVar.f10696c += windowInsetsCompat.j();
                } else {
                    eVar.f10694a += windowInsetsCompat.j();
                }
            }
            if (this.f10690c) {
                if (zL) {
                    eVar.f10694a += windowInsetsCompat.k();
                } else {
                    eVar.f10696c += windowInsetsCompat.k();
                }
            }
            eVar.a(view);
            d dVar = this.f10691d;
            return dVar != null ? dVar.a(view, windowInsetsCompat, eVar) : windowInsetsCompat;
        }
    }

    public class b implements g0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f10692a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f10693b;

        public b(d dVar, e eVar) {
            this.f10692a = dVar;
            this.f10693b = eVar;
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f10692a.a(view, windowInsetsCompat, new e(this.f10693b));
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, e eVar);
    }

    public static Rect b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, view2.getWidth() + i12, view2.getHeight() + i13);
    }

    public static Rect c(View view) {
        return d(view, 0);
    }

    public static Rect d(View view, int i10) {
        return new Rect(view.getLeft(), view.getTop() + i10, view.getRight(), view.getBottom() + i10);
    }

    public static void e(View view, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, j4.l.Insets, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(j4.l.Insets_paddingBottomSystemWindowInsets, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(j4.l.Insets_paddingLeftSystemWindowInsets, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(j4.l.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        f(view, new a(z10, z11, z12, dVar));
    }

    public static void f(View view, d dVar) {
        ViewCompat.t0(view, new b(dVar, new e(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        n(view);
    }

    public static float g(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer h(View view) {
        ColorStateList colorStateListF = w4.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    public static InputMethodManager i(View view) {
        return (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static float j(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static void k(View view, boolean z10) {
        t2 t2VarJ;
        if (z10 && (t2VarJ = ViewCompat.J(view)) != null) {
            t2VarJ.a(WindowInsetsCompat.Type.b());
            return;
        }
        InputMethodManager inputMethodManagerI = i(view);
        if (inputMethodManagerI != null) {
            inputMethodManagerI.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean l(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode m(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void n(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void o(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.p(view, z10);
            }
        });
    }

    public static void p(View view, boolean z10) {
        t2 t2VarJ;
        if (!z10 || (t2VarJ = ViewCompat.J(view)) == null) {
            i(view).showSoftInput(view, 1);
        } else {
            t2VarJ.e(WindowInsetsCompat.Type.b());
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f10694a;

        /* renamed from: b, reason: collision with root package name */
        public int f10695b;

        /* renamed from: c, reason: collision with root package name */
        public int f10696c;

        /* renamed from: d, reason: collision with root package name */
        public int f10697d;

        public e(int i10, int i11, int i12, int i13) {
            this.f10694a = i10;
            this.f10695b = i11;
            this.f10696c = i12;
            this.f10697d = i13;
        }

        public void a(View view) {
            view.setPaddingRelative(this.f10694a, this.f10695b, this.f10696c, this.f10697d);
        }

        public e(e eVar) {
            this.f10694a = eVar.f10694a;
            this.f10695b = eVar.f10695b;
            this.f10696c = eVar.f10696c;
            this.f10697d = eVar.f10697d;
        }
    }
}
