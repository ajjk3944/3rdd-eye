package A3;

import L0.C0156a;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import g3.C2332a;
import g3.C2334c;
import j3.C2562b;
import n.MenuC2677k;
import n.SubMenuC2666C;

/* loaded from: classes.dex */
public final class s implements n.w {

    /* renamed from: a, reason: collision with root package name */
    public C2562b f494a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f495b;

    /* renamed from: c, reason: collision with root package name */
    public int f496c;

    @Override // n.w
    public final void b(boolean z6) {
        m mVar;
        C0156a c0156a;
        if (this.f495b) {
            return;
        }
        if (z6) {
            this.f494a.a();
            return;
        }
        C2562b c2562b = this.f494a;
        m mVar2 = c2562b.f472d0;
        if (mVar2 == null || c2562b.f477g == null) {
            return;
        }
        c2562b.f470c0.f495b = true;
        mVar2.b();
        c2562b.f470c0.f495b = false;
        if (c2562b.f477g != null && (mVar = c2562b.f472d0) != null && mVar.f438b.size() == c2562b.f477g.length) {
            for (int i = 0; i < c2562b.f477g.length; i++) {
                if (!(c2562b.f472d0.a(i) instanceof MenuItemC0132a) || (c2562b.f477g[i] instanceof C0136e)) {
                    boolean z7 = c2562b.f472d0.a(i).hasSubMenu() && !(c2562b.f477g[i] instanceof t);
                    boolean z8 = (c2562b.f472d0.a(i).hasSubMenu() || (c2562b.f477g[i] instanceof k)) ? false : true;
                    if ((c2562b.f472d0.a(i) instanceof MenuItemC0132a) || (!z7 && !z8)) {
                    }
                }
            }
            int i3 = c2562b.f479h;
            int size = c2562b.f472d0.f438b.size();
            for (int i6 = 0; i6 < size; i6++) {
                MenuItem menuItemA = c2562b.f472d0.a(i6);
                if (menuItemA.isChecked()) {
                    c2562b.setCheckedItem(menuItemA);
                    c2562b.f479h = menuItemA.getItemId();
                    c2562b.i = i6;
                }
            }
            if (i3 != c2562b.f479h && (c0156a = c2562b.f466a) != null) {
                L0.p.a(c2562b, c0156a);
            }
            int i7 = c2562b.f473e;
            boolean z9 = i7 != -1 ? i7 == 0 : c2562b.getCurrentVisibleContentItemCount() > 3;
            for (int i8 = 0; i8 < size; i8++) {
                c2562b.f470c0.f495b = true;
                c2562b.f477g[i8].setExpanded(c2562b.f481i0);
                n nVar = c2562b.f477g[i8];
                if (nVar instanceof k) {
                    k kVar = (k) nVar;
                    kVar.setLabelVisibilityMode(c2562b.f473e);
                    kVar.setItemIconGravity(c2562b.f475f);
                    kVar.setItemGravity(c2562b.f464V);
                    kVar.setShifting(z9);
                }
                if (c2562b.f472d0.a(i8) instanceof n.m) {
                    c2562b.f477g[i8].a((n.m) c2562b.f472d0.a(i8));
                }
                c2562b.f470c0.f495b = false;
            }
            return;
        }
        c2562b.a();
    }

    @Override // n.w
    public final void d(Context context, MenuC2677k menuC2677k) {
        this.f494a.b(menuC2677k);
    }

    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) {
        return false;
    }

    @Override // n.w
    public final boolean f() {
        return false;
    }

    @Override // n.w
    public final int getId() {
        return this.f496c;
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
        if (parcelable instanceof r) {
            C2562b c2562b = this.f494a;
            r rVar = (r) parcelable;
            int i = rVar.f492a;
            int size = c2562b.f472d0.f438b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MenuItem menuItemA = c2562b.f472d0.a(i3);
                if (i == menuItemA.getItemId()) {
                    c2562b.f479h = i;
                    c2562b.i = i3;
                    c2562b.setCheckedItem(menuItemA);
                    break;
                }
                i3++;
            }
            Context context = this.f494a.getContext();
            x3.s sVar = rVar.f493b;
            SparseArray sparseArray = new SparseArray(sVar.size());
            for (int i6 = 0; i6 < sVar.size(); i6++) {
                int iKeyAt = sVar.keyAt(i6);
                C2334c c2334c = (C2334c) sVar.valueAt(i6);
                sparseArray.put(iKeyAt, c2334c != null ? new C2332a(context, c2334c) : null);
            }
            C2562b c2562b2 = this.f494a;
            SparseArray sparseArray2 = c2562b2.f453J;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                int iKeyAt2 = sparseArray.keyAt(i7);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (C2332a) sparseArray.get(iKeyAt2));
                }
            }
            n[] nVarArr = c2562b2.f477g;
            if (nVarArr != null) {
                for (n nVar : nVarArr) {
                    if (nVar instanceof k) {
                        k kVar = (k) nVar;
                        C2332a c2332a = (C2332a) sparseArray2.get(kVar.getId());
                        if (c2332a != null) {
                            kVar.setBadge(c2332a);
                        }
                    }
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
        r rVar = new r();
        rVar.f492a = this.f494a.getSelectedItemId();
        SparseArray<C2332a> badgeDrawables = this.f494a.getBadgeDrawables();
        x3.s sVar = new x3.s();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            C2332a c2332aValueAt = badgeDrawables.valueAt(i);
            sVar.put(iKeyAt, c2332aValueAt != null ? c2332aValueAt.f20172e.f20210a : null);
        }
        rVar.f493b = sVar;
        return rVar;
    }

    @Override // n.w
    public final boolean m(n.m mVar) {
        return false;
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
    }
}
