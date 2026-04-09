package K3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends G3.a implements IInterface {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.oss.licenses.IOSSLicenseService");
    }

    public final String f(String str) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        Parcel parcelC = c(4, parcelB);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    public final String n0(String str) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        Parcel parcelC = c(3, parcelB);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    public final String o0(String str) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        Parcel parcelC = c(2, parcelB);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    public final List p0(List list) {
        Parcel parcelB = b();
        parcelB.writeList(list);
        Parcel parcelC = c(5, parcelB);
        ArrayList arrayListA = G3.b.a(parcelC);
        parcelC.recycle();
        return arrayListA;
    }
}
