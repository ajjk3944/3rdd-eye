package oc;

import aa.j;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import i.x;
import java.util.ArrayList;
import java.util.WeakHashMap;
import km.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends x {
    public BottomSheetBehavior g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f30506h;

    /* renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f30507i;
    public FrameLayout j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30508k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30509l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30510m;

    /* renamed from: n, reason: collision with root package name */
    public e f30511n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30512o;

    /* renamed from: p, reason: collision with root package name */
    public yb.e f30513p;

    /* renamed from: q, reason: collision with root package name */
    public d f30514q;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.g == null) {
            f();
        }
        super.cancel();
    }

    public final void f() throws Resources.NotFoundException {
        if (this.f30506h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f30506h = frameLayout;
            this.f30507i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f30506h.findViewById(R.id.design_bottom_sheet);
            this.j = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.g = bottomSheetBehaviorB;
            d dVar = this.f30514q;
            ArrayList arrayList = bottomSheetBehaviorB.Y;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            this.g.H(this.f30508k);
            this.f30513p = new yb.e(this.g, this.j);
        }
    }

    public final FrameLayout h(View view, int i4, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f30506h.findViewById(R.id.coordinator);
        if (i4 != 0 && view == null) {
            view = getLayoutInflater().inflate(i4, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f30512o) {
            FrameLayout frameLayout = this.f30506h;
            y yVar = new y(5, this);
            WeakHashMap weakHashMap = v0.f22405a;
            m0.j(frameLayout, yVar);
        }
        this.j.removeAllViews();
        if (layoutParams == null) {
            this.j.addView(view);
        } else {
            this.j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new j(4, this));
        v0.o(this.j, new com.google.android.material.datepicker.j(2, this));
        this.j.setOnTouchListener(new hd.b(1));
        return this.f30506h;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z3 = this.f30512o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f30506h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z3);
            }
            CoordinatorLayout coordinatorLayout = this.f30507i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z3);
            }
            com.bumptech.glide.f.A(window, !z3);
            e eVar = this.f30511n;
            if (eVar != null) {
                eVar.e(window);
            }
        }
        yb.e eVar2 = this.f30513p;
        if (eVar2 == null) {
            return;
        }
        View view = (View) eVar2.f37511d;
        ad.d dVar = (ad.d) eVar2.f37509b;
        if (this.f30508k) {
            if (dVar != null) {
                dVar.b((ad.b) eVar2.f37510c, view, false);
            }
        } else if (dVar != null) {
            dVar.c(view);
        }
    }

    @Override // i.x, d.l, android.app.Dialog
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
        ad.d dVar;
        e eVar = this.f30511n;
        if (eVar != null) {
            eVar.e(null);
        }
        yb.e eVar2 = this.f30513p;
        if (eVar2 == null || (dVar = (ad.d) eVar2.f37509b) == null) {
            return;
        }
        dVar.c((View) eVar2.f37511d);
    }

    @Override // d.l, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.N != 5) {
            return;
        }
        bottomSheetBehavior.J(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z3) throws Resources.NotFoundException {
        yb.e eVar;
        super.setCancelable(z3);
        if (this.f30508k != z3) {
            this.f30508k = z3;
            BottomSheetBehavior bottomSheetBehavior = this.g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H(z3);
            }
            if (getWindow() == null || (eVar = this.f30513p) == null) {
                return;
            }
            View view = (View) eVar.f37511d;
            ad.d dVar = (ad.d) eVar.f37509b;
            if (this.f30508k) {
                if (dVar != null) {
                    dVar.b((ad.b) eVar.f37510c, view, false);
                }
            } else if (dVar != null) {
                dVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z3) {
        super.setCanceledOnTouchOutside(z3);
        if (z3 && !this.f30508k) {
            this.f30508k = true;
        }
        this.f30509l = z3;
        this.f30510m = true;
    }

    @Override // i.x, d.l, android.app.Dialog
    public final void setContentView(int i4) {
        super.setContentView(h(null, i4, null));
    }

    @Override // i.x, d.l, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // i.x, d.l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }
}
