package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f30225a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f30226b;

    /* renamed from: c, reason: collision with root package name */
    public m f30227c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f30228d;

    /* renamed from: e, reason: collision with root package name */
    public x f30229e;

    /* renamed from: f, reason: collision with root package name */
    public h f30230f;

    public i(ContextWrapper contextWrapper) {
        this.f30225a = contextWrapper;
        this.f30226b = LayoutInflater.from(contextWrapper);
    }

    @Override // o.y
    public final void b(Context context, m mVar) {
        if (this.f30225a != null) {
            this.f30225a = context;
            if (this.f30226b == null) {
                this.f30226b = LayoutInflater.from(context);
            }
        }
        this.f30227c = mVar;
        h hVar = this.f30230f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean c() {
        return false;
    }

    @Override // o.y
    public final boolean d(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f30238a;
        if (!zHasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f30260a = e0Var;
        t7.m mVar = new t7.m(context);
        i.b bVar = (i.b) mVar.f34474c;
        i iVar = new i(bVar.f25230a);
        nVar.f30262c = iVar;
        iVar.f30229e = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.f30262c;
        if (iVar2.f30230f == null) {
            iVar2.f30230f = new h(iVar2);
        }
        bVar.f25245r = iVar2.f30230f;
        bVar.f25246s = nVar;
        View view = e0Var.f30250o;
        if (view != null) {
            bVar.f25234e = view;
        } else {
            bVar.f25232c = e0Var.f30249n;
            bVar.f25233d = e0Var.f30248m;
        }
        bVar.f25243p = nVar;
        i.e eVarF = mVar.f();
        nVar.f30261b = eVarF;
        eVarF.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f30261b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f30261b.show();
        x xVar = this.f30229e;
        if (xVar == null) {
            return true;
        }
        xVar.v(e0Var);
        return true;
    }

    @Override // o.y
    public final void e(m mVar, boolean z3) {
        x xVar = this.f30229e;
        if (xVar != null) {
            xVar.e(mVar, z3);
        }
    }

    @Override // o.y
    public final void f() {
        h hVar = this.f30230f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final boolean g(o oVar) {
        return false;
    }

    @Override // o.y
    public final void i(x xVar) {
        throw null;
    }

    @Override // o.y
    public final boolean j(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        this.f30227c.q(this.f30230f.getItem(i4), this, 0);
    }
}
