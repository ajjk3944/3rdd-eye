package x3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.apm.insight.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import n.MenuC2677k;
import n.SubMenuC2666C;

/* loaded from: classes.dex */
public final class q implements n.w {

    /* renamed from: C, reason: collision with root package name */
    public int f24130C;

    /* renamed from: D, reason: collision with root package name */
    public int f24131D;

    /* renamed from: E, reason: collision with root package name */
    public int f24132E;

    /* renamed from: F, reason: collision with root package name */
    public int f24133F;

    /* renamed from: G, reason: collision with root package name */
    public int f24134G;

    /* renamed from: H, reason: collision with root package name */
    public int f24135H;

    /* renamed from: I, reason: collision with root package name */
    public int f24136I;

    /* renamed from: J, reason: collision with root package name */
    public int f24137J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f24138K;
    public int M;

    /* renamed from: N, reason: collision with root package name */
    public int f24140N;

    /* renamed from: O, reason: collision with root package name */
    public int f24141O;

    /* renamed from: a, reason: collision with root package name */
    public NavigationMenuView f24144a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f24145b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC2677k f24146c;

    /* renamed from: d, reason: collision with root package name */
    public int f24147d;

    /* renamed from: e, reason: collision with root package name */
    public C3004i f24148e;

    /* renamed from: f, reason: collision with root package name */
    public LayoutInflater f24149f;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f24151h;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f24153k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f24154l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f24155m;

    /* renamed from: n, reason: collision with root package name */
    public RippleDrawable f24156n;

    /* renamed from: g, reason: collision with root package name */
    public int f24150g = 0;
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24152j = true;

    /* renamed from: L, reason: collision with root package name */
    public boolean f24139L = true;

    /* renamed from: P, reason: collision with root package name */
    public int f24142P = -1;

    /* renamed from: Q, reason: collision with root package name */
    public final A3.o f24143Q = new A3.o(8, this);

    public final void a() {
        C3004i c3004i = this.f24148e;
        if (c3004i != null) {
            ArrayList arrayList = c3004i.f24121a;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof l) {
                    c3004i.notifyItemChanged(i);
                }
            }
        }
    }

    @Override // n.w
    public final void b(boolean z6) {
        C3004i c3004i = this.f24148e;
        if (c3004i != null) {
            ArrayList arrayList = c3004i.f24121a;
            int size = arrayList.size();
            c3004i.a();
            c3004i.notifyDataSetChanged();
            if (size == arrayList.size()) {
                c3004i.notifyItemRangeChanged(0, arrayList.size());
            }
        }
    }

    @Override // n.w
    public final void d(Context context, MenuC2677k menuC2677k) {
        this.f24149f = LayoutInflater.from(context);
        this.f24146c = menuC2677k;
        this.f24141O = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) {
        return false;
    }

    @Override // n.w
    public final boolean f() {
        return false;
    }

    public final void g() {
        C3004i c3004i = this.f24148e;
        if (c3004i != null) {
            ArrayList arrayList = c3004i.f24121a;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof m) && c3004i.getItemViewType(i) == 1) {
                    c3004i.notifyItemChanged(i);
                }
            }
        }
    }

    @Override // n.w
    public final int getId() {
        return this.f24147d;
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
        n.m mVar;
        View actionView;
        s sVar;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f24144a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C3004i c3004i = this.f24148e;
                ArrayList arrayList = c3004i.f24121a;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    c3004i.f24123c = true;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        k kVar = (k) arrayList.get(i3);
                        if (kVar instanceof m) {
                            n.m mVar2 = ((m) kVar).f24127a;
                            if (mVar2.f22106a == i) {
                                c3004i.b(mVar2);
                                break;
                            }
                        }
                        i3++;
                    }
                    c3004i.f24123c = false;
                    c3004i.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        k kVar2 = (k) arrayList.get(i6);
                        if ((kVar2 instanceof m) && (actionView = (mVar = ((m) kVar2).f24127a).getActionView()) != null && (sVar = (s) sparseParcelableArray2.get(mVar.f22106a)) != null) {
                            actionView.restoreHierarchyState(sVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f24145b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void i() {
        C3004i c3004i = this.f24148e;
        if (c3004i != null) {
            ArrayList arrayList = c3004i.f24121a;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof m) && c3004i.getItemViewType(i) == 0) {
                    c3004i.notifyItemChanged(i);
                }
            }
        }
    }

    @Override // n.w
    public final boolean j(n.m mVar) {
        return false;
    }

    @Override // n.w
    public final Parcelable k() {
        Bundle bundle = new Bundle();
        if (this.f24144a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f24144a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C3004i c3004i = this.f24148e;
        if (c3004i != null) {
            ArrayList arrayList = c3004i.f24121a;
            Bundle bundle2 = new Bundle();
            n.m mVar = c3004i.f24122b;
            if (mVar != null) {
                bundle2.putInt("android:menu:checked", mVar.f22106a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k kVar = (k) arrayList.get(i);
                if (kVar instanceof m) {
                    n.m mVar2 = ((m) kVar).f24127a;
                    View actionView = mVar2 != null ? mVar2.getActionView() : null;
                    if (actionView != null) {
                        s sVar = new s();
                        actionView.saveHierarchyState(sVar);
                        sparseArray2.put(mVar2.f22106a, sVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f24145b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f24145b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // n.w
    public final boolean m(n.m mVar) {
        return false;
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
    }
}
