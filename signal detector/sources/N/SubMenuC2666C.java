package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class SubMenuC2666C extends MenuC2677k implements SubMenu {

    /* renamed from: N, reason: collision with root package name */
    public final MenuC2677k f22007N;

    /* renamed from: O, reason: collision with root package name */
    public final m f22008O;

    public SubMenuC2666C(Context context, MenuC2677k menuC2677k, m mVar) {
        super(context);
        this.f22007N = menuC2677k;
        this.f22008O = mVar;
    }

    @Override // n.MenuC2677k
    public final boolean d(m mVar) {
        return this.f22007N.d(mVar);
    }

    @Override // n.MenuC2677k
    public final boolean e(MenuC2677k menuC2677k, MenuItem menuItem) {
        return super.e(menuC2677k, menuItem) || this.f22007N.e(menuC2677k, menuItem);
    }

    @Override // n.MenuC2677k
    public final boolean f(m mVar) {
        return this.f22007N.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f22008O;
    }

    @Override // n.MenuC2677k
    public final String j() {
        m mVar = this.f22008O;
        int i = mVar != null ? mVar.f22106a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC1135f5.l(i, "android:menu:actionviewstates:");
    }

    @Override // n.MenuC2677k
    public final MenuC2677k k() {
        return this.f22007N.k();
    }

    @Override // n.MenuC2677k
    public final boolean m() {
        return this.f22007N.m();
    }

    @Override // n.MenuC2677k
    public final boolean n() {
        return this.f22007N.n();
    }

    @Override // n.MenuC2677k
    public final boolean o() {
        return this.f22007N.o();
    }

    @Override // n.MenuC2677k, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f22007N.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f22008O.setIcon(drawable);
        return this;
    }

    @Override // n.MenuC2677k, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f22007N.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f22008O.setIcon(i);
        return this;
    }
}
