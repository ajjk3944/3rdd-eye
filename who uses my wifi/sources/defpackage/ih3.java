package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ih3 extends l0 {
    public static final Parcelable.Creator<ih3> CREATOR = new p92(26);
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ih3(l51 l51Var) {
        this(l51Var.a, l51Var.b, l51Var.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 2, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uk2.O(parcel, I);
    }

    public ih3(boolean z, boolean z2, boolean z3) {
        this.f = z;
        this.g = z2;
        this.h = z3;
    }
}
