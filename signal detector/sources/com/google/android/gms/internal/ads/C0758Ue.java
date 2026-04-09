package com.google.android.gms.internal.ads;

import A2.RunnableC0114b;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import j2.C2551g;
import j2.InterfaceC2559o;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2808b;
import q2.C2834o;
import q2.C2841s;
import u2.AbstractC2953c;

/* renamed from: com.google.android.gms.internal.ads.Ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758Ue {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0605Le f11700a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11701b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC0843Ze f11702c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11703d;

    public C0758Ue(Context context, String str) {
        C2834o c2834o = q2.r.f23260g.f23262b;
        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
        c2834o.getClass();
        InterfaceC0605Le interfaceC0605Le = (InterfaceC0605Le) new C2808b(c2834o, context, str, binderC0569Jc).d(context, false);
        this.f11703d = System.currentTimeMillis();
        new AtomicLong();
        this.f11701b = context.getApplicationContext();
        new AtomicReference(str);
        this.f11700a = interfaceC0605Le;
        this.f11702c = new BinderC0843Ze();
    }

    public static void a(Context context, String str, C2551g c2551g, E2.b bVar) {
        M2.u.f(context, "Context cannot be null.");
        M2.u.f(str, "AdUnitId cannot be null.");
        M2.u.c("#008 Must be called on the main UI thread.");
        H9.a(context);
        if (((Boolean) AbstractC1266ha.f14508k.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new RunnableC0114b(context, str, c2551g, bVar, 2));
                return;
            }
        }
        u2.k.c("Loading on UI thread");
        new C0758Ue(context, str).c(c2551g.f21337a, bVar);
    }

    public final void b(Activity activity, InterfaceC2559o interfaceC2559o) {
        BinderC0843Ze binderC0843Ze = this.f11702c;
        binderC0843Ze.f12909b = interfaceC2559o;
        try {
            InterfaceC0605Le interfaceC0605Le = this.f11700a;
            if (interfaceC0605Le != null) {
                interfaceC0605Le.F2(binderC0843Ze);
                interfaceC0605Le.o1(new S2.b(activity));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public final void c(q2.E0 e02, E2.b bVar) {
        try {
            InterfaceC0605Le interfaceC0605Le = this.f11700a;
            if (interfaceC0605Le != null) {
                e02.f23101m = this.f11703d;
                interfaceC0605Le.C0(q2.c1.a(this.f11701b, e02), new BinderC0775Ve(bVar, this, 0));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
