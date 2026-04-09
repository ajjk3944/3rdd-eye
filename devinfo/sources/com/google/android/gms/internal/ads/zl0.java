package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final zw f19117a;

    /* renamed from: b, reason: collision with root package name */
    public final AppSetIdClient f19118b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f19119c;

    /* renamed from: d, reason: collision with root package name */
    public final w81 f19120d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f19121e;

    public zl0(Context context, zw zwVar, ScheduledExecutorService scheduledExecutorService, w81 w81Var) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.F3)).booleanValue()) {
            this.f19118b = AppSet.getClient(context);
        }
        this.f19121e = context;
        this.f19117a = zwVar;
        this.f19119c = scheduledExecutorService;
        this.f19120d = w81Var;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        Task<AppSetIdInfo> appSetIdInfo;
        pk pkVar = sk.B3;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            if (!((Boolean) sVar.f36166c.a(sk.G3)).booleanValue()) {
                if (!((Boolean) sVar.f36166c.a(sk.C3)).booleanValue()) {
                    return yo0.G(al0.j(this.f19118b.getAppSetIdInfo()), o5.f14550m, fx.g);
                }
                if (((Boolean) sVar.f36166c.a(sk.F3)).booleanValue()) {
                    jz.g(this.f19121e, false);
                    synchronized (jz.f12901x) {
                        appSetIdInfo = jz.f12899v;
                    }
                } else {
                    appSetIdInfo = this.f19118b.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return yo0.e(new am0(null, -1, 0));
                }
                vd.b bVarF = yo0.F(al0.j(appSetIdInfo), k20.j, fx.g);
                if (((Boolean) sVar.f36166c.a(sk.D3)).booleanValue()) {
                    bVarF = yo0.E(bVarF, ((Long) sVar.f36166c.a(sk.E3)).longValue(), TimeUnit.MILLISECONDS, this.f19119c);
                }
                return yo0.C(bVarF, Exception.class, new hu(4, this), this.f19120d);
            }
        }
        return yo0.e(new am0(null, -1, 0));
    }
}
