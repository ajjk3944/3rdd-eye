package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f2638a;

    /* renamed from: b, reason: collision with root package name */
    private Map<v.b, MenuItem> f2639b;

    /* renamed from: c, reason: collision with root package name */
    private Map<v.c, SubMenu> f2640c;

    b(Context context) {
        this.f2638a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof v.b)) {
            return menuItem;
        }
        v.b bVar = (v.b) menuItem;
        if (this.f2639b == null) {
            this.f2639b = new k.a();
        }
        MenuItem menuItem2 = this.f2639b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f2638a, bVar);
        this.f2639b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof v.c)) {
            return subMenu;
        }
        v.c cVar = (v.c) subMenu;
        if (this.f2640c == null) {
            this.f2640c = new k.a();
        }
        SubMenu subMenu2 = this.f2640c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f2638a, cVar);
        this.f2640c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        Map<v.b, MenuItem> map = this.f2639b;
        if (map != null) {
            map.clear();
        }
        Map<v.c, SubMenu> map2 = this.f2640c;
        if (map2 != null) {
            map2.clear();
        }
    }

    final void f(int i2) {
        Map<v.b, MenuItem> map = this.f2639b;
        if (map == null) {
            return;
        }
        Iterator<v.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i2 == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void g(int i2) {
        Map<v.b, MenuItem> map = this.f2639b;
        if (map == null) {
            return;
        }
        Iterator<v.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i2 == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
