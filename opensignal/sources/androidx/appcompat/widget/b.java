package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import o.a0;
import o.e0;
import o.m;
import o.o;
import o.p;
import o.u;
import o.x;
import o.y;
import o.z;
import p.f;
import p.g;
import p.h;
import p.i;
import p.k;

/* loaded from: classes.dex */
public final class b implements y {
    public final int B;
    public a0 D;
    public int E;
    public i F;
    public Drawable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final SparseBooleanArray O;
    public f P;
    public f Q;
    public h R;
    public g S;
    public final o2.g T;
    public int U;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1043a;

    /* renamed from: d, reason: collision with root package name */
    public Context f1044d;

    /* renamed from: g, reason: collision with root package name */
    public m f1045g;

    /* renamed from: r, reason: collision with root package name */
    public final LayoutInflater f1046r;

    /* renamed from: x, reason: collision with root package name */
    public x f1047x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1048y;

    public b(Context context) {
        int i10 = h.g.abc_action_menu_layout;
        int i11 = h.g.abc_action_menu_item_layout;
        this.f1043a = context;
        this.f1046r = LayoutInflater.from(context);
        this.f1048y = i10;
        this.B = i11;
        this.O = new SparseBooleanArray();
        this.T = new o2.g(5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof z ? (z) view : (z) this.f1046r.inflate(this.B, viewGroup, false);
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.D);
            if (this.S == null) {
                this.S = new g(this);
            }
            actionMenuItemView2.setPopupCallback(this.S);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof k)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final void b(boolean z10) {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.D;
        ArrayList arrayList = null;
        boolean z11 = false;
        if (viewGroup != null) {
            m mVar = this.f1045g;
            if (mVar != null) {
                mVar.i();
                ArrayList arrayListL = this.f1045g.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    o oVar = (o) arrayListL.get(i11);
                    if ((oVar.f18659x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        o itemData = childAt instanceof z ? ((z) childAt).getItemData() : null;
                        View viewA = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.D).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.F) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.D).requestLayout();
        m mVar2 = this.f1045g;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f18621i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                p pVar = ((o) arrayList2.get(i12)).A;
            }
        }
        m mVar3 = this.f1045g;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.j;
        }
        if (this.I && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !((o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.F == null) {
                this.F = new i(this, this.f1043a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.F.getParent();
            if (viewGroup3 != this.D) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.F);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.D;
                i iVar = this.F;
                actionMenuView.getClass();
                k kVarJ = ActionMenuView.j();
                kVarJ.f20083a = true;
                actionMenuView.addView(iVar, kVarJ);
            }
        } else {
            i iVar2 = this.F;
            if (iVar2 != null) {
                Object parent = iVar2.getParent();
                Object obj = this.D;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.F);
                }
            }
        }
        ((ActionMenuView) this.D).setOverflowReserved(this.I);
    }

    @Override // o.y
    public final void c(m mVar, boolean z10) {
        g();
        f fVar = this.Q;
        if (fVar != null && fVar.b()) {
            fVar.f18681i.dismiss();
        }
        x xVar = this.f1047x;
        if (xVar != null) {
            xVar.c(mVar, z10);
        }
    }

    @Override // o.y
    public final void d(Context context, m mVar) {
        this.f1044d = context;
        LayoutInflater.from(context);
        this.f1045g = mVar;
        Resources resources = context.getResources();
        if (!this.J) {
            this.I = true;
        }
        int i10 = 2;
        this.K = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.M = i10;
        int measuredWidth = this.K;
        if (this.I) {
            if (this.F == null) {
                i iVar = new i(this, this.f1043a);
                this.F = iVar;
                if (this.H) {
                    iVar.setImageDrawable(this.G);
                    this.G = null;
                    this.H = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.F.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.F.getMeasuredWidth();
        } else {
            this.F = null;
        }
        this.L = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // o.y
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i10;
        boolean z10;
        b bVar = this;
        m mVar = bVar.f1045g;
        if (mVar != null) {
            arrayListL = mVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = bVar.M;
        int i12 = bVar.L;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) bVar.D;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            o oVar = (o) arrayListL.get(i13);
            int i16 = oVar.f18660y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (bVar.N && oVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (bVar.I && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = bVar.O;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            o oVar2 = (o) arrayListL.get(i18);
            int i20 = oVar2.f18660y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = oVar2.f18639b;
            if (z12) {
                View viewA = bVar.a(oVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                oVar2.f(z10);
            } else if ((i20 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i21);
                boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                if (z14) {
                    View viewA2 = bVar.a(oVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z14 &= i12 + i19 > 0;
                }
                if (z14 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z13) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        o oVar3 = (o) arrayListL.get(i22);
                        if (oVar3.f18639b == i21) {
                            if ((oVar3.f18659x & 32) == 32) {
                                i17++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z14) {
                    i17--;
                }
                oVar2.f(z14);
            } else {
                oVar2.f(false);
                i18++;
                i10 = 2;
                bVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            bVar = this;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final boolean f(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            e0 e0Var2 = e0Var;
            while (true) {
                m mVar = e0Var2.f18589z;
                if (mVar == this.f1045g) {
                    break;
                }
                e0Var2 = (e0) mVar;
            }
            o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.D;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof z) && ((z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                this.U = e0Var.A.f18638a;
                int size = e0Var.f18618f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                f fVar = new f(this, this.f1044d, e0Var, view);
                this.Q = fVar;
                fVar.f18679g = z10;
                u uVar = fVar.f18681i;
                if (uVar != null) {
                    uVar.q(z10);
                }
                f fVar2 = this.Q;
                if (!fVar2.b()) {
                    if (fVar2.f18677e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                x xVar = this.f1047x;
                if (xVar != null) {
                    xVar.Q(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        Object obj;
        h hVar = this.R;
        if (hVar != null && (obj = this.D) != null) {
            ((View) obj).removeCallbacks(hVar);
            this.R = null;
            return true;
        }
        f fVar = this.P;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f18681i.dismiss();
        }
        return true;
    }

    @Override // o.y
    public final int getId() {
        return this.E;
    }

    @Override // o.y
    public final void h(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i10 = ((ActionMenuPresenter$SavedState) parcelable).f955a) > 0 && (menuItemFindItem = this.f1045g.findItem(i10)) != null) {
            f((e0) menuItemFindItem.getSubMenu());
        }
    }

    @Override // o.y
    public final boolean i(o oVar) {
        return false;
    }

    public final boolean j() {
        f fVar = this.P;
        return fVar != null && fVar.b();
    }

    @Override // o.y
    public final void k(x xVar) {
        throw null;
    }

    @Override // o.y
    public final Parcelable l() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f955a = this.U;
        return actionMenuPresenter$SavedState;
    }

    @Override // o.y
    public final boolean m(o oVar) {
        return false;
    }

    public final boolean n() {
        m mVar;
        if (!this.I || j() || (mVar = this.f1045g) == null || this.D == null || this.R != null) {
            return false;
        }
        mVar.i();
        if (mVar.j.isEmpty()) {
            return false;
        }
        h hVar = new h(this, new f(this, this.f1044d, this.f1045g, this.F));
        this.R = hVar;
        ((View) this.D).post(hVar);
        return true;
    }
}
