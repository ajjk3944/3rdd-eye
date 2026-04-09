package r;

import a4.u;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0329a;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2862e extends Binder implements InterfaceC0329a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f23312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2858a f23313b;

    public BinderC2862e(AbstractC2858a abstractC2858a) {
        this.f23313b = abstractC2858a;
        attachInterface(this, InterfaceC0329a.f5705x);
        this.f23312a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0329a.f5705x;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f23312a;
        AbstractC2858a abstractC2858a = this.f23313b;
        switch (i) {
            case 2:
                int i6 = parcel.readInt();
                Bundle bundle = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new Y0.g(this, i6, bundle, 4));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2860c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new f1.i(this, bundle3, 7, false));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2860c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i7 = parcel.readInt();
                Uri uri = (Uri) com.bumptech.glide.d.d(parcel, Uri.CREATOR);
                boolean z6 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2861d(this, i7, uri, z6, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleB = abstractC2858a == null ? null : abstractC2858a.b(parcel.readString(), (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleB == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleB.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                Bundle bundle6 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new u(this, i8, i9, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2859b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Bundle bundle8 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2859b(this, i10, i11, i12, i13, i14, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2859b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) com.bumptech.glide.d.d(parcel, Bundle.CREATOR);
                if (abstractC2858a != null) {
                    handler.post(new RunnableC2859b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i3);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
