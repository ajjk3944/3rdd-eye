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
public final class qp1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ s62 c;
    public final /* synthetic */ bu1 d;

    public qp1(bu1 bu1Var, Context context, s62 s62Var) {
        this.b = context;
        this.c = s62Var;
        Objects.requireNonNull(bu1Var);
        this.d = bu1Var;
    }

    @Override // defpackage.zu1
    public final /* bridge */ /* synthetic */ Object a() {
        bu1.F(this.b, "ads_preloader");
        return null;
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        kh2 ng2Var;
        wh2 wh2Var;
        kh2 ng2Var2;
        Context context = this.b;
        oi0 oi0Var = new oi0(context);
        mz1.a(context);
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.wb)).booleanValue();
        bu1 bu1Var = this.d;
        s62 s62Var = this.c;
        if (!zBooleanValue) {
            g32 g32Var = (g32) bu1Var.l;
            try {
                oi0 oi0Var2 = new oi0(context);
                wh2 wh2Var2 = (wh2) g32Var.j(context);
                Parcel parcelU = wh2Var2.U();
                iv1.e(parcelU, oi0Var2);
                iv1.e(parcelU, s62Var);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = wh2Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    ng2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    ng2Var = iInterfaceQueryLocalInterface instanceof kh2 ? (kh2) iInterfaceQueryLocalInterface : new ng2(strongBinder);
                }
                ng2Var.f1(s62Var);
                return ng2Var;
            } catch (RemoteException | hp0 unused) {
                gi2.q0(5);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    wh2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    wh2Var = iInterfaceQueryLocalInterface2 instanceof wh2 ? (wh2) iInterfaceQueryLocalInterface2 : new wh2(iBinderB);
                }
                Parcel parcelU2 = wh2Var.U();
                iv1.e(parcelU2, oi0Var);
                iv1.e(parcelU2, s62Var);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = wh2Var.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                if (strongBinder2 == null) {
                    ng2Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    ng2Var2 = iInterfaceQueryLocalInterface3 instanceof kh2 ? (kh2) iInterfaceQueryLocalInterface3 : new ng2(strongBinder2);
                }
                ng2Var2.f1(s62Var);
                return ng2Var2;
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            s92 s92VarA = r92.a(context);
            bu1Var.getClass();
            s92VarA.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            s92 s92VarA2 = r92.a(context);
            bu1Var.getClass();
            s92VarA2.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (ze4 e4) {
            e = e4;
            s92 s92VarA22 = r92.a(context);
            bu1Var.getClass();
            s92VarA22.e("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        oi0 oi0Var = new oi0(this.b);
        s62 s62Var = this.c;
        kh2 kh2VarT0 = ek2Var.T0(oi0Var, s62Var, ModuleDescriptor.MODULE_VERSION);
        kh2VarT0.f1(s62Var);
        return kh2VarT0;
    }
}
