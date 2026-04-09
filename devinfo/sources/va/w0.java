package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.lw;
import com.google.android.gms.internal.ads.mw;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.ys;
import com.google.android.gms.internal.ads.zm;
import com.google.android.gms.internal.ads.zs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 extends ac.a implements x0 {
    @Override // va.x0
    public final l0 A0(vb.a aVar, c3 c3Var, String str, ar arVar, int i4) {
        l0 j0Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, c3Var);
        parcelT.writeString(str);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 13);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelR0.recycle();
        return j0Var;
    }

    @Override // va.x0
    public final l0 H2(vb.a aVar, c3 c3Var, String str, ar arVar, int i4) {
        l0 j0Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, c3Var);
        parcelT.writeString(str);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 1);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelR0.recycle();
        return j0Var;
    }

    @Override // va.x0
    public final nw N3(vb.a aVar, ar arVar, int i4) {
        nw lwVar;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 14);
        IBinder strongBinder = parcelR0.readStrongBinder();
        int i10 = mw.f14034a;
        if (strongBinder == null) {
            lwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            lwVar = iInterfaceQueryLocalInterface instanceof nw ? (nw) iInterfaceQueryLocalInterface : new lw(strongBinder);
        }
        parcelR0.recycle();
        return lwVar;
    }

    @Override // va.x0
    public final l0 V3(vb.a aVar, c3 c3Var, String str, ar arVar, int i4) {
        l0 j0Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, c3Var);
        parcelT.writeString(str);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 2);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelR0.recycle();
        return j0Var;
    }

    @Override // va.x0
    public final h0 f1(vb.a aVar, String str, ar arVar, int i4) {
        h0 f0Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        parcelT.writeString(str);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 3);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            f0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(strongBinder);
        }
        parcelR0.recycle();
        return f0Var;
    }

    @Override // va.x0
    public final t1 g0(vb.a aVar, ar arVar, int i4) {
        t1 s1Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 17);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            s1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            s1Var = iInterfaceQueryLocalInterface instanceof t1 ? (t1) iInterfaceQueryLocalInterface : new s1(strongBinder);
        }
        parcelR0.recycle();
        return s1Var;
    }

    @Override // va.x0
    public final cv h2(vb.a aVar, String str, ar arVar, int i4) {
        cv avVar;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        parcelT.writeString(str);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 12);
        IBinder strongBinder = parcelR0.readStrongBinder();
        int i10 = bv.f9811a;
        if (strongBinder == null) {
            avVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            avVar = iInterfaceQueryLocalInterface instanceof cv ? (cv) iInterfaceQueryLocalInterface : new av(strongBinder);
        }
        parcelR0.recycle();
        return avVar;
    }

    @Override // va.x0
    public final h1 n0(vb.a aVar, int i4) {
        h1 e1Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 9);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            e1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            e1Var = iInterfaceQueryLocalInterface instanceof h1 ? (h1) iInterfaceQueryLocalInterface : new e1(strongBinder);
        }
        parcelR0.recycle();
        return e1Var;
    }

    @Override // va.x0
    public final ft o(vb.a aVar) {
        ft dtVar;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        Parcel parcelR0 = r0(parcelT, 8);
        IBinder strongBinder = parcelR0.readStrongBinder();
        int i4 = et.f10855a;
        if (strongBinder == null) {
            dtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            dtVar = iInterfaceQueryLocalInterface instanceof ft ? (ft) iInterfaceQueryLocalInterface : new dt(strongBinder);
        }
        parcelR0.recycle();
        return dtVar;
    }

    @Override // va.x0
    public final bn s3(vb.a aVar, vb.a aVar2) {
        bn zmVar;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, aVar2);
        Parcel parcelR0 = r0(parcelT, 5);
        IBinder strongBinder = parcelR0.readStrongBinder();
        int i4 = an.f9366a;
        if (strongBinder == null) {
            zmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            zmVar = iInterfaceQueryLocalInterface instanceof bn ? (bn) iInterfaceQueryLocalInterface : new zm(strongBinder);
        }
        parcelR0.recycle();
        return zmVar;
    }

    @Override // va.x0
    public final zs w3(vb.a aVar, ar arVar, int i4) {
        zs ysVar;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 15);
        IBinder strongBinder = parcelR0.readStrongBinder();
        int i10 = qh0.f15341h;
        if (strongBinder == null) {
            ysVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            ysVar = iInterfaceQueryLocalInterface instanceof zs ? (zs) iInterfaceQueryLocalInterface : new ys(strongBinder);
        }
        parcelR0.recycle();
        return ysVar;
    }

    @Override // va.x0
    public final l0 x2(vb.a aVar, c3 c3Var, String str, int i4) {
        l0 j0Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, c3Var);
        parcelT.writeString(str);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 10);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelR0.recycle();
        return j0Var;
    }

    @Override // va.x0
    public final s0 y0(vb.a aVar, ar arVar, int i4) {
        s0 r0Var;
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 18);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            r0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            r0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new r0(strongBinder);
        }
        parcelR0.recycle();
        return r0Var;
    }
}
