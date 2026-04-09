package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.gt;
import com.google.android.gms.internal.ads.ht;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.yn;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f36035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f36036c;

    public c(o oVar, AdActivity adActivity) {
        this.f36035b = adActivity;
        Objects.requireNonNull(oVar);
        this.f36036c = oVar;
    }

    @Override // va.q
    public final /* bridge */ /* synthetic */ Object a() {
        o.t(this.f36035b, "ad_overlay");
        return null;
    }

    @Override // va.q
    public final Object b() throws za.j {
        IInterface gtVar;
        AdActivity adActivity = this.f36035b;
        sk.a(adActivity);
        boolean zBooleanValue = ((Boolean) s.f36163e.f36166c.a(sk.Vb)).booleanValue();
        o oVar = this.f36036c;
        if (!zBooleanValue) {
            yn ynVar = (yn) oVar.f36150f;
            try {
                vb.b bVar = new vb.b(adActivity);
                gt gtVar2 = (gt) ((jt) ynVar.k(adActivity));
                Parcel parcelT = gtVar2.T();
                ng.e(parcelT, bVar);
                Parcel parcelR0 = gtVar2.r0(parcelT, 1);
                IBinder strongBinder = parcelR0.readStrongBinder();
                parcelR0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof ft ? (ft) iInterfaceQueryLocalInterface : new dt(strongBinder);
            } catch (RemoteException e2) {
                za.i.i("Could not create remote AdOverlay.", e2);
                return null;
            } catch (vb.c e10) {
                za.i.i("Could not create remote AdOverlay.", e10);
                return null;
            }
        }
        try {
            vb.b bVar2 = new vb.b(adActivity);
            try {
                IBinder iBinderB = za.i.b(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i4 = ht.f11965a;
                if (iBinderB == null) {
                    gtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    gtVar = iInterfaceQueryLocalInterface2 instanceof jt ? (jt) iInterfaceQueryLocalInterface2 : new gt(iBinderB);
                }
                gt gtVar3 = (gt) gtVar;
                Parcel parcelT2 = gtVar3.T();
                ng.e(parcelT2, bVar2);
                Parcel parcelR02 = gtVar3.r0(parcelT2, 1);
                IBinder strongBinder2 = parcelR02.readStrongBinder();
                parcelR02.recycle();
                int i10 = et.f10855a;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof ft ? (ft) iInterfaceQueryLocalInterface3 : new dt(strongBinder2);
            } catch (Exception e11) {
                throw new za.j(e11);
            }
        } catch (RemoteException | NullPointerException | za.j e12) {
            vt vtVarA = ut.a(adActivity.getApplicationContext());
            oVar.getClass();
            vtVarA.d("ClientApiBroker.createAdOverlay", e12);
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.o(new vb.b(this.f36035b));
    }
}
