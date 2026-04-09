package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4850f6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36454a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36455b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t7 f36456c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36457d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C5 f36458e;

    RunnableC4850f6(C5 c52, String str, String str2, t7 t7Var, com.google.android.gms.internal.measurement.U0 u02) {
        this.f36454a = str;
        this.f36455b = str2;
        this.f36456c = t7Var;
        this.f36457d = u02;
        this.f36458e = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC4951s2 interfaceC4951s2 = this.f36458e.f35813d;
            if (interfaceC4951s2 == null) {
                this.f36458e.zzj().C().c("Failed to get conditional properties; not connected to service", this.f36454a, this.f36455b);
                return;
            }
            AbstractC7901p.l(this.f36456c);
            ArrayList arrayListP0 = x7.p0(interfaceC4951s2.c0(this.f36454a, this.f36455b, this.f36456c));
            this.f36458e.m0();
            this.f36458e.g().P(this.f36457d, arrayListP0);
        } catch (RemoteException e10) {
            this.f36458e.zzj().C().d("Failed to get conditional properties; remote exception", this.f36454a, this.f36455b, e10);
        } finally {
            this.f36458e.g().P(this.f36457d, arrayList);
        }
    }
}
