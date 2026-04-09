package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ow2 extends sb1 implements tx2 {
    public ow2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 2);
    }

    @Override // defpackage.tx2
    public final String b() {
        Parcel parcelY = Y(U(), 1);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.tx2
    public final String c() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.tx2
    public final List e() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelY.createTypedArrayList(qh4.CREATOR);
        parcelY.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.tx2
    public final qh4 f() {
        Parcel parcelY = Y(U(), 4);
        qh4 qh4Var = (qh4) iv1.b(parcelY, qh4.CREATOR);
        parcelY.recycle();
        return qh4Var;
    }

    @Override // defpackage.tx2
    public final String g() {
        Parcel parcelY = Y(U(), 6);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.tx2
    public final Bundle j() {
        Parcel parcelY = Y(U(), 5);
        Bundle bundle = (Bundle) iv1.b(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle;
    }
}
