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
public final class k extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq f36128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f36129e;

    public k(o oVar, Context context, String str, yq yqVar) {
        this.f36126b = context;
        this.f36127c = str;
        this.f36128d = yqVar;
        Objects.requireNonNull(oVar);
        this.f36129e = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36126b, "native_ad");
        return new n2();
    }

    @Override // va.q
    public final Object b() throws za.j {
        i0 i0Var;
        Context context = this.f36126b;
        sk.a(context);
        boolean zBooleanValue = ((Boolean) s.f36163e.f36166c.a(sk.Vb)).booleanValue();
        o oVar = this.f36129e;
        yq yqVar = this.f36128d;
        String str = this.f36127c;
        if (!zBooleanValue) {
            yn ynVar = (yn) oVar.f36147c;
            try {
                vb.b bVar = new vb.b(context);
                i0 i0Var2 = (i0) ynVar.k(context);
                Parcel parcelT = i0Var2.T();
                ng.e(parcelT, bVar);
                parcelT.writeString(str);
                ng.e(parcelT, yqVar);
                parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR0 = i0Var2.r0(parcelT, 1);
                IBinder strongBinder = parcelR0.readStrongBinder();
                parcelR0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(strongBinder);
            } catch (RemoteException e2) {
                e = e2;
                za.i.i("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (vb.c e10) {
                e = e10;
                za.i.i("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            vb.b bVar2 = new vb.b(context);
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    i0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    i0Var = iInterfaceQueryLocalInterface2 instanceof i0 ? (i0) iInterfaceQueryLocalInterface2 : new i0(iBinderB);
                }
                Parcel parcelT2 = i0Var.T();
                ng.e(parcelT2, bVar2);
                parcelT2.writeString(str);
                ng.e(parcelT2, yqVar);
                parcelT2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelR02 = i0Var.r0(parcelT2, 1);
                IBinder strongBinder2 = parcelR02.readStrongBinder();
                parcelR02.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof h0 ? (h0) iInterfaceQueryLocalInterface3 : new f0(strongBinder2);
            } catch (Exception e11) {
                throw new za.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            vt vtVarA = ut.a(context);
            oVar.getClass();
            vtVarA.d("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            vt vtVarA2 = ut.a(context);
            oVar.getClass();
            vtVarA2.d("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (za.j e14) {
            e = e14;
            vt vtVarA22 = ut.a(context);
            oVar.getClass();
            vtVarA22.d("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.f1(new vb.b(this.f36126b), this.f36127c, this.f36128d, ModuleDescriptor.MODULE_VERSION);
    }
}
