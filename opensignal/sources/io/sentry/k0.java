package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile k0 f12402i;

    /* renamed from: a, reason: collision with root package name */
    public final long f12403a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f12404b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f12405c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12406d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f12407e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f12408f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f12400g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h, reason: collision with root package name */
    public static final long f12401h = TimeUnit.SECONDS.toMillis(1);
    public static final io.sentry.util.a j = new io.sentry.util.a();

    public k0() {
        i0 i0Var = new i0(0);
        this.f12406d = new AtomicBoolean(false);
        this.f12408f = Executors.newSingleThreadExecutor(new j0(0));
        this.f12403a = f12400g;
        this.f12407e = i0Var;
        b();
    }

    public static k0 a() {
        if (f12402i == null) {
            q qVarA = j.a();
            try {
                if (f12402i == null) {
                    f12402i = new k0();
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
        return f12402i;
    }

    public final void b() {
        try {
            this.f12408f.submit(new hf.n(1, this)).get(f12401h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f12405c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f12405c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
