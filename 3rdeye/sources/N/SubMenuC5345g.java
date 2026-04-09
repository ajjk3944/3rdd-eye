package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuWrapperICS.java */
/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC5345g extends MenuC5343e implements SubMenu {

    /* renamed from: e, reason: collision with root package name */
    public final E0.c f44189e;

    public SubMenuC5345g(Context context, E0.c cVar) {
        super(context, cVar);
        this.f44189e = cVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f44189e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return f(this.f44189e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f44189e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f44189e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f44189e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f44189e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f44189e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f44189e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f44189e.setIcon(drawable);
        return this;
    }
}
