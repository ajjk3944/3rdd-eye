package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

/* loaded from: classes3.dex */
public final class of0 implements jc {

    /* renamed from: a, reason: collision with root package name */
    private final ct1 f31358a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f31359b;

    /* renamed from: c, reason: collision with root package name */
    private final qf0 f31360c;

    /* renamed from: d, reason: collision with root package name */
    private final rf0 f31361d;

    public /* synthetic */ of0(Context context) {
        this(context, new ct1());
    }

    @Override // com.yandex.mobile.ads.impl.jc
    public final ec a() {
        ResolveInfo resolveInfoResolveService;
        this.f31361d.getClass();
        Intent intent = rf0.a();
        ct1 ct1Var = this.f31358a;
        Context context = this.f31359b;
        ct1Var.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(intent, "intent");
        ec ecVar = null;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService != null) {
            try {
                com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
                if (this.f31359b.bindService(intent, aVar, 1)) {
                    ec ecVarA = this.f31360c.a(aVar);
                    this.f31359b.unbindService(aVar);
                    ecVar = ecVarA;
                } else {
                    fp0.a(new Object[0]);
                }
            } catch (Throwable unused2) {
                fp0.c(new Object[0]);
            }
        }
        return ecVar;
    }

    public of0(Context context, ct1 safePackageManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(safePackageManager, "safePackageManager");
        this.f31358a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f31359b = applicationContext;
        this.f31360c = new qf0();
        this.f31361d = new rf0();
    }
}
