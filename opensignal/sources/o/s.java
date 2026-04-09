package o;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f18667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f18668b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18668b = tVar;
        this.f18667a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f18667a.onMenuItemClick(this.f18668b.g(menuItem));
    }
}
