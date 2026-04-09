package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rb2 extends l0 {
    public static final Parcelable.Creator<rb2> CREATOR = new p92(8);
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final List m;

    public rb2(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.k = z3;
        this.l = z4;
        this.m = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 2, this.f);
        uk2.D(parcel, 3, this.g);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uk2.F(parcel, 6, this.j);
        uk2.T(parcel, 7, 4);
        parcel.writeInt(this.k ? 1 : 0);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        uk2.F(parcel, 9, this.m);
        uk2.O(parcel, I);
    }
}
