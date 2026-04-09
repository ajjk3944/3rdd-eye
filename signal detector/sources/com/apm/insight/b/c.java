package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static long f5989b;

    /* renamed from: a, reason: collision with root package name */
    private final b f5990a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5991c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f5992d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f5991c) {
                    return;
                }
                c.this.f5990a.d();
                long unused = c.f5989b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f5992d, 500L);
                } else {
                    m.a().a(c.this.f5992d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f5989b);
            }
        };
        this.f5992d = runnable;
        this.f5990a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f5989b <= 15000;
    }

    public final void b() {
        this.f5991c = true;
    }

    public final void a() {
        if (this.f5991c) {
            return;
        }
        m.a().a(this.f5992d, 5000L);
    }
}
