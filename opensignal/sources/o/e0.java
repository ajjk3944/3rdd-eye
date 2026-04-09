package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z, reason: collision with root package name */
    public final m f18589z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f18589z = mVar;
        this.A = oVar;
    }

    @Override // o.m
    public final boolean d(o oVar) {
        return this.f18589z.d(oVar);
    }

    @Override // o.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f18589z.e(mVar, menuItem);
    }

    @Override // o.m
    public final boolean f(o oVar) {
        return this.f18589z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.m
    public final String j() {
        o oVar = this.A;
        int i10 = oVar != null ? oVar.f18638a : 0;
        if (i10 == 0) {
            return null;
        }
        return h0.b.h(i10, "android:menu:actionviewstates:");
    }

    @Override // o.m
    public final m k() {
        return this.f18589z.k();
    }

    @Override // o.m
    public final boolean m() {
        return this.f18589z.m();
    }

    @Override // o.m
    public final boolean n() {
        return this.f18589z.n();
    }

    @Override // o.m
    public final boolean o() {
        return this.f18589z.o();
    }

    @Override // o.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f18589z.setGroupDividerEnabled(z10);
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
    public final void setQwertyMode(boolean z10) {
        this.f18589z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
