package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class K5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35965a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35966b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t7 f35967c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f35968d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35969e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C5 f35970f;

    K5(C5 c52, String str, String str2, t7 t7Var, boolean z10, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35965a = str;
        this.f35966b = str2;
        this.f35967c = t7Var;
        this.f35968d = z10;
        this.f35969e = u02;
        this.f35970f = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            InterfaceC4951s2 interfaceC4951s2 = this.f35970f.f35813d;
            if (interfaceC4951s2 == null) {
                this.f35970f.zzj().C().c("Failed to get user properties; not connected to service", this.f35965a, this.f35966b);
                return;
            }
            AbstractC7901p.l(this.f35967c);
            Bundle bundleC = x7.C(interfaceC4951s2.m0(this.f35965a, this.f35966b, this.f35968d, this.f35967c));
            this.f35970f.m0();
            this.f35970f.g().N(this.f35969e, bundleC);
        } catch (RemoteException e10) {
            this.f35970f.zzj().C().c("Failed to get user properties; remote exception", this.f35965a, e10);
        } finally {
            this.f35970f.g().N(this.f35969e, bundle);
        }
    }
}
