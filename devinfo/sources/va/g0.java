package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.mn;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.nn;
import com.google.android.gms.internal.ads.on;
import com.google.android.gms.internal.ads.op;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.qm;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.tn;
import com.google.android.gms.internal.ads.un;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g0 extends mg implements h0 {
    public g0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        pn onVar;
        y wVar = null;
        sp spVar = null;
        un tnVar = null;
        sn snVar = null;
        y0 y0Var = null;
        nn mnVar = null;
        ln lnVar = null;
        kn knVar = null;
        switch (i4) {
            case 1:
                e0 e0VarC = c();
                parcel2.writeNoException();
                ng.e(parcel2, e0VarC);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    wVar = iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new w(strongBinder);
                }
                ng.f(parcel);
                s2(wVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    knVar = iInterfaceQueryLocalInterface2 instanceof kn ? (kn) iInterfaceQueryLocalInterface2 : new kn(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 1);
                }
                ng.f(parcel);
                q2(knVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    lnVar = iInterfaceQueryLocalInterface3 instanceof ln ? (ln) iInterfaceQueryLocalInterface3 : new ln(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 1);
                }
                ng.f(parcel);
                K3(lnVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    onVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    onVar = iInterfaceQueryLocalInterface4 instanceof pn ? (pn) iInterfaceQueryLocalInterface4 : new on(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 1);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    mnVar = iInterfaceQueryLocalInterface5 instanceof nn ? (nn) iInterfaceQueryLocalInterface5 : new mn(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 1);
                }
                ng.f(parcel);
                R2(string, onVar, mnVar);
                parcel2.writeNoException();
                return true;
            case 6:
                qm qmVar = (qm) ng.b(parcel, qm.CREATOR);
                ng.f(parcel);
                G2(qmVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y0Var = iInterfaceQueryLocalInterface6 instanceof y0 ? (y0) iInterfaceQueryLocalInterface6 : new y0(strongBinder6);
                }
                ng.f(parcel);
                z0(y0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    snVar = iInterfaceQueryLocalInterface7 instanceof sn ? (sn) iInterfaceQueryLocalInterface7 : new sn(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 1);
                }
                c3 c3Var = (c3) ng.b(parcel, c3.CREATOR);
                ng.f(parcel);
                Q3(snVar, c3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                sa.e eVar = (sa.e) ng.b(parcel, sa.e.CREATOR);
                ng.f(parcel);
                w2(eVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    tnVar = iInterfaceQueryLocalInterface8 instanceof un ? (un) iInterfaceQueryLocalInterface8 : new tn(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 1);
                }
                ng.f(parcel);
                o0(tnVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                op opVar = (op) ng.b(parcel, op.CREATOR);
                ng.f(parcel);
                M3(opVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    spVar = iInterfaceQueryLocalInterface9 instanceof sp ? (sp) iInterfaceQueryLocalInterface9 : new sp(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 1);
                }
                ng.f(parcel);
                s0(spVar);
                parcel2.writeNoException();
                return true;
            case 15:
                sa.a aVar = (sa.a) ng.b(parcel, sa.a.CREATOR);
                ng.f(parcel);
                p0(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
