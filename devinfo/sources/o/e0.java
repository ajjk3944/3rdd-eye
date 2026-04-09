package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z, reason: collision with root package name */
    public final m f30196z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f30196z = mVar;
        this.A = oVar;
    }

    @Override // o.m
    public final boolean d(o oVar) {
        return this.f30196z.d(oVar);
    }

    @Override // o.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f30196z.e(mVar, menuItem);
    }

    @Override // o.m
    public final boolean f(o oVar) {
        return this.f30196z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.m
    public final String j() {
        o oVar = this.A;
        int i4 = oVar != null ? oVar.f30263a : 0;
        if (i4 == 0) {
            return null;
        }
        return je.u.r(i4, "android:menu:actionviewstates:");
    }

    @Override // o.m
    public final m k() {
        return this.f30196z.k();
    }

    @Override // o.m
    public final boolean m() {
        return this.f30196z.m();
    }

    @Override // o.m
    public final boolean n() {
        return this.f30196z.n();
    }

    @Override // o.m
    public final boolean o() {
        return this.f30196z.o();
    }

    @Override // o.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f30196z.setGroupDividerEnabled(z3);
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

    @Override // o.m, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f30196z.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        u(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        u(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.A.setIcon(i4);
        return this;
    }
}
