package I2;

import I2.n;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    private static final c f8527e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final n f8528f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f8529a;

    /* renamed from: b, reason: collision with root package name */
    private final c f8530b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8531c;

    /* renamed from: d, reason: collision with root package name */
    private final E1.e f8532d;

    private static class a implements n {
        a() {
        }

        @Override // I2.n
        public n.a a(Object obj, int i10, int i11, C2.g gVar) {
            return null;
        }

        @Override // I2.n
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f8533a;

        /* renamed from: b, reason: collision with root package name */
        final Class f8534b;

        /* renamed from: c, reason: collision with root package name */
        final o f8535c;

        public b(Class cls, Class cls2, o oVar) {
            this.f8533a = cls;
            this.f8534b = cls2;
            this.f8535c = oVar;
        }

        public boolean a(Class cls) {
            return this.f8533a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f8534b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public q a(List list, E1.e eVar) {
            return new q(list, eVar);
        }
    }

    public r(E1.e eVar) {
        this(eVar, f8527e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f8529a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n c(b bVar) {
        return (n) W2.k.d(bVar.f8535c.d(this));
    }

    private static n f() {
        return f8528f;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f8529a) {
                if (this.f8531c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f8531c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f8531c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f8530b.a(arrayList, this.f8532d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f8531c.clear();
            throw th2;
        }
    }

    synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f8529a) {
                if (!this.f8531c.contains(bVar) && bVar.a(cls)) {
                    this.f8531c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f8531c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f8529a) {
            if (!arrayList.contains(bVar.f8534b) && bVar.a(cls)) {
                arrayList.add(bVar.f8534b);
            }
        }
        return arrayList;
    }

    r(E1.e eVar, c cVar) {
        this.f8529a = new ArrayList();
        this.f8531c = new HashSet();
        this.f8532d = eVar;
        this.f8530b = cVar;
    }
}
