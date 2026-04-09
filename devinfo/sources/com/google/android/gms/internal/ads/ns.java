package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ns implements bb.l, bb.q, bb.x, bb.t, bb.i {

    /* renamed from: a, reason: collision with root package name */
    public final fr f14403a;

    public ns(fr frVar) {
        this.f14403a = frVar;
    }

    @Override // bb.l, bb.q, bb.t
    public final void a() {
        try {
            this.f14403a.z1();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.q, bb.i
    public final void b(pa.a aVar) {
        try {
            int i4 = aVar.f31511a;
            String str = aVar.f31512b;
            String str2 = aVar.f31513c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 59 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append("Mediated ad failed to show: Error Code = ");
            sb2.append(i4);
            sb2.append(". Error Message = ");
            sb2.append(str);
            sb2.append(" Error Domain = ");
            sb2.append(str2);
            za.i.h(sb2.toString());
            this.f14403a.c1(aVar.a());
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.x, bb.t
    public final void c() {
        try {
            this.f14403a.K();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.x
    public final void d() {
        try {
            this.f14403a.C();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.c
    public final void e() {
        try {
            this.f14403a.C1();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.x
    public final void f() {
        try {
            this.f14403a.H1();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.c
    public final void g() {
        try {
            this.f14403a.D1();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.c
    public final void h() {
        try {
            this.f14403a.c();
        } catch (RemoteException unused) {
        }
    }

    @Override // bb.c
    public final void onAdClosed() {
        try {
            this.f14403a.d();
        } catch (RemoteException unused) {
        }
    }
}
