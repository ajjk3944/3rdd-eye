package o;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f18665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f18666b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f18666b = tVar;
        this.f18665a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f18665a.onMenuItemActionCollapse(this.f18666b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f18665a.onMenuItemActionExpand(this.f18666b.g(menuItem));
    }
}
