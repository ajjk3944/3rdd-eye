package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c70 implements fe0, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public od0 h;
    public ExpandedMenuView i;
    public ee0 j;
    public b70 k;

    public c70(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.fe0
    public final boolean b(sd0 sd0Var) {
        return false;
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
        ee0 ee0Var = this.j;
        if (ee0Var != null) {
            ee0Var.f(od0Var, z);
        }
    }

    @Override // defpackage.fe0
    public final void g() {
        b70 b70Var = this.k;
        if (b70Var != null) {
            b70Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fe0
    public final void i(Context context, od0 od0Var) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = od0Var;
        b70 b70Var = this.k;
        if (b70Var != null) {
            b70Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fe0
    public final boolean j(uy0 uy0Var) {
        boolean zHasVisibleItems = uy0Var.hasVisibleItems();
        Context context = uy0Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        pd0 pd0Var = new pd0();
        pd0Var.f = uy0Var;
        t3 t3Var = new t3(context);
        p3 p3Var = (p3) t3Var.h;
        c70 c70Var = new c70(p3Var.a);
        pd0Var.h = c70Var;
        c70Var.j = pd0Var;
        uy0Var.b(c70Var, context);
        c70 c70Var2 = pd0Var.h;
        if (c70Var2.k == null) {
            c70Var2.k = new b70(c70Var2);
        }
        p3Var.m = c70Var2.k;
        p3Var.n = pd0Var;
        View view = uy0Var.o;
        if (view != null) {
            p3Var.e = view;
        } else {
            p3Var.c = uy0Var.n;
            p3Var.d = uy0Var.m;
        }
        p3Var.k = pd0Var;
        u3 u3VarB = t3Var.b();
        pd0Var.g = u3VarB;
        u3VarB.setOnDismissListener(pd0Var);
        WindowManager.LayoutParams attributes = pd0Var.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pd0Var.g.show();
        ee0 ee0Var = this.j;
        if (ee0Var == null) {
            return true;
        }
        ee0Var.r(uy0Var);
        return true;
    }

    @Override // defpackage.fe0
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
