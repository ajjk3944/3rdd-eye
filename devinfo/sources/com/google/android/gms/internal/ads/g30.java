package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11362a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f11363b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f11364c;

    public /* synthetic */ g30(es1 es1Var, js1 js1Var, int i4) {
        this.f11362a = i4;
        this.f11364c = es1Var;
        this.f11363b = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11362a) {
            case 0:
                return new f30(((a10) this.f11363b).b(), (vg) this.f11364c.a());
            case 1:
                return new b50((tb.a) this.f11363b.a(), (vw) this.f11364c.a());
            case 2:
                return new ua.a((Context) this.f11363b.a(), (uv) this.f11364c.a());
            case 3:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 4:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 5:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 6:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 7:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 8:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 9:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 10:
                return new q80((p70) this.f11364c.a(), (Executor) this.f11363b.a());
            case 11:
                return b();
            case 12:
                vd.b bVar = (vd.b) this.f11364c.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new ol0(bVar, exVar, (ScheduledExecutorService) this.f11363b.a(), 0);
            default:
                return yr1.o((Context) this.f11363b.a(), (gv0) this.f11364c.a());
        }
    }

    public vj0 b() {
        return new vj0((ik0) this.f11364c.a(), (ed0) this.f11363b.a());
    }

    public /* synthetic */ g30(js1 js1Var, es1 es1Var, int i4) {
        this.f11362a = i4;
        this.f11363b = js1Var;
        this.f11364c = es1Var;
    }
}
