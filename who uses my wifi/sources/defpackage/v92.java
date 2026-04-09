package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v92 extends l0 {
    public static final Parcelable.Creator<v92> CREATOR = new p92(2);
    public final boolean f;
    public final List g;

    public v92(boolean z, List list) {
        this.f = z;
        this.g = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uk2.F(parcel, 3, this.g);
        uk2.O(parcel, I);
    }
}
