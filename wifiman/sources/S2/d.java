package S2;

import W2.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.C7010a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f20234a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final C7010a f20235b = new C7010a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f20234a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f20235b) {
            list = (List) this.f20235b.get(jVar);
        }
        this.f20234a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f20235b) {
            this.f20235b.put(new j(cls, cls2, cls3), list);
        }
    }
}
