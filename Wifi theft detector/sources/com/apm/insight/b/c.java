package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static long f4804b;

    /* renamed from: a, reason: collision with root package name */
    private final b f4805a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4806c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f4807d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f4806c) {
                    return;
                }
                c.this.f4805a.d();
                long unused = c.f4804b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f4807d, 500L);
                } else {
                    m.a().a(c.this.f4807d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f4804b);
            }
        };
        this.f4807d = runnable;
        this.f4805a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f4804b <= MBInterstitialActivity.WEB_LOAD_TIME;
    }

    public final void b() {
        this.f4806c = true;
    }

    public final void a() {
        if (this.f4806c) {
            return;
        }
        m.a().a(this.f4807d, 5000L);
    }
}
