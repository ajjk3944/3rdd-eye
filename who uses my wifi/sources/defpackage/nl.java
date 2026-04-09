package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nl extends Binder implements m10 {
    public final Handler f;
    public final /* synthetic */ il g;

    public nl(il ilVar) {
        this.g = ilVar;
        attachInterface(this, m10.a);
        this.f = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = m10.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f;
        il ilVar = this.g;
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new k7((Object) this, i3, (Parcelable) bundle, 2));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new kl(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new jq3(this, bundle3, 8, false));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new kl(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i4 = parcel.readInt();
                Uri uri = (Uri) ou1.b(parcel, Uri.CREATOR);
                boolean z = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new ll(this, i4, uri, z, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleB = ilVar == null ? null : ilVar.b((Bundle) ou1.b(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                if (bundleB == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleB.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Bundle bundle6 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new ml(this, i5, i6, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new jl(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                Bundle bundle8 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new jl(this, i7, i8, i9, i10, i11, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new jl(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) ou1.b(parcel, Bundle.CREATOR);
                if (ilVar != null) {
                    handler.post(new jl(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
