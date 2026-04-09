package n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b9.C2001h;
import b9.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import m0.C5316i;
import w1.k;

/* compiled from: BaseMenuWrapper.java */
/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5340b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f44174a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44175b;

    /* renamed from: c, reason: collision with root package name */
    public Object f44176c;

    public AbstractC5340b(Context context) {
        this.f44174a = context;
    }

    public F1.f c() {
        ((k) this.f44174a).a();
        return ((AtomicBoolean) this.f44175b).compareAndSet(false, true) ? (F1.f) ((p) this.f44176c).getValue() : d();
    }

    public F1.f d() {
        String strE = e();
        k kVar = (k) this.f44174a;
        kVar.getClass();
        kVar.a();
        kVar.b();
        return kVar.i().getWritableDatabase().t(strE);
    }

    public abstract String e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof E0.b)) {
            return menuItem;
        }
        E0.b bVar = (E0.b) menuItem;
        if (((C5316i) this.f44175b) == null) {
            this.f44175b = new C5316i();
        }
        MenuItem menuItem2 = (MenuItem) ((C5316i) this.f44175b).get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC5341c menuItemC5341c = new MenuItemC5341c((Context) this.f44174a, bVar);
        ((C5316i) this.f44175b).put(bVar, menuItemC5341c);
        return menuItemC5341c;
    }

    public SubMenu g(SubMenu subMenu) {
        if (!(subMenu instanceof E0.c)) {
            return subMenu;
        }
        E0.c cVar = (E0.c) subMenu;
        if (((C5316i) this.f44176c) == null) {
            this.f44176c = new C5316i();
        }
        SubMenu subMenu2 = (SubMenu) ((C5316i) this.f44176c).get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC5345g subMenuC5345g = new SubMenuC5345g((Context) this.f44174a, cVar);
        ((C5316i) this.f44176c).put(cVar, subMenuC5345g);
        return subMenuC5345g;
    }

    public void h(F1.f statement) {
        l.f(statement, "statement");
        if (statement == ((F1.f) ((p) this.f44176c).getValue())) {
            ((AtomicBoolean) this.f44175b).set(false);
        }
    }

    public AbstractC5340b(k database) {
        l.f(database, "database");
        this.f44174a = database;
        this.f44175b = new AtomicBoolean(false);
        this.f44176c = C2001h.b(new G1.e(this, 9));
    }
}
