package o4;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: o4.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7075j {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f55273b = Logger.getLogger(C7075j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f55274a;

    /* renamed from: o4.j$a */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v4.d f55275a;

        a(v4.d dVar) {
            this.f55275a = dVar;
        }

        @Override // o4.C7075j.b
        public InterfaceC7073h a(Class cls) throws GeneralSecurityException {
            try {
                return new C7074i(this.f55275a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // o4.C7075j.b
        public InterfaceC7073h b() {
            v4.d dVar = this.f55275a;
            return new C7074i(dVar, dVar.b());
        }

        @Override // o4.C7075j.b
        public Class c() {
            return this.f55275a.getClass();
        }

        @Override // o4.C7075j.b
        public Set d() {
            return this.f55275a.i();
        }
    }

    /* renamed from: o4.j$b */
    private interface b {
        InterfaceC7073h a(Class cls);

        InterfaceC7073h b();

        Class c();

        Set d();
    }

    C7075j(C7075j c7075j) {
        this.f55274a = new ConcurrentHashMap(c7075j.f55274a);
    }

    private static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    private static b b(v4.d dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (!this.f55274a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (b) this.f55274a.get(str);
    }

    private InterfaceC7073h e(String str, Class cls) throws GeneralSecurityException {
        b bVarD = d(str);
        if (cls == null) {
            return bVarD.b();
        }
        if (bVarD.d().contains(cls)) {
            return bVarD.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + bVarD.c() + ", supported primitives: " + i(bVarD.d()));
    }

    private synchronized void h(b bVar, boolean z10) {
        try {
            String strC = bVar.b().c();
            b bVar2 = (b) this.f55274a.get(strC);
            if (bVar2 != null && !bVar2.c().equals(bVar.c())) {
                f55273b.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, bVar2.c().getName(), bVar.c().getName()));
            }
            if (z10) {
                this.f55274a.put(strC, bVar);
            } else {
                this.f55274a.putIfAbsent(strC, bVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String i(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    InterfaceC7073h c(String str, Class cls) {
        return e(str, (Class) a(cls));
    }

    InterfaceC7073h f(String str) {
        return d(str).b();
    }

    synchronized void g(v4.d dVar) {
        if (!dVar.a().isCompatible()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    boolean j(String str) {
        return this.f55274a.containsKey(str);
    }

    C7075j() {
        this.f55274a = new ConcurrentHashMap();
    }
}
