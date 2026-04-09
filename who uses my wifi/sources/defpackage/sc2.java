package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sc2 extends sb1 implements tc2 {
    @Override // defpackage.tc2
    public final void t3(String str, Bundle bundle, String str2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, bundle);
        M0(parcelU, 3);
    }

    @Override // defpackage.tc2
    public final void w(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        M0(parcelU, 2);
    }
}
