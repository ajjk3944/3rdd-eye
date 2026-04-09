package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class js1 extends zu1 {
    public final /* synthetic */ NativeAdView b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ bu1 e;

    public js1(bu1 bu1Var, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.b = nativeAdView;
        this.c = frameLayout;
        this.d = context;
        Objects.requireNonNull(bu1Var);
        this.e = bu1Var;
    }

    @Override // defpackage.zu1
    public final Object a() {
        bu1.F(this.d, "native_ad_view_delegate");
        return new cb3();
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        IInterface g22Var;
        Context context = this.d;
        mz1.a(context);
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.wb)).booleanValue();
        bu1 bu1Var = this.e;
        FrameLayout frameLayout = this.c;
        NativeAdView nativeAdView = this.b;
        if (!zBooleanValue) {
            g32 g32Var = (g32) bu1Var.j;
            try {
                oi0 oi0Var = new oi0(context);
                oi0 oi0Var2 = new oi0(nativeAdView);
                oi0 oi0Var3 = new oi0(frameLayout);
                g22 g22Var2 = (g22) ((i22) g32Var.j(context));
                Parcel parcelU = g22Var2.U();
                iv1.e(parcelU, oi0Var);
                iv1.e(parcelU, oi0Var2);
                iv1.e(parcelU, oi0Var3);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = g22Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof f22 ? (f22) iInterfaceQueryLocalInterface : new d22(strongBinder);
            } catch (RemoteException | hp0 unused) {
                gi2.q0(5);
                return null;
            }
        }
        try {
            oi0 oi0Var4 = new oi0(context);
            oi0 oi0Var5 = new oi0(nativeAdView);
            oi0 oi0Var6 = new oi0(frameLayout);
            try {
                IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = h22.f;
                if (iBinderB == null) {
                    g22Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    g22Var = iInterfaceQueryLocalInterface2 instanceof i22 ? (i22) iInterfaceQueryLocalInterface2 : new g22(iBinderB);
                }
                g22 g22Var3 = (g22) g22Var;
                Parcel parcelU2 = g22Var3.U();
                iv1.e(parcelU2, oi0Var4);
                iv1.e(parcelU2, oi0Var5);
                iv1.e(parcelU2, oi0Var6);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = g22Var3.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                int i2 = e22.f;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof f22 ? (f22) iInterfaceQueryLocalInterface3 : new d22(strongBinder2);
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException | NullPointerException | ze4 e2) {
            s92 s92VarA = r92.a(context);
            bu1Var.getClass();
            s92VarA.e("ClientApiBroker.createNativeAdViewDelegate", e2);
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.x1(new oi0(this.b), new oi0(this.c));
    }
}
