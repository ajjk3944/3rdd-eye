package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.C1643ob;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC1107ee;
import j$.util.Objects;

/* renamed from: q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2830m extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2834o f23246c;

    public C2830m(C2834o c2834o, Context context) {
        this.f23245b = context;
        Objects.requireNonNull(c2834o);
        this.f23246c = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23245b, "mobile_ads_settings");
        return new Q0();
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        C2825j0 c2825j0;
        Context context = this.f23245b;
        H9.a(context);
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Tb)).booleanValue();
        C2834o c2834o = this.f23246c;
        if (!zBooleanValue) {
            C1643ob c1643ob = (C1643ob) c2834o.f23254d;
            try {
                S2.b bVar = new S2.b(context);
                C2825j0 c2825j02 = (C2825j0) c1643ob.l(context);
                Parcel parcelH0 = c2825j02.h0();
                C7.e(parcelH0, bVar);
                parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK0 = c2825j02.k0(parcelH0, 1);
                IBinder strongBinder = parcelK0.readStrongBinder();
                parcelK0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof InterfaceC2823i0 ? (InterfaceC2823i0) iInterfaceQueryLocalInterface : new C2817f0(strongBinder);
            } catch (S2.c e6) {
                e = e6;
                u2.k.i("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (RemoteException e7) {
                e = e7;
                u2.k.i("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            S2.b bVar2 = new S2.b(context);
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    c2825j0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c2825j0 = iInterfaceQueryLocalInterface2 instanceof C2825j0 ? (C2825j0) iInterfaceQueryLocalInterface2 : new C2825j0(iBinderB);
                }
                Parcel parcelH02 = c2825j0.h0();
                C7.e(parcelH02, bVar2);
                parcelH02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK02 = c2825j0.k0(parcelH02, 1);
                IBinder strongBinder2 = parcelK02.readStrongBinder();
                parcelK02.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC2823i0 ? (InterfaceC2823i0) iInterfaceQueryLocalInterface3 : new C2817f0(strongBinder2);
            } catch (Exception e8) {
                throw new u2.l(e8);
            }
        } catch (RemoteException e9) {
            e = e9;
            InterfaceC1107ee interfaceC1107eeA = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            InterfaceC1107ee interfaceC1107eeA2 = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA2.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (u2.l e11) {
            e = e11;
            InterfaceC1107ee interfaceC1107eeA22 = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA22.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.Q1(new S2.b(this.f23245b), ModuleDescriptor.MODULE_VERSION);
    }
}
