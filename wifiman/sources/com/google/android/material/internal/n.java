package com.google.android.material.internal;

import F1.C2780w0;
import F1.F;
import F1.V0;
import F1.W;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import t1.AbstractC8021a;

/* loaded from: classes3.dex */
public abstract class n {

    class a implements F {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f37607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f37608b;

        a(c cVar, d dVar) {
            this.f37607a = cVar;
            this.f37608b = dVar;
        }

        @Override // F1.F
        public C2780w0 a(View view, C2780w0 c2780w0) {
            return this.f37607a.a(view, c2780w0, new d(this.f37608b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            W.j0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        C2780w0 a(View view, C2780w0 c2780w0, d dVar);
    }

    public static void b(View view, c cVar) {
        W.y0(view, new a(cVar, new d(W.E(view), view.getPaddingTop(), W.D(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) AbstractC8021a.i(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float fU = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += W.u((View) parent);
        }
        return fU;
    }

    public static boolean g(View view) {
        return W.z(view) == 1;
    }

    public static PorterDuff.Mode i(int i10, PorterDuff.Mode mode) {
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

    public static void j(View view) {
        if (W.P(view)) {
            W.j0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                n.l(view, z10);
            }
        });
    }

    public static void l(View view, boolean z10) {
        V0 v0I;
        if (!z10 || (v0I = W.I(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            v0I.c(C2780w0.l.c());
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f37609a;

        /* renamed from: b, reason: collision with root package name */
        public int f37610b;

        /* renamed from: c, reason: collision with root package name */
        public int f37611c;

        /* renamed from: d, reason: collision with root package name */
        public int f37612d;

        public d(int i10, int i11, int i12, int i13) {
            this.f37609a = i10;
            this.f37610b = i11;
            this.f37611c = i12;
            this.f37612d = i13;
        }

        public d(d dVar) {
            this.f37609a = dVar.f37609a;
            this.f37610b = dVar.f37610b;
            this.f37611c = dVar.f37611c;
            this.f37612d = dVar.f37612d;
        }
    }
}
