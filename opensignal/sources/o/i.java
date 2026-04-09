package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {
    public h B;

    /* renamed from: a, reason: collision with root package name */
    public Context f18600a;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f18601d;

    /* renamed from: g, reason: collision with root package name */
    public m f18602g;

    /* renamed from: r, reason: collision with root package name */
    public ExpandedMenuView f18603r;

    /* renamed from: x, reason: collision with root package name */
    public final int f18604x;

    /* renamed from: y, reason: collision with root package name */
    public x f18605y;

    public i(Context context, int i10) {
        this.f18604x = i10;
        this.f18600a = context;
        this.f18601d = LayoutInflater.from(context);
    }

    @Override // o.y
    public final void b(boolean z10) {
        h hVar = this.B;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final void c(m mVar, boolean z10) {
        x xVar = this.f18605y;
        if (xVar != null) {
            xVar.c(mVar, z10);
        }
    }

    @Override // o.y
    public final void d(Context context, m mVar) {
        if (this.f18600a != null) {
            this.f18600a = context;
            if (this.f18601d == null) {
                this.f18601d = LayoutInflater.from(context);
            }
        }
        this.f18602g = mVar;
        h hVar = this.B;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean e() {
        return false;
    }

    @Override // o.y
    public final boolean f(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f18613a;
        if (!zHasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f18635a = e0Var;
        i.f fVar = new i.f(context);
        i iVar = new i(fVar.getContext(), h.g.abc_list_menu_item_layout);
        nVar.f18637g = iVar;
        iVar.f18605y = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.f18637g;
        if (iVar2.B == null) {
            iVar2.B = new h(iVar2);
        }
        h hVar = iVar2.B;
        i.b bVar = fVar.f11045a;
        bVar.f11000m = hVar;
        bVar.f11001n = nVar;
        View view = e0Var.f18625o;
        if (view != null) {
            bVar.f10994e = view;
        } else {
            bVar.f10992c = e0Var.f18624n;
            fVar.setTitle(e0Var.f18623m);
        }
        bVar.f10999l = nVar;
        i.g gVarCreate = fVar.create();
        nVar.f18636d = gVarCreate;
        gVarCreate.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f18636d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f18636d.show();
        x xVar = this.f18605y;
        if (xVar == null) {
            return true;
        }
        xVar.Q(e0Var);
        return true;
    }

    @Override // o.y
    public final int getId() {
        return 0;
    }

    @Override // o.y
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f18603r.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // o.y
    public final void k(x xVar) {
        throw null;
    }

    @Override // o.y
    public final Parcelable l() {
        if (this.f18603r == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f18603r;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.y
    public final boolean m(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        this.f18602g.q(this.B.getItem(i10), this, 0);
    }
}
