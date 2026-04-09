package com.apm.insight;

import com.apm.insight.l.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static com.apm.insight.b.a f4888a = new com.apm.insight.b.a();

    public static com.apm.insight.b.a a() {
        return f4888a;
    }

    public static void a(Throwable th, String str) {
        if (!e.i().isEnsureEnable() || g.a(th)) {
            return;
        }
        com.apm.insight.f.b.a(th, str, "core_exception_monitor");
    }
}
