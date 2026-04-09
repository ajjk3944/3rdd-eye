package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C0499Fa;
import com.google.android.gms.internal.ads.C0886ab;
import com.google.android.gms.internal.ads.C0941bb;
import com.google.android.gms.internal.ads.C0942bc;
import com.google.android.gms.internal.ads.C0995cb;
import com.google.android.gms.internal.ads.C1104eb;
import com.google.android.gms.internal.ads.C1160fc;
import com.google.android.gms.internal.ads.C1321ib;
import com.google.android.gms.internal.ads.C1373jb;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC1050db;
import com.google.android.gms.internal.ads.InterfaceC1159fb;
import com.google.android.gms.internal.ads.InterfaceC1427kb;
import m2.C2654a;
import m2.C2658e;

/* loaded from: classes.dex */
public abstract class G extends B7 implements H {
    public G() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1159fb c1104eb;
        InterfaceC2853y c2849w = null;
        C1160fc c1160fc = null;
        InterfaceC1427kb c1373jb = null;
        C1321ib c1321ib = null;
        Z z6 = null;
        InterfaceC1050db c0995cb = null;
        C0941bb c0941bb = null;
        C0886ab c0886ab = null;
        switch (i) {
            case 1:
                E eB = b();
                parcel2.writeNoException();
                C7.e(parcel2, eB);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c2849w = iInterfaceQueryLocalInterface instanceof InterfaceC2853y ? (InterfaceC2853y) iInterfaceQueryLocalInterface : new C2849w(strongBinder);
                }
                C7.f(parcel);
                Y1(c2849w);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    c0886ab = iInterfaceQueryLocalInterface2 instanceof C0886ab ? (C0886ab) iInterfaceQueryLocalInterface2 : new C0886ab(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 2);
                }
                C7.f(parcel);
                W1(c0886ab);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    c0941bb = iInterfaceQueryLocalInterface3 instanceof C0941bb ? (C0941bb) iInterfaceQueryLocalInterface3 : new C0941bb(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 2);
                }
                C7.f(parcel);
                m3(c0941bb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c1104eb = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    c1104eb = iInterfaceQueryLocalInterface4 instanceof InterfaceC1159fb ? (InterfaceC1159fb) iInterfaceQueryLocalInterface4 : new C1104eb(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 2);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    c0995cb = iInterfaceQueryLocalInterface5 instanceof InterfaceC1050db ? (InterfaceC1050db) iInterfaceQueryLocalInterface5 : new C0995cb(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 2);
                }
                C7.f(parcel);
                v2(string, c1104eb, c0995cb);
                parcel2.writeNoException();
                return true;
            case 6:
                C0499Fa c0499Fa = (C0499Fa) C7.b(parcel, C0499Fa.CREATOR);
                C7.f(parcel);
                l2(c0499Fa);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    z6 = iInterfaceQueryLocalInterface6 instanceof Z ? (Z) iInterfaceQueryLocalInterface6 : new Z(strongBinder6);
                }
                C7.f(parcel);
                t2(z6);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c1321ib = iInterfaceQueryLocalInterface7 instanceof C1321ib ? (C1321ib) iInterfaceQueryLocalInterface7 : new C1321ib(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 2);
                }
                d1 d1Var = (d1) C7.b(parcel, d1.CREATOR);
                C7.f(parcel);
                z3(c1321ib, d1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                C2658e c2658e = (C2658e) C7.b(parcel, C2658e.CREATOR);
                C7.f(parcel);
                p1(c2658e);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    c1373jb = iInterfaceQueryLocalInterface8 instanceof InterfaceC1427kb ? (InterfaceC1427kb) iInterfaceQueryLocalInterface8 : new C1373jb(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 2);
                }
                C7.f(parcel);
                F0(c1373jb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C0942bc c0942bc = (C0942bc) C7.b(parcel, C0942bc.CREATOR);
                C7.f(parcel);
                n3(c0942bc);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c1160fc = iInterfaceQueryLocalInterface9 instanceof C1160fc ? (C1160fc) iInterfaceQueryLocalInterface9 : new C1160fc(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 2);
                }
                C7.f(parcel);
                J0(c1160fc);
                parcel2.writeNoException();
                return true;
            case 15:
                C2654a c2654a = (C2654a) C7.b(parcel, C2654a.CREATOR);
                C7.f(parcel);
                z1(c2654a);
                parcel2.writeNoException();
                return true;
        }
    }
}
