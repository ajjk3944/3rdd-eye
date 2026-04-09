package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class h72 extends hv1 implements x72 {
    public h72() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        v22 u22Var;
        d32 v12Var = null;
        j52 j52Var = null;
        z22 y22Var = null;
        x22 x22Var = null;
        pk2 pk2Var = null;
        t22 s22Var = null;
        r22 r22Var = null;
        q22 q22Var = null;
        switch (i) {
            case 1:
                a62 a62VarB = b();
                parcel2.writeNoException();
                iv1.e(parcel2, a62VarB);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    v12Var = iInterfaceQueryLocalInterface instanceof d32 ? (d32) iInterfaceQueryLocalInterface : new v12(strongBinder);
                }
                iv1.f(parcel);
                v0(v12Var);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    q22Var = iInterfaceQueryLocalInterface2 instanceof q22 ? (q22) iInterfaceQueryLocalInterface2 : new q22(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 2);
                }
                iv1.f(parcel);
                m3(q22Var);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    r22Var = iInterfaceQueryLocalInterface3 instanceof r22 ? (r22) iInterfaceQueryLocalInterface3 : new r22(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 2);
                }
                iv1.f(parcel);
                v3(r22Var);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    u22Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    u22Var = iInterfaceQueryLocalInterface4 instanceof v22 ? (v22) iInterfaceQueryLocalInterface4 : new u22(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 2);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    s22Var = iInterfaceQueryLocalInterface5 instanceof t22 ? (t22) iInterfaceQueryLocalInterface5 : new s22(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 2);
                }
                iv1.f(parcel);
                m1(string, u22Var, s22Var);
                parcel2.writeNoException();
                return true;
            case 6:
                r12 r12Var = (r12) iv1.b(parcel, r12.CREATOR);
                iv1.f(parcel);
                w1(r12Var);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    pk2Var = iInterfaceQueryLocalInterface6 instanceof pk2 ? (pk2) iInterfaceQueryLocalInterface6 : new pk2(strongBinder6);
                }
                iv1.f(parcel);
                N2(pk2Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    x22Var = iInterfaceQueryLocalInterface7 instanceof x22 ? (x22) iInterfaceQueryLocalInterface7 : new x22(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 2);
                }
                xe4 xe4Var = (xe4) iv1.b(parcel, xe4.CREATOR);
                iv1.f(parcel);
                Y1(x22Var, xe4Var);
                parcel2.writeNoException();
                return true;
            case 9:
                vm0 vm0Var = (vm0) iv1.b(parcel, vm0.CREATOR);
                iv1.f(parcel);
                C0(vm0Var);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    y22Var = iInterfaceQueryLocalInterface8 instanceof z22 ? (z22) iInterfaceQueryLocalInterface8 : new y22(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 2);
                }
                iv1.f(parcel);
                q1(y22Var);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                f52 f52Var = (f52) iv1.b(parcel, f52.CREATOR);
                iv1.f(parcel);
                x3(f52Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    j52Var = iInterfaceQueryLocalInterface9 instanceof j52 ? (j52) iInterfaceQueryLocalInterface9 : new j52(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 2);
                }
                iv1.f(parcel);
                u0(j52Var);
                parcel2.writeNoException();
                return true;
            case 15:
                z2 z2Var = (z2) iv1.b(parcel, z2.CREATOR);
                iv1.f(parcel);
                F0(z2Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
