package n;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f22125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f22126b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22126b = rVar;
        this.f22125a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f22125a.onMenuItemClick(this.f22126b.j(menuItem));
    }
}
