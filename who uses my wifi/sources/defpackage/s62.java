package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s62 extends hv1 implements u62 {
    public s62() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static u62 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof u62 ? (u62) iInterfaceQueryLocalInterface : new t62(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 2);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            iv1.f(parcel);
            w62 w62VarW = w(string);
            parcel2.writeNoException();
            iv1.e(parcel2, w62VarW);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            iv1.f(parcel);
            boolean zP = P(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zP ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            iv1.f(parcel);
            d82 d82VarG = G(string3);
            parcel2.writeNoException();
            iv1.e(parcel2, d82VarG);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String string4 = parcel.readString();
        iv1.f(parcel);
        boolean zJ = J(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zJ ? 1 : 0);
        return true;
    }

    @Override // defpackage.u62
    public final d82 G(String str) {
        return new h82((RtbAdapter) Class.forName(str, false, g82.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // defpackage.u62
    public final boolean J(String str) {
        try {
            return f3.class.isAssignableFrom(Class.forName(str, false, s62.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            gi2.i0(sb.toString());
            return false;
        }
    }

    @Override // defpackage.u62
    public final boolean P(String str) {
        try {
            return el.class.isAssignableFrom(Class.forName(str, false, s62.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            gi2.i0(sb.toString());
            return false;
        }
    }

    @Override // defpackage.u62
    public final w62 w(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, s62.class.getClassLoader());
                if (cd0.class.isAssignableFrom(cls)) {
                    return new m72((cd0) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (f3.class.isAssignableFrom(cls)) {
                    return new m72((f3) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                gi2.i0(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                gi2.U("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new m72(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new m72(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable unused2) {
            new StringBuilder(String.valueOf(str).length() + 43);
            gi2.q0(5);
            throw new RemoteException();
        }
    }
}
