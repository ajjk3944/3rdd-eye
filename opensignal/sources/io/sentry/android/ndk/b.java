package io.sentry.android.ndk;

import a5.o;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.e;
import io.sentry.k6;
import io.sentry.ndk.NativeScope;
import io.sentry.p3;
import io.sentry.s3;
import io.sentry.x5;
import ir.f0;

/* loaded from: classes.dex */
public final class b extends s3 {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11824a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeScope f11825b;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        f0.T(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f11824a = sentryAndroidOptions;
        this.f11825b = nativeScope;
    }

    @Override // io.sentry.s3, io.sentry.a1
    public final void b(String str, String str2) {
        x5 x5Var = this.f11824a;
        try {
            x5Var.getExecutorService().submit(new ch.a(this, str, str2, 7));
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.a1
    public final void m(e eVar) {
        x5 x5Var = this.f11824a;
        try {
            x5Var.getExecutorService().submit(new o(this, 25, eVar));
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.a1
    public final void p(k6 k6Var, p3 p3Var) {
        x5 x5Var = this.f11824a;
        if (k6Var == null) {
            return;
        }
        try {
            x5Var.getExecutorService().submit(new o(this, 26, k6Var));
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
