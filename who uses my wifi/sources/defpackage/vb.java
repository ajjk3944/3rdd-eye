package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vb extends j6 {
    public BottomSheetBehavior k;
    public FrameLayout l;
    public CoordinatorLayout m;
    public FrameLayout n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public ub s;
    public boolean t;
    public t83 u;
    public final tb v;

    public vb(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.p = true;
        this.q = true;
        this.v = new tb(0, this);
        d().f(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.t = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.k == null) {
            g();
        }
        BottomSheetBehavior bottomSheetBehavior = this.k;
        if (!this.o || bottomSheetBehavior.N == 5) {
            super.cancel();
        } else {
            bottomSheetBehavior.I(5);
        }
    }

    public final void g() {
        if (this.l == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.l = frameLayout;
            this.m = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.l.findViewById(R.id.design_bottom_sheet);
            this.n = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.k = bottomSheetBehaviorB;
            ArrayList arrayList = bottomSheetBehaviorB.Y;
            tb tbVar = this.v;
            if (!arrayList.contains(tbVar)) {
                arrayList.add(tbVar);
            }
            this.k.G(this.p);
            this.u = new t83(this.k, this.n);
        }
    }

    public final FrameLayout h(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.l.findViewById(R.id.coordinator);
        int i2 = 0;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.t) {
            FrameLayout frameLayout = this.l;
            f20 f20Var = new f20(3, this);
            WeakHashMap weakHashMap = e61.a;
            t51.u(frameLayout, f20Var);
        }
        this.n.removeAllViews();
        if (layoutParams == null) {
            this.n.addView(view);
        } else {
            this.n.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new m1(2, this));
        e61.l(this.n, new sb(i2, this));
        this.n.setOnTouchListener(new na(1));
        return this.l;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.t && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.l;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.m;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            pu1.n(window, !z);
            ub ubVar = this.s;
            if (ubVar != null) {
                ubVar.e(window);
            }
        }
        t83 t83Var = this.u;
        if (t83Var == null) {
            return;
        }
        View view = (View) t83Var.i;
        ob0 ob0Var = (ob0) t83Var.g;
        if (this.p) {
            if (ob0Var != null) {
                ob0Var.b((nb0) t83Var.h, view, false);
            }
        } else if (ob0Var != null) {
            ob0Var.c(view);
        }
    }

    @Override // defpackage.j6, defpackage.eh, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ob0 ob0Var;
        ub ubVar = this.s;
        if (ubVar != null) {
            ubVar.e(null);
        }
        t83 t83Var = this.u;
        if (t83Var == null || (ob0Var = (ob0) t83Var.g) == null) {
            return;
        }
        ob0Var.c((View) t83Var.i);
    }

    @Override // defpackage.eh, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.k;
        if (bottomSheetBehavior == null || bottomSheetBehavior.N != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        t83 t83Var;
        super.setCancelable(z);
        if (this.p != z) {
            this.p = z;
            BottomSheetBehavior bottomSheetBehavior = this.k;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z);
            }
            if (getWindow() == null || (t83Var = this.u) == null) {
                return;
            }
            View view = (View) t83Var.i;
            ob0 ob0Var = (ob0) t83Var.g;
            if (this.p) {
                if (ob0Var != null) {
                    ob0Var.b((nb0) t83Var.h, view, false);
                }
            } else if (ob0Var != null) {
                ob0Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.p) {
            this.p = true;
        }
        this.q = z;
        this.r = true;
    }

    @Override // defpackage.j6, defpackage.eh, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(null, i, null));
    }

    @Override // defpackage.j6, defpackage.eh, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // defpackage.j6, defpackage.eh, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }
}
