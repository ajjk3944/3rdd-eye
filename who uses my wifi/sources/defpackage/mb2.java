package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mb2 extends l0 {
    public static final Parcelable.Creator<mb2> CREATOR = new p92(7);
    public final String f;
    public final String g;

    public mb2(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.D(parcel, 2, this.g);
        uk2.O(parcel, I);
    }
}
