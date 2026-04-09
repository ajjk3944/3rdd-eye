package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s12 extends sb1 implements x12 {
    public s12(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 2);
    }

    @Override // defpackage.x12
    public final String d() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.x12
    public final ArrayList h() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayList = parcelY.readArrayList(iv1.a);
        parcelY.recycle();
        return arrayList;
    }
}
