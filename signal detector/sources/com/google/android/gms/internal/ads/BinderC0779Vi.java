package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q2.C2841s;
import q2.InterfaceC2842s0;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.Vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0779Vi extends B7 implements InterfaceC1193g8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0762Ui f12066a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.L f12067b;

    /* renamed from: c, reason: collision with root package name */
    public final C1391jt f12068c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12069d;

    /* renamed from: e, reason: collision with root package name */
    public final C0784Vn f12070e;

    public BinderC0779Vi(C0762Ui c0762Ui, q2.L l2, C1391jt c1391jt, C0784Vn c0784Vn) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f12069d = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8735e1)).booleanValue();
        this.f12066a = c0762Ui;
        this.f12067b = l2;
        this.f12068c = c1391jt;
        this.f12070e = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C0712Rj c0712Rj;
        C0712Rj c0712Rj2;
        InterfaceC1569n8 c1515m8 = null;
        String strA = null;
        q2.L l2 = this.f12067b;
        C0762Ui c0762Ui = this.f12066a;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                C7.e(parcel2, l2);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC1461l8) {
                    }
                }
                C7.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c1515m8 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1569n8 ? (InterfaceC1569n8) iInterfaceQueryLocalInterface2 : new C1515m8(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 2);
                }
                C7.f(parcel);
                X2(aVarD1, c1515m8);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC2854y0 interfaceC2854y0E = e();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2854y0E);
                return true;
            case 6:
                boolean zA = C7.a(parcel);
                C7.f(parcel);
                this.f12069d = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC2842s0 interfaceC2842s0K3 = q2.T0.K3(parcel.readStrongBinder());
                C7.f(parcel);
                M2.u.c("setOnPaidEventListener must be called on the main UI thread.");
                C1391jt c1391jt = this.f12068c;
                if (c1391jt != null) {
                    try {
                        if (!interfaceC2842s0K3.d()) {
                            this.f12070e.b();
                        }
                    } catch (RemoteException e6) {
                        u2.k.d("Error in making CSI ping for reporting paid event callback", e6);
                    }
                    c1391jt.f15014g.set(interfaceC2842s0K3);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    strA = l2.A();
                } catch (RemoteException e7) {
                    u2.k.k("#007 Could not call remote method.", e7);
                }
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 9:
                long j6 = (c0762Ui == null || (c0712Rj = c0762Ui.f16608j) == null) ? 0L : c0712Rj.f11035a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j6);
                return true;
            case 10:
                long j7 = parcel.readLong();
                C7.f(parcel);
                if (c0762Ui != null && (c0712Rj2 = c0762Ui.f16608j) != null) {
                    c0712Rj2.a(j7);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1193g8
    public final void X2(S2.a aVar, InterfaceC1569n8 interfaceC1569n8) {
        try {
            this.f12068c.f15011d.set(interfaceC1569n8);
            this.f12066a.c((Activity) S2.b.n1(aVar), this.f12069d);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1193g8
    public final InterfaceC2854y0 e() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.x7)).booleanValue()) {
            return this.f12066a.f16605f;
        }
        return null;
    }
}
