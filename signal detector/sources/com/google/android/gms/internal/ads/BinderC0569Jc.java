package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import w2.AbstractC2969a;
import x2.InterfaceC2988a;

/* renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0569Jc extends B7 implements InterfaceC0603Lc {
    public BinderC0569Jc() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC0603Lc K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0603Lc ? (InterfaceC0603Lc) iInterfaceQueryLocalInterface : new C0586Kc(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final boolean F(String str) {
        try {
            return AbstractC2969a.class.isAssignableFrom(Class.forName(str, false, BinderC0569Jc.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            u2.k.h(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            C7.f(parcel);
            InterfaceC0637Nc interfaceC0637NcV = v(string);
            parcel2.writeNoException();
            C7.e(parcel2, interfaceC0637NcV);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            C7.f(parcel);
            boolean zO = O(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zO ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            C7.f(parcel);
            InterfaceC1860sd interfaceC1860sdX = x(string3);
            parcel2.writeNoException();
            C7.e(parcel2, interfaceC1860sdX);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String string4 = parcel.readString();
        C7.f(parcel);
        boolean zF = F(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zF ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final boolean O(String str) {
        try {
            return InterfaceC2988a.class.isAssignableFrom(Class.forName(str, false, BinderC0569Jc.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            u2.k.h(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final InterfaceC0637Nc v(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC0569Jc.class.getClassLoader());
                if (w2.g.class.isAssignableFrom(cls)) {
                    return new BinderC0997cd((w2.g) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (AbstractC2969a.class.isAssignableFrom(cls)) {
                    return new BinderC0997cd((AbstractC2969a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                u2.k.h(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                u2.k.i(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            u2.k.c("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC0997cd(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC0997cd(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final InterfaceC1860sd x(String str) {
        return new BinderC2076wd((RtbAdapter) Class.forName(str, false, AbstractC2022vd.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
