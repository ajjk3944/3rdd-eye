package i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import r.k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21508a;

    /* renamed from: b, reason: collision with root package name */
    public k f21509b;

    /* renamed from: c, reason: collision with root package name */
    public k f21510c;

    public b(Context context) {
        this.f21508a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof l0.b)) {
            return menuItem;
        }
        l0.b bVar = (l0.b) menuItem;
        if (this.f21509b == null) {
            this.f21509b = new k();
        }
        MenuItem menuItem2 = (MenuItem) this.f21509b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f21508a, bVar);
        this.f21509b.put(bVar, cVar);
        return cVar;
    }

    public final void e() {
        k kVar = this.f21509b;
        if (kVar != null) {
            kVar.clear();
        }
        k kVar2 = this.f21510c;
        if (kVar2 != null) {
            kVar2.clear();
        }
    }

    public final void f(int i10) {
        if (this.f21509b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f21509b.size()) {
            if (((l0.b) this.f21509b.h(i11)).getGroupId() == i10) {
                this.f21509b.j(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void g(int i10) {
        if (this.f21509b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f21509b.size(); i11++) {
            if (((l0.b) this.f21509b.h(i11)).getItemId() == i10) {
                this.f21509b.j(i11);
                return;
            }
        }
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
