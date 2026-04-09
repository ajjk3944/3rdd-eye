package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.yn;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f36138c;

    public m(o oVar, Context context) {
        this.f36137b = context;
        Objects.requireNonNull(oVar);
        this.f36138c = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36137b, "mobile_ads_settings");
        return new p2();
    }

    @Override // va.q
    public final Object b() throws za.j {
        i1 i1Var;
        Context context = this.f36137b;
        sk.a(context);
        boolean zBooleanValue = ((Boolean) s.f36163e.f36166c.a(sk.Vb)).booleanValue();
        o oVar = this.f36138c;
        if (!zBooleanValue) {
            yn ynVar = (yn) oVar.f36148d;
            try {
                vb.b bVar = new vb.b(context);
                i1 i1Var2 = (i1) ynVar.k(context);
                Parcel parcelT = i1Var2.T();
                ng.e(parcelT, bVar);
                parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR0 = i1Var2.r0(parcelT, 1);
                IBinder strongBinder = parcelR0.readStrongBinder();
                parcelR0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof h1 ? (h1) iInterfaceQueryLocalInterface : new e1(strongBinder);
            } catch (RemoteException e2) {
                e = e2;
                za.i.i("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (vb.c e10) {
                e = e10;
                za.i.i("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            vb.b bVar2 = new vb.b(context);
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    i1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    i1Var = iInterfaceQueryLocalInterface2 instanceof i1 ? (i1) iInterfaceQueryLocalInterface2 : new i1(iBinderB);
                }
                Parcel parcelT2 = i1Var.T();
                ng.e(parcelT2, bVar2);
                parcelT2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR02 = i1Var.r0(parcelT2, 1);
                IBinder strongBinder2 = parcelR02.readStrongBinder();
                parcelR02.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof h1 ? (h1) iInterfaceQueryLocalInterface3 : new e1(strongBinder2);
            } catch (Exception e11) {
                throw new za.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            vt vtVarA = ut.a(context);
            oVar.getClass();
            vtVarA.d("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            vt vtVarA2 = ut.a(context);
            oVar.getClass();
            vtVarA2.d("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (za.j e14) {
            e = e14;
            vt vtVarA22 = ut.a(context);
            oVar.getClass();
            vtVarA22.d("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.n0(new vb.b(this.f36137b), ModuleDescriptor.MODULE_VERSION);
    }
}
