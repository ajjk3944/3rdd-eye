package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uy0 extends od0 implements SubMenu {
    public final sd0 A;
    public final od0 z;

    public uy0(Context context, od0 od0Var, sd0 sd0Var) {
        super(context);
        this.z = od0Var;
        this.A = sd0Var;
    }

    @Override // defpackage.od0
    public final boolean d(sd0 sd0Var) {
        return this.z.d(sd0Var);
    }

    @Override // defpackage.od0
    public final boolean e(od0 od0Var, MenuItem menuItem) {
        return super.e(od0Var, menuItem) || this.z.e(od0Var, menuItem);
    }

    @Override // defpackage.od0
    public final boolean f(sd0 sd0Var) {
        return this.z.f(sd0Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.od0
    public final String j() {
        sd0 sd0Var = this.A;
        int i = sd0Var != null ? sd0Var.a : 0;
        if (i == 0) {
            return null;
        }
        return ex0.f("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.od0
    public final od0 k() {
        return this.z.k();
    }

    @Override // defpackage.od0
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.od0
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.od0
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.od0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.od0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
