package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class up extends ab.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17281a;

    /* renamed from: b, reason: collision with root package name */
    public final va.b3 f17282b;

    /* renamed from: c, reason: collision with root package name */
    public final va.l0 f17283c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17284d;

    public up(Context context, String str) {
        yq yqVar = new yq();
        this.f17284d = System.currentTimeMillis();
        new AtomicLong();
        this.f17281a = context;
        new AtomicReference(str);
        this.f17282b = va.b3.f36034a;
        va.o oVar = va.r.g.f36158b;
        va.c3 c3Var = new va.c3();
        oVar.getClass();
        this.f17283c = (va.l0) new va.j(oVar, context, c3Var, str, yqVar).d(context, false);
    }

    @Override // ab.a
    public final void b(Activity activity) {
        if (activity == null) {
            za.i.h("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            va.l0 l0Var = this.f17283c;
            if (l0Var != null) {
                l0Var.j3(new vb.b(activity));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public final void c(va.d2 d2Var, pa.u uVar) {
        try {
            va.l0 l0Var = this.f17283c;
            if (l0Var != null) {
                d2Var.f36063m = this.f17284d;
                va.b3 b3Var = this.f17282b;
                Context context = this.f17281a;
                b3Var.getClass();
                l0Var.Z3(va.b3.a(context, d2Var), new va.y2(uVar, this));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
            uVar.c(new pa.l(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
