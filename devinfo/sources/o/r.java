package o;

import android.view.MenuItem;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f30291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f30292b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f30292b = tVar;
        this.f30291a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f30291a.onMenuItemActionCollapse(this.f30292b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f30291a.onMenuItemActionExpand(this.f30292b.g(menuItem));
    }
}
