package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ub extends pb {
    public final Boolean a;
    public final o91 b;
    public Window c;
    public boolean d;

    public ub(View view, o91 o91Var) {
        this.b = o91Var;
        nc0 nc0Var = BottomSheetBehavior.B(view).i;
        ColorStateList backgroundTintList = nc0Var != null ? nc0Var.g.d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(i41.m(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListJ = qb1.j(view.getBackground());
        Integer numValueOf = colorStateListJ != null ? Integer.valueOf(colorStateListJ.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(i41.m(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.pb
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.pb
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.pb
    public final void c(View view, int i) {
        d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(View view) {
        p91 p91Var;
        p91 p91Var2;
        int top = view.getTop();
        o91 o91Var = this.b;
        if (top < o91Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                ts0 ts0Var = new ts0(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    q91 q91Var = new q91(window.getInsetsController(), ts0Var);
                    q91Var.r = window;
                    p91Var2 = q91Var;
                } else {
                    p91Var2 = new p91(window, ts0Var);
                }
                p91Var2.v(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), o91Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                ts0 ts0Var2 = new ts0(window2.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    q91 q91Var2 = new q91(window2.getInsetsController(), ts0Var2);
                    q91Var2.r = window2;
                    p91Var = q91Var2;
                } else {
                    p91Var = new p91(window2, ts0Var2);
                }
                p91Var.v(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Window window) {
        p91 p91Var;
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            ts0 ts0Var = new ts0(window.getDecorView());
            if (Build.VERSION.SDK_INT >= 30) {
                q91 q91Var = new q91(window.getInsetsController(), ts0Var);
                q91Var.r = window;
                p91Var = q91Var;
            } else {
                p91Var = new p91(window, ts0Var);
            }
            this.d = p91Var.n();
        }
    }
}
