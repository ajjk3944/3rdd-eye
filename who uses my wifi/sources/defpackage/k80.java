package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class k80 {
    public static volatile int a;
    public static final wy0 b = new wy0(0);
    public static final fr c = new fr(26);
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedHashSet linkedHashSetB;
        try {
            try {
                try {
                    if (f()) {
                        linkedHashSetB = null;
                    } else {
                        linkedHashSetB = b();
                        i(linkedHashSetB);
                    }
                    StaticLoggerBinder.getSingleton();
                    a = 3;
                    h(linkedHashSetB);
                    g();
                } catch (Exception e2) {
                    a = 2;
                    System.err.println("Failed to instantiate SLF4J LoggerFactory");
                    System.err.println("Reported exception:");
                    e2.printStackTrace();
                    throw new IllegalStateException("Unexpected initialization failure", e2);
                } catch (NoSuchMethodError e3) {
                    String message = e3.getMessage();
                    if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                        a = 2;
                        i41.x("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                        i41.x("Your binding is version 1.5.5 or earlier.");
                        i41.x("Upgrade your binding to version 1.6.x.");
                    }
                    throw e3;
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    a = 2;
                    System.err.println("Failed to instantiate SLF4J LoggerFactory");
                    System.err.println("Reported exception:");
                    e4.printStackTrace();
                    throw e4;
                }
                a = 4;
                i41.x("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                i41.x("Defaulting to no-operation (NOP) logger implementation");
                i41.x("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                g();
            }
        } catch (Throwable th) {
            g();
            throw th;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = k80.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e2) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e2.printStackTrace();
            return linkedHashSet;
        }
    }

    public static ILoggerFactory c() {
        if (a == 0) {
            synchronized (k80.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            j();
                        }
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static i80 d(Class cls) {
        int i;
        i80 i80VarE = e(cls.getName());
        if (d) {
            h41 h41Var = i41.f;
            Class cls2 = null;
            if (h41Var == null) {
                if (i41.g) {
                    h41Var = null;
                } else {
                    try {
                        h41Var = new h41();
                    } catch (SecurityException unused) {
                        h41Var = null;
                    }
                    i41.f = h41Var;
                    i41.g = true;
                }
            }
            if (h41Var != null) {
                Class[] classContext = h41Var.getClassContext();
                String name = i41.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                i41.x("Detected logger name mismatch. Given name: \"" + i80VarE.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                i41.x("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return i80VarE;
    }

    public static i80 e(String str) {
        return c().a(str);
    }

    public static boolean f() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static void g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        wy0 wy0Var = b;
        synchronized (wy0Var) {
            try {
                wy0Var.f = true;
                ArrayList arrayList = new ArrayList(((HashMap) wy0Var.g).values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    vy0 vy0Var = (vy0) obj;
                    vy0Var.g = e(vy0Var.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) b.h;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                xy0 xy0Var = (xy0) obj2;
                if (xy0Var != null) {
                    vy0 vy0Var2 = xy0Var.a;
                    String str = vy0Var2.f;
                    if (vy0Var2.g == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(vy0Var2.g instanceof vf0)) {
                        if (!vy0Var2.b()) {
                            i41.x(str);
                        } else if (vy0Var2.b()) {
                            try {
                                vy0Var2.i.invoke(vy0Var2.g, xy0Var);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (xy0Var.a.b()) {
                        i41.x("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        i41.x("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        i41.x("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(xy0Var.a.g instanceof vf0)) {
                        i41.x("The following set of substitute loggers may have been accessed");
                        i41.x("during the initialization phase. Logging calls during this");
                        i41.x("phase were not honored. However, subsequent logging calls to these");
                        i41.x("loggers will work as normally expected.");
                        i41.x("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        wy0 wy0Var2 = b;
        ((HashMap) wy0Var2.g).clear();
        ((LinkedBlockingQueue) wy0Var2.h).clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        i41.x("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            i41.x("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                i41.x("Found binding in [" + ((URL) it.next()) + "]");
            }
            i41.x("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            i41.x("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            i41.x("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
