package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q42 extends l0 {
    public static final Parcelable.Creator<q42> CREATOR = new kq0(24);
    public final String f;
    public final String[] g;
    public final String[] h;

    public q42(String str, String[] strArr, String[] strArr2) {
        this.f = str;
        this.g = strArr;
        this.h = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 1, this.f);
        uk2.E(parcel, 2, this.g);
        uk2.E(parcel, 3, this.h);
        uk2.O(parcel, I);
    }
}
