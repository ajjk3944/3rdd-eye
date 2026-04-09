package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o.V;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6521b {

    /* renamed from: a, reason: collision with root package name */
    final Context f52315a;

    /* renamed from: b, reason: collision with root package name */
    private V f52316b;

    /* renamed from: c, reason: collision with root package name */
    private V f52317c;

    AbstractC6521b(Context context) {
        this.f52315a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof y1.b)) {
            return menuItem;
        }
        y1.b bVar = (y1.b) menuItem;
        if (this.f52316b == null) {
            this.f52316b = new V();
        }
        MenuItem menuItem2 = (MenuItem) this.f52316b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC6522c menuItemC6522c = new MenuItemC6522c(this.f52315a, bVar);
        this.f52316b.put(bVar, menuItemC6522c);
        return menuItemC6522c;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        V v10 = this.f52316b;
        if (v10 != null) {
            v10.clear();
        }
        V v11 = this.f52317c;
        if (v11 != null) {
            v11.clear();
        }
    }

    final void f(int i10) {
        if (this.f52316b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f52316b.size()) {
            if (((y1.b) this.f52316b.h(i11)).getGroupId() == i10) {
                this.f52316b.j(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f52316b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f52316b.size(); i11++) {
            if (((y1.b) this.f52316b.h(i11)).getItemId() == i10) {
                this.f52316b.j(i11);
                return;
            }
        }
    }
}
