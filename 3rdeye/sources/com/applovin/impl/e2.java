package com.applovin.impl;

import com.applovin.impl.r5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19265a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (f19265a) {
            return;
        }
        kVar.E().a(y1.f21826w0, "no_ads_loaded");
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        Long l5 = (Long) kVar.a(g3.f19374K7);
        if (l5.longValue() <= 0) {
            return;
        }
        kVar.q0().a(new f6(kVar, true, "submitIntegrationErrorReport", new B.b(kVar, 16)), r5.b.OTHER, TimeUnit.SECONDS.toMillis(l5.longValue()));
    }

    public static void a() {
        f19265a = true;
    }
}
