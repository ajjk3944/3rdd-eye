package A3;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import n.MenuC2677k;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC2677k f437a;

    /* renamed from: c, reason: collision with root package name */
    public int f439c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f440d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f441e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f438b = new ArrayList();

    public m(MenuC2677k menuC2677k) {
        this.f437a = menuC2677k;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.f438b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.f438b;
        arrayList.clear();
        this.f439c = 0;
        this.f440d = 0;
        this.f441e = 0;
        int i = 0;
        while (true) {
            MenuC2677k menuC2677k = this.f437a;
            if (i >= menuC2677k.f22081f.size()) {
                break;
            }
            MenuItem item = menuC2677k.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(arrayList.get(arrayList.size() - 1) instanceof MenuItemC0132a) && item.isVisible()) {
                    arrayList.add(new MenuItemC0132a());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i3 = 0; i3 < subMenu.size(); i3++) {
                    MenuItem item2 = subMenu.getItem(i3);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f439c++;
                    if (item2.isVisible()) {
                        this.f440d++;
                    }
                }
                arrayList.add(new MenuItemC0132a());
            } else {
                arrayList.add(item);
                this.f439c++;
                if (item.isVisible()) {
                    this.f440d++;
                    this.f441e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof MenuItemC0132a)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
