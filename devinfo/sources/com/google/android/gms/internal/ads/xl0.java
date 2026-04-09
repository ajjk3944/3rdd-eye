package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18420a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18421b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18422c;

    public /* synthetic */ xl0(int i4, Object obj, Object obj2) {
        this.f18420a = i4;
        this.f18421b = obj;
        this.f18422c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f18420a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 21;
            case 3:
                return 60;
            case 4:
                return 23;
            case 5:
                return 62;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        switch (this.f18420a) {
            case 0:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.A3)).booleanValue()) {
                    return yo0.e(new sl0(1, null));
                }
                zw zwVar = (zw) this.f18422c;
                return yo0.G(zwVar.j(), o5.f14549l, (Executor) this.f18421b);
            case 1:
                return ((ex) ((w81) this.f18421b)).e(new qe(12, this));
            case 2:
                return ((ex) ((w81) this.f18421b)).e(new qe(18, this));
            case 3:
                ya.a0.m("HsdpMigrationSignal.produce");
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16081ce)).booleanValue()) {
                    return yo0.e(new wm0(null, 1));
                }
                boolean z3 = false;
                try {
                    if (((Intent) this.f18422c).resolveActivity(((Context) this.f18421b).getPackageManager()) != null) {
                        ya.a0.m("HSDP intent is supported");
                        z3 = true;
                    }
                } catch (Exception e2) {
                    ua.j.C.f35265h.f("HsdpMigrationSignal.isHsdpMigrationSupported", e2);
                }
                return yo0.e(new wm0(Boolean.valueOf(z3), 1));
            case 4:
                return ((ex) ((w81) this.f18421b)).e(new qe(20, this));
            case 5:
                return ((ex) ((w81) this.f18421b)).e(new qe(22, this));
            case 6:
                s81 s81VarE = yo0.e((String) this.f18422c);
                o5 o5Var = o5.f14551n;
                Executor executor = (Executor) this.f18421b;
                return yo0.D(yo0.G(s81VarE, o5Var, executor), Throwable.class, new fp(11, this), executor);
            default:
                return ((ex) ((w81) this.f18421b)).e(new go0(1, this));
        }
    }

    public xl0(za.a aVar, w81 w81Var) {
        this.f18420a = 1;
        this.f18422c = aVar;
        this.f18421b = w81Var;
    }
}
