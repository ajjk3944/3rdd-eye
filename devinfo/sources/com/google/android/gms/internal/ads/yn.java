package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yn extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn(String str, int i4) {
        super(str);
        this.f18809c = i4;
    }

    @Override // androidx.recyclerview.widget.d0
    public final /* synthetic */ Object j(IBinder iBinder) {
        switch (this.f18809c) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new cn(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface2 instanceof jt ? (jt) iInterfaceQueryLocalInterface2 : new gt(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface3 instanceof va.i1 ? (va.i1) iInterfaceQueryLocalInterface3 : new va.i1(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface4 instanceof va.i0 ? (va.i0) iInterfaceQueryLocalInterface4 : new va.i0(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return iInterfaceQueryLocalInterface5 instanceof va.m0 ? (va.m0) iInterfaceQueryLocalInterface5 : new va.m0(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface6 instanceof va.t0 ? (va.t0) iInterfaceQueryLocalInterface6 : new va.t0(iBinder);
        }
    }

    public va.l0 y(Context context, va.c3 c3Var, String str, ar arVar, int i4) throws za.j {
        va.m0 m0Var;
        va.c3 c3Var2;
        String str2;
        ar arVar2;
        int i10;
        sk.a(context);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Vb)).booleanValue()) {
            try {
                vb.b bVar = new vb.b(context);
                try {
                    IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        c3Var2 = c3Var;
                        str2 = str;
                        arVar2 = arVar;
                        i10 = i4;
                        m0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        m0Var = iInterfaceQueryLocalInterface instanceof va.m0 ? (va.m0) iInterfaceQueryLocalInterface : new va.m0(iBinderB);
                        c3Var2 = c3Var;
                        str2 = str;
                        arVar2 = arVar;
                        i10 = i4;
                    }
                    IBinder iBinderK2 = m0Var.k2(bVar, c3Var2, str2, arVar2, i10);
                    if (iBinderK2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderK2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof va.l0 ? (va.l0) iInterfaceQueryLocalInterface2 : new va.j0(iBinderK2);
                    }
                } catch (Exception e2) {
                    throw new za.j(e2);
                }
            } catch (RemoteException e10) {
                e = e10;
                Exception exc = e;
                ut.a(context).d("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                za.i.k("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                Exception exc2 = e;
                ut.a(context).d("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                za.i.k("#007 Could not call remote method.", exc2);
                return null;
            } catch (za.j e12) {
                e = e12;
                Exception exc22 = e;
                ut.a(context).d("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                za.i.k("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder iBinderK22 = ((va.m0) k(context)).k2(new vb.b(context), c3Var, str, arVar, i4);
                if (iBinderK22 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderK22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof va.l0 ? (va.l0) iInterfaceQueryLocalInterface3 : new va.j0(iBinderK22);
                }
            } catch (RemoteException e13) {
                e = e13;
                za.i.d("Could not create remote AdManager.", e);
                return null;
            } catch (vb.c e14) {
                e = e14;
                za.i.d("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
