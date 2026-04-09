package Ej;

import Gj.f;
import Gj.g;
import Gj.h;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    static volatile int f4807a;

    /* renamed from: b, reason: collision with root package name */
    static final g f4808b = new g();

    /* renamed from: c, reason: collision with root package name */
    static final Gj.d f4809c = new Gj.d();

    /* renamed from: d, reason: collision with root package name */
    static boolean f4810d = h.f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f4811e = {"1.6", "1.7"};

    /* renamed from: f, reason: collision with root package name */
    private static String f4812f = "org/slf4j/impl/StaticLoggerBinder.class";

    private static final void a() {
        Set setF;
        try {
            try {
                if (l()) {
                    setF = null;
                } else {
                    setF = f();
                    t(setF);
                }
                Hj.a.c();
                f4807a = 3;
                s(setF);
            } catch (Exception e10) {
                e(e10);
                throw new IllegalStateException("Unexpected initialization failure", e10);
            } catch (NoClassDefFoundError e11) {
                if (!m(e11.getMessage())) {
                    e(e11);
                    throw e11;
                }
                f4807a = 4;
                h.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                h.c("Defaulting to no-operation (NOP) logger implementation");
                h.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e12) {
                String message = e12.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f4807a = 2;
                    h.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    h.c("Your binding is version 1.5.5 or earlier.");
                    h.c("Upgrade your binding to version 1.6.x.");
                }
                throw e12;
            }
            p();
        } catch (Throwable th2) {
            p();
            throw th2;
        }
    }

    private static void b(Fj.d dVar, int i10) {
        if (dVar.a().f()) {
            c(i10);
        } else {
            if (dVar.a().i()) {
                return;
            }
            d();
        }
    }

    private static void c(int i10) {
        h.c("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        h.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        h.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void d() {
        h.c("The following set of substitute loggers may have been accessed");
        h.c("during the initialization phase. Logging calls during this");
        h.c("phase were not honored. However, subsequent logging calls to these");
        h.c("loggers will work as normally expected.");
        h.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    static void e(Throwable th2) {
        f4807a = 2;
        h.d("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    static Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f4812f) : classLoader.getResources(f4812f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e10) {
            h.d("Error getting resources from path", e10);
        }
        return linkedHashSet;
    }

    private static void g() {
        g gVar = f4808b;
        synchronized (gVar) {
            try {
                gVar.e();
                for (f fVar : gVar.d()) {
                    fVar.u(j(fVar.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a h() {
        if (f4807a == 0) {
            synchronized (c.class) {
                try {
                    if (f4807a == 0) {
                        f4807a = 1;
                        o();
                    }
                } finally {
                }
            }
        }
        int i10 = f4807a;
        if (i10 == 1) {
            return f4808b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return Hj.a.c().a();
        }
        if (i10 == 4) {
            return f4809c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static b i(Class cls) {
        Class clsA;
        b bVarJ = j(cls.getName());
        if (f4810d && (clsA = h.a()) != null && n(cls, clsA)) {
            h.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", bVarJ.getName(), clsA.getName()));
            h.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return bVarJ;
    }

    public static b j(String str) {
        return h().a(str);
    }

    private static boolean k(Set set) {
        return set.size() > 1;
    }

    private static boolean l() {
        String strG = h.g("java.vendor.url");
        if (strG == null) {
            return false;
        }
        return strG.toLowerCase().contains("android");
    }

    private static boolean m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean n(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void o() {
        a();
        if (f4807a == 3) {
            u();
        }
    }

    private static void p() {
        g();
        q();
        f4808b.b();
    }

    private static void q() {
        LinkedBlockingQueue linkedBlockingQueueC = f4808b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<Fj.d> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (Fj.d dVar : arrayList) {
                r(dVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    b(dVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    private static void r(Fj.d dVar) {
        if (dVar == null) {
            return;
        }
        f fVarA = dVar.a();
        String name = fVarA.getName();
        if (fVarA.k()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (fVarA.i()) {
            return;
        }
        if (fVarA.f()) {
            fVarA.q(dVar);
        } else {
            h.c(name);
        }
    }

    private static void s(Set set) {
        if (set == null || !k(set)) {
            return;
        }
        h.c("Actual binding is of type [" + Hj.a.c().b() + "]");
    }

    private static void t(Set set) {
        if (k(set)) {
            h.c("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                h.c("Found binding in [" + ((URL) it.next()) + "]");
            }
            h.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void u() {
        try {
            String str = Hj.a.f7983c;
            boolean z10 = false;
            for (String str2 : f4811e) {
                if (str.startsWith(str2)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            h.c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f4811e).toString());
            h.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            h.d("Unexpected problem occured during version sanity check", th2);
        }
    }
}
