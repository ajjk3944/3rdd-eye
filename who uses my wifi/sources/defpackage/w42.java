package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w42 extends l0 {
    public static final Parcelable.Creator<w42> CREATOR = new kq0(26);
    public final String f;
    public final boolean g;
    public final int h;
    public final String i;

    public w42(String str, int i, String str2, boolean z) {
        this.f = str;
        this.g = z;
        this.h = i;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.h);
        uk2.D(parcel, 4, this.i);
        uk2.O(parcel, I);
    }
}
