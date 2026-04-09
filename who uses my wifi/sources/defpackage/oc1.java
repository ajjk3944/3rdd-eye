package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oc1 extends l0 {
    public static final Parcelable.Creator<oc1> CREATOR = new kq0(8);
    public final List f;
    public final String g;

    public oc1(ArrayList arrayList, String str) {
        this.f = arrayList;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.F(parcel, 1, this.f);
        uk2.D(parcel, 2, this.g);
        uk2.O(parcel, I);
    }
}
