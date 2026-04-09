package S2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f20227a = new ArrayList();

    /* renamed from: S2.a$a, reason: collision with other inner class name */
    private static final class C0725a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f20228a;

        /* renamed from: b, reason: collision with root package name */
        final C2.d f20229b;

        C0725a(Class cls, C2.d dVar) {
            this.f20228a = cls;
            this.f20229b = dVar;
        }

        boolean a(Class cls) {
            return this.f20228a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, C2.d dVar) {
        this.f20227a.add(new C0725a(cls, dVar));
    }

    public synchronized C2.d b(Class cls) {
        for (C0725a c0725a : this.f20227a) {
            if (c0725a.a(cls)) {
                return c0725a.f20229b;
            }
        }
        return null;
    }
}
