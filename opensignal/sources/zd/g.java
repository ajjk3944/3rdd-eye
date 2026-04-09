package zd;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import o.m;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final m f27326a;

    /* renamed from: c, reason: collision with root package name */
    public int f27328c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f27329d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f27330e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27327b = new ArrayList();

    public g(m mVar) {
        this.f27326a = mVar;
        b();
    }

    public final MenuItem a(int i10) {
        return (MenuItem) this.f27327b.get(i10);
    }

    public final void b() {
        ArrayList arrayList = this.f27327b;
        arrayList.clear();
        this.f27328c = 0;
        this.f27329d = 0;
        this.f27330e = 0;
        int i10 = 0;
        while (true) {
            m mVar = this.f27326a;
            if (i10 >= mVar.f18618f.size()) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(h0.b.f(1, arrayList) instanceof a) && item.isVisible()) {
                    arrayList.add(new a());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f27328c++;
                    if (item2.isVisible()) {
                        this.f27329d++;
                    }
                }
                arrayList.add(new a());
            } else {
                arrayList.add(item);
                this.f27328c++;
                if (item.isVisible()) {
                    this.f27329d++;
                    this.f27330e++;
                }
            }
            i10++;
        }
        if (arrayList.isEmpty() || !(h0.b.f(1, arrayList) instanceof a)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
