package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.C1643ob;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC1107ee;
import j$.util.Objects;

/* renamed from: q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2826k extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2834o f23241e;

    public C2826k(C2834o c2834o, Context context, String str, BinderC0569Jc binderC0569Jc) {
        this.f23238b = context;
        this.f23239c = str;
        this.f23240d = binderC0569Jc;
        Objects.requireNonNull(c2834o);
        this.f23241e = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23238b, "native_ad");
        return new O0();
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        I i;
        Context context = this.f23238b;
        H9.a(context);
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Tb)).booleanValue();
        C2834o c2834o = this.f23241e;
        BinderC0569Jc binderC0569Jc = this.f23240d;
        String str = this.f23239c;
        if (!zBooleanValue) {
            C1643ob c1643ob = (C1643ob) c2834o.f23253c;
            try {
                S2.b bVar = new S2.b(context);
                I i3 = (I) c1643ob.l(context);
                Parcel parcelH0 = i3.h0();
                C7.e(parcelH0, bVar);
                parcelH0.writeString(str);
                C7.e(parcelH0, binderC0569Jc);
                parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK0 = i3.k0(parcelH0, 1);
                IBinder strongBinder = parcelK0.readStrongBinder();
                parcelK0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
            } catch (S2.c e6) {
                e = e6;
                u2.k.i("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (RemoteException e7) {
                e = e7;
                u2.k.i("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            S2.b bVar2 = new S2.b(context);
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    i = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    i = iInterfaceQueryLocalInterface2 instanceof I ? (I) iInterfaceQueryLocalInterface2 : new I(iBinderB);
                }
                Parcel parcelH02 = i.h0();
                C7.e(parcelH02, bVar2);
                parcelH02.writeString(str);
                C7.e(parcelH02, binderC0569Jc);
                parcelH02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK02 = i.k0(parcelH02, 1);
                IBinder strongBinder2 = parcelK02.readStrongBinder();
                parcelK02.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof H ? (H) iInterfaceQueryLocalInterface3 : new F(strongBinder2);
            } catch (Exception e8) {
                throw new u2.l(e8);
            }
        } catch (RemoteException e9) {
            e = e9;
            InterfaceC1107ee interfaceC1107eeA = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            InterfaceC1107ee interfaceC1107eeA2 = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA2.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (u2.l e11) {
            e = e11;
            InterfaceC1107ee interfaceC1107eeA22 = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA22.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.T0(new S2.b(this.f23238b), this.f23239c, this.f23240d, ModuleDescriptor.MODULE_VERSION);
    }
}
