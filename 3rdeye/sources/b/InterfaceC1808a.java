package b;

import A9.J0;
import B9.d;
import I5.h;
import O4.C;
import a2.RunnableC1646c;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import g2.RunnableC4378b;
import s.BinderC5541e;
import s.C5537a;
import s.RunnableC5538b;
import s.RunnableC5539c;
import s.RunnableC5540d;

/* compiled from: ICustomTabsCallback.java */
/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1808a extends IInterface {

    /* renamed from: j8, reason: collision with root package name */
    public static final String f17050j8 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: b.a$b */
    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0273a extends Binder implements InterfaceC1808a {
        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            String str = InterfaceC1808a.f17050j8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    int i11 = parcel.readInt();
                    Bundle bundle = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e = (BinderC5541e) this;
                    if (binderC5541e.f45882c != null) {
                        binderC5541e.f45881b.post(new RunnableC1646c(binderC5541e, i11, bundle, 1));
                        return true;
                    }
                    return true;
                case 3:
                    String string = parcel.readString();
                    Bundle bundle2 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e2 = (BinderC5541e) this;
                    if (binderC5541e2.f45882c != null) {
                        binderC5541e2.f45881b.post(new h(binderC5541e2, string, bundle2));
                        return true;
                    }
                    return true;
                case 4:
                    Bundle bundle3 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e3 = (BinderC5541e) this;
                    if (binderC5541e3.f45882c != null) {
                        binderC5541e3.f45881b.post(new J0(binderC5541e3, bundle3));
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    String string2 = parcel.readString();
                    Bundle bundle4 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e4 = (BinderC5541e) this;
                    if (binderC5541e4.f45882c != null) {
                        binderC5541e4.f45881b.post(new RunnableC4378b(binderC5541e4, string2, bundle4));
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int i12 = parcel.readInt();
                    Uri uri = (Uri) b.a(parcel, Uri.CREATOR);
                    boolean z10 = parcel.readInt() != 0;
                    Bundle bundle5 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e5 = (BinderC5541e) this;
                    if (binderC5541e5.f45882c != null) {
                        binderC5541e5.f45881b.post(new RunnableC5538b(binderC5541e5, i12, uri, z10, bundle5));
                        return true;
                    }
                    return true;
                case 7:
                    String string3 = parcel.readString();
                    Bundle bundle6 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    C5537a c5537a = ((BinderC5541e) this).f45882c;
                    Bundle bundleExtraCallbackWithResult = c5537a == null ? null : c5537a.extraCallbackWithResult(string3, bundle6);
                    parcel2.writeNoException();
                    if (bundleExtraCallbackWithResult == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                    int i13 = parcel.readInt();
                    int i14 = parcel.readInt();
                    Bundle bundle7 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e6 = (BinderC5541e) this;
                    if (binderC5541e6.f45882c != null) {
                        binderC5541e6.f45881b.post(new RunnableC5539c(binderC5541e6, i13, i14, bundle7));
                        return true;
                    }
                    return true;
                case 9:
                    Bundle bundle8 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e7 = (BinderC5541e) this;
                    if (binderC5541e7.f45882c != null) {
                        binderC5541e7.f45881b.post(new C(1, binderC5541e7, bundle8));
                        return true;
                    }
                    return true;
                case 10:
                    int i15 = parcel.readInt();
                    int i16 = parcel.readInt();
                    int i17 = parcel.readInt();
                    int i18 = parcel.readInt();
                    int i19 = parcel.readInt();
                    Bundle bundle9 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e8 = (BinderC5541e) this;
                    if (binderC5541e8.f45882c != null) {
                        binderC5541e8.f45881b.post(new RunnableC5540d(binderC5541e8, i15, i16, i17, i18, i19, bundle9));
                        return true;
                    }
                    return true;
                case 11:
                    Bundle bundle10 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e9 = (BinderC5541e) this;
                    if (binderC5541e9.f45882c != null) {
                        binderC5541e9.f45881b.post(new U1.a(2, binderC5541e9, bundle10));
                        return true;
                    }
                    return true;
                case 12:
                    Bundle bundle11 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    BinderC5541e binderC5541e10 = (BinderC5541e) this;
                    if (binderC5541e10.f45882c != null) {
                        binderC5541e10.f45881b.post(new d(3, binderC5541e10, bundle11));
                        return true;
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i10);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
