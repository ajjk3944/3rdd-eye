package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xe0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18378a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f18379b;

    public /* synthetic */ xe0(es1 es1Var, int i4) {
        this.f18378a = i4;
        this.f18379b = es1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18378a) {
            case 0:
                we0 we0Var = (we0) this.f18379b.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new q80(we0Var, exVar);
            case 1:
                we0 we0Var2 = (we0) this.f18379b.a();
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new q80(we0Var2, exVar2);
            case 2:
                we0 we0Var3 = (we0) this.f18379b.a();
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new q80(we0Var3, exVar3);
            case 3:
                return new q80((vf0) this.f18379b.a(), fx.g);
            case 4:
                return new q80((vf0) this.f18379b.a(), fx.g);
            case 5:
                return new q80((vf0) this.f18379b.a(), fx.g);
            case 6:
                Context context = (Context) this.f18379b.a();
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                return new dg0(context, exVar4, 0);
            case 7:
                dh0 dh0Var = (dh0) this.f18379b.a();
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return new q80(dh0Var, exVar5);
            case 8:
                dh0 dh0Var2 = (dh0) this.f18379b.a();
                ex exVar6 = fx.f11274a;
                al0.z(exVar6);
                return new q80(dh0Var2, exVar6);
            case 9:
                return new jq0((oe) this.f18379b.a());
            case 10:
                return new q80((sq0) this.f18379b.a(), fx.g);
            case 11:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f18379b.a()));
                al0.z(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 12:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f18379b.a();
                ex exVar7 = fx.f11274a;
                al0.z(exVar7);
                return new nr0(scheduledExecutorService, exVar7);
            case 13:
                return new at0((lh0) this.f18379b.a());
            case 14:
                return new lz0((g21) this.f18379b.a());
            default:
                return new b21();
        }
    }
}
