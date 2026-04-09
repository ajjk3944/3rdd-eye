package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ms1 extends u.o {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f14005b;

    public ms1(al alVar) {
        this.f14005b = new WeakReference(alVar);
    }

    @Override // u.o
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.h hVar) {
        al alVar = (al) this.f14005b.get();
        if (alVar != null) {
            alVar.f9345b = (u.n) hVar;
            try {
                ((b.b) hVar.f34709a).g1();
            } catch (RemoteException unused) {
            }
            se.b bVar = alVar.f9347d;
            if (bVar != null) {
                al alVar2 = (al) bVar.f33556a;
                u.n nVar = alVar2.f9345b;
                if (nVar == null) {
                    alVar2.f9344a = null;
                } else if (alVar2.f9344a == null) {
                    alVar2.f9344a = nVar.c(null);
                }
                u.l lVar = new u.l(alVar2.f9344a);
                ya.f0.A(lVar, (Bundle) bVar.f33557b);
                u.m mVarA = lVar.a();
                Intent intent = mVarA.f34718a;
                Context context = (Context) bVar.f33558c;
                intent.setPackage(yo0.g(context));
                mVarA.a(context, (Uri) bVar.f33559d);
                Activity activity = (Activity) context;
                ms1 ms1Var = alVar2.f9346c;
                if (ms1Var == null) {
                    return;
                }
                activity.unbindService(ms1Var);
                alVar2.f9345b = null;
                alVar2.f9344a = null;
                alVar2.f9346c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        al alVar = (al) this.f14005b.get();
        if (alVar != null) {
            alVar.f9345b = null;
            alVar.f9344a = null;
        }
    }
}
