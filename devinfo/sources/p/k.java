package p;

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
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements o.y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30725a;

    /* renamed from: b, reason: collision with root package name */
    public Context f30726b;

    /* renamed from: c, reason: collision with root package name */
    public o.m f30727c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f30728d;

    /* renamed from: e, reason: collision with root package name */
    public o.x f30729e;

    /* renamed from: h, reason: collision with root package name */
    public o.a0 f30731h;

    /* renamed from: i, reason: collision with root package name */
    public j f30732i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30733k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30734l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30735m;

    /* renamed from: n, reason: collision with root package name */
    public int f30736n;

    /* renamed from: o, reason: collision with root package name */
    public int f30737o;

    /* renamed from: p, reason: collision with root package name */
    public int f30738p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30739q;

    /* renamed from: s, reason: collision with root package name */
    public g f30741s;

    /* renamed from: t, reason: collision with root package name */
    public g f30742t;

    /* renamed from: u, reason: collision with root package name */
    public i f30743u;

    /* renamed from: v, reason: collision with root package name */
    public h f30744v;

    /* renamed from: f, reason: collision with root package name */
    public final int f30730f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f30740r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final nm.d0 f30745w = new nm.d0(1, this);

    public k(Context context) {
        this.f30725a = context;
        this.f30728d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(o.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof o.z ? (o.z) view : (o.z) this.f30728d.inflate(this.g, viewGroup, false);
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f30731h);
            if (this.f30744v == null) {
                this.f30744v = new h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f30744v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // o.y
    public final void b(Context context, o.m mVar) {
        this.f30726b = context;
        LayoutInflater.from(context);
        this.f30727c = mVar;
        Resources resources = context.getResources();
        if (!this.f30735m) {
            this.f30734l = true;
        }
        int i4 = 2;
        this.f30736n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i4 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i4 = 4;
        } else if (i10 >= 360) {
            i4 = 3;
        }
        this.f30738p = i4;
        int measuredWidth = this.f30736n;
        if (this.f30734l) {
            if (this.f30732i == null) {
                j jVar = new j(this, this.f30725a);
                this.f30732i = jVar;
                if (this.f30733k) {
                    jVar.setImageDrawable(this.j);
                    this.j = null;
                    this.f30733k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f30732i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f30732i.getMeasuredWidth();
        } else {
            this.f30732i = null;
        }
        this.f30737o = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // o.y
    public final boolean c() {
        int size;
        ArrayList arrayListL;
        int i4;
        boolean z3;
        k kVar = this;
        o.m mVar = kVar.f30727c;
        if (mVar != null) {
            arrayListL = mVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i10 = kVar.f30738p;
        int i11 = kVar.f30737o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) kVar.f30731h;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i12 >= size) {
                break;
            }
            o.o oVar = (o.o) arrayListL.get(i12);
            int i15 = oVar.f30285y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z10 = true;
            }
            if (kVar.f30739q && oVar.C) {
                i10 = 0;
            }
            i12++;
        }
        if (kVar.f30734l && (z10 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = kVar.f30740r;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            o.o oVar2 = (o.o) arrayListL.get(i17);
            int i19 = oVar2.f30285y;
            boolean z11 = (i19 & 2) == i4 ? z3 : false;
            int i20 = oVar2.f30264b;
            if (z11) {
                View viewA = kVar.a(oVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z3);
                }
                oVar2.f(z3);
            } else if ((i19 & 1) == z3) {
                boolean z12 = sparseBooleanArray.get(i20);
                boolean z13 = ((i16 > 0 || z12) && i11 > 0) ? z3 : false;
                if (z13) {
                    View viewA2 = kVar.a(oVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z13 &= i11 + i18 > 0;
                }
                if (z13 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z12) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        o.o oVar3 = (o.o) arrayListL.get(i21);
                        if (oVar3.f30264b == i20) {
                            if ((oVar3.f30284x & 32) == 32) {
                                i16++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z13) {
                    i16--;
                }
                oVar2.f(z13);
            } else {
                oVar2.f(false);
                i17++;
                i4 = 2;
                kVar = this;
                z3 = true;
            }
            i17++;
            i4 = 2;
            kVar = this;
            z3 = true;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final boolean d(o.e0 e0Var) {
        boolean z3;
        if (e0Var.hasVisibleItems()) {
            o.e0 e0Var2 = e0Var;
            while (true) {
                o.m mVar = e0Var2.f30196z;
                if (mVar == this.f30727c) {
                    break;
                }
                e0Var2 = (o.e0) mVar;
            }
            o.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f30731h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i4);
                    if ((childAt instanceof o.z) && ((o.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i4++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f30243f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i10++;
                }
                g gVar = new g(this, this.f30726b, e0Var, view);
                this.f30742t = gVar;
                gVar.g = z3;
                o.u uVar = gVar.f30307i;
                if (uVar != null) {
                    uVar.n(z3);
                }
                g gVar2 = this.f30742t;
                if (!gVar2.b()) {
                    if (gVar2.f30304e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    gVar2.d(0, 0, false, false);
                }
                o.x xVar = this.f30729e;
                if (xVar != null) {
                    xVar.v(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.y
    public final void e(o.m mVar, boolean z3) {
        h();
        g gVar = this.f30742t;
        if (gVar != null && gVar.b()) {
            gVar.f30307i.dismiss();
        }
        o.x xVar = this.f30729e;
        if (xVar != null) {
            xVar.e(mVar, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final void f() {
        int i4;
        ViewGroup viewGroup = (ViewGroup) this.f30731h;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            o.m mVar = this.f30727c;
            if (mVar != null) {
                mVar.i();
                ArrayList arrayListL = this.f30727c.l();
                int size = arrayListL.size();
                i4 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    o.o oVar = (o.o) arrayListL.get(i10);
                    if ((oVar.f30284x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i4);
                        o.o itemData = childAt instanceof o.z ? ((o.z) childAt).getItemData() : null;
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
                            ((ViewGroup) this.f30731h).addView(viewA, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f30732i) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.f30731h).requestLayout();
        o.m mVar2 = this.f30727c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f30245i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                o.p pVar = ((o.o) arrayList2.get(i11)).A;
            }
        }
        o.m mVar3 = this.f30727c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.j;
        }
        if (this.f30734l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((o.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f30732i == null) {
                this.f30732i = new j(this, this.f30725a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f30732i.getParent();
            if (viewGroup3 != this.f30731h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f30732i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f30731h;
                j jVar = this.f30732i;
                actionMenuView.getClass();
                m mVarJ = ActionMenuView.j();
                mVarJ.f30761a = true;
                actionMenuView.addView(jVar, mVarJ);
            }
        } else {
            j jVar2 = this.f30732i;
            if (jVar2 != null) {
                Object parent = jVar2.getParent();
                Object obj = this.f30731h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f30732i);
                }
            }
        }
        ((ActionMenuView) this.f30731h).setOverflowReserved(this.f30734l);
    }

    @Override // o.y
    public final boolean g(o.o oVar) {
        return false;
    }

    public final boolean h() {
        Object obj;
        i iVar = this.f30743u;
        if (iVar != null && (obj = this.f30731h) != null) {
            ((View) obj).removeCallbacks(iVar);
            this.f30743u = null;
            return true;
        }
        g gVar = this.f30741s;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.f30307i.dismiss();
        }
        return true;
    }

    @Override // o.y
    public final void i(o.x xVar) {
        throw null;
    }

    @Override // o.y
    public final boolean j(o.o oVar) {
        return false;
    }

    public final boolean k() {
        g gVar = this.f30741s;
        return gVar != null && gVar.b();
    }

    public final boolean l() {
        o.m mVar;
        if (!this.f30734l || k() || (mVar = this.f30727c) == null || this.f30731h == null || this.f30743u != null) {
            return false;
        }
        mVar.i();
        if (mVar.j.isEmpty()) {
            return false;
        }
        i iVar = new i(this, new g(this, this.f30726b, this.f30727c, this.f30732i));
        this.f30743u = iVar;
        ((View) this.f30731h).post(iVar);
        return true;
    }
}
