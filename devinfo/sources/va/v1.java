package va;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v1 extends ac.a implements x1 {
    public v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 1);
    }

    @Override // va.x1
    public final String A1() {
        Parcel parcelR0 = r0(T(), 6);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // va.x1
    public final Bundle C1() {
        Parcel parcelR0 = r0(T(), 5);
        Bundle bundle = (Bundle) ng.b(parcelR0, Bundle.CREATOR);
        parcelR0.recycle();
        return bundle;
    }

    @Override // va.x1
    public final String c() {
        Parcel parcelR0 = r0(T(), 1);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // va.x1
    public final String d() {
        Parcel parcelR0 = r0(T(), 2);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // va.x1
    public final List e() {
        Parcel parcelR0 = r0(T(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelR0.createTypedArrayList(e3.CREATOR);
        parcelR0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // va.x1
    public final e3 z1() {
        Parcel parcelR0 = r0(T(), 4);
        e3 e3Var = (e3) ng.b(parcelR0, e3.CREATOR);
        parcelR0.recycle();
        return e3Var;
    }
}
