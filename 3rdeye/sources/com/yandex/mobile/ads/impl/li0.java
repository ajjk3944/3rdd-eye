package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class li0 implements mi0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f30002h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final le f30003a;

    /* renamed from: b, reason: collision with root package name */
    private final ye f30004b;

    /* renamed from: c, reason: collision with root package name */
    private final we f30005c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f30006d;

    /* renamed from: e, reason: collision with root package name */
    private ue f30007e;

    /* renamed from: f, reason: collision with root package name */
    private final ni0 f30008f;

    /* renamed from: g, reason: collision with root package name */
    private final String f30009g;

    public li0(Context context, le appMetricaAdapter, ye appMetricaIdentifiersValidator, we appMetricaIdentifiersLoader, bu0 mauidManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(appMetricaAdapter, "appMetricaAdapter");
        kotlin.jvm.internal.l.f(appMetricaIdentifiersValidator, "appMetricaIdentifiersValidator");
        kotlin.jvm.internal.l.f(appMetricaIdentifiersLoader, "appMetricaIdentifiersLoader");
        kotlin.jvm.internal.l.f(mauidManager, "mauidManager");
        this.f30003a = appMetricaAdapter;
        this.f30004b = appMetricaIdentifiersValidator;
        this.f30005c = appMetricaIdentifiersLoader;
        this.f30008f = ni0.f30885b;
        this.f30009g = mauidManager.a();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f30006d = applicationContext;
    }

    @Override // com.yandex.mobile.ads.impl.mi0
    public final String a() {
        return this.f30009g;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.mobile.ads.impl.ue] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.yandex.mobile.ads.impl.mi0
    public final ue b() {
        ?? r22;
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        synchronized (f30002h) {
            try {
                ue ueVar = this.f30007e;
                r22 = ueVar;
                if (ueVar == null) {
                    ue ueVar2 = new ue(null, this.f30003a.b(this.f30006d), this.f30003a.a(this.f30006d));
                    this.f30005c.a(this.f30006d, this);
                    r22 = ueVar2;
                }
                wVar.f43660b = r22;
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r22;
    }

    @Override // com.yandex.mobile.ads.impl.mi0
    public final ni0 c() {
        return this.f30008f;
    }

    public final void a(ue appMetricaIdentifiers) {
        kotlin.jvm.internal.l.f(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (f30002h) {
            try {
                this.f30004b.getClass();
                if (ye.a(appMetricaIdentifiers)) {
                    this.f30007e = appMetricaIdentifiers;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
