package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import q2.InterfaceC2831m0;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536Hd extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1589nb f8964a;

    /* renamed from: c, reason: collision with root package name */
    public final C0889ae f8966c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8965b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8967d = new ArrayList();

    public C0536Hd(InterfaceC1589nb interfaceC1589nb) {
        new AtomicLong();
        this.f8964a = interfaceC1589nb;
        C0889ae c0889ae = null;
        try {
            List listD = interfaceC1589nb.d();
            if (listD != null) {
                for (Object obj : listD) {
                    InterfaceC0635Na interfaceC0635NaK3 = obj instanceof IBinder ? BinderC0465Da.K3((IBinder) obj) : null;
                    if (interfaceC0635NaK3 != null) {
                        this.f8965b.add(new C0889ae(interfaceC0635NaK3));
                    }
                }
            }
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
        try {
            List listS = this.f8964a.S();
            if (listS != null) {
                for (Object obj2 : listS) {
                    InterfaceC2831m0 interfaceC2831m0K3 = obj2 instanceof IBinder ? q2.K0.K3((IBinder) obj2) : null;
                    if (interfaceC2831m0K3 != null) {
                        this.f8967d.add(new X3.e(interfaceC2831m0K3));
                    }
                }
            }
        } catch (RemoteException e7) {
            u2.k.f("", e7);
        }
        try {
            InterfaceC0635Na interfaceC0635NaG = this.f8964a.g();
            if (interfaceC0635NaG != null) {
                c0889ae = new C0889ae(interfaceC0635NaG);
            }
        } catch (RemoteException e8) {
            u2.k.f("", e8);
        }
        this.f8966c = c0889ae;
        try {
            if (this.f8964a.l() != null) {
                new C0567Ja(this.f8964a.l(), 1);
            }
        } catch (RemoteException e9) {
            u2.k.f("", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.f8964a.I();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f8964a.h();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f8964a.e();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String d() {
        try {
            return this.f8964a.j();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String e() {
        try {
            return this.f8964a.b();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final C0889ae f() {
        return this.f8966c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final q2.M0 g() {
        try {
            InterfaceC1589nb interfaceC1589nb = this.f8964a;
            if (interfaceC1589nb.C() != null) {
                return new q2.M0(interfaceC1589nb.C());
            }
            return null;
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String h() {
        try {
            return this.f8964a.n();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final j2.q i() {
        InterfaceC2854y0 interfaceC2854y0K;
        try {
            interfaceC2854y0K = this.f8964a.K();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            interfaceC2854y0K = null;
        }
        if (interfaceC2854y0K != null) {
            return new j2.q(interfaceC2854y0K);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double j() {
        try {
            double dK = this.f8964a.k();
            if (dK == -1.0d) {
                return null;
            }
            return Double.valueOf(dK);
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String k() {
        try {
            return this.f8964a.i();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ S2.a l() {
        try {
            return this.f8964a.A();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f8964a.m2(bundle);
        } catch (RemoteException e6) {
            u2.k.f("Failed to record native event", e6);
        }
    }
}
