package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC0655Od;
import com.google.android.gms.internal.ads.AbstractBinderC0706Rd;
import com.google.android.gms.internal.ads.C0638Nd;
import com.google.android.gms.internal.ads.C0689Qd;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.C1643ob;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0672Pd;
import com.google.android.gms.internal.ads.InterfaceC0723Sd;
import com.google.android.gms.internal.ads.InterfaceC1107ee;
import j$.util.Objects;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2810c extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f23182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2834o f23183c;

    public C2810c(C2834o c2834o, AdActivity adActivity) {
        this.f23182b = adActivity;
        Objects.requireNonNull(c2834o);
        this.f23183c = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final /* bridge */ /* synthetic */ Object a() {
        C2834o.h(this.f23182b, "ad_overlay");
        return null;
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        IInterface c0689Qd;
        AdActivity adActivity = this.f23182b;
        H9.a(adActivity);
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Tb)).booleanValue();
        C2834o c2834o = this.f23183c;
        if (!zBooleanValue) {
            C1643ob c1643ob = (C1643ob) c2834o.f23256f;
            try {
                S2.b bVar = new S2.b(adActivity);
                C0689Qd c0689Qd2 = (C0689Qd) ((InterfaceC0723Sd) c1643ob.l(adActivity));
                Parcel parcelH0 = c0689Qd2.h0();
                C7.e(parcelH0, bVar);
                Parcel parcelK0 = c0689Qd2.k0(parcelH0, 1);
                IBinder strongBinder = parcelK0.readStrongBinder();
                parcelK0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0672Pd ? (InterfaceC0672Pd) iInterfaceQueryLocalInterface : new C0638Nd(strongBinder);
            } catch (S2.c e6) {
                u2.k.i("Could not create remote AdOverlay.", e6);
                return null;
            } catch (RemoteException e7) {
                u2.k.i("Could not create remote AdOverlay.", e7);
                return null;
            }
        }
        try {
            S2.b bVar2 = new S2.b(adActivity);
            try {
                IBinder iBinderB = u2.k.b(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = AbstractBinderC0706Rd.f10913a;
                if (iBinderB == null) {
                    c0689Qd = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c0689Qd = iInterfaceQueryLocalInterface2 instanceof InterfaceC0723Sd ? (InterfaceC0723Sd) iInterfaceQueryLocalInterface2 : new C0689Qd(iBinderB);
                }
                C0689Qd c0689Qd3 = (C0689Qd) c0689Qd;
                Parcel parcelH02 = c0689Qd3.h0();
                C7.e(parcelH02, bVar2);
                Parcel parcelK02 = c0689Qd3.k0(parcelH02, 1);
                IBinder strongBinder2 = parcelK02.readStrongBinder();
                parcelK02.recycle();
                int i3 = AbstractBinderC0655Od.f10211a;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC0672Pd ? (InterfaceC0672Pd) iInterfaceQueryLocalInterface3 : new C0638Nd(strongBinder2);
            } catch (Exception e8) {
                throw new u2.l(e8);
            }
        } catch (RemoteException | NullPointerException | u2.l e9) {
            InterfaceC1107ee interfaceC1107eeA = C1053de.a(adActivity.getApplicationContext());
            c2834o.getClass();
            interfaceC1107eeA.e("ClientApiBroker.createAdOverlay", e9);
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.D(new S2.b(this.f23182b));
    }
}
