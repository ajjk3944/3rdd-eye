package Q2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set f19163a = Collections.newSetFromMap(new WeakHashMap());

    @Override // Q2.l
    public void a() {
        Iterator it = W2.l.j(this.f19163a).iterator();
        while (it.hasNext()) {
            ((T2.d) it.next()).a();
        }
    }

    @Override // Q2.l
    public void b() {
        Iterator it = W2.l.j(this.f19163a).iterator();
        while (it.hasNext()) {
            ((T2.d) it.next()).b();
        }
    }

    public void c() {
        this.f19163a.clear();
    }

    @Override // Q2.l
    public void f() {
        Iterator it = W2.l.j(this.f19163a).iterator();
        while (it.hasNext()) {
            ((T2.d) it.next()).f();
        }
    }

    public List m() {
        return W2.l.j(this.f19163a);
    }

    public void n(T2.d dVar) {
        this.f19163a.add(dVar);
    }

    public void o(T2.d dVar) {
        this.f19163a.remove(dVar);
    }
}
