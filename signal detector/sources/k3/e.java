package k3;

import A3.o;
import J3.g;
import R.F;
import R.O;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.x;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.a1;
import z3.C3018c;
import z3.InterfaceC3017b;

/* loaded from: classes.dex */
public final class e extends x {

    /* renamed from: C, reason: collision with root package name */
    public a1 f21790C;

    /* renamed from: D, reason: collision with root package name */
    public c f21791D;

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f21792f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f21793g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f21794h;
    public FrameLayout i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21795j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21796k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21797l;

    /* renamed from: m, reason: collision with root package name */
    public d f21798m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21799n;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        h();
        super.cancel();
    }

    public final void g() throws Resources.NotFoundException {
        if (this.f21793g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f21793g = frameLayout;
            this.f21794h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f21793g.findViewById(R.id.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.f21792f = bottomSheetBehaviorB;
            c cVar = this.f21791D;
            ArrayList arrayList = bottomSheetBehaviorB.f18160m0;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
            this.f21792f.G(this.f21795j);
            this.f21790C = new a1(this.f21792f, this.i);
        }
    }

    public final BottomSheetBehavior h() throws Resources.NotFoundException {
        if (this.f21792f == null) {
            g();
        }
        return this.f21792f;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f21793g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f21799n) {
            FrameLayout frameLayout = this.f21793g;
            h2.d dVar = new h2.d(this);
            WeakHashMap weakHashMap = O.f3270a;
            F.k(frameLayout, dVar);
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new o(4, this));
        O.m(this.i, new J3.e(2, this));
        this.i.setOnTouchListener(new g(1));
        return this.f21793g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z6 = this.f21799n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f21793g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z6);
            }
            CoordinatorLayout coordinatorLayout = this.f21794h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z6);
            }
            com.bumptech.glide.e.x(window, !z6);
            d dVar = this.f21798m;
            if (dVar != null) {
                dVar.e(window);
            }
        }
        a1 a1Var = this.f21790C;
        if (a1Var == null) {
            return;
        }
        View view = (View) a1Var.f22481d;
        C3018c c3018c = (C3018c) a1Var.f22479b;
        if (this.f21795j) {
            if (c3018c != null) {
                c3018c.b((InterfaceC3017b) a1Var.f22480c, view, false);
            }
        } else if (c3018c != null) {
            c3018c.c(view);
        }
    }

    @Override // h.x, c.DialogC0390o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C3018c c3018c;
        d dVar = this.f21798m;
        if (dVar != null) {
            dVar.e(null);
        }
        a1 a1Var = this.f21790C;
        if (a1Var == null || (c3018c = (C3018c) a1Var.f22479b) == null) {
            return;
        }
        c3018c.c((View) a1Var.f22481d);
    }

    @Override // c.DialogC0390o, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f21792f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.b0 != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z6) throws Resources.NotFoundException {
        a1 a1Var;
        super.setCancelable(z6);
        if (this.f21795j != z6) {
            this.f21795j = z6;
            BottomSheetBehavior bottomSheetBehavior = this.f21792f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z6);
            }
            if (getWindow() == null || (a1Var = this.f21790C) == null) {
                return;
            }
            View view = (View) a1Var.f22481d;
            C3018c c3018c = (C3018c) a1Var.f22479b;
            if (this.f21795j) {
                if (c3018c != null) {
                    c3018c.b((InterfaceC3017b) a1Var.f22480c, view, false);
                }
            } else if (c3018c != null) {
                c3018c.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z6) {
        super.setCanceledOnTouchOutside(z6);
        if (z6 && !this.f21795j) {
            this.f21795j = true;
        }
        this.f21796k = z6;
        this.f21797l = true;
    }

    @Override // h.x, c.DialogC0390o, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // h.x, c.DialogC0390o, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // h.x, c.DialogC0390o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
