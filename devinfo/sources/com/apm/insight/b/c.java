package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static long f3042b;

    /* renamed from: a, reason: collision with root package name */
    private final b f3043a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3044c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f3045d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f3044c) {
                    return;
                }
                c.this.f3043a.d();
                long unused = c.f3042b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f3045d, 500L);
                } else {
                    m.a().a(c.this.f3045d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f3042b);
            }
        };
        this.f3045d = runnable;
        this.f3043a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f3042b <= 15000;
    }

    public final void b() {
        this.f3044c = true;
    }

    public final void a() {
        if (this.f3044c) {
            return;
        }
        m.a().a(this.f3045d, 5000L);
    }
}
