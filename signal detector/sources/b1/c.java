package b1;

import V0.m;
import a1.C0264c;
import a1.InterfaceC0263b;
import c1.AbstractC0400d;
import e1.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5710a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f5711b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0400d f5712c;

    /* renamed from: d, reason: collision with root package name */
    public b f5713d;

    public c(AbstractC0400d abstractC0400d) {
        this.f5712c = abstractC0400d;
    }

    public abstract boolean a(h hVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f5710a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (a(hVar)) {
                this.f5710a.add(hVar.f19908a);
            }
        }
        if (this.f5710a.isEmpty()) {
            this.f5712c.b(this);
        } else {
            AbstractC0400d abstractC0400d = this.f5712c;
            synchronized (abstractC0400d.f5887c) {
                try {
                    if (abstractC0400d.f5888d.add(this)) {
                        if (abstractC0400d.f5888d.size() == 1) {
                            abstractC0400d.f5889e = abstractC0400d.a();
                            m.f().a(AbstractC0400d.f5884f, String.format("%s: initial state = %s", abstractC0400d.getClass().getSimpleName(), abstractC0400d.f5889e), new Throwable[0]);
                            abstractC0400d.d();
                        }
                        Object obj = abstractC0400d.f5889e;
                        this.f5711b = obj;
                        d(this.f5713d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f5713d, this.f5711b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f5710a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ((C0264c) bVar).b(this.f5710a);
            return;
        }
        ArrayList arrayList = this.f5710a;
        C0264c c0264c = (C0264c) bVar;
        synchronized (c0264c.f4652c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    String str = (String) obj2;
                    if (c0264c.a(str)) {
                        m.f().a(C0264c.f4649d, "Constraints met for " + str, new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                InterfaceC0263b interfaceC0263b = c0264c.f4650a;
                if (interfaceC0263b != null) {
                    interfaceC0263b.f(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
