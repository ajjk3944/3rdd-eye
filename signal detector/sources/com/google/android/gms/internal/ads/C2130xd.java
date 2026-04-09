package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2130xd implements w2.j, w2.n, w2.t, w2.q, w2.h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0688Qc f17603a;

    public C2130xd(InterfaceC0688Qc interfaceC0688Qc) {
        this.f17603a = interfaceC0688Qc;
    }

    @Override // w2.t
    public final void a() {
        try {
            this.f17603a.T();
        } catch (RemoteException unused) {
        }
    }

    @Override // w2.InterfaceC2971c
    public final void b() {
        try {
            this.f17603a.j();
        } catch (RemoteException unused) {
        }
    }

    @Override // w2.InterfaceC2971c
    public final void c() {
        try {
            this.f17603a.d();
        } catch (RemoteException unused) {
        }
    }

    @Override // w2.InterfaceC2971c
    public final void d() {
        try {
            this.f17603a.k();
        } catch (RemoteException unused) {
        }
    }

    @Override // w2.InterfaceC2971c
    public final void e() {
        try {
            this.f17603a.b();
        } catch (RemoteException unused) {
        }
    }
}
