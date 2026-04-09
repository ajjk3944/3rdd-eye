package F1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import f.AbstractC5487d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: F1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2781x {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f5803a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f5804b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f5805c = new HashMap();

    public C2781x(Runnable runnable) {
        this.f5803a = runnable;
    }

    public void a(InterfaceC2784z interfaceC2784z) {
        this.f5804b.add(interfaceC2784z);
        this.f5803a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f5804b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2784z) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f5804b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2784z) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f5804b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2784z) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f5804b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2784z) it.next()).d(menu);
        }
    }

    public void f(InterfaceC2784z interfaceC2784z) {
        this.f5804b.remove(interfaceC2784z);
        AbstractC5487d.a(this.f5805c.remove(interfaceC2784z));
        this.f5803a.run();
    }
}
