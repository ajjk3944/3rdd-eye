package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y1 implements fe0 {
    public w1 A;
    public final Context f;
    public Context g;
    public od0 h;
    public final LayoutInflater i;
    public ee0 j;
    public he0 m;
    public x1 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public v1 x;
    public v1 y;
    public jq3 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final zs1 B = new zs1(1, this);

    public y1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ge0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(sd0 sd0Var, View view, ViewGroup viewGroup) {
        View actionView = sd0Var.getActionView();
        if (actionView == null || sd0Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof ge0 ? (ge0) view : (ge0) this.i.inflate(this.l, viewGroup, false);
            actionMenuItemView.c(sd0Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new w1(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(sd0Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof a2)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.fe0
    public final boolean b(sd0 sd0Var) {
        return false;
    }

    public final boolean c() {
        Object obj;
        jq3 jq3Var = this.z;
        if (jq3Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(jq3Var);
            this.z = null;
            return true;
        }
        v1 v1Var = this.x;
        if (v1Var == null) {
            return false;
        }
        if (v1Var.b()) {
            v1Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.fe0
    public final void d(ee0 ee0Var) {
        throw null;
    }

    @Override // defpackage.fe0
    public final boolean e(sd0 sd0Var) {
        return false;
    }

    @Override // defpackage.fe0
    public final void f(od0 od0Var, boolean z) {
        c();
        v1 v1Var = this.y;
        if (v1Var != null && v1Var.b()) {
            v1Var.i.dismiss();
        }
        ee0 ee0Var = this.j;
        if (ee0Var != null) {
            ee0Var.f(od0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fe0
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            od0 od0Var = this.h;
            if (od0Var != null) {
                od0Var.i();
                ArrayList arrayListL = this.h.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    sd0 sd0Var = (sd0) arrayListL.get(i2);
                    if ((sd0Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        sd0 itemData = childAt instanceof ge0 ? ((ge0) childAt).getItemData() : null;
                        View viewA = a(sd0Var, childAt, viewGroup);
                        if (sd0Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.m).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.m).requestLayout();
        od0 od0Var2 = this.h;
        if (od0Var2 != null) {
            od0Var2.i();
            ArrayList arrayList2 = od0Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                td0 td0Var = ((sd0) arrayList2.get(i3)).A;
            }
        }
        od0 od0Var3 = this.h;
        if (od0Var3 != null) {
            od0Var3.i();
            arrayList = od0Var3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((sd0) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.n == null) {
                this.n = new x1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                x1 x1Var = this.n;
                actionMenuView.getClass();
                a2 a2VarJ = ActionMenuView.j();
                a2VarJ.a = true;
                actionMenuView.addView(x1Var, a2VarJ);
            }
        } else {
            x1 x1Var2 = this.n;
            if (x1Var2 != null) {
                Object parent = x1Var2.getParent();
                Object obj = this.m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.n);
                }
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    public final boolean h() {
        v1 v1Var = this.x;
        return v1Var != null && v1Var.b();
    }

    @Override // defpackage.fe0
    public final void i(Context context, od0 od0Var) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = od0Var;
        Resources resources = context.getResources();
        if (!this.r) {
            this.q = true;
        }
        int i = 2;
        this.s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.u = i;
        int measuredWidth = this.s;
        if (this.q) {
            if (this.n == null) {
                x1 x1Var = new x1(this, this.f);
                this.n = x1Var;
                if (this.p) {
                    x1Var.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fe0
    public final boolean j(uy0 uy0Var) {
        boolean z;
        if (uy0Var.hasVisibleItems()) {
            uy0 uy0Var2 = uy0Var;
            while (true) {
                od0 od0Var = uy0Var2.z;
                if (od0Var == this.h) {
                    break;
                }
                uy0Var2 = (uy0) od0Var;
            }
            sd0 sd0Var = uy0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ge0) && ((ge0) childAt).getItemData() == sd0Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                uy0Var.A.getClass();
                int size = uy0Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = uy0Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                v1 v1Var = new v1(this, this.g, uy0Var, view);
                this.y = v1Var;
                v1Var.g = z;
                xd0 xd0Var = v1Var.i;
                if (xd0Var != null) {
                    xd0Var.o(z);
                }
                v1 v1Var2 = this.y;
                if (!v1Var2.b()) {
                    if (v1Var2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    v1Var2.d(0, 0, false, false);
                }
                ee0 ee0Var = this.j;
                if (ee0Var != null) {
                    ee0Var.r(uy0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fe0
    public final boolean k() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        y1 y1Var = this;
        od0 od0Var = y1Var.h;
        if (od0Var != null) {
            arrayListL = od0Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = y1Var.u;
        int i3 = y1Var.t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) y1Var.m;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            sd0 sd0Var = (sd0) arrayListL.get(i4);
            int i7 = sd0Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (y1Var.v && sd0Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (y1Var.q && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = y1Var.w;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            sd0 sd0Var2 = (sd0) arrayListL.get(i9);
            int i11 = sd0Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = sd0Var2.b;
            if (z3) {
                View viewA = y1Var.a(sd0Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                sd0Var2.f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = y1Var.a(sd0Var2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        sd0 sd0Var3 = (sd0) arrayListL.get(i13);
                        if (sd0Var3.b == i12) {
                            if ((sd0Var3.x & 32) == 32) {
                                i8++;
                            }
                            sd0Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                sd0Var2.f(z5);
            } else {
                sd0Var2.f(false);
                i9++;
                i = 2;
                y1Var = this;
                z = true;
            }
            i9++;
            i = 2;
            y1Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        od0 od0Var;
        if (!this.q || h() || (od0Var = this.h) == null || this.m == null || this.z != null) {
            return false;
        }
        od0Var.i();
        if (od0Var.j.isEmpty()) {
            return false;
        }
        jq3 jq3Var = new jq3(this, new v1(this, this.g, this.h, this.n), 1, false);
        this.z = jq3Var;
        ((View) this.m).post(jq3Var);
        return true;
    }
}
