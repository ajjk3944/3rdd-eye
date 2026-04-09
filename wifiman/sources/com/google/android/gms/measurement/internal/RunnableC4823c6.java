package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4823c6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36360a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36361b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36362c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f36363d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t7 f36364e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C5 f36365f;

    RunnableC4823c6(C5 c52, AtomicReference atomicReference, String str, String str2, String str3, t7 t7Var) {
        this.f36360a = atomicReference;
        this.f36361b = str;
        this.f36362c = str2;
        this.f36363d = str3;
        this.f36364e = t7Var;
        this.f36365f = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2;
        synchronized (this.f36360a) {
            try {
                try {
                    interfaceC4951s2 = this.f36365f.f35813d;
                } catch (RemoteException e10) {
                    this.f36365f.zzj().C().d("(legacy) Failed to get conditional properties; remote exception", L2.r(this.f36361b), this.f36362c, e10);
                    this.f36360a.set(Collections.emptyList());
                }
                if (interfaceC4951s2 == null) {
                    this.f36365f.zzj().C().d("(legacy) Failed to get conditional properties; not connected to service", L2.r(this.f36361b), this.f36362c, this.f36363d);
                    this.f36360a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f36361b)) {
                    AbstractC7901p.l(this.f36364e);
                    this.f36360a.set(interfaceC4951s2.c0(this.f36362c, this.f36363d, this.f36364e));
                } else {
                    this.f36360a.set(interfaceC4951s2.I(this.f36361b, this.f36362c, this.f36363d));
                }
                this.f36365f.m0();
                this.f36360a.notify();
            } finally {
                this.f36360a.notify();
            }
        }
    }
}
