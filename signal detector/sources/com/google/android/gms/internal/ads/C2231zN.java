package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import r.AbstractServiceConnectionC2868k;
import r.C2866i;
import r.C2867j;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.zN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2231zN extends AbstractServiceConnectionC2868k {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f17871b;

    public C2231zN(Q9 q9) {
        this.f17871b = new WeakReference(q9);
    }

    @Override // r.AbstractServiceConnectionC2868k
    public final void a(C2867j c2867j) {
        Q9 q9 = (Q9) this.f17871b.get();
        if (q9 != null) {
            q9.f10582b = c2867j;
            try {
                ((b.b) c2867j.f23316a).d1();
            } catch (RemoteException unused) {
            }
            c1.g gVar = q9.f10584d;
            if (gVar != null) {
                Q9 q92 = (Q9) gVar.f5896b;
                C2867j c2867j2 = q92.f10582b;
                if (c2867j2 == null) {
                    q92.f10581a = null;
                } else if (q92.f10581a == null) {
                    q92.f10581a = c2867j2.b(null);
                }
                C0855Zq c0855Zq = new C0855Zq(q92.f10581a);
                C2911G.A(c0855Zq, (Bundle) gVar.f5897c);
                C2866i c2866iA = c0855Zq.a();
                Intent intent = c2866iA.f23314a;
                Context context = (Context) gVar.f5898d;
                intent.setPackage(AbstractC1984ut.g(context));
                intent.setData((Uri) gVar.f5899e);
                context.startActivity(intent, c2866iA.f23315b);
                Activity activity = (Activity) context;
                C2231zN c2231zN = q92.f10583c;
                if (c2231zN == null) {
                    return;
                }
                activity.unbindService(c2231zN);
                q92.f10582b = null;
                q92.f10581a = null;
                q92.f10583c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Q9 q9 = (Q9) this.f17871b.get();
        if (q9 != null) {
            q9.f10582b = null;
            q9.f10581a = null;
        }
    }
}
