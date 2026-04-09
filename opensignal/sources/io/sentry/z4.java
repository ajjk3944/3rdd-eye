package io.sentry;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class z4 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile z4 f12881c;

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.util.a f12882d = new io.sentry.util.a();

    /* renamed from: e, reason: collision with root package name */
    public static volatile Boolean f12883e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final io.sentry.util.a f12884f = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f12885a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f12886b = new CopyOnWriteArraySet();

    public static z4 d() {
        if (f12881c == null) {
            q qVarA = f12882d.a();
            try {
                if (f12881c == null) {
                    f12881c = new z4();
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f12881c;
    }

    public final void a(String str) {
        ir.f0.T(str, "integration is required.");
        this.f12885a.add(str);
    }

    public final void b(String str, String str2) {
        this.f12886b.add(new io.sentry.protocol.u(str, str2));
        q qVarA = f12884f.a();
        try {
            f12883e = null;
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean c(u0 u0Var) {
        Boolean bool = f12883e;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVarA = f12884f.a();
        try {
            Iterator it = this.f12886b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                io.sentry.protocol.u uVar = (io.sentry.protocol.u) it.next();
                if (uVar.f12638a.startsWith("maven:io.sentry:") && !"8.25.0".equalsIgnoreCase(uVar.f12639d)) {
                    u0Var.m(b5.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", uVar.f12638a, "8.25.0", uVar.f12639d);
                    z10 = true;
                }
            }
            if (z10) {
                b5 b5Var = b5.ERROR;
                u0Var.m(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                u0Var.m(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                u0Var.m(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                u0Var.m(b5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f12883e = Boolean.valueOf(z10);
            qVarA.close();
            return z10;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
