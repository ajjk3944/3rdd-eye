package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import s0.x;

/* loaded from: classes2.dex */
public class s implements androidx.appcompat.view.menu.h {
    public int A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public NavigationMenuView f10718a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f10719b;

    /* renamed from: c, reason: collision with root package name */
    public h.a f10720c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.view.menu.d f10721d;

    /* renamed from: e, reason: collision with root package name */
    public int f10722e;

    /* renamed from: f, reason: collision with root package name */
    public c f10723f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f10724g;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f10726i;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f10729l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f10730m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f10731n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f10732o;

    /* renamed from: p, reason: collision with root package name */
    public int f10733p;

    /* renamed from: q, reason: collision with root package name */
    public int f10734q;

    /* renamed from: r, reason: collision with root package name */
    public int f10735r;

    /* renamed from: s, reason: collision with root package name */
    public int f10736s;

    /* renamed from: t, reason: collision with root package name */
    public int f10737t;

    /* renamed from: u, reason: collision with root package name */
    public int f10738u;

    /* renamed from: v, reason: collision with root package name */
    public int f10739v;

    /* renamed from: w, reason: collision with root package name */
    public int f10740w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10741x;

    /* renamed from: z, reason: collision with root package name */
    public int f10743z;

    /* renamed from: h, reason: collision with root package name */
    public int f10725h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f10727j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10728k = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10742y = true;
    public int C = -1;
    public final View.OnClickListener D = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            s.this.Y(true);
            androidx.appcompat.view.menu.f itemData = ((NavigationMenuItemView) view).getItemData();
            s sVar = s.this;
            boolean zP = sVar.f10721d.P(itemData, sVar, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                s.this.f10723f.p(itemData);
            } else {
                z10 = false;
            }
            s.this.Y(false);
            if (z10) {
                s.this.h(false);
            }
        }
    }

    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    public class c extends RecyclerView.Adapter {

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f10745i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f10746j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f10747k;

        public class a extends androidx.core.view.a {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f10749d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f10750e;

            public a(int i10, boolean z10) {
                this.f10749d = i10;
                this.f10750e = z10;
            }

            @Override // androidx.core.view.a
            public void g(View view, s0.x xVar) {
                super.g(view, xVar);
                xVar.p0(x.f.a(c.this.e(this.f10749d), 1, 1, 1, this.f10750e, view.isSelected()));
            }
        }

        public c() {
            m();
        }

        public final int e(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (s.this.f10723f.getItemViewType(i12) == 2 || s.this.f10723f.getItemViewType(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        public final void f(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f10745i.get(i10)).f10755b = true;
                i10++;
            }
        }

        public Bundle g() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.f fVar = this.f10746j;
            if (fVar != null) {
                bundle.putInt("android:menu:checked", fVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f10745i.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) this.f10745i.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.f fVarA = ((g) eVar).a();
                    View actionView = fVarA != null ? fVarA.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(fVarA.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f10745i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            e eVar = (e) this.f10745i.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public androidx.appcompat.view.menu.f h() {
            return this.f10746j;
        }

        public int i() {
            int i10 = 0;
            for (int i11 = 0; i11 < s.this.f10723f.getItemCount(); i11++) {
                int itemViewType = s.this.f10723f.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(l lVar, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f10745i.get(i10);
                    lVar.itemView.setPaddingRelative(s.this.f10737t, fVar.b(), s.this.f10738u, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f10745i.get(i10)).a().getTitle());
                TextViewCompat.m(textView, s.this.f10725h);
                textView.setPaddingRelative(s.this.f10739v, textView.getPaddingTop(), s.this.f10740w, textView.getPaddingBottom());
                ColorStateList colorStateList = s.this.f10726i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                o(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(s.this.f10730m);
            navigationMenuItemView.setTextAppearance(s.this.f10727j);
            ColorStateList colorStateList2 = s.this.f10729l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = s.this.f10731n;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = s.this.f10732o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f10745i.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f10755b);
            s sVar = s.this;
            int i11 = sVar.f10733p;
            int i12 = sVar.f10734q;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(s.this.f10735r);
            s sVar2 = s.this;
            if (sVar2.f10741x) {
                navigationMenuItemView.setIconSize(sVar2.f10736s);
            }
            navigationMenuItemView.setMaxLines(s.this.f10743z);
            navigationMenuItemView.B(gVar.a(), s.this.f10728k);
            o(navigationMenuItemView, i10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                s sVar = s.this;
                return new i(sVar.f10724g, viewGroup, sVar.D);
            }
            if (i10 == 1) {
                return new k(s.this.f10724g, viewGroup);
            }
            if (i10 == 2) {
                return new j(s.this.f10724g, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new b(s.this.f10719b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).C();
            }
        }

        public final void m() {
            if (this.f10747k) {
                return;
            }
            this.f10747k = true;
            this.f10745i.clear();
            this.f10745i.add(new d());
            int size = s.this.f10721d.G().size();
            int i10 = -1;
            boolean z10 = false;
            int size2 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) s.this.f10721d.G().get(i11);
                if (fVar.isChecked()) {
                    p(fVar);
                }
                if (fVar.isCheckable()) {
                    fVar.t(false);
                }
                if (fVar.hasSubMenu()) {
                    SubMenu subMenu = fVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.f10745i.add(new f(s.this.B, 0));
                        }
                        this.f10745i.add(new g(fVar));
                        int size3 = this.f10745i.size();
                        int size4 = subMenu.size();
                        boolean z11 = false;
                        for (int i12 = 0; i12 < size4; i12++) {
                            androidx.appcompat.view.menu.f fVar2 = (androidx.appcompat.view.menu.f) subMenu.getItem(i12);
                            if (fVar2.isVisible()) {
                                if (!z11 && fVar2.getIcon() != null) {
                                    z11 = true;
                                }
                                if (fVar2.isCheckable()) {
                                    fVar2.t(false);
                                }
                                if (fVar2.isChecked()) {
                                    p(fVar2);
                                }
                                this.f10745i.add(new g(fVar2));
                            }
                        }
                        if (z11) {
                            f(size3, this.f10745i.size());
                        }
                    }
                } else {
                    int groupId = fVar.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f10745i.size();
                        z10 = fVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList arrayList = this.f10745i;
                            int i13 = s.this.B;
                            arrayList.add(new f(i13, i13));
                        }
                    } else if (!z10 && fVar.getIcon() != null) {
                        f(size2, this.f10745i.size());
                        z10 = true;
                    }
                    g gVar = new g(fVar);
                    gVar.f10755b = z10;
                    this.f10745i.add(gVar);
                    i10 = groupId;
                }
            }
            this.f10747k = false;
        }

        public void n(Bundle bundle) {
            androidx.appcompat.view.menu.f fVarA;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.f fVarA2;
            int i10 = bundle.getInt("android:menu:checked", 0);
            if (i10 != 0) {
                this.f10747k = true;
                int size = this.f10745i.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    e eVar = (e) this.f10745i.get(i11);
                    if ((eVar instanceof g) && (fVarA2 = ((g) eVar).a()) != null && fVarA2.getItemId() == i10) {
                        p(fVarA2);
                        break;
                    }
                    i11++;
                }
                this.f10747k = false;
                m();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f10745i.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = (e) this.f10745i.get(i12);
                    if ((eVar2 instanceof g) && (fVarA = ((g) eVar2).a()) != null && (actionView = fVarA.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(fVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public final void o(View view, int i10, boolean z10) {
            ViewCompat.j0(view, new a(i10, z10));
        }

        public void p(androidx.appcompat.view.menu.f fVar) {
            if (this.f10746j == fVar || !fVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.f fVar2 = this.f10746j;
            if (fVar2 != null) {
                fVar2.setChecked(false);
            }
            this.f10746j = fVar;
            fVar.setChecked(true);
        }

        public void q(boolean z10) {
            this.f10747k = z10;
        }

        public void r() {
            int size = this.f10745i.size();
            m();
            notifyDataSetChanged();
            if (size == this.f10745i.size()) {
                notifyItemRangeChanged(0, this.f10745i.size());
            }
        }

        public final void s() {
            for (int i10 = 0; i10 < this.f10745i.size(); i10++) {
                if (this.f10745i.get(i10) instanceof f) {
                    notifyItemChanged(i10);
                }
            }
        }

        public final void t() {
            for (int i10 = 0; i10 < this.f10745i.size(); i10++) {
                if ((this.f10745i.get(i10) instanceof g) && getItemViewType(i10) == 1) {
                    notifyItemChanged(i10);
                }
            }
        }

        public final void u() {
            for (int i10 = 0; i10 < this.f10745i.size(); i10++) {
                if ((this.f10745i.get(i10) instanceof g) && getItemViewType(i10) == 0) {
                    notifyItemChanged(i10);
                }
            }
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final int f10752a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10753b;

        public f(int i10, int i11) {
            this.f10752a = i10;
            this.f10753b = i11;
        }

        public int a() {
            return this.f10753b;
        }

        public int b() {
            return this.f10752a;
        }
    }

    public static class g implements e {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f10754a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10755b;

        public g(androidx.appcompat.view.menu.f fVar) {
            this.f10754a = fVar;
        }

        public androidx.appcompat.view.menu.f a() {
            return this.f10754a;
        }
    }

    public class h extends androidx.recyclerview.widget.k {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.k, androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            xVar.o0(x.e.a(s.this.f10723f.i(), 1, false));
        }
    }

    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(j4.h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(j4.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(j4.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class l extends RecyclerView.c0 {
        public l(View view) {
            super(view);
        }
    }

    public int A() {
        return this.f10739v;
    }

    public final boolean B() {
        return q() > 0;
    }

    public View C(int i10) {
        View viewInflate = this.f10724g.inflate(i10, (ViewGroup) this.f10719b, false);
        l(viewInflate);
        return viewInflate;
    }

    public void D(boolean z10) {
        if (this.f10742y != z10) {
            this.f10742y = z10;
            c0();
        }
    }

    public void E(androidx.appcompat.view.menu.f fVar) {
        this.f10723f.p(fVar);
    }

    public void F(int i10) {
        this.f10738u = i10;
        Z();
    }

    public void G(int i10) {
        this.f10737t = i10;
        Z();
    }

    public void H(int i10) {
        this.f10722e = i10;
    }

    public void I(Drawable drawable) {
        this.f10731n = drawable;
        b0();
    }

    public void J(RippleDrawable rippleDrawable) {
        this.f10732o = rippleDrawable;
        b0();
    }

    public void K(int i10) {
        this.f10733p = i10;
        b0();
    }

    public void L(int i10) {
        this.f10735r = i10;
        b0();
    }

    public void M(int i10) {
        if (this.f10736s != i10) {
            this.f10736s = i10;
            this.f10741x = true;
            b0();
        }
    }

    public void N(ColorStateList colorStateList) {
        this.f10730m = colorStateList;
        b0();
    }

    public void O(int i10) {
        this.f10743z = i10;
        b0();
    }

    public void P(int i10) {
        this.f10727j = i10;
        b0();
    }

    public void Q(boolean z10) {
        this.f10728k = z10;
        b0();
    }

    public void R(ColorStateList colorStateList) {
        this.f10729l = colorStateList;
        b0();
    }

    public void S(int i10) {
        this.f10734q = i10;
        b0();
    }

    public void T(int i10) {
        this.C = i10;
        NavigationMenuView navigationMenuView = this.f10718a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void U(ColorStateList colorStateList) {
        this.f10726i = colorStateList;
        a0();
    }

    public void V(int i10) {
        this.f10740w = i10;
        a0();
    }

    public void W(int i10) {
        this.f10739v = i10;
        a0();
    }

    public void X(int i10) {
        this.f10725h = i10;
        a0();
    }

    public void Y(boolean z10) {
        c cVar = this.f10723f;
        if (cVar != null) {
            cVar.q(z10);
        }
    }

    public final void Z() {
        c cVar = this.f10723f;
        if (cVar != null) {
            cVar.s();
        }
    }

    public final void a0() {
        c cVar = this.f10723f;
        if (cVar != null) {
            cVar.t();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
        h.a aVar = this.f10720c;
        if (aVar != null) {
            aVar.b(dVar, z10);
        }
    }

    public final void b0() {
        c cVar = this.f10723f;
        if (cVar != null) {
            cVar.u();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean c(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.f fVar) {
        return false;
    }

    public final void c0() {
        int i10 = (B() || !this.f10742y) ? 0 : this.A;
        NavigationMenuView navigationMenuView = this.f10718a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.h
    public void e(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f10718a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f10723f.n(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f10719b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean f(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public Parcelable g() {
        Bundle bundle = new Bundle();
        if (this.f10718a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f10718a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f10723f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.g());
        }
        if (this.f10719b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f10719b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.h
    public int getId() {
        return this.f10722e;
    }

    @Override // androidx.appcompat.view.menu.h
    public void h(boolean z10) {
        c cVar = this.f10723f;
        if (cVar != null) {
            cVar.r();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean j(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.f fVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(Context context, androidx.appcompat.view.menu.d dVar) {
        this.f10724g = LayoutInflater.from(context);
        this.f10721d = dVar;
        this.B = context.getResources().getDimensionPixelOffset(j4.d.design_navigation_separator_vertical_padding);
    }

    public void l(View view) {
        this.f10719b.addView(view);
        NavigationMenuView navigationMenuView = this.f10718a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void m(WindowInsetsCompat windowInsetsCompat) {
        int iL = windowInsetsCompat.l();
        if (this.A != iL) {
            this.A = iL;
            c0();
        }
        NavigationMenuView navigationMenuView = this.f10718a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.i());
        ViewCompat.g(this.f10719b, windowInsetsCompat);
    }

    public androidx.appcompat.view.menu.f n() {
        return this.f10723f.h();
    }

    public int o() {
        return this.f10738u;
    }

    public int p() {
        return this.f10737t;
    }

    public int q() {
        return this.f10719b.getChildCount();
    }

    public Drawable r() {
        return this.f10731n;
    }

    public int s() {
        return this.f10733p;
    }

    public int t() {
        return this.f10735r;
    }

    public int u() {
        return this.f10743z;
    }

    public ColorStateList v() {
        return this.f10729l;
    }

    public ColorStateList w() {
        return this.f10730m;
    }

    public int x() {
        return this.f10734q;
    }

    public androidx.appcompat.view.menu.i y(ViewGroup viewGroup) {
        if (this.f10718a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f10724g.inflate(j4.h.design_navigation_menu, viewGroup, false);
            this.f10718a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f10718a));
            if (this.f10723f == null) {
                c cVar = new c();
                this.f10723f = cVar;
                cVar.setHasStableIds(true);
            }
            int i10 = this.C;
            if (i10 != -1) {
                this.f10718a.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f10724g.inflate(j4.h.design_navigation_item_header, (ViewGroup) this.f10718a, false);
            this.f10719b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f10718a.setAdapter(this.f10723f);
        }
        return this.f10718a;
    }

    public int z() {
        return this.f10740w;
    }
}
