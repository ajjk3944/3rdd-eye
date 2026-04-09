package C1;

import H1.n;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import n1.j;
import n1.x;
import u.C2936e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final x f1139c = new x(Object.class, Object.class, Object.class, Collections.singletonList(new j(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new z1.c(0), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final C2936e f1140a = new C2936e(0);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1141b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, x xVar) {
        synchronized (this.f1140a) {
            C2936e c2936e = this.f1140a;
            n nVar = new n(cls, cls2, cls3);
            if (xVar == null) {
                xVar = f1139c;
            }
            c2936e.put(nVar, xVar);
        }
    }
}
