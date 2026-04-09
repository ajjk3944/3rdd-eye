package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import q2.C2825j0;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643ob extends B3.u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1643ob(String str, int i) {
        super(str);
        this.f15963c = i;
    }

    public q2.L D(Context context, q2.d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) throws u2.l {
        q2.M m6;
        q2.d1 d1Var2;
        String str2;
        InterfaceC0603Lc interfaceC0603Lc2;
        int i3;
        H9.a(context);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Tb)).booleanValue()) {
            try {
                S2.b bVar = new S2.b(context);
                try {
                    IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        d1Var2 = d1Var;
                        str2 = str;
                        interfaceC0603Lc2 = interfaceC0603Lc;
                        i3 = i;
                        m6 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        m6 = iInterfaceQueryLocalInterface instanceof q2.M ? (q2.M) iInterfaceQueryLocalInterface : new q2.M(iBinderB);
                        d1Var2 = d1Var;
                        str2 = str;
                        interfaceC0603Lc2 = interfaceC0603Lc;
                        i3 = i;
                    }
                    IBinder iBinderN1 = m6.n1(bVar, d1Var2, str2, interfaceC0603Lc2, i3);
                    if (iBinderN1 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderN1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof q2.L ? (q2.L) iInterfaceQueryLocalInterface2 : new q2.J(iBinderN1);
                    }
                } catch (Exception e6) {
                    throw new u2.l(e6);
                }
            } catch (RemoteException e7) {
                e = e7;
                Exception exc = e;
                C1053de.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                u2.k.k("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e8) {
                e = e8;
                Exception exc2 = e;
                C1053de.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                u2.k.k("#007 Could not call remote method.", exc2);
                return null;
            } catch (u2.l e9) {
                e = e9;
                Exception exc22 = e;
                C1053de.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                u2.k.k("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder iBinderN12 = ((q2.M) l(context)).n1(new S2.b(context), d1Var, str, interfaceC0603Lc, i);
                if (iBinderN12 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderN12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof q2.L ? (q2.L) iInterfaceQueryLocalInterface3 : new q2.J(iBinderN12);
                }
            } catch (S2.c e10) {
                e = e10;
                u2.k.d("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e11) {
                e = e11;
                u2.k.d("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }

    @Override // B3.u
    public final /* synthetic */ Object k(IBinder iBinder) {
        switch (this.f15963c) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0754Ua ? (InterfaceC0754Ua) iInterfaceQueryLocalInterface : new C0720Sa(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface2 instanceof InterfaceC0723Sd ? (InterfaceC0723Sd) iInterfaceQueryLocalInterface2 : new C0689Qd(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface3 instanceof C2825j0 ? (C2825j0) iInterfaceQueryLocalInterface3 : new C2825j0(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface4 instanceof q2.I ? (q2.I) iInterfaceQueryLocalInterface4 : new q2.I(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return iInterfaceQueryLocalInterface5 instanceof q2.M ? (q2.M) iInterfaceQueryLocalInterface5 : new q2.M(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface6 instanceof q2.U ? (q2.U) iInterfaceQueryLocalInterface6 : new q2.U(iBinder);
        }
    }
}
