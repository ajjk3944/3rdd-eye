package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xs extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final xn f18456a;

    /* renamed from: c, reason: collision with root package name */
    public final l90 f18458c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18457b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18459d = new ArrayList();

    public xs(xn xnVar) {
        new AtomicLong();
        this.f18456a = xnVar;
        l90 l90Var = null;
        try {
            List listD = xnVar.d();
            if (listD != null) {
                for (Object obj : listD) {
                    xm xmVarH4 = obj instanceof IBinder ? om.h4((IBinder) obj) : null;
                    if (xmVarH4 != null) {
                        this.f18457b.add(new l90(xmVarH4));
                    }
                }
            }
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
        try {
            List listZ = this.f18456a.z();
            if (listZ != null) {
                for (Object obj2 : listZ) {
                    va.l1 l1VarH4 = obj2 instanceof IBinder ? va.j2.h4((IBinder) obj2) : null;
                    if (l1VarH4 != null) {
                        this.f18459d.add(new gb.a(l1VarH4));
                    }
                }
            }
        } catch (RemoteException e10) {
            za.i.f("", e10);
        }
        try {
            xm xmVarZ1 = this.f18456a.z1();
            if (xmVarZ1 != null) {
                l90Var = new l90(xmVarZ1);
            }
        } catch (RemoteException e11) {
            za.i.f("", e11);
        }
        this.f18458c = l90Var;
        try {
            if (this.f18456a.E1() != null) {
                new fk0(this.f18456a.E1());
            }
        } catch (RemoteException e12) {
            za.i.f("", e12);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f18456a.e();
        } catch (RemoteException e2) {
            za.i.f("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f18456a.c();
        } catch (RemoteException e2) {
            za.i.f("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final pa.q c() {
        va.x1 x1VarT;
        try {
            x1VarT = this.f18456a.t();
        } catch (RemoteException e2) {
            za.i.f("", e2);
            x1VarT = null;
        }
        if (x1VarT != null) {
            return new pa.q(x1VarT);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ vb.a d() {
        try {
            return this.f18456a.M1();
        } catch (RemoteException e2) {
            za.i.f("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f18456a.J2(bundle);
        } catch (RemoteException e2) {
            za.i.f("Failed to record native event", e2);
        }
    }
}
