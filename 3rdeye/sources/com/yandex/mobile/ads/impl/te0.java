package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

/* loaded from: classes3.dex */
public final class te0 {

    /* renamed from: a, reason: collision with root package name */
    private final ct1 f33561a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f33562b;

    /* renamed from: c, reason: collision with root package name */
    private final ue0 f33563c;

    /* renamed from: d, reason: collision with root package name */
    private final ve0 f33564d;

    public /* synthetic */ te0(Context context) {
        this(context, new ct1());
    }

    public final ec a() {
        ResolveInfo resolveInfoResolveService;
        this.f33564d.getClass();
        Intent intent = ve0.a();
        ct1 ct1Var = this.f33561a;
        Context context = this.f33562b;
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
                qe0 qe0Var = new qe0();
                if (this.f33562b.bindService(intent, qe0Var, 1)) {
                    ec ecVarA = this.f33563c.a(qe0Var);
                    this.f33562b.unbindService(qe0Var);
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

    public te0(Context context, ct1 safePackageManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(safePackageManager, "safePackageManager");
        this.f33561a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f33562b = applicationContext;
        this.f33563c = new ue0();
        this.f33564d = new ve0();
    }
}
