package ra;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer.java */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f45861a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference<h> f45862b;

    /* compiled from: ZoneRulesInitializer.java */
    public static class b extends h {
        @Override // ra.h
        public final void a() {
            try {
                Iterator it = Arrays.asList(new i[0]).iterator();
                while (it.hasNext()) {
                    try {
                        i.d((i) it.next());
                    } catch (ServiceConfigurationError e4) {
                        if (!(e4.getCause() instanceof SecurityException)) {
                            throw e4;
                        }
                    }
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    static {
        new a();
        f45861a = new AtomicBoolean(false);
        f45862b = new AtomicReference<>();
    }

    public abstract void a();

    /* compiled from: ZoneRulesInitializer.java */
    public static class a extends h {
        @Override // ra.h
        public final void a() {
        }
    }
}
