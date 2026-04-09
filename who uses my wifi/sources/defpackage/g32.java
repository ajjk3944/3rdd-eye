package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g32 extends e6 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g32(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.e6
    public final /* synthetic */ Object i(IBinder iBinder) {
        switch (this.c) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface instanceof i22 ? (i22) iInterfaceQueryLocalInterface : new g22(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface2 instanceof f92 ? (f92) iInterfaceQueryLocalInterface2 : new d92(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface3 instanceof lo2 ? (lo2) iInterfaceQueryLocalInterface3 : new lo2(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface4 instanceof k82 ? (k82) iInterfaceQueryLocalInterface4 : new k82(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return iInterfaceQueryLocalInterface5 instanceof oa2 ? (oa2) iInterfaceQueryLocalInterface5 : new oa2(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface6 instanceof wh2 ? (wh2) iInterfaceQueryLocalInterface6 : new wh2(iBinder);
        }
    }

    public ba2 w(Context context, xe4 xe4Var, String str, u62 u62Var, int i) throws ze4 {
        oa2 oa2Var;
        xe4 xe4Var2;
        String str2;
        u62 u62Var2;
        int i2;
        mz1.a(context);
        if (((Boolean) tw1.e.c.a(mz1.wb)).booleanValue()) {
            try {
                oi0 oi0Var = new oi0(context);
                try {
                    IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        xe4Var2 = xe4Var;
                        str2 = str;
                        u62Var2 = u62Var;
                        i2 = i;
                        oa2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        oa2Var = iInterfaceQueryLocalInterface instanceof oa2 ? (oa2) iInterfaceQueryLocalInterface : new oa2(iBinderB);
                        xe4Var2 = xe4Var;
                        str2 = str;
                        u62Var2 = u62Var;
                        i2 = i;
                    }
                    IBinder iBinderL1 = oa2Var.l1(oi0Var, xe4Var2, str2, u62Var2, i2);
                    if (iBinderL1 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderL1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof ba2 ? (ba2) iInterfaceQueryLocalInterface2 : new v82(iBinderL1);
                    }
                } catch (Exception e) {
                    throw new ze4(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                Exception exc = e;
                r92.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                gi2.p0("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                Exception exc2 = e;
                r92.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                gi2.p0("#007 Could not call remote method.", exc2);
                return null;
            } catch (ze4 e4) {
                e = e4;
                Exception exc22 = e;
                r92.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                gi2.p0("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder iBinderL12 = ((oa2) j(context)).l1(new oi0(context), xe4Var, str, u62Var, i);
                if (iBinderL12 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderL12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof ba2 ? (ba2) iInterfaceQueryLocalInterface3 : new v82(iBinderL12);
                }
            } catch (RemoteException | hp0 unused) {
                gi2.q0(3);
                return null;
            }
        }
        return null;
    }
}
