package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lv {

    /* renamed from: a, reason: collision with root package name */
    public final cv f13639a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13640b;

    /* renamed from: c, reason: collision with root package name */
    public final qv f13641c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13642d;

    public lv(Context context, String str) {
        va.o oVar = va.r.g.f36158b;
        yq yqVar = new yq();
        oVar.getClass();
        cv cvVar = (cv) new va.b(oVar, context, str, yqVar).d(context, false);
        this.f13642d = System.currentTimeMillis();
        new AtomicLong();
        this.f13640b = context.getApplicationContext();
        new AtomicReference(str);
        this.f13639a = cvVar;
        this.f13641c = new qv();
    }

    public static void a(Context context, String str, pa.g gVar, ab.b bVar) {
        pb.y.i(context, "Context cannot be null.");
        pb.y.i(str, "AdUnitId cannot be null.");
        pb.y.d("#008 Must be called on the main UI thread.");
        sk.a(context);
        if (((Boolean) sl.f16463k.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new ab.c(context, str, gVar, bVar, 14));
                return;
            }
        }
        za.i.c("Loading on UI thread");
        new lv(context, str).c(gVar.f31526a, bVar);
    }

    public final void b(Activity activity, pa.o oVar) {
        qv qvVar = this.f13641c;
        qvVar.f15456b = oVar;
        try {
            cv cvVar = this.f13639a;
            if (cvVar != null) {
                cvVar.Y2(qvVar);
                cvVar.I2(new vb.b(activity));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public final void c(va.d2 d2Var, ab.b bVar) {
        try {
            cv cvVar = this.f13639a;
            if (cvVar != null) {
                d2Var.f36063m = this.f13642d;
                cvVar.v2(va.b3.a(this.f13640b, d2Var), new mv(bVar, this, 0));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }
}
