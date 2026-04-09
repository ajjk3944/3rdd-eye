package io.sentry;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class ShutdownHookIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f11442a;

    /* renamed from: d, reason: collision with root package name */
    public Thread f11443d;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        ir.f0.T(runtime, "Runtime is required");
        this.f11442a = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11443d != null) {
            try {
                this.f11442a.removeShutdownHook(this.f11443d);
            } catch (IllegalStateException e4) {
                String message = e4.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e4;
                }
            }
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        if (!x5Var.isEnableShutdownHook()) {
            x5Var.getLogger().m(b5.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f11443d = new Thread(new z3(x5Var, 3), "sentry-shutdownhook");
        try {
            this.f11442a.addShutdownHook(this.f11443d);
            x5Var.getLogger().m(b5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            ic.a.b("ShutdownHook");
        } catch (IllegalStateException e4) {
            String message = e4.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e4;
            }
        }
    }
}
