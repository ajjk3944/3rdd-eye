package S2;

import P2.g;
import W2.j;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import o.C7010a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final q f20231c = new q(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C7010a f20232a = new C7010a();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f20233b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f20233b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public q a(Class cls, Class cls2, Class cls3) {
        q qVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f20232a) {
            qVar = (q) this.f20232a.get(jVarB);
        }
        this.f20233b.set(jVarB);
        return qVar;
    }

    public boolean c(q qVar) {
        return f20231c.equals(qVar);
    }

    public void d(Class cls, Class cls2, Class cls3, q qVar) {
        synchronized (this.f20232a) {
            C7010a c7010a = this.f20232a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f20231c;
            }
            c7010a.put(jVar, qVar);
        }
    }
}
