package o;

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
import androidx.appcompat.widget.ActionMenuView;
import com.apm.insight.R;
import h0.C2352b;
import java.util.ArrayList;
import n.MenuC2677k;
import n.SubMenuC2666C;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2723l implements n.w {

    /* renamed from: C, reason: collision with root package name */
    public int f22543C;

    /* renamed from: D, reason: collision with root package name */
    public int f22544D;

    /* renamed from: E, reason: collision with root package name */
    public int f22545E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22546F;

    /* renamed from: H, reason: collision with root package name */
    public C2713g f22548H;

    /* renamed from: I, reason: collision with root package name */
    public C2713g f22549I;

    /* renamed from: J, reason: collision with root package name */
    public RunnableC2717i f22550J;

    /* renamed from: K, reason: collision with root package name */
    public C2715h f22551K;
    public int M;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22553a;

    /* renamed from: b, reason: collision with root package name */
    public Context f22554b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC2677k f22555c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f22556d;

    /* renamed from: e, reason: collision with root package name */
    public n.v f22557e;

    /* renamed from: h, reason: collision with root package name */
    public n.y f22560h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C2719j f22561j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f22562k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22563l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22564m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22565n;

    /* renamed from: f, reason: collision with root package name */
    public final int f22558f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f22559g = R.layout.abc_action_menu_item_layout;

    /* renamed from: G, reason: collision with root package name */
    public final SparseBooleanArray f22547G = new SparseBooleanArray();

    /* renamed from: L, reason: collision with root package name */
    public final C2352b f22552L = new C2352b(7, this);

    public C2723l(Context context) {
        this.f22553a = context;
        this.f22556d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [n.x] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(n.m mVar, View view, ViewGroup viewGroup) {
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof n.x ? (n.x) view : (n.x) this.f22556d.inflate(this.f22559g, viewGroup, false);
            actionMenuItemView.a(mVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f22560h);
            if (this.f22551K == null) {
                this.f22551K = new C2715h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f22551K);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(mVar.f22105Q ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2727n)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.w
    public final void b(boolean z6) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f22560h;
        ArrayList arrayList = null;
        boolean z7 = false;
        if (viewGroup != null) {
            MenuC2677k menuC2677k = this.f22555c;
            if (menuC2677k != null) {
                menuC2677k.i();
                ArrayList arrayListL = this.f22555c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    n.m mVar = (n.m) arrayListL.get(i3);
                    if ((mVar.f22101L & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        n.m itemData = childAt instanceof n.x ? ((n.x) childAt).getItemData() : null;
                        View viewA = a(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f22560h).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f22561j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f22560h).requestLayout();
        MenuC2677k menuC2677k2 = this.f22555c;
        if (menuC2677k2 != null) {
            menuC2677k2.i();
            ArrayList arrayList2 = menuC2677k2.i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                n.n nVar = ((n.m) arrayList2.get(i6)).f22103O;
            }
        }
        MenuC2677k menuC2677k3 = this.f22555c;
        if (menuC2677k3 != null) {
            menuC2677k3.i();
            arrayList = menuC2677k3.f22084j;
        }
        if (this.f22564m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z7 = !((n.m) arrayList.get(0)).f22105Q;
            } else if (size3 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f22561j == null) {
                this.f22561j = new C2719j(this, this.f22553a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f22561j.getParent();
            if (viewGroup3 != this.f22560h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f22561j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f22560h;
                C2719j c2719j = this.f22561j;
                actionMenuView.getClass();
                C2727n c2727nJ = ActionMenuView.j();
                c2727nJ.f22589a = true;
                actionMenuView.addView(c2719j, c2727nJ);
            }
        } else {
            C2719j c2719j2 = this.f22561j;
            if (c2719j2 != null) {
                Object parent = c2719j2.getParent();
                Object obj = this.f22560h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f22561j);
                }
            }
        }
        ((ActionMenuView) this.f22560h).setOverflowReserved(this.f22564m);
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
        g();
        C2713g c2713g = this.f22549I;
        if (c2713g != null && c2713g.b()) {
            c2713g.i.dismiss();
        }
        n.v vVar = this.f22557e;
        if (vVar != null) {
            vVar.c(menuC2677k, z6);
        }
    }

    @Override // n.w
    public final void d(Context context, MenuC2677k menuC2677k) {
        this.f22554b = context;
        LayoutInflater.from(context);
        this.f22555c = menuC2677k;
        Resources resources = context.getResources();
        if (!this.f22565n) {
            this.f22564m = true;
        }
        int i = 2;
        this.f22543C = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i6 > 720) || (i3 > 720 && i6 > 960))) {
            i = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i6 > 480) || (i3 > 480 && i6 > 640))) {
            i = 4;
        } else if (i3 >= 360) {
            i = 3;
        }
        this.f22545E = i;
        int measuredWidth = this.f22543C;
        if (this.f22564m) {
            if (this.f22561j == null) {
                C2719j c2719j = new C2719j(this, this.f22553a);
                this.f22561j = c2719j;
                if (this.f22563l) {
                    c2719j.setImageDrawable(this.f22562k);
                    this.f22562k = null;
                    this.f22563l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f22561j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f22561j.getMeasuredWidth();
        } else {
            this.f22561j = null;
        }
        this.f22544D = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) {
        boolean z6;
        if (subMenuC2666C.hasVisibleItems()) {
            SubMenuC2666C subMenuC2666C2 = subMenuC2666C;
            while (true) {
                MenuC2677k menuC2677k = subMenuC2666C2.f22007N;
                if (menuC2677k == this.f22555c) {
                    break;
                }
                subMenuC2666C2 = (SubMenuC2666C) menuC2677k;
            }
            n.m mVar = subMenuC2666C2.f22008O;
            ViewGroup viewGroup = (ViewGroup) this.f22560h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof n.x) && ((n.x) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.M = subMenuC2666C.f22008O.f22106a;
                int size = subMenuC2666C.f22081f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = subMenuC2666C.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i3++;
                }
                C2713g c2713g = new C2713g(this, this.f22554b, subMenuC2666C, view);
                this.f22549I = c2713g;
                c2713g.f22137g = z6;
                n.s sVar = c2713g.i;
                if (sVar != null) {
                    sVar.q(z6);
                }
                C2713g c2713g2 = this.f22549I;
                if (!c2713g2.b()) {
                    if (c2713g2.f22135e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c2713g2.d(0, 0, false, false);
                }
                n.v vVar = this.f22557e;
                if (vVar != null) {
                    vVar.g(subMenuC2666C);
                }
                return true;
            }
        }
        return false;
    }

    @Override // n.w
    public final boolean f() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z6;
        C2723l c2723l = this;
        MenuC2677k menuC2677k = c2723l.f22555c;
        if (menuC2677k != null) {
            arrayListL = menuC2677k.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i3 = c2723l.f22545E;
        int i6 = c2723l.f22544D;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2723l.f22560h;
        int i7 = 0;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = 2;
            z6 = true;
            if (i7 >= size) {
                break;
            }
            n.m mVar = (n.m) arrayListL.get(i7);
            int i10 = mVar.M;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z7 = true;
            }
            if (c2723l.f22546F && mVar.f22105Q) {
                i3 = 0;
            }
            i7++;
        }
        if (c2723l.f22564m && (z7 || i9 + i8 > i3)) {
            i3--;
        }
        int i11 = i3 - i8;
        SparseBooleanArray sparseBooleanArray = c2723l.f22547G;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            n.m mVar2 = (n.m) arrayListL.get(i12);
            int i14 = mVar2.M;
            boolean z8 = (i14 & 2) == i ? z6 : false;
            int i15 = mVar2.f22107b;
            if (z8) {
                View viewA = c2723l.a(mVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z6);
                }
                mVar2.g(z6);
            } else if ((i14 & 1) == z6) {
                boolean z9 = sparseBooleanArray.get(i15);
                boolean z10 = ((i11 > 0 || z9) && i6 > 0) ? z6 : false;
                if (z10) {
                    View viewA2 = c2723l.a(mVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z10 &= i6 + i13 > 0;
                }
                if (z10 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z9) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        n.m mVar3 = (n.m) arrayListL.get(i16);
                        if (mVar3.f22107b == i15) {
                            if ((mVar3.f22101L & 32) == 32) {
                                i11++;
                            }
                            mVar3.g(false);
                        }
                    }
                }
                if (z10) {
                    i11--;
                }
                mVar2.g(z10);
            } else {
                mVar2.g(false);
                i12++;
                i = 2;
                c2723l = this;
                z6 = true;
            }
            i12++;
            i = 2;
            c2723l = this;
            z6 = true;
        }
        return z6;
    }

    public final boolean g() {
        Object obj;
        RunnableC2717i runnableC2717i = this.f22550J;
        if (runnableC2717i != null && (obj = this.f22560h) != null) {
            ((View) obj).removeCallbacks(runnableC2717i);
            this.f22550J = null;
            return true;
        }
        C2713g c2713g = this.f22548H;
        if (c2713g == null) {
            return false;
        }
        if (c2713g.b()) {
            c2713g.i.dismiss();
        }
        return true;
    }

    @Override // n.w
    public final int getId() {
        return this.i;
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C2721k) && (i = ((C2721k) parcelable).f22540a) > 0 && (menuItemFindItem = this.f22555c.findItem(i)) != null) {
            e((SubMenuC2666C) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean i() {
        C2713g c2713g = this.f22548H;
        return c2713g != null && c2713g.b();
    }

    @Override // n.w
    public final boolean j(n.m mVar) {
        return false;
    }

    @Override // n.w
    public final Parcelable k() {
        C2721k c2721k = new C2721k();
        c2721k.f22540a = this.M;
        return c2721k;
    }

    @Override // n.w
    public final void l(n.v vVar) {
        throw null;
    }

    @Override // n.w
    public final boolean m(n.m mVar) {
        return false;
    }

    public final boolean n() {
        MenuC2677k menuC2677k;
        if (!this.f22564m || i() || (menuC2677k = this.f22555c) == null || this.f22560h == null || this.f22550J != null) {
            return false;
        }
        menuC2677k.i();
        if (menuC2677k.f22084j.isEmpty()) {
            return false;
        }
        RunnableC2717i runnableC2717i = new RunnableC2717i(this, new C2713g(this, this.f22554b, this.f22555c, this.f22561j));
        this.f22550J = runnableC2717i;
        ((View) this.f22560h).post(runnableC2717i);
        return true;
    }
}
