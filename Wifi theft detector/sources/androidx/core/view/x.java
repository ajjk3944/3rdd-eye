package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2771a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2772b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Map f2773c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f2774a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.j f2775b;

        public a(Lifecycle lifecycle, androidx.lifecycle.j jVar) {
            this.f2774a = lifecycle;
            this.f2775b = jVar;
            lifecycle.a(jVar);
        }

        public void a() {
            this.f2774a.d(this.f2775b);
            this.f2775b = null;
        }
    }

    public x(Runnable runnable) {
        this.f2771a = runnable;
    }

    public static /* synthetic */ void a(x xVar, Lifecycle.State state, z zVar, androidx.lifecycle.n nVar, Lifecycle.Event event) {
        xVar.getClass();
        if (event == Lifecycle.Event.h(state)) {
            xVar.c(zVar);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            xVar.j(zVar);
        } else if (event == Lifecycle.Event.f(state)) {
            xVar.f2772b.remove(zVar);
            xVar.f2771a.run();
        }
    }

    public static /* synthetic */ void b(x xVar, z zVar, androidx.lifecycle.n nVar, Lifecycle.Event event) {
        xVar.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            xVar.j(zVar);
        }
    }

    public void c(z zVar) {
        this.f2772b.add(zVar);
        this.f2771a.run();
    }

    public void d(final z zVar, androidx.lifecycle.n nVar) {
        c(zVar);
        Lifecycle lifecycle = nVar.getLifecycle();
        a aVar = (a) this.f2773c.remove(zVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f2773c.put(zVar, new a(lifecycle, new androidx.lifecycle.j() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.j
            public final void onStateChanged(androidx.lifecycle.n nVar2, Lifecycle.Event event) {
                x.b(this.f2764a, zVar, nVar2, event);
            }
        }));
    }

    public void e(final z zVar, androidx.lifecycle.n nVar, final Lifecycle.State state) {
        Lifecycle lifecycle = nVar.getLifecycle();
        a aVar = (a) this.f2773c.remove(zVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f2773c.put(zVar, new a(lifecycle, new androidx.lifecycle.j() { // from class: androidx.core.view.v
            @Override // androidx.lifecycle.j
            public final void onStateChanged(androidx.lifecycle.n nVar2, Lifecycle.Event event) {
                x.a(this.f2758a, state, zVar, nVar2, event);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f2772b.iterator();
        while (it.hasNext()) {
            ((z) it.next()).d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f2772b.iterator();
        while (it.hasNext()) {
            ((z) it.next()).a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f2772b.iterator();
        while (it.hasNext()) {
            if (((z) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f2772b.iterator();
        while (it.hasNext()) {
            ((z) it.next()).b(menu);
        }
    }

    public void j(z zVar) {
        this.f2772b.remove(zVar);
        a aVar = (a) this.f2773c.remove(zVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f2771a.run();
    }
}
