package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4841e6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36438a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36439b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36440c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f36441d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t7 f36442e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f36443f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C5 f36444g;

    RunnableC4841e6(C5 c52, AtomicReference atomicReference, String str, String str2, String str3, t7 t7Var, boolean z10) {
        this.f36438a = atomicReference;
        this.f36439b = str;
        this.f36440c = str2;
        this.f36441d = str3;
        this.f36442e = t7Var;
        this.f36443f = z10;
        this.f36444g = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2;
        synchronized (this.f36438a) {
            try {
                try {
                    interfaceC4951s2 = this.f36444g.f35813d;
                } catch (RemoteException e10) {
                    this.f36444g.zzj().C().d("(legacy) Failed to get user properties; remote exception", L2.r(this.f36439b), this.f36440c, e10);
                    this.f36438a.set(Collections.emptyList());
                }
                if (interfaceC4951s2 == null) {
                    this.f36444g.zzj().C().d("(legacy) Failed to get user properties; not connected to service", L2.r(this.f36439b), this.f36440c, this.f36441d);
                    this.f36438a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f36439b)) {
                    AbstractC7901p.l(this.f36442e);
                    this.f36438a.set(interfaceC4951s2.m0(this.f36440c, this.f36441d, this.f36443f, this.f36442e));
                } else {
                    this.f36438a.set(interfaceC4951s2.p(this.f36439b, this.f36440c, this.f36441d, this.f36443f));
                }
                this.f36444g.m0();
                this.f36438a.notify();
            } finally {
                this.f36438a.notify();
            }
        }
    }
}
