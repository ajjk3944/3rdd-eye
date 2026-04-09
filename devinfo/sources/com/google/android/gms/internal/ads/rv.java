package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rv {

    /* renamed from: a, reason: collision with root package name */
    public final cv f15767a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15768b;

    /* renamed from: c, reason: collision with root package name */
    public final qv f15769c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15770d = System.currentTimeMillis();

    public rv(Context context, String str) {
        new AtomicLong();
        this.f15768b = context.getApplicationContext();
        va.o oVar = va.r.g.f36158b;
        yq yqVar = new yq();
        oVar.getClass();
        this.f15767a = (cv) new va.b(oVar, context, str, yqVar).d(context, false);
        this.f15769c = new qv();
    }

    public static void a(Context context, String str, pa.g gVar, mf0 mf0Var) {
        pb.y.i(context, "Context cannot be null.");
        pb.y.i(str, "AdUnitId cannot be null.");
        pb.y.d("#008 Must be called on the main UI thread.");
        sk.a(context);
        if (((Boolean) sl.f16463k.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new ab.c(context, str, gVar, mf0Var, 15));
                return;
            }
        }
        new rv(context, str).b(gVar.f31526a, mf0Var);
    }

    public final void b(va.d2 d2Var, mf0 mf0Var) {
        try {
            cv cvVar = this.f15767a;
            if (cvVar != null) {
                d2Var.f36063m = this.f15770d;
                cvVar.V2(va.b3.a(this.f15768b, d2Var), new mv(mf0Var, this, 1));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }
}
