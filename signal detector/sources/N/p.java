package n;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class p implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f22123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f22124b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f22124b = rVar;
        this.f22123a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f22123a.onMenuItemActionCollapse(this.f22124b.j(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f22123a.onMenuItemActionExpand(this.f22124b.j(menuItem));
    }
}
