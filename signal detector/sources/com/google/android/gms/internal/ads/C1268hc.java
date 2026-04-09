package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import j2.C2556l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2824j;
import q2.C2834o;
import v2.AbstractC2960a;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268hc extends AbstractC2960a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14509a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.c1 f14510b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.L f14511c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14512d;

    public C1268hc(Context context, String str) {
        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
        this.f14512d = System.currentTimeMillis();
        new AtomicLong();
        this.f14509a = context;
        new AtomicReference(str);
        this.f14510b = q2.c1.f23184a;
        C2834o c2834o = q2.r.f23260g.f23262b;
        q2.d1 d1Var = new q2.d1();
        c2834o.getClass();
        this.f14511c = (q2.L) new C2824j(c2834o, context, d1Var, str, binderC0569Jc).d(context, false);
    }

    @Override // v2.AbstractC2960a
    public final void b(Activity activity) {
        if (activity == null) {
            u2.k.h("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            q2.L l2 = this.f14511c;
            if (l2 != null) {
                l2.B2(new S2.b(activity));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public final void c(q2.E0 e02, j2.u uVar) {
        try {
            q2.L l2 = this.f14511c;
            if (l2 != null) {
                e02.f23101m = this.f14512d;
                q2.c1 c1Var = this.f14510b;
                Context context = this.f14509a;
                c1Var.getClass();
                l2.x3(q2.c1.a(context, e02), new q2.Z0(uVar, this));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
            uVar.c(new C2556l(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
