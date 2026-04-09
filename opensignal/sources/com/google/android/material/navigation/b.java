package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import o.e0;
import o.m;
import o.o;
import o.y;
import t7.u;
import zd.e;
import zd.g;
import zd.h;
import zd.j;

/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: a, reason: collision with root package name */
    public kd.b f5672a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5673d;

    /* renamed from: g, reason: collision with root package name */
    public int f5674g;

    @Override // o.y
    public final void b(boolean z10) {
        g gVar;
        t7.a aVar;
        if (this.f5673d) {
            return;
        }
        if (z10) {
            this.f5672a.a();
            return;
        }
        kd.b bVar = this.f5672a;
        g gVar2 = bVar.f27347l0;
        if (gVar2 == null || bVar.B == null) {
            return;
        }
        bVar.f27346k0.f5673d = true;
        gVar2.b();
        bVar.f27346k0.f5673d = false;
        if (bVar.B != null && (gVar = bVar.f27347l0) != null && gVar.f27327b.size() == bVar.B.length) {
            for (int i10 = 0; i10 < bVar.B.length; i10++) {
                if (!(bVar.f27347l0.a(i10) instanceof zd.a) || (bVar.B[i10] instanceof zd.b)) {
                    boolean z11 = bVar.f27347l0.a(i10).hasSubMenu() && !(bVar.B[i10] instanceof j);
                    boolean z12 = (bVar.f27347l0.a(i10).hasSubMenu() || (bVar.B[i10] instanceof e)) ? false : true;
                    if ((bVar.f27347l0.a(i10) instanceof zd.a) || (!z11 && !z12)) {
                    }
                }
            }
            int i11 = bVar.D;
            int size = bVar.f27347l0.f27327b.size();
            for (int i12 = 0; i12 < size; i12++) {
                MenuItem menuItemA = bVar.f27347l0.a(i12);
                if (menuItemA.isChecked()) {
                    bVar.setCheckedItem(menuItemA);
                    bVar.D = menuItemA.getItemId();
                    bVar.E = i12;
                }
            }
            if (i11 != bVar.D && (aVar = bVar.f27333a) != null) {
                u.a(bVar, aVar);
            }
            int i13 = bVar.f27358x;
            boolean z13 = i13 != -1 ? i13 == 0 : bVar.getCurrentVisibleContentItemCount() > 3;
            for (int i14 = 0; i14 < size; i14++) {
                bVar.f27346k0.f5673d = true;
                bVar.B[i14].setExpanded(bVar.f27352q0);
                h hVar = bVar.B[i14];
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    eVar.setLabelVisibilityMode(bVar.f27358x);
                    eVar.setItemIconGravity(bVar.f27359y);
                    eVar.setItemGravity(bVar.f27342g0);
                    eVar.setShifting(z13);
                }
                if (bVar.f27347l0.a(i14) instanceof o) {
                    bVar.B[i14].a((o) bVar.f27347l0.a(i14));
                }
                bVar.f27346k0.f5673d = false;
            }
            return;
        }
        bVar.a();
    }

    @Override // o.y
    public final void d(Context context, m mVar) {
        this.f5672a.b(mVar);
    }

    @Override // o.y
    public final boolean e() {
        return false;
    }

    @Override // o.y
    public final boolean f(e0 e0Var) {
        return false;
    }

    @Override // o.y
    public final int getId() {
        return this.f5674g;
    }

    @Override // o.y
    public final void h(Parcelable parcelable) {
        if (parcelable instanceof NavigationBarPresenter$SavedState) {
            kd.b bVar = this.f5672a;
            NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
            int i10 = navigationBarPresenter$SavedState.f5669a;
            int size = bVar.f27347l0.f27327b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem menuItemA = bVar.f27347l0.a(i11);
                if (i10 == menuItemA.getItemId()) {
                    bVar.D = i10;
                    bVar.E = i11;
                    bVar.setCheckedItem(menuItemA);
                    break;
                }
                i11++;
            }
            Context context = this.f5672a.getContext();
            ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.f5670d;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i12 = 0; i12 < parcelableSparseArray.size(); i12++) {
                int iKeyAt = parcelableSparseArray.keyAt(i12);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i12);
                sparseArray.put(iKeyAt, badgeState$State != null ? new hd.a(context, badgeState$State) : null);
            }
            kd.b bVar2 = this.f5672a;
            SparseArray sparseArray2 = bVar2.R;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int iKeyAt2 = sparseArray.keyAt(i13);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (hd.a) sparseArray.get(iKeyAt2));
                }
            }
            h[] hVarArr = bVar2.B;
            if (hVarArr != null) {
                for (h hVar : hVarArr) {
                    if (hVar instanceof e) {
                        e eVar = (e) hVar;
                        hd.a aVar = (hd.a) sparseArray2.get(eVar.getId());
                        if (aVar != null) {
                            eVar.setBadge(aVar);
                        }
                    }
                }
            }
        }
    }

    @Override // o.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // o.y
    public final Parcelable l() {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.f5669a = this.f5672a.getSelectedItemId();
        SparseArray<hd.a> badgeDrawables = this.f5672a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int iKeyAt = badgeDrawables.keyAt(i10);
            hd.a aVarValueAt = badgeDrawables.valueAt(i10);
            parcelableSparseArray.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f10624x.f10626a : null);
        }
        navigationBarPresenter$SavedState.f5670d = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }

    @Override // o.y
    public final boolean m(o oVar) {
        return false;
    }

    @Override // o.y
    public final void c(m mVar, boolean z10) {
    }
}
