package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e52 extends l0 {
    public static final Parcelable.Creator<e52> CREATOR = new kq0(27);
    public final String f;
    public final Bundle g;

    public e52(Bundle bundle, String str) {
        this.f = str;
        this.g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.z(parcel, 2, this.g);
        uk2.O(parcel, I);
    }
}
