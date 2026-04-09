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

/* renamed from: q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2828l extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2834o f23244d;

    public C2828l(C2834o c2834o, Context context, BinderC0569Jc binderC0569Jc) {
        this.f23242b = context;
        this.f23243c = binderC0569Jc;
        Objects.requireNonNull(c2834o);
        this.f23244d = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final /* bridge */ /* synthetic */ Object a() {
        C2834o.h(this.f23242b, "ads_preloader");
        return null;
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        U u6;
        T s5;
        Context context = this.f23242b;
        S2.b bVar = new S2.b(context);
        H9.a(context);
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Tb)).booleanValue();
        C2834o c2834o = this.f23244d;
        BinderC0569Jc binderC0569Jc = this.f23243c;
        if (!zBooleanValue) {
            C1643ob c1643ob = (C1643ob) c2834o.f23257g;
            try {
                S2.b bVar2 = new S2.b(context);
                U u7 = (U) c1643ob.l(context);
                Parcel parcelH0 = u7.h0();
                C7.e(parcelH0, bVar2);
                C7.e(parcelH0, binderC0569Jc);
                parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK0 = u7.k0(parcelH0, 1);
                IBinder strongBinder = parcelK0.readStrongBinder();
                parcelK0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new S(strongBinder);
            } catch (S2.c e6) {
                e = e6;
                u2.k.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (RemoteException e7) {
                e = e7;
                u2.k.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e8) {
                e = e8;
                u2.k.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    u6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    u6 = iInterfaceQueryLocalInterface2 instanceof U ? (U) iInterfaceQueryLocalInterface2 : new U(iBinderB);
                }
                Parcel parcelH02 = u6.h0();
                C7.e(parcelH02, bVar);
                C7.e(parcelH02, binderC0569Jc);
                parcelH02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelK02 = u6.k0(parcelH02, 1);
                IBinder strongBinder2 = parcelK02.readStrongBinder();
                parcelK02.recycle();
                if (strongBinder2 == null) {
                    s5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    s5 = iInterfaceQueryLocalInterface3 instanceof T ? (T) iInterfaceQueryLocalInterface3 : new S(strongBinder2);
                }
                s5.i2(binderC0569Jc);
                return s5;
            } catch (Exception e9) {
                throw new u2.l(e9);
            }
        } catch (RemoteException e10) {
            e = e10;
            InterfaceC1107ee interfaceC1107eeA = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            InterfaceC1107ee interfaceC1107eeA2 = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA2.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (u2.l e12) {
            e = e12;
            InterfaceC1107ee interfaceC1107eeA22 = C1053de.a(context);
            c2834o.getClass();
            interfaceC1107eeA22.e("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.E0(new S2.b(this.f23242b), this.f23243c, ModuleDescriptor.MODULE_VERSION);
    }
}
