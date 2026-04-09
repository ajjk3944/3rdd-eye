package X2;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final g f24015a = new C0909a();

    /* renamed from: X2.a$a, reason: collision with other inner class name */
    class C0909a implements g {
        C0909a() {
        }

        @Override // X2.a.g
        public void a(Object obj) {
        }
    }

    class b implements d {
        b() {
        }

        @Override // X2.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    class c implements g {
        c() {
        }

        @Override // X2.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object create();
    }

    private static final class e implements E1.e {

        /* renamed from: a, reason: collision with root package name */
        private final d f24016a;

        /* renamed from: b, reason: collision with root package name */
        private final g f24017b;

        /* renamed from: c, reason: collision with root package name */
        private final E1.e f24018c;

        e(E1.e eVar, d dVar, g gVar) {
            this.f24018c = eVar;
            this.f24016a = dVar;
            this.f24017b = gVar;
        }

        @Override // E1.e
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).b().b(true);
            }
            this.f24017b.a(obj);
            return this.f24018c.a(obj);
        }

        @Override // E1.e
        public Object b() {
            Object objB = this.f24018c.b();
            if (objB == null) {
                objB = this.f24016a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objB.getClass());
                }
            }
            if (objB instanceof f) {
                ((f) objB).b().b(false);
            }
            return objB;
        }
    }

    public interface f {
        X2.c b();
    }

    public interface g {
        void a(Object obj);
    }

    private static E1.e a(E1.e eVar, d dVar) {
        return b(eVar, dVar, c());
    }

    private static E1.e b(E1.e eVar, d dVar, g gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static g c() {
        return f24015a;
    }

    public static E1.e d(int i10, d dVar) {
        return a(new E1.g(i10), dVar);
    }

    public static E1.e e() {
        return f(20);
    }

    public static E1.e f(int i10) {
        return b(new E1.g(i10), new b(), new c());
    }
}
