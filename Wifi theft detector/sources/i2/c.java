package i2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.p;

/* loaded from: classes.dex */
public abstract class c implements h2.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f21562a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f21563b;

    /* renamed from: c, reason: collision with root package name */
    public j2.d f21564c;

    /* renamed from: d, reason: collision with root package name */
    public a f21565d;

    public interface a {
        void a(List list);

        void b(List list);
    }

    public c(j2.d dVar) {
        this.f21564c = dVar;
    }

    @Override // h2.a
    public void a(Object obj) {
        this.f21563b = obj;
        h(this.f21565d, obj);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(Object obj);

    public boolean d(String str) {
        Object obj = this.f21563b;
        return obj != null && c(obj) && this.f21562a.contains(str);
    }

    public void e(Iterable iterable) {
        this.f21562a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f21562a.add(pVar.f23092a);
            }
        }
        if (this.f21562a.isEmpty()) {
            this.f21564c.c(this);
        } else {
            this.f21564c.a(this);
        }
        h(this.f21565d, this.f21563b);
    }

    public void f() {
        if (this.f21562a.isEmpty()) {
            return;
        }
        this.f21562a.clear();
        this.f21564c.c(this);
    }

    public void g(a aVar) {
        if (this.f21565d != aVar) {
            this.f21565d = aVar;
            h(aVar, this.f21563b);
        }
    }

    public final void h(a aVar, Object obj) {
        if (this.f21562a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.f21562a);
        } else {
            aVar.a(this.f21562a);
        }
    }
}
