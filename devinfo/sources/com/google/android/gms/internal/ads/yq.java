package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yq extends mg implements ar {
    public yq() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static ar h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof ar ? (ar) iInterfaceQueryLocalInterface : new zq(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 1);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i4 == 1) {
            String string = parcel.readString();
            ng.f(parcel);
            cr crVarJ = j(string);
            parcel2.writeNoException();
            ng.e(parcel2, crVarJ);
            return true;
        }
        if (i4 == 2) {
            String string2 = parcel.readString();
            ng.f(parcel);
            boolean zX = x(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zX ? 1 : 0);
            return true;
        }
        if (i4 == 3) {
            String string3 = parcel.readString();
            ng.f(parcel);
            is isVarK = k(string3);
            parcel2.writeNoException();
            ng.e(parcel2, isVarK);
            return true;
        }
        if (i4 != 4) {
            return false;
        }
        String string4 = parcel.readString();
        ng.f(parcel);
        boolean zQ = q(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zQ ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final cr j(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, yq.class.getClassLoader());
                if (bb.g.class.isAssignableFrom(cls)) {
                    return new sr((bb.g) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (bb.a.class.isAssignableFrom(cls)) {
                    return new sr((bb.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                za.i.h(sb2.toString());
                throw new RemoteException();
            } catch (Throwable th2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Could not instantiate mediation adapter: ");
                sb3.append(str);
                sb3.append(". ");
                za.i.i(sb3.toString(), th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            za.i.c("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new sr(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new sr(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final is k(String str) {
        return new ms((RtbAdapter) Class.forName(str, false, ls.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final boolean q(String str) {
        try {
            return bb.a.class.isAssignableFrom(Class.forName(str, false, yq.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            za.i.h(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final boolean x(String str) {
        try {
            return cb.a.class.isAssignableFrom(Class.forName(str, false, yq.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            za.i.h(sb2.toString());
            return false;
        }
    }
}
