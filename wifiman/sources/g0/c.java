package G0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f6757a;

    /* renamed from: b, reason: collision with root package name */
    private C6533i f6758b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6824a f6759c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6824a f6760d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6824a f6761e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6824a f6762f;

    public c(InterfaceC6824a interfaceC6824a, C6533i c6533i, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC6824a interfaceC6824a4, InterfaceC6824a interfaceC6824a5) {
        this.f6757a = interfaceC6824a;
        this.f6758b = c6533i;
        this.f6759c = interfaceC6824a2;
        this.f6760d = interfaceC6824a3;
        this.f6761e = interfaceC6824a4;
        this.f6762f = interfaceC6824a5;
    }

    private final void b(Menu menu, b bVar, InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a != null && menu.findItem(bVar.getId()) == null) {
            a(menu, bVar);
        } else {
            if (interfaceC6824a != null || menu.findItem(bVar.getId()) == null) {
                return;
            }
            menu.removeItem(bVar.getId());
        }
    }

    public final void a(Menu menu, b bVar) {
        menu.add(0, bVar.getId(), bVar.getOrder(), bVar.getTitleResource()).setShowAsAction(1);
    }

    public final C6533i c() {
        return this.f6758b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        AbstractC6492s.f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.getId()) {
            InterfaceC6824a interfaceC6824a = this.f6759c;
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
        } else if (itemId == b.Paste.getId()) {
            InterfaceC6824a interfaceC6824a2 = this.f6760d;
            if (interfaceC6824a2 != null) {
                interfaceC6824a2.invoke();
            }
        } else if (itemId == b.Cut.getId()) {
            InterfaceC6824a interfaceC6824a3 = this.f6761e;
            if (interfaceC6824a3 != null) {
                interfaceC6824a3.invoke();
            }
        } else {
            if (itemId != b.SelectAll.getId()) {
                return false;
            }
            InterfaceC6824a interfaceC6824a4 = this.f6762f;
            if (interfaceC6824a4 != null) {
                interfaceC6824a4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f6759c != null) {
            a(menu, b.Copy);
        }
        if (this.f6760d != null) {
            a(menu, b.Paste);
        }
        if (this.f6761e != null) {
            a(menu, b.Cut);
        }
        if (this.f6762f == null) {
            return true;
        }
        a(menu, b.SelectAll);
        return true;
    }

    public final void f() {
        InterfaceC6824a interfaceC6824a = this.f6757a;
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(InterfaceC6824a interfaceC6824a) {
        this.f6759c = interfaceC6824a;
    }

    public final void i(InterfaceC6824a interfaceC6824a) {
        this.f6761e = interfaceC6824a;
    }

    public final void j(InterfaceC6824a interfaceC6824a) {
        this.f6760d = interfaceC6824a;
    }

    public final void k(InterfaceC6824a interfaceC6824a) {
        this.f6762f = interfaceC6824a;
    }

    public final void l(C6533i c6533i) {
        this.f6758b = c6533i;
    }

    public final void m(Menu menu) {
        b(menu, b.Copy, this.f6759c);
        b(menu, b.Paste, this.f6760d);
        b(menu, b.Cut, this.f6761e);
        b(menu, b.SelectAll, this.f6762f);
    }

    public /* synthetic */ c(InterfaceC6824a interfaceC6824a, C6533i c6533i, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC6824a interfaceC6824a4, InterfaceC6824a interfaceC6824a5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC6824a, (i10 & 2) != 0 ? C6533i.f52340e.a() : c6533i, (i10 & 4) != 0 ? null : interfaceC6824a2, (i10 & 8) != 0 ? null : interfaceC6824a3, (i10 & 16) != 0 ? null : interfaceC6824a4, (i10 & 32) != 0 ? null : interfaceC6824a5);
    }
}
