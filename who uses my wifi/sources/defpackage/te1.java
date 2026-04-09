package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class te1 extends zu1 {
    public final /* synthetic */ AdActivity b;
    public final /* synthetic */ bu1 c;

    public te1(bu1 bu1Var, AdActivity adActivity) {
        this.b = adActivity;
        Objects.requireNonNull(bu1Var);
        this.c = bu1Var;
    }

    @Override // defpackage.zu1
    public final /* bridge */ /* synthetic */ Object a() {
        bu1.F(this.b, "ad_overlay");
        return null;
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        IInterface d92Var;
        AdActivity adActivity = this.b;
        mz1.a(adActivity);
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.wb)).booleanValue();
        bu1 bu1Var = this.c;
        if (!zBooleanValue) {
            g32 g32Var = (g32) bu1Var.k;
            try {
                oi0 oi0Var = new oi0(adActivity);
                d92 d92Var2 = (d92) ((f92) g32Var.j(adActivity));
                Parcel parcelU = d92Var2.U();
                iv1.e(parcelU, oi0Var);
                Parcel parcelY = d92Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof c92 ? (c92) iInterfaceQueryLocalInterface : new a92(strongBinder);
            } catch (RemoteException unused) {
                gi2.q0(5);
                return null;
            } catch (hp0 unused2) {
                gi2.q0(5);
                return null;
            }
        }
        try {
            oi0 oi0Var2 = new oi0(adActivity);
            try {
                IBinder iBinderB = pu1.z(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = e92.f;
                if (iBinderB == null) {
                    d92Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    d92Var = iInterfaceQueryLocalInterface2 instanceof f92 ? (f92) iInterfaceQueryLocalInterface2 : new d92(iBinderB);
                }
                d92 d92Var3 = (d92) d92Var;
                Parcel parcelU2 = d92Var3.U();
                iv1.e(parcelU2, oi0Var2);
                Parcel parcelY2 = d92Var3.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                int i2 = b92.f;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof c92 ? (c92) iInterfaceQueryLocalInterface3 : new a92(strongBinder2);
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException | NullPointerException | ze4 e2) {
            s92 s92VarA = r92.a(adActivity.getApplicationContext());
            bu1Var.getClass();
            s92VarA.e("ClientApiBroker.createAdOverlay", e2);
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.M(new oi0(this.b));
    }
}
