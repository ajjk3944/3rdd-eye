package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q30 extends mg implements rh {

    /* renamed from: a, reason: collision with root package name */
    public final p30 f15196a;

    /* renamed from: b, reason: collision with root package name */
    public final va.l0 f15197b;

    /* renamed from: c, reason: collision with root package name */
    public final oo0 f15198c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15199d;

    /* renamed from: e, reason: collision with root package name */
    public final qd0 f15200e;

    public q30(p30 p30Var, va.l0 l0Var, oo0 oo0Var, qd0 qd0Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f15199d = ((Boolean) va.s.f36163e.f36166c.a(sk.f16101e1)).booleanValue();
        this.f15196a = p30Var;
        this.f15197b = l0Var;
        this.f15198c = oo0Var;
        this.f15200e = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.rh
    public final void J0(va.r1 r1Var) {
        pb.y.d("setOnPaidEventListener must be called on the main UI thread.");
        oo0 oo0Var = this.f15198c;
        if (oo0Var != null) {
            try {
                if (!r1Var.d()) {
                    this.f15200e.b();
                }
            } catch (RemoteException e2) {
                za.i.d("Error in making CSI ping for reporting paid event callback", e2);
            }
            oo0Var.g.set(r1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.rh
    public final void L0(vb.a aVar, yh yhVar) {
        try {
            this.f15198c.f14759d.set(yhVar);
            this.f15196a.c((Activity) vb.b.U0(aVar), this.f15199d);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.rh
    public final va.x1 e() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16401x7)).booleanValue()) {
            return this.f15196a.f14537f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        o50 o50Var;
        o50 o50Var2;
        yh xhVar = null;
        String strM1 = null;
        va.l0 l0Var = this.f15197b;
        p30 p30Var = this.f15196a;
        switch (i4) {
            case 2:
                parcel2.writeNoException();
                ng.e(parcel2, l0Var);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof wh) {
                    }
                }
                ng.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    xhVar = iInterfaceQueryLocalInterface2 instanceof yh ? (yh) iInterfaceQueryLocalInterface2 : new xh(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 1);
                }
                ng.f(parcel);
                L0(aVarR0, xhVar);
                parcel2.writeNoException();
                return true;
            case 5:
                va.x1 x1VarE = e();
                parcel2.writeNoException();
                ng.e(parcel2, x1VarE);
                return true;
            case 6:
                boolean zA = ng.a(parcel);
                ng.f(parcel);
                this.f15199d = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                va.r1 r1VarH4 = va.s2.h4(parcel.readStrongBinder());
                ng.f(parcel);
                J0(r1VarH4);
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    strM1 = l0Var.M1();
                } catch (RemoteException e2) {
                    za.i.k("#007 Could not call remote method.", e2);
                }
                parcel2.writeNoException();
                parcel2.writeString(strM1);
                return true;
            case 9:
                long j = (p30Var == null || (o50Var = p30Var.j) == null) ? 0L : o50Var.f14565a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case 10:
                long j8 = parcel.readLong();
                ng.f(parcel);
                if (p30Var != null && (o50Var2 = p30Var.j) != null) {
                    o50Var2.a(j8);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
