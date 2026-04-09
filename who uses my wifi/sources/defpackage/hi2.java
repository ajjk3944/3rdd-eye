package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hi2 extends sb1 implements wi2 {
    public hi2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 2);
    }

    @Override // defpackage.wi2
    public final void n0(String str, String str2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        M0(parcelU, 1);
    }
}
