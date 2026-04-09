package u;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends Binder implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f34707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f34708b;

    public g(a aVar) {
        this.f34708b = aVar;
        attachInterface(this, b.a.D8);
        this.f34707a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.a.D8;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f34707a;
        a aVar = this.f34708b;
        switch (i4) {
            case 2:
                int i11 = parcel.readInt();
                Bundle bundle = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new oc.a(this, i11, bundle, 3));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i12 = parcel.readInt();
                Uri uri = (Uri) ci.b.b(parcel, Uri.CREATOR);
                boolean z3 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, i12, uri, z3, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = aVar == null ? null : aVar.extraCallbackWithResult(parcel.readString(), (Bundle) ci.b.b(parcel, Bundle.CREATOR));
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
                Bundle bundle6 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, i13, i14, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 2));
                    return true;
                }
                return true;
            case 10:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                Bundle bundle8 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new f(this, i15, i16, i17, i18, i19, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) ci.b.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
