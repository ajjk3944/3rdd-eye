package com.google.android.gms.internal.ads;

import A2.RunnableC0114b;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import j2.C2551g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2841s;
import u2.AbstractC2953c;

/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029d8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1193g8 f13732a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC1083e8 f13733b = new BinderC1083e8("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public C1029d8(InterfaceC1193g8 interfaceC1193g8, String str) {
        new AtomicLong();
        this.f13732a = interfaceC1193g8;
        new AtomicReference(str);
    }

    public static void a(Context context, String str, C2551g c2551g, E2.b bVar) {
        M2.u.f(context, "Context cannot be null.");
        M2.u.f(str, "adUnitId cannot be null.");
        M2.u.c("#008 Must be called on the main UI thread.");
        H9.a(context);
        if (((Boolean) AbstractC1266ha.f14502d.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new RunnableC0114b(context, str, c2551g, bVar, 5));
                return;
            }
        }
        new C0969c3(context, str, c2551g.f21337a, bVar).b();
    }

    public final void b(Activity activity) {
        try {
            this.f13732a.X2(new S2.b(activity), this.f13733b);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
