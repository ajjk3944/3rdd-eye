package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.b5;
import io.sentry.m2;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class d0 implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final d0 f11554x = new d0();

    /* renamed from: d, reason: collision with root package name */
    public volatile c0 f11556d;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f11555a = new io.sentry.util.a();

    /* renamed from: g, reason: collision with root package name */
    public final f0 f11557g = new f0();

    /* renamed from: r, reason: collision with root package name */
    public volatile Boolean f11558r = null;

    public final void b(a0 a0Var) {
        io.sentry.q qVarA = this.f11555a.a();
        try {
            h(m2.f12434a);
            if (this.f11556d != null) {
                this.f11556d.f11548a.add(a0Var);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q();
    }

    public final void f(io.sentry.u0 u0Var) {
        c0 c0Var = this.f11556d;
        if (c0Var != null) {
            try {
                ProcessLifecycleOwner.E.f1470y.V0(c0Var);
            } catch (Throwable th2) {
                this.f11556d = null;
                u0Var.g(b5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    public final void h(io.sentry.u0 u0Var) {
        if (this.f11556d != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.E;
            this.f11556d = new c0(this);
            if (io.sentry.android.core.internal.util.e.f11647a.c()) {
                f(u0Var);
                return;
            }
            f0 f0Var = this.f11557g;
            ((Handler) f0Var.f11569a).post(new a5.o(this, 22, u0Var));
        } catch (ClassNotFoundException unused) {
            u0Var.m(b5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            u0Var.g(b5.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    public final void i(a0 a0Var) {
        io.sentry.q qVarA = this.f11555a.a();
        try {
            if (this.f11556d != null) {
                this.f11556d.f11548a.remove(a0Var);
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

    public final void q() {
        if (this.f11556d == null) {
            return;
        }
        io.sentry.q qVarA = this.f11555a.a();
        try {
            c0 c0Var = this.f11556d;
            this.f11556d.f11548a.clear();
            this.f11556d = null;
            qVarA.close();
            if (io.sentry.android.core.internal.util.e.f11647a.c()) {
                if (c0Var != null) {
                    ProcessLifecycleOwner.E.f1470y.m1(c0Var);
                }
            } else {
                f0 f0Var = this.f11557g;
                ((Handler) f0Var.f11569a).post(new androidx.lifecycle.f0(this, 21, c0Var));
            }
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
