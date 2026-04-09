package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ej2 extends sb1 implements ek2 {
    @Override // defpackage.ek2
    public final ba2 E2(u10 u10Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        ba2 v82Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, xe4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 2);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            v82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v82Var = iInterfaceQueryLocalInterface instanceof ba2 ? (ba2) iInterfaceQueryLocalInterface : new v82(strongBinder);
        }
        parcelY.recycle();
        return v82Var;
    }

    @Override // defpackage.ek2
    public final zn2 I2(u10 u10Var, int i) {
        zn2 zm2Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 9);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            zm2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zm2Var = iInterfaceQueryLocalInterface instanceof zn2 ? (zn2) iInterfaceQueryLocalInterface : new zm2(strongBinder);
        }
        parcelY.recycle();
        return zm2Var;
    }

    @Override // defpackage.ek2
    public final c92 M(u10 u10Var) {
        c92 a92Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        Parcel parcelY = Y(parcelU, 8);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i = b92.f;
        if (strongBinder == null) {
            a92Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            a92Var = iInterfaceQueryLocalInterface instanceof c92 ? (c92) iInterfaceQueryLocalInterface : new a92(strongBinder);
        }
        parcelY.recycle();
        return a92Var;
    }

    @Override // defpackage.ek2
    public final kh2 T0(u10 u10Var, u62 u62Var, int i) {
        kh2 ng2Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 18);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            ng2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            ng2Var = iInterfaceQueryLocalInterface instanceof kh2 ? (kh2) iInterfaceQueryLocalInterface : new ng2(strongBinder);
        }
        parcelY.recycle();
        return ng2Var;
    }

    @Override // defpackage.ek2
    public final ba2 T1(u10 u10Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        ba2 v82Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, xe4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            v82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v82Var = iInterfaceQueryLocalInterface instanceof ba2 ? (ba2) iInterfaceQueryLocalInterface : new v82(strongBinder);
        }
        parcelY.recycle();
        return v82Var;
    }

    @Override // defpackage.ek2
    public final uv2 Y0(u10 u10Var, u62 u62Var, int i) {
        uv2 dv2Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 17);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            dv2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            dv2Var = iInterfaceQueryLocalInterface instanceof uv2 ? (uv2) iInterfaceQueryLocalInterface : new dv2(strongBinder);
        }
        parcelY.recycle();
        return dv2Var;
    }

    @Override // defpackage.ek2
    public final ba2 Y2(u10 u10Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        ba2 v82Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, xe4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 13);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            v82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v82Var = iInterfaceQueryLocalInterface instanceof ba2 ? (ba2) iInterfaceQueryLocalInterface : new v82(strongBinder);
        }
        parcelY.recycle();
        return v82Var;
    }

    @Override // defpackage.ek2
    public final ba2 b1(u10 u10Var, xe4 xe4Var, String str, int i) {
        ba2 v82Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, xe4Var);
        parcelU.writeString(str);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 10);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            v82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v82Var = iInterfaceQueryLocalInterface instanceof ba2 ? (ba2) iInterfaceQueryLocalInterface : new v82(strongBinder);
        }
        parcelY.recycle();
        return v82Var;
    }

    @Override // defpackage.ek2
    public final wc2 c2(u10 u10Var, u62 u62Var, int i) {
        wc2 uc2Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 14);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i2 = vc2.f;
        if (strongBinder == null) {
            uc2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            uc2Var = iInterfaceQueryLocalInterface instanceof wc2 ? (wc2) iInterfaceQueryLocalInterface : new uc2(strongBinder);
        }
        parcelY.recycle();
        return uc2Var;
    }

    @Override // defpackage.ek2
    public final x72 i1(u10 u10Var, String str, u62 u62Var, int i) {
        x72 o62Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        parcelU.writeString(str);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 3);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            o62Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            o62Var = iInterfaceQueryLocalInterface instanceof x72 ? (x72) iInterfaceQueryLocalInterface : new o62(strongBinder);
        }
        parcelY.recycle();
        return o62Var;
    }

    @Override // defpackage.ek2
    public final w82 r1(u10 u10Var, u62 u62Var, int i) {
        w82 s82Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 15);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i2 = pz2.m;
        if (strongBinder == null) {
            s82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            s82Var = iInterfaceQueryLocalInterface instanceof w82 ? (w82) iInterfaceQueryLocalInterface : new s82(strongBinder);
        }
        parcelY.recycle();
        return s82Var;
    }

    @Override // defpackage.ek2
    public final ya2 s2(u10 u10Var, String str, u62 u62Var, int i) {
        ya2 wa2Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        parcelU.writeString(str);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 12);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i2 = xa2.f;
        if (strongBinder == null) {
            wa2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            wa2Var = iInterfaceQueryLocalInterface instanceof ya2 ? (ya2) iInterfaceQueryLocalInterface : new wa2(strongBinder);
        }
        parcelY.recycle();
        return wa2Var;
    }

    @Override // defpackage.ek2
    public final f22 x1(u10 u10Var, u10 u10Var2) {
        f22 d22Var;
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u10Var2);
        Parcel parcelY = Y(parcelU, 5);
        IBinder strongBinder = parcelY.readStrongBinder();
        int i = e22.f;
        if (strongBinder == null) {
            d22Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            d22Var = iInterfaceQueryLocalInterface instanceof f22 ? (f22) iInterfaceQueryLocalInterface : new d22(strongBinder);
        }
        parcelY.recycle();
        return d22Var;
    }
}
