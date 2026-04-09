package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import b9.m;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class jh2 {

    /* renamed from: a, reason: collision with root package name */
    private static final uh2 f29144a = new uh2(new mf1(), new vh2());

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29145b = 0;

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnPreDrawListener f29146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29147b;

        public a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f29146a = onPreDrawListener;
            this.f29147b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f29146a.onPreDraw();
            this.f29147b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public static final int a(int i, float f10) {
        float f11 = 100 - f10;
        int i10 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i11 = (int) ((KotlinVersion.MAX_COMPONENT_VALUE * f11) / 100.0f);
        if (255 > i11) {
            i10 = i11;
        }
        if (i10 <= 0) {
            i10 = 0;
        }
        return Color.argb(i10, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final float b(int i, float f10) {
        return ((i + 0.0f) / f10) + 0.5f;
    }

    public static final boolean c(View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int width = view.getWidth() + i;
        int i10 = iArr[1];
        Rect rect = new Rect(i, i10, width, view.getHeight() + i10);
        Rect rect2 = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect2);
        } catch (NullPointerException unused) {
        }
        return !((rect.bottom <= rect2.top || rect.top >= rect2.bottom) || (rect.right <= rect2.left || rect.left >= rect2.right));
    }

    public static final boolean d(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        if (view.isShown()) {
            if (!(view.getAlpha() == 0.0f)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    public static final int a(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        return com.google.gson.internal.c.y(i / context.getResources().getDisplayMetrics().density);
    }

    public static final int b(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        if (view.isShown()) {
            return f29144a.a(view);
        }
        return 0;
    }

    public static final int d(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return (int) b(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().density);
    }

    public static final void a(View view, ViewTreeObserver.OnPreDrawListener callback) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(callback, "callback");
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, callback));
    }

    public static final int b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return (int) b(c(context), context.getResources().getDisplayMetrics().density);
    }

    public static final int a(Context context, float f10) {
        kotlin.jvm.internal.l.f(context, "context");
        return com.google.gson.internal.c.y(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics()));
    }

    public static final int a(View view) {
        int iB;
        if (view == null || !view.isShown() || (iB = b(view)) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (iB * 100) / (height * width);
    }

    public static final int c(Context context) {
        Object objA;
        int iHeight;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA != null && du1VarA.K()) {
            try {
                Object systemService = context.getSystemService("window");
                kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    iHeight = displayMetrics.heightPixels;
                }
                objA = Integer.valueOf(iHeight);
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            Object objValueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
            if (objA instanceof m.a) {
                objA = objValueOf;
            }
            return ((Number) objA).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final boolean a(View view, int i) {
        return a(view) >= i;
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    kotlin.jvm.internal.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final int a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final int a(Context context, ef1 requestedOrientation) {
        ef1 ef1Var;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(requestedOrientation, "requestedOrientation");
        ef1 ef1VarB = es.b(context);
        if (ef1VarB != requestedOrientation && ef1VarB != (ef1Var = ef1.f26823e) && (requestedOrientation != ef1Var || ef1VarB == ef1.f26821c)) {
            return d(context);
        }
        return b(context);
    }
}
