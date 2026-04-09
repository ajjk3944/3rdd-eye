package com.google.android.gms.internal.ads;

import A2.RunnableC0114b;
import android.content.Context;
import android.os.RemoteException;
import j2.C2551g;
import java.util.concurrent.atomic.AtomicLong;
import q2.C2808b;
import q2.C2834o;
import q2.C2841s;
import u2.AbstractC2953c;

/* renamed from: com.google.android.gms.internal.ads.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890af {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0605Le f13152a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13153b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC0843Ze f13154c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13155d = System.currentTimeMillis();

    public C0890af(Context context, String str) {
        new AtomicLong();
        this.f13153b = context.getApplicationContext();
        C2834o c2834o = q2.r.f23260g.f23262b;
        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
        c2834o.getClass();
        this.f13152a = (InterfaceC0605Le) new C2808b(c2834o, context, str, binderC0569Jc).d(context, false);
        this.f13154c = new BinderC0843Ze();
    }

    public static void a(Context context, String str, C2551g c2551g, C0700Qo c0700Qo) {
        M2.u.f(context, "Context cannot be null.");
        M2.u.f(str, "AdUnitId cannot be null.");
        M2.u.c("#008 Must be called on the main UI thread.");
        H9.a(context);
        if (((Boolean) AbstractC1266ha.f14508k.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new RunnableC0114b(context, str, c2551g, c0700Qo, 3));
                return;
            }
        }
        new C0890af(context, str).b(c2551g.f21337a, c0700Qo);
    }

    public final void b(q2.E0 e02, C0700Qo c0700Qo) {
        try {
            InterfaceC0605Le interfaceC0605Le = this.f13152a;
            if (interfaceC0605Le != null) {
                e02.f23101m = this.f13155d;
                interfaceC0605Le.X0(q2.c1.a(this.f13153b, e02), new BinderC0775Ve(c0700Qo, this, 1));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
