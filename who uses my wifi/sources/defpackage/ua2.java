package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ua2 extends sb1 implements va2 {
    public ua2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 2);
    }

    @Override // defpackage.va2
    public final String b() {
        Parcel parcelY = Y(U(), 1);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.va2
    public final int c() {
        Parcel parcelY = Y(U(), 2);
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }
}
