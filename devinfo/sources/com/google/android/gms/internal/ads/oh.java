package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oh {

    /* renamed from: a, reason: collision with root package name */
    public final rh f14699a;

    /* renamed from: b, reason: collision with root package name */
    public final ph f14700b = new ph("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public oh(rh rhVar, String str) {
        new AtomicLong();
        this.f14699a = rhVar;
        new AtomicReference(str);
    }

    public static void a(Context context, String str, pa.g gVar, ab.b bVar) {
        pb.y.i(context, "Context cannot be null.");
        pb.y.i(str, "adUnitId cannot be null.");
        pb.y.d("#008 Must be called on the main UI thread.");
        sk.a(context);
        if (((Boolean) sl.f16458d.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new ab.c(context, str, gVar, bVar, 17));
                return;
            }
        }
        new b7(context, str, gVar.f31526a, bVar).b();
    }

    public final void b(Activity activity) {
        try {
            this.f14699a.L0(new vb.b(activity), this.f14700b);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }
}
