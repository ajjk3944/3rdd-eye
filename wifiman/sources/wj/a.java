package wj;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f65239a;

    /* renamed from: wj.a$a, reason: collision with other inner class name */
    private static final class C2304a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65240a = new b();
    }

    static {
        Logger logger = Logger.getLogger(a.class.getName());
        f65239a = logger;
        String property = System.getProperty("java.library.path");
        logger.log(Level.INFO, "librarypath=" + property);
        System.loadLibrary("sodiumjni");
    }

    public static b a() {
        b.l();
        return C2304a.f65240a;
    }
}
