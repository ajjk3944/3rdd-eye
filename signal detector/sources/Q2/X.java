package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC0588Ke;
import com.google.android.gms.internal.ads.AbstractBinderC0655Od;
import com.google.android.gms.internal.ads.AbstractBinderC0686Qa;
import com.google.android.gms.internal.ads.AbstractBinderC2078wf;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.C0553Id;
import com.google.android.gms.internal.ads.C0571Je;
import com.google.android.gms.internal.ads.C0638Nd;
import com.google.android.gms.internal.ads.C0669Pa;
import com.google.android.gms.internal.ads.C2024vf;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0570Jd;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import com.google.android.gms.internal.ads.InterfaceC0605Le;
import com.google.android.gms.internal.ads.InterfaceC0672Pd;
import com.google.android.gms.internal.ads.InterfaceC0703Ra;
import com.google.android.gms.internal.ads.InterfaceC2132xf;

/* loaded from: classes.dex */
public final class X extends W2.a implements Y {
    @Override // q2.Y
    public final InterfaceC0672Pd D(S2.a aVar) {
        InterfaceC0672Pd c0638Nd;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        Parcel parcelK0 = k0(parcelH0, 8);
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i = AbstractBinderC0655Od.f10211a;
        if (strongBinder == null) {
            c0638Nd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c0638Nd = iInterfaceQueryLocalInterface instanceof InterfaceC0672Pd ? (InterfaceC0672Pd) iInterfaceQueryLocalInterface : new C0638Nd(strongBinder);
        }
        parcelK0.recycle();
        return c0638Nd;
    }

    @Override // q2.Y
    public final T E0(S2.a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        T s5;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 18);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            s5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            s5 = iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new S(strongBinder);
        }
        parcelK0.recycle();
        return s5;
    }

    @Override // q2.Y
    public final L H0(S2.a aVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        L j6;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, d1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 2);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            j6 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j6 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelK0.recycle();
        return j6;
    }

    @Override // q2.Y
    public final InterfaceC2846u0 P0(S2.a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        InterfaceC2846u0 c2844t0;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 17);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2844t0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c2844t0 = iInterfaceQueryLocalInterface instanceof InterfaceC2846u0 ? (InterfaceC2846u0) iInterfaceQueryLocalInterface : new C2844t0(strongBinder);
        }
        parcelK0.recycle();
        return c2844t0;
    }

    @Override // q2.Y
    public final InterfaceC2823i0 Q1(S2.a aVar, int i) {
        InterfaceC2823i0 c2817f0;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 9);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2817f0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c2817f0 = iInterfaceQueryLocalInterface instanceof InterfaceC2823i0 ? (InterfaceC2823i0) iInterfaceQueryLocalInterface : new C2817f0(strongBinder);
        }
        parcelK0.recycle();
        return c2817f0;
    }

    @Override // q2.Y
    public final H T0(S2.a aVar, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        H f2;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 3);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            f2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            f2 = iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
        }
        parcelK0.recycle();
        return f2;
    }

    @Override // q2.Y
    public final L U1(S2.a aVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        L j6;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, d1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 13);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            j6 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j6 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelK0.recycle();
        return j6;
    }

    @Override // q2.Y
    public final L Y0(S2.a aVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        L j6;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, d1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 1);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            j6 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j6 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelK0.recycle();
        return j6;
    }

    @Override // q2.Y
    public final InterfaceC2132xf Z2(S2.a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        InterfaceC2132xf c2024vf;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 14);
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i3 = AbstractBinderC2078wf.f17457a;
        if (strongBinder == null) {
            c2024vf = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2024vf = iInterfaceQueryLocalInterface instanceof InterfaceC2132xf ? (InterfaceC2132xf) iInterfaceQueryLocalInterface : new C2024vf(strongBinder);
        }
        parcelK0.recycle();
        return c2024vf;
    }

    @Override // q2.Y
    public final InterfaceC0605Le j3(S2.a aVar, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        InterfaceC0605Le c0571Je;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 12);
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i3 = AbstractBinderC0588Ke.f9489a;
        if (strongBinder == null) {
            c0571Je = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c0571Je = iInterfaceQueryLocalInterface instanceof InterfaceC0605Le ? (InterfaceC0605Le) iInterfaceQueryLocalInterface : new C0571Je(strongBinder);
        }
        parcelK0.recycle();
        return c0571Je;
    }

    @Override // q2.Y
    public final InterfaceC0570Jd o3(S2.a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        InterfaceC0570Jd c0553Id;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 15);
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i3 = BinderC0718Rp.f11046h;
        if (strongBinder == null) {
            c0553Id = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c0553Id = iInterfaceQueryLocalInterface instanceof InterfaceC0570Jd ? (InterfaceC0570Jd) iInterfaceQueryLocalInterface : new C0553Id(strongBinder);
        }
        parcelK0.recycle();
        return c0553Id;
    }

    @Override // q2.Y
    public final InterfaceC0703Ra q1(S2.a aVar, S2.a aVar2) {
        InterfaceC0703Ra c0669Pa;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, aVar2);
        Parcel parcelK0 = k0(parcelH0, 5);
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i = AbstractBinderC0686Qa.f10621a;
        if (strongBinder == null) {
            c0669Pa = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            c0669Pa = iInterfaceQueryLocalInterface instanceof InterfaceC0703Ra ? (InterfaceC0703Ra) iInterfaceQueryLocalInterface : new C0669Pa(strongBinder);
        }
        parcelK0.recycle();
        return c0669Pa;
    }

    @Override // q2.Y
    public final L y2(S2.a aVar, d1 d1Var, String str, int i) {
        L j6;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, d1Var);
        parcelH0.writeString(str);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 10);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            j6 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j6 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelK0.recycle();
        return j6;
    }
}
