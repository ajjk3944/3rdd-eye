package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e51 extends l0 {
    public static final Parcelable.Creator<e51> CREATOR = new ed4(8);
    public final String f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;

    public e51(String str, int i, int i2, boolean z, boolean z2) {
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
    }

    public static e51 a() {
        return new e51(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 2, this.f);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.g);
        uk2.T(parcel, 4, 4);
        parcel.writeInt(this.h);
        uk2.T(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uk2.T(parcel, 6, 4);
        parcel.writeInt(this.j ? 1 : 0);
        uk2.O(parcel, I);
    }

    public e51(int i, int i2, boolean z) {
        this(i, i2, 0, z, false);
    }

    public e51(int i, int i2, int i3, boolean z, boolean z2) {
        String str;
        if (z) {
            str = "0";
        } else {
            str = "1";
        }
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(str.length() + length2 + length + 13 + 1);
        ex0.o(sb, "afma-sdk-a-v", i, ".", i2);
        this(ex0.k(sb, ".", str), i, i2, z, z2);
    }
}
