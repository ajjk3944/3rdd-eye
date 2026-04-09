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
import com.google.android.gms.internal.ads.yq;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yq f36132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f36133d;

    public l(o oVar, Context context, yq yqVar) {
        this.f36131b = context;
        this.f36132c = yqVar;
        Objects.requireNonNull(oVar);
        this.f36133d = oVar;
    }

    @Override // va.q
    public final /* bridge */ /* synthetic */ Object a() {
        o.t(this.f36131b, "ads_preloader");
        return null;
    }

    @Override // va.q
    public final Object b() throws za.j {
        t0 t0Var;
        s0 r0Var;
        Context context = this.f36131b;
        vb.b bVar = new vb.b(context);
        sk.a(context);
        boolean zBooleanValue = ((Boolean) s.f36163e.f36166c.a(sk.Vb)).booleanValue();
        o oVar = this.f36133d;
        yq yqVar = this.f36132c;
        if (!zBooleanValue) {
            yn ynVar = (yn) oVar.g;
            try {
                vb.b bVar2 = new vb.b(context);
                t0 t0Var2 = (t0) ynVar.k(context);
                Parcel parcelT = t0Var2.T();
                ng.e(parcelT, bVar2);
                ng.e(parcelT, yqVar);
                parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR0 = t0Var2.r0(parcelT, 1);
                IBinder strongBinder = parcelR0.readStrongBinder();
                parcelR0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new r0(strongBinder);
            } catch (RemoteException e2) {
                e = e2;
                za.i.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                za.i.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (vb.c e11) {
                e = e11;
                za.i.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    t0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    t0Var = iInterfaceQueryLocalInterface2 instanceof t0 ? (t0) iInterfaceQueryLocalInterface2 : new t0(iBinderB);
                }
                Parcel parcelT2 = t0Var.T();
                ng.e(parcelT2, bVar);
                ng.e(parcelT2, yqVar);
                parcelT2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR02 = t0Var.r0(parcelT2, 1);
                IBinder strongBinder2 = parcelR02.readStrongBinder();
                parcelR02.recycle();
                if (strongBinder2 == null) {
                    r0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    r0Var = iInterfaceQueryLocalInterface3 instanceof s0 ? (s0) iInterfaceQueryLocalInterface3 : new r0(strongBinder2);
                }
                r0Var.C2(yqVar);
                return r0Var;
            } catch (Exception e12) {
                throw new za.j(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            vt vtVarA = ut.a(context);
            oVar.getClass();
            vtVarA.d("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            vt vtVarA2 = ut.a(context);
            oVar.getClass();
            vtVarA2.d("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (za.j e15) {
            e = e15;
            vt vtVarA22 = ut.a(context);
            oVar.getClass();
            vtVarA22.d("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.y0(new vb.b(this.f36131b), this.f36132c, ModuleDescriptor.MODULE_VERSION);
    }
}
