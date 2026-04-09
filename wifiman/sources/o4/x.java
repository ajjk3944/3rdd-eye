package o4;

import A4.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.M;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import v4.d;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f55311a = Logger.getLogger(x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f55312b = new AtomicReference(new C7075j());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f55313c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f55314d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f55315e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f55316f = new ConcurrentHashMap();

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v4.d f55317a;

        a(v4.d dVar) {
            this.f55317a = dVar;
        }
    }

    private interface b {
    }

    private static b a(v4.d dVar) {
        return new a(dVar);
    }

    private static synchronized void b(String str, Map map, boolean z10) {
        if (z10) {
            try {
                ConcurrentMap concurrentMap = f55314d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z10) {
            if (((C7075j) f55312b.get()).j(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f55316f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f55316f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    static Object c(AbstractC7072g abstractC7072g, Class cls) {
        return v4.h.c().b(abstractC7072g, cls);
    }

    public static Class d(Class cls) {
        try {
            return v4.h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object e(A4.y yVar, Class cls) {
        return f(yVar.Z(), yVar.a0(), cls);
    }

    public static Object f(String str, AbstractC5081h abstractC5081h, Class cls) {
        return ((C7075j) f55312b.get()).c(str, cls).d(abstractC5081h);
    }

    public static Object g(String str, byte[] bArr, Class cls) {
        return f(str, AbstractC5081h.s(bArr), cls);
    }

    public static InterfaceC7073h h(String str) {
        return ((C7075j) f55312b.get()).f(str);
    }

    static synchronized Map i() {
        return Collections.unmodifiableMap(f55316f);
    }

    public static synchronized M j(A a10) {
        InterfaceC7073h interfaceC7073hH;
        interfaceC7073hH = h(a10.Z());
        if (!((Boolean) f55314d.get(a10.Z())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.Z());
        }
        return interfaceC7073hH.a(a10.a0());
    }

    public static synchronized A4.y k(A a10) {
        InterfaceC7073h interfaceC7073hH;
        interfaceC7073hH = h(a10.Z());
        if (!((Boolean) f55314d.get(a10.Z())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.Z());
        }
        return interfaceC7073hH.b(a10.a0());
    }

    public static synchronized void l(v4.d dVar, boolean z10) {
        try {
            if (dVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = f55312b;
            C7075j c7075j = new C7075j((C7075j) atomicReference.get());
            c7075j.g(dVar);
            String strD = dVar.d();
            b(strD, z10 ? dVar.f().c() : Collections.emptyMap(), z10);
            if (!((C7075j) atomicReference.get()).j(strD)) {
                f55313c.put(strD, a(dVar));
                if (z10) {
                    m(strD, dVar.f().c());
                }
            }
            f55314d.put(strD, Boolean.valueOf(z10));
            atomicReference.set(c7075j);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void m(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f55316f.put((String) entry.getKey(), l.a(str, ((M) ((d.a.C2247a) entry.getValue()).f63429a).toByteArray(), ((d.a.C2247a) entry.getValue()).f63430b));
        }
    }

    public static synchronized void n(w wVar) {
        v4.h.c().e(wVar);
    }

    public static Object o(v vVar, Class cls) {
        return v4.h.c().f(vVar, cls);
    }
}
