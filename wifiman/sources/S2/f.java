package S2;

import C2.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f20241a = new ArrayList();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f20242a;

        /* renamed from: b, reason: collision with root package name */
        final j f20243b;

        a(Class cls, j jVar) {
            this.f20242a = cls;
            this.f20243b = jVar;
        }

        boolean a(Class cls) {
            return this.f20242a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, j jVar) {
        this.f20241a.add(new a(cls, jVar));
    }

    public synchronized j b(Class cls) {
        int size = this.f20241a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f20241a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f20243b;
            }
        }
        return null;
    }
}
