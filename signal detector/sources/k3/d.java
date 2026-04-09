package k3;

import G3.C0152f;
import G3.j;
import R.r0;
import R.s0;
import R.t0;
import R.u0;
import R.v0;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class d extends AbstractC2626a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f21786a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f21787b;

    /* renamed from: c, reason: collision with root package name */
    public Window f21788c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21789d;

    public d(View view, r0 r0Var) {
        this.f21787b = r0Var;
        j jVar = BottomSheetBehavior.B(view).i;
        ColorStateList backgroundTintList = jVar != null ? jVar.f1597b.f1563d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f21786a = Boolean.valueOf(com.bumptech.glide.e.s(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListN = R2.a.n(view.getBackground());
        Integer numValueOf = colorStateListN != null ? Integer.valueOf(colorStateListN.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f21786a = Boolean.valueOf(com.bumptech.glide.e.s(numValueOf.intValue()));
        } else {
            this.f21786a = null;
        }
    }

    @Override // k3.AbstractC2626a
    public final void a(View view) {
        d(view);
    }

    @Override // k3.AbstractC2626a
    public final void b(View view) {
        d(view);
    }

    @Override // k3.AbstractC2626a
    public final void c(int i, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        r0 r0Var = this.f21787b;
        if (top < r0Var.d()) {
            Window window = this.f21788c;
            if (window != null) {
                Boolean bool = this.f21786a;
                boolean zBooleanValue = bool == null ? this.f21789d : bool.booleanValue();
                C0152f c0152f = new C0152f(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new v0(window, c0152f) : i >= 30 ? new u0(window, c0152f) : i >= 26 ? new t0(window, c0152f) : new s0(window, c0152f)).D(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), r0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f21788c;
            if (window2 != null) {
                boolean z6 = this.f21789d;
                C0152f c0152f2 = new C0152f(window2.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new v0(window2, c0152f2) : i3 >= 30 ? new u0(window2, c0152f2) : i3 >= 26 ? new t0(window2, c0152f2) : new s0(window2, c0152f2)).D(z6);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f21788c == window) {
            return;
        }
        this.f21788c = window;
        if (window != null) {
            C0152f c0152f = new C0152f(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.f21789d = (i >= 35 ? new v0(window, c0152f) : i >= 30 ? new u0(window, c0152f) : i >= 26 ? new t0(window, c0152f) : new s0(window, c0152f)).t();
        }
    }
}
