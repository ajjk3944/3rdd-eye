package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class no1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s62 d;
    public final /* synthetic */ bu1 e;

    public no1(bu1 bu1Var, Context context, String str, s62 s62Var) {
        this.b = context;
        this.c = str;
        this.d = s62Var;
        Objects.requireNonNull(bu1Var);
        this.e = bu1Var;
    }

    @Override // defpackage.zu1
    public final Object a() {
        bu1.F(this.b, "native_ad");
        return new y83();
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        k82 k82Var;
        Context context = this.b;
        mz1.a(context);
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.wb)).booleanValue();
        bu1 bu1Var = this.e;
        s62 s62Var = this.d;
        String str = this.c;
        if (!zBooleanValue) {
            g32 g32Var = (g32) bu1Var.h;
            try {
                oi0 oi0Var = new oi0(context);
                k82 k82Var2 = (k82) g32Var.j(context);
                Parcel parcelU = k82Var2.U();
                iv1.e(parcelU, oi0Var);
                parcelU.writeString(str);
                iv1.e(parcelU, s62Var);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = k82Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof x72 ? (x72) iInterfaceQueryLocalInterface : new o62(strongBinder);
            } catch (RemoteException | hp0 unused) {
                gi2.q0(5);
                return null;
            }
        }
        try {
            oi0 oi0Var2 = new oi0(context);
            try {
                IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    k82Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    k82Var = iInterfaceQueryLocalInterface2 instanceof k82 ? (k82) iInterfaceQueryLocalInterface2 : new k82(iBinderB);
                }
                Parcel parcelU2 = k82Var.U();
                iv1.e(parcelU2, oi0Var2);
                parcelU2.writeString(str);
                iv1.e(parcelU2, s62Var);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = k82Var.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof x72 ? (x72) iInterfaceQueryLocalInterface3 : new o62(strongBinder2);
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            s92 s92VarA = r92.a(context);
            bu1Var.getClass();
            s92VarA.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            s92 s92VarA2 = r92.a(context);
            bu1Var.getClass();
            s92VarA2.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (ze4 e4) {
            e = e4;
            s92 s92VarA22 = r92.a(context);
            bu1Var.getClass();
            s92VarA22.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.i1(new oi0(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
