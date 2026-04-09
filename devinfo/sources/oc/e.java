package oc;

import a4.l;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e4.c2;
import e4.d2;
import e4.e2;
import e4.f2;
import e4.h2;
import ed.j;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f30502a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f30503b;

    /* renamed from: c, reason: collision with root package name */
    public Window f30504c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30505d;

    public e(View view, c2 c2Var) {
        this.f30503b = c2Var;
        j jVar = BottomSheetBehavior.B(view).f20364i;
        ColorStateList backgroundTintList = jVar != null ? jVar.f23316b.f23301d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f30502a = Boolean.valueOf(i0.m(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListA = l.a(view.getBackground());
        Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f30502a = Boolean.valueOf(i0.m(numValueOf.intValue()));
        } else {
            this.f30502a = null;
        }
    }

    @Override // oc.b
    public final void a(View view) {
        d(view);
    }

    @Override // oc.b
    public final void b(View view) {
        d(view);
    }

    @Override // oc.b
    public final void c(int i4, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        c2 c2Var = this.f30503b;
        if (top < c2Var.d()) {
            Window window = this.f30504c;
            if (window != null) {
                Boolean bool = this.f30502a;
                boolean zBooleanValue = bool == null ? this.f30505d : bool.booleanValue();
                o7.c cVar = new o7.c(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                (i4 >= 35 ? new h2(window, cVar) : i4 >= 30 ? new f2(window, cVar) : i4 >= 26 ? new e2(window, cVar) : new d2(window, cVar)).w(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), c2Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f30504c;
            if (window2 != null) {
                boolean z3 = this.f30505d;
                o7.c cVar2 = new o7.c(window2.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new h2(window2, cVar2) : i10 >= 30 ? new f2(window2, cVar2) : i10 >= 26 ? new e2(window2, cVar2) : new d2(window2, cVar2)).w(z3);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f30504c == window) {
            return;
        }
        this.f30504c = window;
        if (window != null) {
            o7.c cVar = new o7.c(window.getDecorView());
            int i4 = Build.VERSION.SDK_INT;
            this.f30505d = (i4 >= 35 ? new h2(window, cVar) : i4 >= 30 ? new f2(window, cVar) : i4 >= 26 ? new e2(window, cVar) : new d2(window, cVar)).o();
        }
    }
}
