package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: com.google.android.play.integrity.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5026b extends G {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ IBinder f38124g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC5029e f38125h;

    C5026b(ServiceConnectionC5029e serviceConnectionC5029e, IBinder iBinder) {
        this.f38125h = serviceConnectionC5029e;
        this.f38124g = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.G
    public final void b() throws RemoteException {
        this.f38125h.f38127a.f38142n = (IInterface) this.f38125h.f38127a.f38137i.a(this.f38124g);
        C5030f.r(this.f38125h.f38127a);
        this.f38125h.f38127a.f38135g = false;
        Iterator it = this.f38125h.f38127a.f38132d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f38125h.f38127a.f38132d.clear();
    }
}
