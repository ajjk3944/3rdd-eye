package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rb1 extends l0 {
    public static final Parcelable.Creator<rb1> CREATOR = new kq0(6);
    public final int f;
    public final int g;
    public final Intent h;

    public rb1(int i, int i2, Intent intent) {
        this.f = i;
        this.g = i2;
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.g);
        uk2.C(parcel, 3, this.h, i);
        uk2.O(parcel, I);
    }
}
